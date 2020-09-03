package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class PartTwoStep {
    @Given("I execute {string} api")
    public void iExecuteApi(String apiUrl) {
        RestAssured.when().
                get(apiUrl).
                then().statusCode(200).body("Name", equalTo("R2-D2"),
                "lotto.winners.winnerId", hasItems("white", "blue"));
    }

    @Then("I can see the {string} skin colour is {string} and {string}")
    public void iCanSeeTheSkinColourIsAnd(String arg0, String arg1, String arg2) {
    }
}
