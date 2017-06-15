package utility;

import java.io.IOException;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class testClass {
	static DesiredCapabilities cap;
	public static void main(String[] args) throws ClientProtocolException, IOException, InterruptedException {
		//utiliyFactory.getutiliyInstance();
		//		BrowserFactory.gripOperations("chrome");
		//		BrowserFactory.driver.navigate().to("http://gmail.com");

		doTesting("firefox");
		
		RemoteWebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://google.com");
		
		Thread.sleep(2000);
		driver.quit();
		
	//	java -jar selenium-server-standalone-3.4.0.jar -role node -hub http://localhost:4444/grid/register -port 5555
		

	}

	public static void doTesting(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			cap = new DesiredCapabilities().chrome();
			cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			cap.setCapability(CapabilityType.PLATFORM, Platform.ANY);
			cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");			
		}
		
		 if(browser.equalsIgnoreCase("firefox")){
			System.out.println("for firefox browser");
			cap = new DesiredCapabilities().firefox();
			//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//geckodriver.exe");			
			cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			cap.setCapability(CapabilityType.PLATFORM, Platform.ANY);
			cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");			
		}
	}

}
