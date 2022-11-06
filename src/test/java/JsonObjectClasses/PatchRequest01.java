package JsonObjectClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import testBases.JsonPlaceHolderTestbase;
import testData.JsonPlaceHolderTestData;

import java.util.HashMap;
import static io.restassured.RestAssured.given;

public class PatchRequest01 extends JsonPlaceHolderTestbase {

    /*  https://jsonplaceholder.typicode.com/todos/198 URL ine aşağıdaki body gönderdiğimde
   {  "title": "API calismaliyim"  }
    Dönen response un status kodunun 200 ve body kısmının aşağıdaki gibi olduğunu test edin
    {   "userId": 10,
        "title": "API calismaliyim"
        "completed": true,
        "id": 198  }  */






















    /*
     @Test
    public void test(){

        // url
        spec.pathParams("parametre1","todos",
                "parametre2",198);

        //expexted ve request data oluştur.
        JsonPlaceHolderTestData testData=new JsonPlaceHolderTestData();
        JSONObject requestData= testData.setUpPatchRequestData();
        System.out.println(requestData);

        JSONObject expectedData=testData.setUpPatchExpectedData();
        System.out.println(expectedData);

        //request Gönder
        Response response=given().
                contentType(ContentType.JSON).
                spec(spec).
                auth().basic("admin","password123").
                body(requestData.toString()).
                when().
                patch("/{parametre1}/{parametre2}");

        response.prettyPrint();

        //De- Serialization
        HashMap<String,Object> actualData=response.as(HashMap.class);
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals(expectedData.getInt("userId"),actualData.get("userId"));
        Assert.assertEquals(expectedData.getInt("id"),actualData.get("id"));
        Assert.assertEquals(expectedData.getString("title"),actualData.get("title"));
        Assert.assertEquals(expectedData.getBoolean("completed"),actualData.get("completed"));
    }
     */

}