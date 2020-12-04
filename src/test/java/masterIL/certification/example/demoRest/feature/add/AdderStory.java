package masterIL.certification.example.demoRest.feature.add;

import masterIL.certification.example.demoRest.step.serenity.AdderRestStep;
import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringIntegrationSerenityRunner.class)
public class AdderStory {

    @Steps
    private AdderRestStep api;


    @Test
    public void adding_three_to_current_should_return_sum_both(){
        api.givenCurrentNumber();
        api.whenAddNumber(5);
        api.thenSummedUp();
    }


    /********************   JBehave   ********************/

    @Given("a number")
    public void givenANumber(){
        api.givenCurrentNumber();
    }

    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num){
        api.whenAddNumber(num);
    }

    @When("I submit another number $num to adder using rest")
    public void whenISubmitToAdderWithNumberUsingRest(int num){
        api.whenAddNumberUsingRest(num);
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum(){
        api.thenSummedUp();
    }

}
