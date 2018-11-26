package tc;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"progress",
            "html:build/report/html",
            "junit:build/report/junit/cucumber-report.xml",
            "json:build/report/json/cucumber-report.json"
    },
   monochrome = true,
    features = {"C:\\Users\\jitender.ahuja\\git\\BDD\\BDD_Pro\\feature_files\\tc\\first.feature"}
    )
public class RunCukesTest {

}