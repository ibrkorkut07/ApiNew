package apiClassesWithTestBase;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;
import testBases.DummyTestbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetRequest10 extends DummyTestbase {
    /*
    http://dummy.restapiexample.com/api/v1/employees
    url ine bir istek gönderildiğinde Dönen response un
    Status kodunun 200,
    1)10’dan büyük tüm id’leri ekrana yazdırın ve 10’dan büyük 14 id olduğunu,
    2)30’dan küçük tüm yaşları ekrana yazdırın ve bu yaşların içerisinde en büyük yaşın 23 olduğunu
    3)Maası 350000 den büyük olan tüm employee name’leri ekrana yazdırın ve bunların içerisinde “Charde Marshall” olduğunu test edin
    */

    /*
    @Test
    public void test(){

        spec03.pathParam("parametre1","employees");

        Response response= given().
                accept("application/json").
                spec(spec03).
                when().
                get("/{parametre1}");

        JsonPath jsonPath=response.jsonPath();
//Groovy dili javanın alt dilidir. biz bu dil yardımı ile loop kullanmadan
        // gelen responsedaki değerleri bir şarta bağlı olarak listeye yazdırabiliyoruz

        //Status kodunun 200,

        Assert.assertEquals(200,response.getStatusCode());
//        1)10’dan büyük tüm id’leri ekrana yazdırın ve
//        10’dan büyük 14 id olduğunu,
      List<Integer> idList= jsonPath.getList("data.findAll{it.id>10}.id");
        System.out.println(idList);
        Assert.assertEquals(14,idList.size());

//        2)30’dan küçük tüm yaşları ekrana yazdırın ve
//        bu yaşların içerisinde en büyük yaşın 23 olduğunu

       List<Integer> yasListesi= jsonPath.getList("data.findAll{it.employee_age<30}.employee_age");
        System.out.println(yasListesi);

        Collections.sort(yasListesi);
        Assert.assertEquals((Integer)23,yasListesi.get(yasListesi.size()-1));


//        3)Maası 350000 den büyük olan tüm employee name’leri ekrana yazdırın ve
//        bunların içerisinde “Charde Marshall” olduğunu test edin

        List<String> isimListesi=jsonPath.getList("data.findAll{it.employee_salary>350000}.employee_name");
        System.out.println(isimListesi);

        Assert.assertTrue(isimListesi.contains("Charde Marshall"));
    }	}

     */

   /*
    @Test
    public void test() {
        spec.pathParams("p1","api", "p2", "v1", "p3", "employees");
        response = given().spec(spec).when().get("/{p1}/{p2}/{p3}");
        response.then().assertThat().statusCode(200);

        List<Integer> idList = new ArrayList<>();
        JsonPath jsonPath = response.jsonPath();
        int a = jsonPath.getList("data.id").size();
        for (int i = 0; i < a ; i++) {
            if (jsonPath.getInt("data.id[" + i + "]")>10)
                idList.add(jsonPath.getInt("data.id[" + i + "]"));
        }
        System.out.println(idList);
        Assert.assertEquals(14, idList.size());

        List<Integer> idList2 = new ArrayList<>();
        for (int i = 0; i < a ; i++) {
            if (jsonPath.getInt("data.employee_age[" + i + "]")< 30)
                idList2.add(jsonPath.getInt("data.employee_age[" + i + "]"));
        }
        System.out.println(idList2);
        Assert.assertEquals(23, jsonPath.getInt("data.employee_age[-1]"));
        System.out.println(jsonPath.getInt("data.employee_age[-1]"));

        List<String> idList3 = new ArrayList<>();
        for (int i = 0; i < a ; i++) {
            if (jsonPath.getInt("data.employee_salary[" + i + "]") > 350000)
                idList3.add(jsonPath.getString("data.employee_name[" + i + "]"));
        }
        System.out.println(idList3);
        Assert.assertTrue(idList3.contains("Charde Marshall"));
        System.out.println("That idList3 contains: Charde Marshall is " + idList3.contains("Charde Marshall"));
    }

    */
}
