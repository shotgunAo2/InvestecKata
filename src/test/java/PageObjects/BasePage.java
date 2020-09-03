package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BasePage {
    public static WebDriver browser;

   //public WebDriverWait wait = new WebDriverWait(browser,5);

    Wait wait = new FluentWait<WebDriver>(browser)
            .withTimeout(50, TimeUnit.SECONDS)
            .pollingEvery(3, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);



    public static void SetUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("useAutomationExtention","false");
        browser = new ChromeDriver(options);
        browser.manage().window().maximize();
        //browser.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void CloseBrowser() {
        browser.quit();
    }

    public String GetPageUrl()
    {
        return browser.getCurrentUrl();
    }

    public String GetPageTitle()
    {
        return browser.getTitle();
    }

    public void WaitForElementToBeVisible(By by)
    {
        try {
            wait.until(ExpectedConditions.visibilityOf(browser.findElement(by)));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
