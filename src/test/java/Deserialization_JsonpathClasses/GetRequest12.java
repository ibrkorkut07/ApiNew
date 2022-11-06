package Deserialization_JsonpathClasses;

import testBases.HerokuAppTestbase;
import testData.HerokuappTestData;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetRequest12 extends HerokuAppTestbase {

    /*
    https://restful-booker.herokuapp.com/booking/1001 url ine bir istek gönderildiğinde
 dönen response body nin
{
 "firstname": "Eric",
 "lastname": "Smith",
 "totalprice": 555,
 "depositpaid": false,
 "bookingdates": {
 "checkin": "2016-09-09",
 "checkout": "2017-09-21"
 }
 } gibi olduğunu test edin
 NOT: Bu tur ic ice mapler asagidaki gibi nested map metoduyla da yapilabilir
     */

    @Test
    public void test(){

        // url oluştur
        spec.pathParams("parametre1","booking", "parametre2",1001);

        //expected Data
        HerokuappTestData expectedobje=new HerokuappTestData();
        HashMap<String,Object>expectedDataMap=expectedobje.setUpTestData();
        System.out.println(expectedDataMap);

        //request gönder
        Response response=given().
                accept("application/json").
                spec(spec).
                when().
                get("/{parametre1}/{parametre2}");

        response.prettyPrint();

        // 1. yol  DeSerialization
        HashMap<String,Object> actualDataMap=response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals(expectedDataMap.get("firstname"),actualDataMap.get("firstname"));
        Assert.assertEquals(expectedDataMap.get("lastname"),actualDataMap.get("lastname"));
        Assert.assertEquals(expectedDataMap.get("totalprice"),actualDataMap.get("totalprice"));
        Assert.assertEquals(expectedDataMap.get("depositpaid"),actualDataMap.get("depositpaid"));
        Assert.assertEquals(   ((Map)expectedDataMap.get("bookingdates")).get("checkin"),
                ((Map) actualDataMap.get("bookingdates")).get("checkin"));

        Assert.assertEquals(   ((Map) expectedDataMap.get("bookingdates")).get("checkout"),
                ((Map) actualDataMap.get("bookingdates")).get("checkout")  );

        Assert.assertEquals(
                ((Map)expectedDataMap.get("bookingdates")).get("checkin"),
                ((Map)actualDataMap.get("bookingdates")).get("checkin")
        );

        // 2. yol JsonPath
        JsonPath jsonPath=response.jsonPath();

        Assert.assertEquals(expectedDataMap.get("firstname"),jsonPath.getString("firstname"));
        Assert.assertEquals(expectedDataMap.get("lastname"),jsonPath.getString("lastname"));
        Assert.assertEquals(expectedDataMap.get("totalprice"),jsonPath.getInt("totalprice"));
        Assert.assertEquals(expectedDataMap.get("depositpaid"),jsonPath.getBoolean("depositpaid"));
        Assert.assertEquals(  ((Map)expectedDataMap.get("bookingdates")).get("checkin"),
                jsonPath.getString("bookingdates.checkin"));  // Burada 2 tane get metodu arka arkaya
        // olusturamayacagimiz icin once ilk get metodu olan bookingdates kismini parantez icine alip Map casting
        // yapiyoruz ve sonra da bunlarin tamamina get metodu uyguluyoruz
        Assert.assertEquals(((Map) expectedDataMap.get("bookingdates")).get("checkout"),
                jsonPath.getString("bookingdates.checkout"));
    }
}