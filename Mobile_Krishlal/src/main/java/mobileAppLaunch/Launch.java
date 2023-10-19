package mobileAppLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;


public class Launch {
	
	
	public static AndroidDriver driver = null;

	 @BeforeTest
	  public void setUp() throws MalformedURLException, InterruptedException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("appium:deviceName", "Redmi Note 11T 5G");
	    desiredCapabilities.setCapability("appium:platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "14.0.2");
	    desiredCapabilities.setCapability("appium:udid", "6TNNUCBIO7QW8HWC");
	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\RohitFulzele\\Desktop\\RCS\\KL\\krishlal-test_V115.apk");
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    
	    Thread.sleep(5000);

//}
//	    
//	    @AfterClass
//	    
//			public void closeBrowser() {	
//	    
//			driver.quit();
	  	  
}

}


