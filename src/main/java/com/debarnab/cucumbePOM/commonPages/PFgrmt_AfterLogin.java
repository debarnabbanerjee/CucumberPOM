package com.debarnab.cucumbePOM.commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PFgrmt_AfterLogin {

    public PFgrmt_AfterLogin(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='contact-link']/a")
    private  WebElement contactUsBtn ;

    @FindBy(how = How.XPATH, using = "//*[@id='header_logo']/a/img")
    private  WebElement landingPageLogo ;

    @FindBy(how = How.XPATH, using = "//*[@id='search_query_top']")
    private  WebElement searchbar ;

    @FindBy(how = How.XPATH, using = "//*[@id='searchbox']/button")
    private  WebElement searchbtn ;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
    private  WebElement cartDisplay ;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    private  WebElement signOut ;

//    @FindBy(how = How.XPATH, using = "/*[@id='header']/div[2]/div/div/nav/div[1]/a")
//    private  WebElement displayedName ;

    public boolean verifyPageElement(){
        try{
            contactUsBtn.isDisplayed();
            landingPageLogo.isDisplayed();
            searchbar.isDisplayed();
            searchbtn.isDisplayed();
            cartDisplay.isDisplayed();
            signOut.isDisplayed();
            //displayedName.isDisplayed();
            // log that all the elements are present
            return true;
        }catch(Exception e){
            e.printStackTrace();
            // log the error here
            return false;
        }
    }


}
