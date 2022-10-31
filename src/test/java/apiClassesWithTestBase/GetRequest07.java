package apiClassesWithTestBase;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import testBases.JsonPlaceHolderTestbase;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class GetRequest07 extends JsonPlaceHolderTestbase {
    /* response.jsonPath(); methodu JsonPath class’indan obje ureterek response uzerinden
    JsonPath class’indaki methodlari kullanmamizi saglar.
    https://restful-booker.herokuapp.com/booking/5 url’ine bir request yolladigimda
    HTTP Status Code’unun 200
    ve response content type’inin “application/JSON” oldugunu
    ve response body’sinin asagidaki gibi oldugunu test edin
    {"firstname": Sally,
    "lastname": "Smith",
    "totalprice": 789,
    "depositpaid": false,
    "bookingdates": { "checkin": "2017-12-11",
    "checkout":"2020-02-20" }
    */






}
























//    @Test
//    public void test() {
//        // String url = "https://restful-booker.herokuapp.com/booking/1005";
//        // Response response = given().when().get(url);
//        spec.pathParams("param1", "booking", "param2", "1005");
//        Response response = given().spec(spec).when().get("/{param1}/{param2}");
//        response.then().assertThat().statusCode(200).contentType("application/JSON").
//                                    body("firstname", Matchers.equalTo("Sally"),
//                                           "lastname", Matchers.equalTo("Brown"),
//                                            "totalprice", Matchers.equalTo(111),
//                                            "depositpaid", Matchers.equalTo(false),
//                                            "bookingdates.checkin", Matchers.equalTo("2017-12-11"));
//        JsonPath jsonPath = response.jsonPath();
//
//        Assert.assertEquals("Sally", jsonPath.getString("firstname"));
//        Assert.assertEquals("Brown", jsonPath.getString("lastname"));
//        Assert.assertEquals(111, jsonPath.getInt("totalprice"));
//        Assert.assertEquals(true, jsonPath.getBoolean("depositpaid"));
//        Assert.assertEquals("2013-02-23", jsonPath.getString("bookingdates.checkin"));
//    }
