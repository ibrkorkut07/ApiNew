package basicApiClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest04 {
    /*
    https://restful-booker.herokuapp.com/booking/5 url'ine accept type'i "application/json" olan
    GET request'i yolladigimda gelen response'un
    status kodunun 200 ve
    content type'inin "application/json" ve
    firstname'in “Jim" ve
    totalprice’in 600 ve
    checkin date'in "2015-06-12"     oldugunu test edin
     */
}

//    @Test
//    public void test() {
//        String url = "https://restful-booker.herokuapp.com/booking/5";
//        Response response = given().accept(ContentType.JSON).when().get("https://restful-booker.herokuapp.com/booking/5");
//
//        Assert.assertEquals(200, response.statusCode());
//        Assert.assertTrue(response.contentType().contains("application/json"));
//        response.then().assertThat().statusCode(200).contentType("application/json").
//                body("firstname", equalTo("Jim"),
//                        "bookingdates.checkin", equalTo("2015-06-12"));
//    }
