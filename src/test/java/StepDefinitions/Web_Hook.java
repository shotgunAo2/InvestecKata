package StepDefinitions;

import PageObjects.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Web_Hook {

    @Before
    public void InitializeTest(Scenario s)
    {

        if (!s.getSourceTagNames().toString().equals("[@apiTest]"))
        {
            BasePage.SetUp();
        }
        else{
            System.out.println("Api test browser not started");
        }
    }

    @After
    public void TearDownTest(Scenario s)
    {
        if (!s.getSourceTagNames().toString().equals("[@apiTest]"))
        {
            BasePage.CloseBrowser();
        }
    }

    @AfterStep
    public void TakeScreenShot(Scenario s) throws IOException, InterruptedException {
        if (!s.getSourceTagNames().toString().equals("[@apiTest]")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HHmmss");
            LocalDateTime dateTime = LocalDateTime.now();
            File scr = ((TakesScreenshot) BasePage.browser).getScreenshotAs(OutputType.FILE);
            File dest = new File(String.format(System.getProperty("user.dir")), "\\screenshots\\" + dateTime.format(formatter) + ".png");
            FileUtils.copyFile(scr, dest);
            Thread.sleep(100);
        }
    }
}
