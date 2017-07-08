package com.debarnab.cucumbePOM.WebPages;

import com.debarnab.cucumbePOM.commonPages.PFgrmt_BeforeLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {

    // encapsulated page fragment class
    public PFgrmt_BeforeLogin pf_bfrlgn;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        pf_bfrlgn = new PFgrmt_BeforeLogin(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement singinBtn ;

    public void clickSignBtn(){
        try{
            singinBtn.click();
            //log
        }catch (Exception e){
            e.printStackTrace();
            // log here
        }
    }



}
