package apiClassesWithTestBase;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import testBases.HerokuAppTestbase;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest07WithTestbase {


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
