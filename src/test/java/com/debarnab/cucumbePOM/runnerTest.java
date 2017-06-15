package com.debarnab.cucumbePOM;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import utility.BrowserFactory;
import utility.utiliyFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = false, format = { "pretty",
				"json:target/cucumber.json" ,"html:target/Destination"}, tags = { "~@ignore" },
				features = {"src\\test\\java\\com\\debarnab\\cucumbePOM"})
public class runnerTest {

	static String firstScenarioName="";

	

	@AfterClass
	public static void tearDown(){
		if(utiliyFactory.getProp("executionmode").equalsIgnoreCase("Standalone")){

			utiliyFactory.writeLogs("Trying to close browser for standalone running ");
			if(BrowserFactory.chrome_BKP!=null){

				BrowserFactory.chrome_BKP.quit();
				BrowserFactory.chrome_BKP=null;
				utiliyFactory.writeLogs("Closed Chrome Browser ");
			} 
			
			if(BrowserFactory.firefox_BKP!=null){

				BrowserFactory.firefox_BKP.quit();
				BrowserFactory.firefox_BKP=null;
				
				utiliyFactory.writeLogs("Closed Firefox Browser ");
			} 
			
		//	if(BrowserFactory.ie_BKP!=null){
				BrowserFactory.ie_BKP.close();
				BrowserFactory.ie_BKP=null;
				utiliyFactory.writeLogs("Closed IE Browser ");
				
				try {
					utiliyFactory.writeLogs("Trying to kill the  IE task now");
					Runtime.getRuntime().exec("taskkill /C /IM iexplore.exe");
					utiliyFactory.writeLogs("Killed the  IE task now");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					utiliyFactory.writeLogs("Unable to kill the IE task " +e.getMessage());
				}
		//	}	
			
			utiliyFactory.writeLogs("Closed all browsers for standalone running ");
		}
		
		
		// Below logic is for grid execution
		else if(utiliyFactory.getProp("executionmode").equalsIgnoreCase("grid")){
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
