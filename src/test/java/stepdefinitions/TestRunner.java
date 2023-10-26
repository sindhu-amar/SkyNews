package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/skyNews.feature",
        glue = "stepdefinitions",
        monochrome = true,
        publish = true,
        plugin = { "pretty",  "html:Reports/cucumber-pretty" })


public class TestRunner {

}
