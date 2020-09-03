package StepDefinitions;

import PageObjects.BasePage;
import PageObjects.SearchResultsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPageSteps extends BasePage {
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Then("I see the search results page")
    public void iSeeTheSearchResultsPage()  {
        System.out.println(GetPageTitle());
        assertThat("Search results").isEqualTo(GetPageTitle());
    }

    @When("I click on {string}")
    public void iClickOn(String searchOptionSelection) throws Exception{
        try {
            searchResultsPage.ClickOnSearchText(searchOptionSelection);
        } catch (Exception e) {
            throw new Exception("Unable to click on "+ searchOptionSelection);
        }
    }
}
