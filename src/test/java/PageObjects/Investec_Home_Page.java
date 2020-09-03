package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Investec_Home_Page extends BasePage {

    public void Navigate_to_Investec_Home() throws InterruptedException {
        browser.navigate().to("http://www.investec.com");
    }

    public void ClickSearchOption()
    {
        //WaitForElementToBeVisible(By.className("search-toggler__hitArea"));
        WebElement searchOption = browser.findElement(By.className("search-toggler__hitArea"));
        searchOption.click();
    }

    public void EnterTextInSearchBox(String textToSearch)
    {
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBarInput")));
        WebElement searchBarInput = browser.findElement(By.id("searchBarInput"));
        searchBarInput.sendKeys(textToSearch);
    }
}
