package JsonpathClasses;

import testBases.JsonPlaceHolderTestbase;

import static io.restassured.RestAssured.given;

public class PutRequest01 extends JsonPlaceHolderTestbase {
    /*  https://jsonplaceholder.typicode.com/todos/198 URL ine aşağıdaki body gönerdiğimde
    {
    "userId": 21,
    "title": "Wash the dishes",
    "completed": false  }
    Dönen response un status kodunun 200 ve body kısmının aşağıdaki gibi olduğunu test edin
    { "userId": 21,
      "title": "Wash the dishes",
      "completed": false,
      "id": 198  } */





















    /*
    @Test
    public void test(){
        spec.pathParams("parametre1","todos",
                "parametre2",198);

        JsonPlaceHolderTestData testObje=new JsonPlaceHolderTestData();
        JSONObject expectedRequest= testObje.setUpPutData();
        System.out.println(expectedRequest);

        Response response=given().
                contentType(ContentType.JSON).
                spec(spec).
                auth().basic("admin","password123").
                body(expectedRequest.toString()).
                when().
                put("/{parametre1}/{parametre2}");
        response.prettyPrint();

        //JsonPath
        JsonPath json=response.jsonPath();
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals(expectedRequest.getInt("userId"),json.getInt("userId"));
        Assert.assertEquals(expectedRequest.getString("title"),json.getString("title"));
        Assert.assertEquals(expectedRequest.getBoolean("completed"),json.getBoolean("completed"));
    }
     */

}