package basicApiClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class GetRequest02 {
    /* Test1:
    https://restful-booker.herokuapp.com/booking url'ine accept type'i "application/json" olan
    GET request'i yolladigimda gelen response'un status kodunun 200 content type'inin "application/json"
    oldugunu test edin
     */

    /* Test2:
    https://restful-booker.herokuapp.com/booking/1001 url'ine accept type'i "application/json" olan
    GET request'i yolladigimda gelen response'un status kodunun 404 oldugunu ve Response body'sinin
    "Not Found" icerdigini ve Response body'sinin "API" icermedigini test edin
    */



}

















//    @Test
//    public void test2() {
//
//        String url = "https://restful-booker.herokuapp.com/booking/1001";
//        Response response = given().accept(ContentType.JSON).when().get(url);
//
//        Assert.assertEquals(404, response.statusCode());
//        Assert.assertTrue(response.asString().contains("Not Found"));
//        Assert.assertFalse(response.asString().contains("API"));
//    }
