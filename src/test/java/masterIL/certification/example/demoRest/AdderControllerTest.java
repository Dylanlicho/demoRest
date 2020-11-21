package masterIL.certification.example.demoRest;

import masterIL.certification.example.demoRest.controller.AdderController;
import masterIL.certification.example.demoRest.service.AdderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AdderControllerTest {

    @Test
    public void currentTest(){
        when().get("/adder/current").then().statusCode(200).body(equalTo("10"));
    }

    @Test
    public void addTest(){
        given().queryParam("num", "10").when().post("/adder/add").then().statusCode(200).body(equalTo("20"));
    }


    @Test
    public void subTest(){
        given().queryParam("num", "10").when().post("/adder/sub").then().statusCode(200).body(equalTo("0"));
    }


    @Test
    public void multTest(){
        given().queryParam("num", "10").when().post("/adder/mult").then().statusCode(200).body(equalTo("100"));
    }

    @Test
    public void divTest(){
        given().queryParam("num", "10").when().post("/adder/div").then().statusCode(200).body(equalTo("1"));
    }

    /*
    @Test
    public void accumulTest(){
        given().queryParam("num", "10").when().post("/adder/accumul").then().statusCode(200).body(equalTo("20"));
        given().queryParam("num", "10").when().post("/adder/accumul").then().statusCode(200).body(equalTo("30"));
    }*/

}
