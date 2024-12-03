package com.Flipkart.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\MJ\\eclipse-workspace\\list\\FlipkartProject\\src\\test\\resources\\Flipkart.feature",
                         glue = "com.Flipkart",
                         dryRun = false,
                         monochrome= true,
                         plugin = {"html:target/html", "json:target/report.json"} )
                         
                                                                                          


public class Testrunner {

}
