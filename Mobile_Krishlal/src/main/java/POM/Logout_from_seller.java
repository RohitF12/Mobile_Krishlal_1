package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;

public class Logout_from_seller extends Launch{
	
	public void logout_user () throws InterruptedException {
		
		
		   
		   driver.navigate().back();
		   
		   Thread.sleep(5000);
		
		   
		   //click on profile icon to logout
		   
		   WebElement Profile_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView")); 
			                                                 
		   Profile_1.click(); 
		   
		   Thread.sleep(5000);
		   
		   //Click on logout 
		   
//		   WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")); 
//			  
//		   Logout.click(); 
		   
		 	TouchAction touchAction_1 = new TouchAction(driver);
		    touchAction_1.tap(PointOption.point(327, 1947)).perform(); 
		   
		   Thread.sleep(5000);
		   
		   WebElement Logout_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
			  
		   Logout_button.click(); 
		   
		   Thread.sleep(5000);

	}

}
