package com.debarnab.cucumbePOM.PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

import static utils.BrowserFactory.driver;

public class basePage {
    private Actions action;
    private WebDriver driver = BrowserFactory.driver;
    private WebDriverWait wait;

//    basePage(WebDriver driver){
//        this.driver= driver;
//    }

    public void hoverOverElement(WebElement element){
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public void waitForElementToLoad(WebElement element){
        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
