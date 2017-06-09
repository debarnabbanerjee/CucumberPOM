package com.debarnab.cucumbePOM;

import java.io.File;
import java.util.Iterator;

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
		if(utiliyFactory.getProp("executionmode").equalsIgnoreCase("Standalone")){

			utiliyFactory.writeLogs("Trying to close browser for standalone running ");
			if(BrowserFactory.chrome_BKP!=null){

				BrowserFactory.chrome_BKP.quit();
				BrowserFactory.chrome_BKP=null;
				utiliyFactory.writeLogs("Closed Chrome Browser ");
			} if(BrowserFactory.firefox_BKP!=null){

				BrowserFactory.firefox_BKP.quit();
				BrowserFactory.firefox_BKP=null;
				utiliyFactory.writeLogs("Closed Firefox Browser ");
			} if(BrowserFactory.ie_BKP!=null){

				BrowserFactory.ie_BKP.quit();
				BrowserFactory.ie_BKP=null;
				utiliyFactory.writeLogs("Closed IE Browser ");
			}	
		} else if(utiliyFactory.getProp("executionmode").equalsIgnoreCase("grid")){
			utiliyFactory.writeLogs("Trying to close browser for gird running ");
			//BrowserFactory.chrome_BKP.quit();
			//BrowserFactory.ie_BKP.quit();
			BrowserFactory.driver.quit();			
		}	
		
		try{
			FileUtils.copyFile(new File(System.getProperty("user.dir")+"//logs//app.logs"), new File(System.getProperty("user.dir")+"//Execution Results//"+utiliyFactory.returnPath()+"//app.logs"));
		}catch(Exception e){
			e.printStackTrace();
		}	

	}
}
