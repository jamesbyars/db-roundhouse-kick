package com.ernesttech.roundhousekick.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = {"classpath:features"},
        glue = {"com.ernesttech.roundhousekick.cucumber"},
        plugin = {"pretty", "html:target/cucumber"})
public class RunCukesTest {
}