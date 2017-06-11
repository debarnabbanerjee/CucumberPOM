package com.debarnab.cucumbePOM;

import java.io.File;
import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import util.BrowserFactory;
import util.utiliyFactory;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class testSteps {

	private boolean loginResult=false;
	private boolean isLoggedIn=false;
	private String scenarioName="";
	private int iter=0;
	
	@Before
	public static  void setUp(){
		utiliyFactory.getutiliyInstance();			
	}
		
	@After
	public void tearDown(Scenario s){

		// capability to take screenshot
		if(s.isFailed()){
			// take screenshots
			try {
				if(BrowserFactory.driver!=null){
					byte[] screenshot = ((TakesScreenshot) BrowserFactory.driver).getScreenshotAs(OutputType.BYTES);
					s.embed(screenshot, "image/png");
					try {
						FileUtils.copyFile(((TakesScreenshot) BrowserFactory.driver).getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"//Execution Results//"+utiliyFactory.returnPath()+"//"+s.getName()+".png"));

					} catch (IOException e) {
						// TODO Auto-generated catch block
						utiliyFactory.writeLogs("Unable to take screenshot in the Execution results folder" +  e.getMessage());
						//e.printStackTrace();
					}
				}
				
				else if(BrowserFactory.driver==null){
					utiliyFactory.writeLogs("Unable to take screenshot as driver object is null");
				}
			} catch (WebDriverException wde) {
				utiliyFactory.writeLogs("Unable to take screenshot " +  wde.getMessage());
			} catch (ClassCastException cce) {
				utiliyFactory.writeLogs("Unable to take screenshot " +  cce.getMessage());
			}
		}

		// closing the browsers in case of grid running 
		if(utiliyFactory.getProp("executionmode").equalsIgnoreCase("grid")){
			utiliyFactory.writeLogs("As Execution Mode is set to Grid hence closing the browser");
			BrowserFactory.driver.quit();
			utiliyFactory.writeLogs("Closed the browser after execution iteration");
		}
	}

//	*************************************************************************************************************************************
//	In the below section keep of adding the glue codes for the steps defined in the feature files.
//	*************************************************************************************************************************************

	@Given("^WH User navigates to \"(.*?)\" site using \"(.*?)\"$")
	public void wh_User_navigates_to_site_using(String url, String browserType) throws Throwable {
		BrowserFactory.getBrowsewrInstance(browserType);
		try{
			BrowserFactory.driver.navigate().to(utiliyFactory.getProp("baseUrl"));
			Assert.assertEquals(200,utiliyFactory.checkResponse(BrowserFactory.driver.getCurrentUrl()));
			utiliyFactory.writeLogs("Opened the base url with browserType " +  browserType);
		}catch(Exception e){
			utiliyFactory.writeLogs("Unable to navigate to browser " +  e.getMessage());
			return ;
		}
	}

	@Then("^I validate the page title as \"(.*?)\"$")
	public void i_validate_the_page_title_as(String arg1) throws Throwable {
		try{
			Assert.assertEquals(arg1,BrowserFactory.driver.getTitle());
			utiliyFactory.writeLogs("Page Title Validation done . Actual is " + BrowserFactory.driver.getTitle());
		}catch(Exception e){
			utiliyFactory.writeLogs("FAIL - Page Title mismatch. Actual is " + BrowserFactory.driver.getTitle());
		}
	}

	@Then("^I validate the Login with \"(.*?)\" credentials$")
	public void i_validate_the_Login_with_credentials(String type) throws Throwable {

		//System.out.println("type is " + type );
		//System.out.println("Login Result is " +loginResult );
		utiliyFactory.writeLogs("Validating login for credentials type of " + type);

		if(type.trim().equalsIgnoreCase("correct") && loginResult==false){
			//System.out.println("******AA");
			utiliyFactory.writeLogs("FAIL -- Unable to login with correct credentials");
			isLoggedIn=false;
			Assert.fail("FAIL - Unable to Login with correct credentials");
		}
		else if(type.trim().equalsIgnoreCase("correct") && loginResult==true){
			//System.out.println("**** BB");
			utiliyFactory.writeLogs("PASS - Able to login with correct credentials");
			isLoggedIn=true;
			//HomePage_Admin hp = new HomePage_Admin(BrowserFactory.driver);
			// instantiation of home page class will depend on the login access level used . 
			// Hence need to capture the type username used and hence instatiate the correct login class

		}

		else if(type.trim().equalsIgnoreCase("incorrect") && loginResult==true){
			//System.out.println("******* CC");
			utiliyFactory.writeLogs("FAIL - Able to login with incorrect credentials");
			isLoggedIn=false;
			Assert.fail("FAIL - Able to login with incorrect credential");

		}
		else if(type.trim().equalsIgnoreCase("incorrect") && loginResult==false){
			//System.out.println("****** DD");
			utiliyFactory.writeLogs("PASS - Unable to login with incorrect credentials");
			isLoggedIn=false;				
		}		
	}

	@When("^I try to Login with the following data:$")
	public void i_try_to_Login_with_the_following_data(DataTable table) throws Throwable {		
		LoginPage lp = new LoginPage(BrowserFactory.driver);
		try{
			List<List<String>> list = table.raw();
			utiliyFactory.writeLogs("Tryin to login using ussername as " + list.get(1).get(1) + " and password as "
					+ list.get(1).get(1));
			loginResult = lp.doLogin(list.get(2).get(1), list.get(1).get(1));
			Assert.assertEquals(utiliyFactory.checkResponse(BrowserFactory.driver.getCurrentUrl()), 200);
			//Assert.fail("login Failed and checking screenshots");
		}catch(Exception e){
			utiliyFactory.writeLogs("Error while login in  " + e.getMessage());
		}
	}
}
