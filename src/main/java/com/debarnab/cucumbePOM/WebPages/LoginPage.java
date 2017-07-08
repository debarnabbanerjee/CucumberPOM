package com.debarnab.cucumbePOM.WebPages;

import com.debarnab.cucumbePOM.commonPages.PFgrmt_BeforeLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public PFgrmt_BeforeLogin pf_bfrlgn;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        pf_bfrlgn = new PFgrmt_BeforeLogin(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private WebElement userame ;

    @FindBy(how = How.XPATH, using = "//*[@id='passwd']")
    private WebElement password ;

    @FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
    private WebElement siginBtn ;

    public void doLogin(String usrNme,String psswd){
        userame.sendKeys(usrNme);
        password.sendKeys(psswd);
        siginBtn.click();
    }

    public void doRegistration(){

    }

    public void forgotPassword(){

    }

}
