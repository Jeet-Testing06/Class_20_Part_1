package tc;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"progress",
            "html:build/report/html",
            "junit:build/report/junit/cucumber-report.xml",
            "json:build/report/json/cucumber-report.json"
    },
   monochrome = true,
    features = {"C:\\\\Users\\\\ZEAHDCE\\\\Rest_Assured\\\\BDD_Pro\\\\feature_files\\\\tc"}
    )
public class RunCukesTest {

}