package ClassesWithTestBase;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;
import testBases.DummyTestbase;

import static io.restassured.RestAssured.given;

public class GetRequest09 extends DummyTestbase {
    /*
    http://dummy.restapiexample.com/api/v1/employees
    url ine bir istek gönderildiğinde,
    status kodun 200,
    gelen body de,
    5. çalışanın isminin "Airi Satou" olduğunu ,
    6. çalışanın maaşının "372000" olduğunu ,
    Toplam 24 tane çalışan olduğunu,
    "Rhona Davidson" ın employee lerden biri olduğunu
    "21", "23", "61" yaşlarında employeeler olduğunu test edin
    */

    @Test
    public void test () {
        spec.pathParams("p1", "api", "p2", "v1", "p3", "employees");
        response=given().spec(spec).when().get("/{p1}/{p2}/{p3}");

        response.then().assertThat().statusCode(200);
        JsonPath jsonPath = response.jsonPath();

        Assert.assertEquals("Airi Satou", jsonPath.getString("data.employee_name[4]"));
        Assert.assertEquals(372000, jsonPath.getInt("data.employee_salary[5]"));
        Assert.assertEquals(24, jsonPath.getList("data.employee_name").size());
        Assert.assertTrue(jsonPath.getString("data").contains("Rhona Davidson"));
        Assert.assertTrue(jsonPath.getList("data.employee_age").contains(21 & 23 & 61));

    }

}
