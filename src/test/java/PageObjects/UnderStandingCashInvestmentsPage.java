package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UnderStandingCashInvestmentsPage extends BasePage {
    public  void ClickSignUpButton() {
        WebElement signUpButton = browser.findElement(By.className("button-primary"));
        signUpButton.click();
    }

    public void EnterName(String firstName) throws InterruptedException {

        EnterTextInInputBoxByName(firstName,"name");
    }

    public void EnterTextInInputBoxByName(String firstName, String byNameElement) {
        WaitForElementToBeVisible(By.name(byNameElement));
        WebElement inputBoxHolder = browser.findElement(By.name(byNameElement));
        inputBoxHolder.click();
        inputBoxHolder.sendKeys(firstName);
    }

    public void EnterSurname(String surname) {
        EnterTextInInputBoxByName(surname,"surname");
    }

    public void EnterEmail(String email) {
        EnterTextInInputBoxByName(email,"email");
    }

    public void CheckTheCheckBoxOption(String checkBoxOption) {
        List<WebElement> allCheckBoxes = browser.findElements(By.className("checkbox-input__button-copy"));

        for(WebElement individualCheckBoxOption:allCheckBoxes)
        {
            System.out.println(individualCheckBoxOption.getText());
            if(individualCheckBoxOption.getText().equals(checkBoxOption))
            {
                individualCheckBoxOption.click();
            }
        }
    }

    public void ClickSumbitButton() {
        WebElement submitButton = browser.findElement(By.className("forms__submit"));
        submitButton.click();
    }

    public boolean IsThankYouMessageDisplayed() {
        WaitForElementToBeVisible(By.className("thank-you__heading"));
        boolean isMessageDisplayed = browser.findElement(By.className("thank-you__heading")).isDisplayed();
        return isMessageDisplayed;
    }
}