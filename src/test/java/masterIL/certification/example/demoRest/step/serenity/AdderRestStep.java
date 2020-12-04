package masterIL.certification.example.demoRest.step.serenity;

import io.restassured.RestAssured;
import io.restassured.module.mockmvc.response.MockMvcResponse;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class AdderRestStep {

    private int currentNum;

    @Step("get the current number")
    public void givenCurrentNumber() {
        currentNum = Integer.parseInt(when().get("/adder/current").getBody().asString());
    }

    @Step("adding {0}")
    public void whenAddNumber(int num) {
        currentNum += num;
    }

    @Step("adding {0} using rest")
    public void whenAddNumberUsingRest(int num){
        int sum = Integer.parseInt(given().queryParam("num", num).when().post("/adder/add").getBody().asString());
        Assert.assertThat(sum,Matchers.equalTo(currentNum + num));
    }

    @Step("got the sum")
    public void thenSummedUp() {
        Assert.assertThat(currentNum, Matchers.equalTo(15));
    }

}
