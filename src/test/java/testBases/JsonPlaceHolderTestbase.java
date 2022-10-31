package testBases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

    public class JsonPlaceHolderTestbase {
        protected RequestSpecification spec;
        @Before
        public void setUp(){
            spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
        }
    }

    //   https://jsonplaceholder.typicode.com
