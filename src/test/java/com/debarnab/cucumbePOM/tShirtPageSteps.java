package com.debarnab.cucumbePOM;

import com.debarnab.cucumbePOM.WebPages.*;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utils.BrowserFactory;
import utils.utiliyFactory;

import java.io.IOException;
import java.util.List;

public class tShirtPageSteps {

    private HomePage homePage;
    private tShirtPage TShirtPage;
    private shoppingCartSummaryPage shoppingCartSummarypage;
    private Class cls;
    private Object obj;

//    File f;byte[] screenshot;
//    public void takeScreenshot(){
//        screenshot = ((TakesScreenshot) BrowserFactory.driver)
//                .getScreenshotAs(OutputType.BYTES);
//        f = ((TakesScreenshot) BrowserFactory.driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils. copyFile(f, new File(System.getProperty("user.dir")+"//selenium/error.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Before
    public void setUp() {
        System.out.println("From Before Class");
        utiliyFactory.getutiliyInstance();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
//        System.out.println("From After Class");
//        if (scenario.isFailed()) {
//            scenario.embed(BrowserFactory.takeScreenShot(scenario), "image/png"); //stick it in the report
//            //scenario.write("Failure is here");
//        }
        BrowserFactory.closeBrowser();
    }

    @Given("^I open a browser using \"([^\"]*)\"$")
    public void i_open_a_browser_using(String browserType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("browser is " + browserType);
        BrowserFactory.getBrowser(browserType);
    }

    @When("^I navigate to \"([^\"]*)\" of application$")
    public void i_navigate_to(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("url is " + url);
        BrowserFactory.driver.navigate().to(utiliyFactory.getProp(url));
    }

    @Then("^I see the title as \"([^\"]*)\"$")
    public void i_see_the_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("I see the title as " + arg1);
        Assert.assertEquals(arg1, BrowserFactory.driver.getTitle());
    }

    @Then("^I try to sign in entering userame and password as :$")
    public void i_enter_userame_and_password_as(DataTable loginData) throws Throwable {
        final List<List<String>> data = loginData.raw();
        //System.out.println("User name is " + data.get(1).get(1) + " password is " + data.get(2).get(1));
        LandingPage lp = new LandingPage(BrowserFactory.driver);
        Assert.assertTrue(lp.pf_bfrlgn.verifylandingPageElementsPresent());
        lp.clickSignBtn();
        Assert.assertTrue(BrowserFactory.driver.getTitle().equals("Login - My Store"));
        LoginPage loginPage = new LoginPage(BrowserFactory.driver);
        loginPage.pf_bfrlgn.verifylandingPageElementsPresent();
        loginPage.doLogin(data.get(1).get(1), data.get(2).get(1));
    }

    @Then("^I validate the login as per \"([^\"]*)\"$")
    public void i_validate_the_login_as_per_Y(String type) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // System.out.println("I validate the login as per " + type);
        if (type.equalsIgnoreCase("Y")) {
            Assert.assertEquals(BrowserFactory.driver.getTitle(), "My account - My Store");
        } else if (type.equalsIgnoreCase("N")) {
            Assert.assertEquals(BrowserFactory.driver.getTitle(), "Login - My Store");
        }
    }

    // below is for booking a tshrt
    //private HomePage homePage;

    @Then("^I validate the \"([^\"]*)\" elements$")
    public void i_validate_the_elements(String classForName) throws Throwable {
        try {
            // below code is with reflection
            Object result = utiliyFactory.instantiateClass(classForName,"verifyPageElement");
            Assert.assertEquals(result.toString(),"true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I click on \"([^\"]*)\" on \"([^\"]*)\"$")
    public void i_click_on(String category,String page) throws Throwable {
        utiliyFactory.instantiateClass(page,"click"+category);
    }

    @When("^I try to add an item in \"([^\"]*)\" with the following features:$")
    public void i_try_to_buy_a_with_the_following_features(String category , DataTable table) throws Throwable {
        // for tshirt page
        if(category.equalsIgnoreCase("tShirt")){
            final List<List<String>> raw = table.raw();
           // System.out.println("Size is " + raw.get(1).get(1));
           // System.out.println("Color is " + raw.get(2).get(1));
          //  Assert.assertTrue(TShirtPage.addTshirtToCart(raw.get(1).get(1),raw.get(2).get(1)));

        // Below code is using reflection
           Object result =  utiliyFactory.instantiateClass(category,"addToCart");
            Assert.assertEquals(result.toString(),"true");

        }
    }

    @Then("^I verify that the added \"([^\"]*)\" in cart$")
    public void i_verfify_the_added_category_InCart(String category) throws Throwable {
        // for tshirt page
        if(category.equalsIgnoreCase("tShirt")){
            TShirtPage.verifyCartAdditionSection();
        }
    }
    @Then("^I verify \"([^\"]*)\" the confirmation message as \"([^\"]*)\"$")
    public void i_verfify_the_confirmation_message_of_the_category(String category,String messsage) throws Throwable {
        // for tshirt page
        if(category.equalsIgnoreCase("tShirt")){
            Assert.assertEquals(TShirtPage.verifyCartAdditionMessage(),messsage);
        }
    }

    @And("^I click \"([^\"]*)\" checkOut btn$")
    public void i_click_category_clickBtn(String category) throws Throwable {
        // for tshirt page
        if(category.equalsIgnoreCase("TShirts")){
            TShirtPage.proceedCheckOut();
        }
    }

    @Then("^I validate the added item to have the following:$")
    public void i_validate_the_added_item_to_have_the_following(DataTable arg1) throws Throwable {


    }

    @Then("^I validate that the prices of the product in cart as:$")
    public void i_validate_that_the_prices_of_the_product_in_cart_as(DataTable arg1) throws Throwable {


    }





}
