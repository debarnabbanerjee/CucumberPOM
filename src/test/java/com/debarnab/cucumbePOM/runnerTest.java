package com.debarnab.cucumbePOM;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import util.BrowserFactory;
import util.utiliyFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = false, format = { "pretty",
	   "json:target/cucumber.json" ,"html:target/Destination"}, tags = { "~@ignore" },
		features = {"src\\test\\java\\com\\debarnab\\cucumbePOM"})
public class runnerTest {
	
	static String firstScenarioName="";
	
	@BeforeClass
	public static void setUp(){
		
	}
	

    @AfterClass
    public static void tearDown(){
    	utiliyFactory.writeLogs("Trying to close browser ");
		if(BrowserFactory.driver!=null){
			//BrowserFactory.driver.quit();
			BrowserFactory.driver.quit();
			BrowserFactory.driver=null;
		}
			
		utiliyFactory.writeLogs("Closed browser ");
		
		try{
			FileUtils.copyFile(new File(System.getProperty("user.dir")+"//logs//app.logs"), new File(System.getProperty("user.dir")+"//Execution Results//"+utiliyFactory.returnPath()+"//app.logs"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
    }

}
