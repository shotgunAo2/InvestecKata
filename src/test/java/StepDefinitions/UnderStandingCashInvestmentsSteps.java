package StepDefinitions;

import PageObjects.UnderStandingCashInvestmentsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;

public class UnderStandingCashInvestmentsSteps {
    UnderStandingCashInvestmentsPage underStandingCashInvestmentsPage = new UnderStandingCashInvestmentsPage();
    @And("I enter Surname {string}")
    public void iEnterSurname(String surname) {
        underStandingCashInvestmentsPage.EnterSurname(surname);
    }


    @And("I enter Email {string}")
    public void iEnterEmail(String email) {
        underStandingCashInvestmentsPage.EnterEmail(email);
    }

    @And("I check the checkbox to receive insights for {string}")
    public void iCheckTheCheckboxToReceiveInsightsFor(String checkBoxOption) {
        underStandingCashInvestmentsPage.CheckTheCheckBoxOption(checkBoxOption);
    }

    @And("I click the Submit button")
    public void iClickTheSubmitButton() {
        underStandingCashInvestmentsPage.ClickSumbitButton();
    }

    @Then("I see the Thank you message displayed")
    public void iSeeTheThankYouMessageDisplayed() {
        boolean isMessageDisplayed = underStandingCashInvestmentsPage.IsThankYouMessageDisplayed();
        assertThat(isMessageDisplayed).isTrue();
    }
}
