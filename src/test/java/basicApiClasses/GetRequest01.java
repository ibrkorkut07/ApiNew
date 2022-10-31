package basicApiClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.*;

import static io.restassured.RestAssured.*;

public class GetRequest01 {
    /*
    https://restful-booker.herokuapp.com/booking/1003 adresine bir request gonderildiginde donecek cevap(response) icin
    HTTP status kodunun 200
    Content Type’in Json
    Ve Status Line’in HTTP/1.1 200 OK Oldugunu test edin.
     */







//    @Test
//    public void test() {
//        String url = "https://restful-booker.herokuapp.com/booking/1003";
//        Response response = given().accept(ContentType.JSON).when().get(url);
//        Assert.assertEquals(200, response.statusCode());
//        Assert.assertTrue(response.contentType().contains("application/json"));
//        Assert.assertEquals("application/json; charset=utf-8", response.contentType());
//        Assert.assertEquals("HTTP/1.1 200 OK", response.statusLine());
//
//        response.then().assertThat().statusCode(200)
//                                    .contentType("application/json; charset=utf-8")
//                                    .statusLine("HTTP/1.1 200 OK");
//    }
}
