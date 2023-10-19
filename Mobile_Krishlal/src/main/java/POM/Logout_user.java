package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;

public class Logout_user extends Launch {
	
	@Test
	
	public void logout () throws InterruptedException {
		
		 
		   //click on profile icon to logout
		   
//		   WebElement Profile_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView")); 
	//
//		   Profile_1.click(); 
		   
		   
		   TouchAction Profile_Icon = new TouchAction(driver);
		   Profile_Icon.tap(PointOption.point(948, 182)).perform();
		   
		   
		   Thread.sleep(5000);
		   
		   //Click on logout 
		   
	       //	WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")); 
			  
	       //   Logout.click(); 
		   
		 	TouchAction touchAction_1 = new TouchAction(driver);
		    touchAction_1.tap(PointOption.point(327, 1947)).perform(); 
		   
		   Thread.sleep(7000);
		   
		   WebElement Logout_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
			  
		   Logout_button.click(); 
		   
		   Thread.sleep(5000);


}
}
