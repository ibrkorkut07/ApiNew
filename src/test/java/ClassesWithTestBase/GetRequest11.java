package ClassesWithTestBase;

import testBases.JsonPlaceHolderTestbase;

import static io.restassured.RestAssured.given;

public class GetRequest11 extends JsonPlaceHolderTestbase {
    /*
    https://jsonplaceholder.typicode.com/todos/2 url ‘ine istek gönderildiğinde, Dönen response un
    Status kodunun 200, dönen body de,
    "completed": değerinin false
    "title”: değerinin “quis ut nam facilis et officia qui”
    "userId" sinin 1 ve
    header değerlerinden
    "Via" değerinin “1.1 vegur” ve
    "Server" değerinin “cloudflare” olduğunu test edin…
    */
        /*

    url oluştur
    --expected data
    request gönder
   -- actual data
    assertion

     */

    /*
    @Test
    public void test(){

        spec.pathParams("parametre1","todos", "parametre2",2);

        HashMap<String,Object> expectedData=new HashMap<String, Object>();

        expectedData.put("statusCode",200);
        expectedData.put("via","1.1 vegur");
        expectedData.put("Server","cloudflare");
        expectedData.put("userId",1);
        expectedData.put("title","quis ut nam facilis et officia qui");
        expectedData.put("completed",false);

        System.out.println(expectedData);
        System.out.println("----------------------------");

        Response response=given().
                accept("application/json").
                spec(spec).
                when().
                get("/{parametre1}/{parametre2}");

        response.prettyPrint();

        //1. yöntem Mathers class ile assertion işlemi yaptık

        response.then().assertThat().statusCode((Integer)expectedData.get("statusCode")).
                headers("via", equalTo(expectedData.get("via")),
                        "Server",equalTo(expectedData.get("Server"))).
                body("userId",equalTo(expectedData.get("userId")),
                        "title",equalTo(expectedData.get("title")),
                        "completed",equalTo(expectedData.get("completed")));

        //2. yöntem

        JsonPath jsonPath=response.jsonPath();

        Assert.assertEquals(expectedData.get("statusCode"),response.statusCode());
        Assert.assertEquals(expectedData.get("via"),response.getHeader("via"));
        Assert.assertEquals(expectedData.get("Server"),response.getHeader("Server"));
        Assert.assertEquals(expectedData.get("userId"),jsonPath.getInt("userId"));
        Assert.assertEquals(expectedData.get("title"),jsonPath.getString("title"));
        Assert.assertEquals(expectedData.get("completed"),jsonPath.getBoolean("completed"));

        //3. yöntem  deserialization
        //   --object mapper
        //   --pojo class ile birlite map
    }
       */
}