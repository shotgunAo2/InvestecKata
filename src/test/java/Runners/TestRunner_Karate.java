package Runners;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "src/test/Feature-Karate")

public class TestRunner_Karate {

}
