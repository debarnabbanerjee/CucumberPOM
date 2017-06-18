package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javafx.beans.value.WritableLongValue;

public class BrowserFactory {

	private BrowserFactory(){}

	public static WebDriver driver;
	public static FirefoxDriver firefox_BKP=null;
	public static InternetExplorerDriver ie_BKP=null;
	public static ChromeDriver chrome_BKP=null;	
	private static DesiredCapabilities cap =null;
	private static boolean isGridStarted = false;
	
	public static void getBrowsewrInstance(String browser){
		if(utiliyFactory.getProp("executionmode").equalsIgnoreCase(("Standalone"))){
			standAlondInstance(browser);
		}else if(utiliyFactory.getProp("executionmode").contains("grid")){
			gripOperations(browser);
		}
	}

	private static void standAlondInstance(String browser) {

		// check if the execution type is standalone or not.
		// if standalone
		//if(utiliyFactory.getProp("executionmode").contains("Standalone")){
		
			//firefox
			if(browser.equalsIgnoreCase("firefox") && firefox_BKP  == null ){
				//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//geckodriver.exe");
				System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir")+"//geckodriver.exe");
				driver = new FirefoxDriver();
				firefox_BKP=(FirefoxDriver) driver;
				utiliyFactory.writeLogs("Loaded browser " + browser);
			}
			else if(browser.equalsIgnoreCase("firefox") && firefox_BKP  != null){
				driver = firefox_BKP;
				utiliyFactory.writeLogs("repointed to the already opened browser " + browser);
			}
			//chrome
			else if (browser.equalsIgnoreCase("chrome") && chrome_BKP==null){
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
				driver = new ChromeDriver();
				chrome_BKP=(ChromeDriver) driver;
				utiliyFactory.writeLogs("Loaded browser " + browser);
			}
			
			else if (browser.equalsIgnoreCase("chrome") && chrome_BKP!=null){			
				driver=chrome_BKP;
				utiliyFactory.writeLogs("repointed to the already opened browser " + browser);
			}
			//ie
			else if (browser.equalsIgnoreCase("ie") && ie_BKP==null){
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//IEDriverServer.exe");
				driver = new InternetExplorerDriver();				
				ie_BKP=(InternetExplorerDriver) driver;
				utiliyFactory.writeLogs("Loaded browser " + browser);
			}
			
			else if (browser.equalsIgnoreCase("ie") && ie_BKP!=null){			
				driver=ie_BKP;
				utiliyFactory.writeLogs("repointed to the already opened browser " + browser);
			}
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Integer.valueOf(utiliyFactory.getProp("timeout")), TimeUnit.SECONDS);
			utiliyFactory.writeLogs("Added Implicit Wait for webdriver");
			driver.manage().window().maximize();
			utiliyFactory.writeLogs("Maximized the browser Window");
		//}
	}
		// need to code for the remote webdriver 	
		private static void gripOperations(String browser){
			if(utiliyFactory.getProp("executionmode").equalsIgnoreCase("grid")){
				
				// check whether the port 4444 is empty or not write a function for that
				
				
				// start up hub and node				
				//startNodeAndHub();
				
				cap = new DesiredCapabilities();	
				if(browser.equalsIgnoreCase("firefox")){
					System.out.println("Inside firefox cap check");
					cap.firefox();
					cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
					//cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
					cap.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);					
					//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, Platform.ANY);
					cap.setCapability(CapabilityType.VERSION, "54.0");		
					
					utiliyFactory.writeLogs("Set Capabilities for " + browser);
				}
				
				else if(browser.equalsIgnoreCase("chrome")){
					System.out.println("Inside chrome cap check");
					cap.chrome();
					cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
					//cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
					//cap.setCapability(CapabilityType.PLATFORM, Platform.ANY);
					//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, Platform.ANY);
					
					utiliyFactory.writeLogs("Set Capabilities for " + browser);
				}
				
				else if(browser.equalsIgnoreCase("ie")){
					cap.internetExplorer();
					cap.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
					cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
					cap.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
					cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, Platform.WINDOWS);
					utiliyFactory.writeLogs("Set Capabilities for " + browser);
				}
				

				try {
					//driver =new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"),cap);	
					//http://localhost:4445/wd/hub
					driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);	
				} catch (MalformedURLException e) {
					utiliyFactory.writeLogs("Unable to open the remote webdriver " + e.getMessage());
					return;
				}
			}
		}
		
		private static void startNodeAndHub(){
			
			if(isGridStarted==false){
				try {
					String[] command = {"cmd.exe", "/C", "Start", "startHub.bat"};
					Process p =  Runtime.getRuntime().exec(command);

					//add assertion of the consol logs that grid has started
					Thread.sleep(3000);

					String[] command1 = {"cmd.exe", "/C", "Start", "startNode.bat"};
					Process p1 =  Runtime.getRuntime().exec(command1); 
					//add assertion of the consoel logs that node has started				
					isGridStarted = true;
					utiliyFactory.writeLogs("Selenium Grid Started");
				} catch (Exception ex) {
					utiliyFactory.writeLogs("Coudldn't start Selenium Grid " + ex.getMessage());
					return;
				}	
			}else if(isGridStarted==true){
				utiliyFactory.writeLogs("Selenium Grid already opened hence ignoring ...");
				return;
			}
				
			
		}
	

}
