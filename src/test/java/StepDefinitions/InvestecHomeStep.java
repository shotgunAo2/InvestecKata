package StepDefinitions;

import PageObjects.BasePage;
import PageObjects.Investec_Home_Page;
import PageObjects.SearchResultsPage;
import PageObjects.UnderStandingCashInvestmentsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import static org.assertj.core.api.Assertions.assertThat;


public class InvestecHomeStep extends BasePage {
    
    Investec_Home_Page investecHomePage = new Investec_Home_Page();
    UnderStandingCashInvestmentsPage underStandingCashInvestmentsPage = new UnderStandingCashInvestmentsPage();

    @Given("I am navigate to the Investec SA home page")
    public void iAmNavigateToTheInvestecSAHomePage() throws InterruptedException {

        investecHomePage.Navigate_to_Investec_Home();
    }

    @When("I click on the search option")
    public void iClickOnTheSearchOption() {
        investecHomePage.ClickSearchOption();
    }

    @And("I enter {string} in the search field")
    public void iEnterInTheSearchField(String textToSearch) {
        investecHomePage.EnterTextInSearchBox(textToSearch);
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
        WebElement searchBarButton = browser.findElement(By.id("searchBarButton"));
        searchBarButton.click();
    }



    @Then("I see the {string} page")
    public void iSeeThePage(String expectedPageTitle) {
        assertThat(expectedPageTitle).isEqualTo(GetPageTitle());
    }

    @When("I click on the Sign up button")
    public void iClickOnTheSignUpButton() {
        underStandingCashInvestmentsPage.ClickSignUpButton();
    }

    @And("I enter name {string}")
    public void iEnterName(String firstName) throws InterruptedException {
        underStandingCashInvestmentsPage.EnterName(firstName);
    }
}
