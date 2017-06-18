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
		utiliyFactory.getutiliyInstance();
		utiliyFactory.writeLogs("checking logs");
		
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
			//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			cap.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
			cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");	
			cap.setCapability(CapabilityType.VERSION, "54.0");	
		}
	}

}
