package Post_Delete_Patch_RequestClasses;

import testBases.JsonPlaceHolderTestbase;

import static io.restassured.RestAssured.given;

public class PostRequest03 extends JsonPlaceHolderTestbase {

    /*  https://jsonplaceholder.typicode.com/todos URL ine aşağıdaki body gönderildiğinde,
     {  "userId": 55,
        "title": "Tidy your room",
        "completed": false  }
    Dönen response un Status kodunun 201 ve response body nin aşağıdaki gibi olduğunu test edin
   {  "userId": 55,
      "title": "Tidy your room",
      "completed": false,
      "id": …  }  */



























    /*
    @Test
    public void test(){

        spec.pathParam("parametre1","todos");

        JsonPlaceHolderTestData testObje=new JsonPlaceHolderTestData();
        JSONObject expectedRequest= testObje.setUpPostData();
        System.out.println(expectedRequest);

        Response response= given().
                contentType(ContentType.JSON).
                spec(spec).
                auth().basic("admin","password123").
                body(expectedRequest.toString()).
                when().
                post("/{parametre1}");
      //  response.prettyPrint();

        //Matchers class
        response.then().
                assertThat().statusCode(expectedRequest.getInt("statusCode"))
                .body("completed", equalTo(expectedRequest.getBoolean("completed")),
                        "title",equalTo(expectedRequest.getString("title")),
                        "userId",equalTo(expectedRequest.getInt("userId")));

        //JsonPath ile
        JsonPath json=response.jsonPath();

        Assert.assertEquals(expectedRequest.getInt("statusCode"),response.getStatusCode());
        Assert.assertEquals(expectedRequest.getInt("userId"),json.getInt("userId"));
        Assert.assertEquals(expectedRequest.getString("title"),json.getString("title"));
        Assert.assertEquals(expectedRequest.getBoolean("completed"),json.getBoolean("completed"));

        //De Serialization
        HashMap<String,Object> actualDataMap=response.as(HashMap.class);
        Assert.assertEquals(expectedRequest.getString("title"),actualDataMap.get("title"));
        Assert.assertEquals(expectedRequest.getInt("userId"),actualDataMap.get("userId"));
        Assert.assertEquals(expectedRequest.getBoolean("completed"),actualDataMap.get("completed"));
    }
     */
}