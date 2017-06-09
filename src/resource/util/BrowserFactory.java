package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	private BrowserFactory(){}
	
	public static WebDriver driver;
	private static FirefoxDriver firefox_BKP=null;
	private static InternetExplorerDriver ie_BKP=null;
	private static ChromeDriver chrome_BKP=null;
	
	public static void getBrowsewrInstance(String browser ) {
		//firefox
		if(browser.equalsIgnoreCase("firefox") && firefox_BKP  == null &&utiliyFactory.getProp("executionmode").contains("Standalone")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//");
			driver = new FirefoxDriver();
			firefox_BKP=(FirefoxDriver) driver;
			utiliyFactory.writeLogs("Loaded browser " + browser);
		}
		else if(browser.equalsIgnoreCase("firefox") && firefox_BKP  != null &&utiliyFactory.getProp("executionmode").contains("Standalone") ){
			driver = firefox_BKP;
			utiliyFactory.writeLogs("repointed to the already opened browser " + browser);
		}
		//chrome
		else if (browser.equalsIgnoreCase("chrome") && chrome_BKP==null &&utiliyFactory.getProp("executionmode").contains("Standalone")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
			driver = new ChromeDriver();
			chrome_BKP=(ChromeDriver) driver;
			utiliyFactory.writeLogs("Loaded browser " + browser);
		}
		
		else if (browser.equalsIgnoreCase("chrome") && chrome_BKP!=null &&utiliyFactory.getProp("executionmode").contains("Standalone")){			
			driver=chrome_BKP;
			utiliyFactory.writeLogs("repointed to the already opened browser " + browser);
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(utiliyFactory.getProp("timeout")), TimeUnit.SECONDS);
		utiliyFactory.writeLogs("Added Implicit Wait for webdriver");
		driver.manage().window().maximize();
		utiliyFactory.writeLogs("Maximized the browser Window");
		// need to code for the remote webdriver option		
	}

}
