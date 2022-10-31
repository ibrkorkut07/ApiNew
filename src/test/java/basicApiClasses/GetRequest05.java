package basicApiClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

public class GetRequest05 {


        /*
        http://dummy.restapiexample.com/api/v1/employees url'ine accept type'i "application/json" olan
        GET request'i yolladigimda gelen response'un status kodunun 200 ve content type'inin "application/json"
        ve employees sayisinin 24 ve employee'lerden birinin "Ashton Cox" ve gelen icinde 21, 61, ve 23 degerlerinden
        birinin oldugunu test edin
         */


}
