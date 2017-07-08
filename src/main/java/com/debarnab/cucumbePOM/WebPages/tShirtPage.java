package com.debarnab.cucumbePOM.WebPages;

import com.debarnab.cucumbePOM.PageBase.basePage;
import com.debarnab.cucumbePOM.commonPages.PFgrmt_AfterLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class tShirtPage extends basePage {

    public  PFgrmt_AfterLogin afterLoginPF;
    private Actions actions;
    public tShirtPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        afterLoginPF = new PFgrmt_AfterLogin(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/a")
    private WebElement womanMenu;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    private WebElement dressMenu;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tshirtsMenu;

    @FindBy(how = How.XPATH, using = "//*[@id='columns']/div[1]/a[1]")
    private WebElement homeIcon;

    @FindBy(how = How.XPATH, using = "//*[@id='columns']/div[1]/a[2]")
    private WebElement WomanBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='columns']/div[1]/a[3]")
    private WebElement TopsMenu;

    // Catalog Section
    // Size - 3 options
    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_1']")
    private WebElement small;

    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_2']")
    private WebElement medium;

    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_3']")
    private WebElement large;

    // color 2 options
    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_13']")
    private WebElement orange;

    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_14']")
    private WebElement blue;

    // results section
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[1]/div")
    private WebElement result;

    // on hovering over results
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div")
    private WebElement displayAddToCart;

    // add to cart button
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
    private WebElement AddToCart;

    // verify that conformation message that successful addition is done to cart comes up
    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]")
    private WebElement confirmationMessageThatddedToCart;

    // confirmation Text
    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]/h2/text()[2]")
    private WebElement confirmationMessageThatddedToCartText;

    // proceed to checkOutBtn
    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    private WebElement proceedToCheckOut;

    public boolean verifyPageElement(){
        try{
            afterLoginPF.verifyPageElement();
            womanMenu.isDisplayed();
            dressMenu.isDisplayed();
            tshirtsMenu.isDisplayed();
            homeIcon.isDisplayed();
            WomanBtn.isDisplayed();
            TopsMenu.isDisplayed();
            small.isDisplayed();
            medium.isDisplayed();
            large.isDisplayed();
            orange.isDisplayed();
            blue.isDisplayed();
            return true;
        }catch(Exception e){e.printStackTrace(); return false; }
    }

    public boolean addTshirtToCart(String size,String color){
        try{
            // medium
            if(size.equalsIgnoreCase("small"))
                small.click();
            else if(size.equalsIgnoreCase("meduium"))
                medium.click();
            else if(size.equalsIgnoreCase("large"))
                large.click();
            // color
            if(color.equalsIgnoreCase("orange"))
                orange.click();
            else if(size.equalsIgnoreCase("blue"))
                blue.click();

//            // hover mouse over the result
//            //waitForElementToLoad(displayAddToCart);
            waitForElementToLoad(result);
            hoverOverElement(result);
//            waitForElementToLoad(displayAddToCart);
            waitForElementToLoad(AddToCart);
            AddToCart.click();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean verifyCartAdditionSection(){
        try{
            waitForElementToLoad(confirmationMessageThatddedToCart);
            confirmationMessageThatddedToCart.isDisplayed();
           return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public String verifyCartAdditionMessage(){
        try{
            waitForElementToLoad(confirmationMessageThatddedToCart);
            confirmationMessageThatddedToCart.isDisplayed();
            return confirmationMessageThatddedToCartText.getText();
        }catch(Exception e){
            e.printStackTrace();
            return "Error in getting confirmation Message";
        }
    }

    public void proceedCheckOut(){
        waitForElementToLoad(proceedToCheckOut);
        proceedToCheckOut.click();
    }

}
