package PostRequestClasses;

import testBases.DummyTestbase;

import static io.restassured.RestAssured.given;

public class PostRequest01 extends DummyTestbase {
    /*  http://dummy.restapiexample.com/api/v1/create url ine, Request Body olarak
    {
    "name":"Ahmet Aksoy",
    "salary":"1000",
    "age":"18",
    }
    gönderildiğinde,Status kodun 200 olduğunu ve dönen response body nin ,
    {
    "status": "success",
    "data": {
    “id”:…
    },
    "message": "Successfully! Record has been added."
    }
    olduğunu test edin
     */

    /*
    Post islemlerinde hem post yapacagimiz body hem de response body si olmak uzere 2 body olusturmamiz gerekiyor.
    Bunu Postman uzerinde de gorebiliriz. Post yapacagimiz sayfanin Swagger veya ilgili database dokumanina uygun
    olarak post yapiyoruz. Postman de post yaparken Body / raw / JSON ve response kisminda Body / Pretty / JSOn
    seceneklerine dikkat et.
     */




















    /*
    @Test
    public void test(){

        spec.pathParams("parametre1","api", "paramaetre2", "v1", "parametre3", "create");
        DummyTestData obje=new DummyTestData();

        //post request yaparken biz body göndermek zorundayız, testdata classında oluşturduğumuz request
        //body i burada çağırıyoruz.

        HashMap<String,String> requestBodyMap=obje.setupRequestBody();
        HashMap<String,Object>expectedDataMap=obje.setUpExpectedData();

        Response response=given().
                accept("application/json").
                spec(spec).auth().basic("admin","password123")
                .body(requestBodyMap).
                when().
                post("/{parametre1}/{parametre2}/{parametre3}");

        response.prettyPrint();

        //DE Serialization
        HashMap<String, Object> actualDataMap=response.as(HashMap.class);
        Assert.assertEquals(expectedDataMap.get("statusCode"),response.getStatusCode());
        Assert.assertEquals(expectedDataMap.get("status"),actualDataMap.get("status"));
        Assert.assertEquals(expectedDataMap.get("message"),actualDataMap.get("message"));

        //JsonPath
        HashMap<String, Object> actualDataMap=response.as(HashMap.class);  // burasi ayni
        Assert.assertEquals(expectedDataMap.get("statusCode"),response.getStatusCode());  // burasi ayni
        JsonPath json=response.jsonPath();
        Assert.assertEquals(expectedDataMap.get("status"),json.getString("status"));
        Assert.assertEquals(expectedDataMap.get("message"),json.getString("message"));
    }
     */
}