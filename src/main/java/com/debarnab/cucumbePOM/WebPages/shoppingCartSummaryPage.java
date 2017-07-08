package com.debarnab.cucumbePOM.WebPages;

import com.debarnab.cucumbePOM.commonPages.PFgrmt_AfterLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;


public class shoppingCartSummaryPage {
    public PFgrmt_AfterLogin afterLoginPF;
    public shoppingCartSummaryPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        afterLoginPF = new PFgrmt_AfterLogin(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='cart_title']")
    public WebElement shoppingCartSummmarytext ;

    @FindBy(how = How.XPATH, using = "//*[@id='product_1_1_0_6981']/td[2]/p/a")
    public WebElement addedTshirtInartName ;

     @FindBy(how = How.XPATH, using = "//*[@id='product_1_1_0_6981']/td[2]/small[2]/a")
    public WebElement addedTshirtInartAttributes ;

    @FindBy(how = How.XPATH, using = "//*[@id='product_1_1_0_6981']/td[3]/span")
    public WebElement inStockorNot ;

    @FindBy(how = How.XPATH, using = "//*[@id='product_price_1_1_6981']/span")
    public WebElement unitPrice ;

    @FindBy(how = How.XPATH, using = "//*[@id='product_1_1_0_6981']/td[5]/input[2]")
    public WebElement quantity ;

    @FindBy(how = How.XPATH, using = "//*[@id='cart_quantity_up_1_1_0_6981']/span")
    public WebElement increaseQnty ;

    @FindBy(how = How.XPATH, using = "//*[@id='cart_quantity_down_1_1_0_6981']/span")
    public WebElement decreaseQnty ;

    @FindBy(how = How.XPATH, using = "//*[@id='total_product_price_1_1_6981']")
    public WebElement totalPrice ;


    @FindBy(how = How.XPATH, using = "//*[@id='1_1_0_6981']/i")
    public WebElement deleteItems ;

    @FindBy(how = How.XPATH, using = "//*[@id='total_product']")
    public WebElement totalProducts ;

    @FindBy(how = How.XPATH, using = "//*[@id='total_shipping']")
    public WebElement totalSipping ;

    @FindBy(how = How.XPATH, using = "//*[@id='total_price_without_tax']")
    public WebElement total ;

    @FindBy(how = How.XPATH, using = "//*[@id='total_tax']")
    public WebElement tax ;

    @FindBy(how = How.XPATH, using = "//*[@id='total_price']")
    public WebElement grandTotal ;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/p[2]/a[1]/span")
    public WebElement proceedToCheckOut ;

    public boolean verifyPageElement(){
        try{
            shoppingCartSummmarytext.isDisplayed();
            addedTshirtInartName.isDisplayed();
            inStockorNot.isDisplayed();
            unitPrice.isDisplayed();
            quantity.isDisplayed();
            inStockorNot.isDisplayed();
            decreaseQnty.isDisplayed();
            total.isDisplayed();
            deleteItems.isDisplayed();
            totalProducts.isDisplayed();
            totalSipping.isDisplayed();
            total.isDisplayed();
            tax.isDisplayed();
            grandTotal.isDisplayed();
            proceedToCheckOut.isDisplayed();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    //String unitPrice,String totalSipping,String quantity,String total,String tax , String grandTotal
    public HashMap<WebElement, String> getPriceDisplayed(){
        try{
            HashMap<WebElement,String> pricesMap = new HashMap<WebElement,String>();
            pricesMap.put(unitPrice,unitPrice.getText());
            pricesMap.put(totalSipping,totalSipping.getText());
            pricesMap.put(quantity,quantity.getText());
            pricesMap.put(total,total.getText());
            pricesMap.put(tax,tax.getText());
            pricesMap.put(grandTotal,grandTotal.getText());
            return pricesMap;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void getProductSizeColorSize(){
        // TODO
    }
}
