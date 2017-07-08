package com.debarnab.cucumbePOM.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Debar on 7/2/2017.
 */
public class test {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("debarnab.banerjee@gmail.com");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("California0!");
        driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_1']")).click();
        driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_13']")).click();
        driver.findElement(By.xpath("//*[@id='layered_id_feature_11']")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div"))).build().perform();
        driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
    }
}
