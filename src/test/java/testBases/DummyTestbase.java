package testBases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class DummyTestbase {

    protected RequestSpecification spec;
    protected Response response;

    @Before
    public void setUp() {
        spec = new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com").build();
    }

}

//   http://dummy.restapiexample.com