package basicApiClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest03 {

        /*
        https://restful-booker.herokuapp.com/booking/7 url'ine accept type'i "application/json" olan
        GET request'i yolladigimda gelen response'un
        status kodunun 200 ve
        content type'inin "application/json" ve
        firstname'in "Sally" ve
        lastname'in "Ericsson" ve
        checkin date'in 2018-10-07" ve
        checkout date'in 2020-09-30
        oldugunu test edin
        Gelen Response:
        {
        "firstname": "Jim",
        "lastname": "Brown",
        "totalprice": 842,
        "depositpaid": true,
        "bookingdates": {
        "checkin": "2017-12-27",
        "checkout": "2021-11-10"
        }
        }
        */
    @Test
    public void test() {

        String url = "https://restful-booker.herokuapp.com/booking/7";
        Response response = given().accept(ContentType.JSON).when().get(url);

        Assert.assertEquals(418, response.statusCode());
        Assert.assertEquals("application/json; charset=utf-8", response.contentType());

        response.then().assertThat().body("Jim", Matchers.equalTo("firstname"),
                                            "Brown", Matchers.equalTo("lastname"),
                                                    "2017-12-27", Matchers.equalTo("bookingdates.checkin"));



    }

}
