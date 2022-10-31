package basicApiClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

public class GetRequest05 {
        /*
        http://dummy.restapiexample.com/api/v1/employees url'ine accept type'i "application/json" olan
        GET request'i yolladigimda gelen
        response'un status kodunun 200 ve
        content type'inin "application/json" ve
        employees sayisinin 24 ve
        employee'lerden birinin "Ashton Cox" ve
        gelen employee_age icinde 21, 61, ve 23 degerlerinden birinin oldugunu test edin
         */



}

























//    @Test
//    public void test() {
//        String url = "http://dummy.restapiexample.com/api/v1/employees";
//        Response response = given().accept(ContentType.JSON).when().get(url);
//
//        response.then().assertThat().statusCode(200).contentType("application/json").
//                                    body("data.id", Matchers.hasSize(24),
//                                            "data.employee_name", Matchers.hasItem("Ashton Cox"),
//                                            "employee_age", Matchers.hasItems(21, 23, 61));
//    }