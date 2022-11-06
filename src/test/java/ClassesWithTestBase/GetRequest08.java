package ClassesWithTestBase;

import testBases.DummyTestbase;

import static io.restassured.RestAssured.given;

public class GetRequest08 extends DummyTestbase {
    /*
   http://dummy.restapiexample.com/api/v1/employees url'inde bulunan

  1) Butun calisanlarin isimlerini consola yazdıralim
  2) 3. calisan kisinin ismini konsola yazdıralim
  3) Ilk 5 calisanin adini konsola yazdiralim
  4) En son calisanin adini konsola yazdiralim
    */
}



/*
@Test
    public void test () {

        // without base class
        spec.pathParams("par1", "api", "par2", "v1", "par3", "employees");
        Response response = given().spec(spec).when().get("/{par1}/{par2}/{par3}");
        JsonPath jsonPath = response.jsonPath();

        System.out.println("All employee names: " + jsonPath.getString("data.employee_name"));
        System.out.println("3rd employee's name: " + jsonPath.getString("data.employee_name[2]"));

        for (int i = 0; i<5; i++) {
            System.out.println(i+". employee's name: " + jsonPath.getString("data.employee_name[" + i + "]"));
        }
        System.out.println("Last employee's names: " + jsonPath.getString("data.employee_name[-1]"));
    }
 */