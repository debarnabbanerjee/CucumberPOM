package com.debarnab.cucumbePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.utiliyFactory;
public class LoginPage {	
	LoginPage(WebDriver driver){		
		PageFactory.initElements(driver,this);
	}
	public boolean isLoggedIn=false;
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
	public WebElement username ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	public WebElement password ;	
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnLogin']")
	public WebElement loginBtn ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='branding']/a[1]")
	public WebElement joinHrmCommunity ;	
	
	public boolean doLogin(String usrName,String psswd){
		try{
			utiliyFactory.writeLogs("Trying to login with " + usrName + " and " + psswd);
			username.sendKeys(usrName);
			password.sendKeys(psswd);
			loginBtn.click();
			
			if(joinHrmCommunity.isDisplayed())
				return true;
		}catch(Exception e){
			utiliyFactory.writeLogs("Error in login " + e.getMessage());
			return false;
		}
		return false;
	}
	
	
	
	
	
		
	
	
	
}
