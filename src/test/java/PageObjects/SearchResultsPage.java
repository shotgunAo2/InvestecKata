package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultsPage extends BasePage {

    public void ClickOnSearchText(String searchOptionToClick) throws InterruptedException {
        WaitForElementToBeVisible(By.className("search-results__title"));
        List<WebElement> searchList = browser.findElements(By.className("search-results__title"));
        for (WebElement searchItem: searchList)
        {
            System.out.println(searchItem.getText());
            if(searchItem.getText().toLowerCase().equals(searchOptionToClick.toLowerCase()))
            {
                searchItem.click();
                break;
            }
        }
    }
}
