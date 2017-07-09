package com.debarnab.cucumbePOM.WebPages;

import com.debarnab.cucumbePOM.commonPages.PFgrmt_AfterLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    public PFgrmt_AfterLogin afterLoginPF;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        afterLoginPF = new PFgrmt_AfterLogin(driver);
    }

//    public HomePage(){
//        PageFactory.initElements(driver,this);
//        afterLoginPF = new PFgrmt_AfterLogin(driver);
//    }

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/a")
    private WebElement woman ;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    private WebElement dresses ;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tShirt ;

    public void clickWoman(){
        woman.click();
    }

    public void clickdresses(){
        dresses.click();
    }

    public void clickTShirt(){
        tShirt.click();
    }

    public boolean verifyPageElement(){
       return afterLoginPF.verifyPageElement();
    }
}
