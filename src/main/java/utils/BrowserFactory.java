package utils;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    private BrowserFactory() {
    }

    public static WebDriver driver;
    //	public static FirefoxDriver firefox_BKP=null;
//	public static InternetExplorerDriver ie_BKP=null;
//	public static ChromeDriver chrome_BKP=null;
    private static DesiredCapabilities cap_grid = null;
    private static DesiredCapabilities cap_standalone = null;
    private static boolean isGridStarted = false;

    public static void getBrowser(String browser) {
        System.out.println("prop is " + utiliyFactory.getProp("executionmode").equalsIgnoreCase(("Standalone")));
        if (utiliyFactory.getProp("executionmode").equalsIgnoreCase(("Standalone"))) {
            getStandAloneBrowser(browser);
        } else if (utiliyFactory.getProp("executionmode").contains("grid")) {
            gripOperations(browser);
        }
    }

    private static void getStandAloneBrowser(String browser) {
        //firefox
        if (browser.equalsIgnoreCase("firefox")) {
            //System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//geckodriver.exe");
            System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "//geckodriver.exe");
            cap_standalone = DesiredCapabilities.firefox();
            cap_standalone.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new FirefoxDriver(cap_standalone);
            //utiliyFactory.writeLogs("Loaded browser " + browser);
        }
        //chrome
        else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
            cap_standalone = DesiredCapabilities.chrome();
            cap_standalone.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new ChromeDriver(cap_standalone);
        }
        //ie
        else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//IEDriverServer.exe");
            cap_standalone = DesiredCapabilities.internetExplorer();
            cap_standalone.setCapability("ignoreZoomSetting", true);
            cap_standalone.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new InternetExplorerDriver(cap_standalone);
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Integer.valueOf(utiliyFactory.getProp("implicitTimeout")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Integer.valueOf(utiliyFactory.getProp("pageLodTimeOut")), TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(Integer.valueOf(utiliyFactory.getProp("scriptTimeOut")), TimeUnit.SECONDS);
        //utiliyFactory.writeLogs("Added Implicit Wait for webdriver");
        driver.manage().window().maximize();
        //utiliyFactory.writeLogs("Maximized the browser Window");
    }

    // need to code for the remote webdriver
    private static void gripOperations(String browser) {
        // start up hub and node
        startNodeAndHub();

        cap_grid = new DesiredCapabilities();
        if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Inside firefox cap check");
            cap_grid.firefox();
            cap_grid.setCapability(CapabilityType.BROWSER_NAME, "firefox");
            //cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
            cap_grid.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
            //cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, Platform.ANY);
            cap_grid.setCapability(CapabilityType.VERSION, "54.0");

            utiliyFactory.writeLogs("Set Capabilities for " + browser);
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Inside chrome cap check");
            cap_grid.chrome();
            cap_grid.setCapability(CapabilityType.BROWSER_NAME, "chrome");
            //cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
            //cap.setCapability(CapabilityType.PLATFORM, Platform.ANY);
            //cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, Platform.ANY);

            utiliyFactory.writeLogs("Set Capabilities for " + browser);
        } else if (browser.equalsIgnoreCase("ie")) {
            cap_grid.internetExplorer();
            cap_grid.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
            cap_grid.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
            cap_grid.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
            //cap_grid.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, Platform.WINDOWS);
            utiliyFactory.writeLogs("Set Capabilities for " + browser);
        }


        try {
            //driver =new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"),cap);
            //http://localhost:4445/wd/hub
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap_grid);
        } catch (MalformedURLException e) {
            utiliyFactory.writeLogs("Unable to open the remote webdriver " + e.getMessage());
            return;
        }

    }

    private static void startNodeAndHub() {

        if (isGridStarted == false) {
            try {
                String[] command = {"cmd.exe", "/C", "Start", "startHub.bat"};
                Process p = Runtime.getRuntime().exec(command);

                //add assertion of the consol logs that grid has started
                Thread.sleep(3000);

                String[] command1 = {"cmd.exe", "/C", "Start", "startNode.bat"};
                Process p1 = Runtime.getRuntime().exec(command1);
                //add assertion of the consoel logs that node has started
                isGridStarted = true;
                utiliyFactory.writeLogs("Selenium Grid Started");
            } catch (Exception ex) {
                utiliyFactory.writeLogs("Coudldn't start Selenium Grid " + ex.getMessage());
                return;
            }
        } else if (isGridStarted == true) {
            utiliyFactory.writeLogs("Selenium Grid already opened hence ignoring ...");
            return;
        }


    }

    public static void closeBrowser() {
        //close the browser
        try {
            if (BrowserFactory.driver != null) {
                Thread.sleep(2000L);
                if (BrowserFactory.driver instanceof InternetExplorerDriver) {
                    try {
                        Runtime.getRuntime().exec("taskkill /f /fi \"pid gt 0\" /im IEDriverServer.exe");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Runtime.getRuntime().exec("taskkill /f /fi \"pid gt 0\" /im iexplore.exe");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else
                    BrowserFactory.driver.quit();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static byte[] takeScreenShot(Scenario s) {
        return ((TakesScreenshot) BrowserFactory.driver).getScreenshotAs(OutputType.BYTES);
        // return ((TakesScreenshot) BrowserFactory.driver).getScreenshotAs(OutputType.FILE);
//            try {
//                FileUtils. copyFile(f, new File(System.getProperty("user.dir")+"//selenium/error.png"))
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
