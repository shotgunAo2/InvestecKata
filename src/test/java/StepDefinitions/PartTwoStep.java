package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;

public class PartTwoStep {

    private Response response;

    @Given("I execute {string} api")
    public void iExecuteApi(String apiUrl) {
        response = when().get(apiUrl).then().contentType(ContentType.JSON).extract().response();
        System.out.println("response status: "+ response.statusCode());
        assertThat(response.getStatusCode()).as("API response code").isEqualTo(200);
    }

    @Then("I can see the {string} skin colour is {string}")
    public void iCanSeeTheSkinColourIs(String expectedName, String expectedcolour) {
        List<Map<String, String>> resultsList = response.jsonPath().getList("results");
        for(int counter =0;counter<resultsList.size();counter++)
        {
            if (resultsList.get(counter).get("name").equals(expectedName))
            {
                System.out.println(resultsList.get(counter).get("name"));
                System.out.println(resultsList.get(counter).get("skin_color"));
                assertThat(resultsList.get(counter).get("skin_color")).isEqualTo(expectedcolour);
            }
        }
    }
}
