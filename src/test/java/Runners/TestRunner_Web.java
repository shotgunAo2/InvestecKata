package Runners;

//import cucumber.api.*;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Feature"},
        glue={"StepDefinitions"},
        plugin = {
                "json:target/CucumberReportjson/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/Report.html",
                "junit:target/cucumber-reports/Cucumber.xml",
                "pretty","json:target/cucumber-json/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"
        },
        publish = true,
        monochrome = true
)

public class TestRunner_Web {

        }
