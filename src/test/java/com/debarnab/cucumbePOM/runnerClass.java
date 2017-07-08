package com.debarnab.cucumbePOM;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resource//",
        //  ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        // ,glue={"//main//java//steps//tShirtPageSteps"},
        format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
        ,tags = {"~@Ignore"}
)
public class runnerClass {
    @AfterClass
    public static void clear(){
    System.gc();
    }

}

