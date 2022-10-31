package basicApiClasses;

import static io.restassured.RestAssured.given;

public class GetRequest06 {
        /*
        https://jsonplaceholder.typicode.com/todos/123 url'ine accept type'i "application/json" olan
        GET request'i yolladigimda gelen response’un
        status kodunun 200 ve
        content type'inin "application/json"
        ve
        Headers'daki "Server" in "cloudflare" ve
        response body'deki "userId"'nin 7 ve
        "title" in "esse et quis iste est earum aut impedit" ve
        "completed" bolumunun false oldugunu test edin
         */




}

















//    @Test
//    public void test() {
//        String url = "https://jsonplaceholder.typicode.com/todos/123";
//        Response response = given().accept(ContentType.JSON).when().get(url);
//        response.then().assertThat().statusCode(200).contentType("application/json; charset=utf-8").
//                body("title", equalTo("esse et quis iste est earum aut impedit"),
//                        "completed", equalTo(false));
//    }