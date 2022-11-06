package PojoClasses;

import Pojos.TodosPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import testBases.JsonPlaceHolderTestbase;

import static io.restassured.RestAssured.given;

public class PostRequestWithPojo01 extends JsonPlaceHolderTestbase {
    /*  https://jsonplaceholder.typicode.com/todos url ‘ine bir request gönderildiğinde
        Request body{
        "userId": 21,
        "id": 201,
        "title": "Tidy your room",
        "completed": false  }
        Status kodun 201, response body ‘nin ise
        { "userId": 21,
        "id": 201,
        "title": "Tidy your room",
        "completed": false  }  */

    @Test
    public void test(){

        spec.pathParam("parametre1","todos");

        TodosPojo requestExpected=new TodosPojo(21,201,"Tidy your room",false);
        System.out.println(requestExpected);

        Response response=given().
                contentType(ContentType.JSON).
                spec(spec).
                auth().basic("admin","password123").
                body(requestExpected).when().post("/{parametre1}");

        response.prettyPrint();

    // DE serialization
        TodosPojo actualData=response.as(TodosPojo.class);

        Assert.assertEquals(201,response.getStatusCode());
        Assert.assertEquals(requestExpected.getUserId(),actualData.getUserId());
        Assert.assertEquals(requestExpected.getId(),actualData.getId());
        Assert.assertEquals(requestExpected.getTitle(),actualData.getTitle());
        Assert.assertEquals(requestExpected.isCompleted(),actualData.isCompleted());
    }
}