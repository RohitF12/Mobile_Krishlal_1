package mobileAppLaunch;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchSessionException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login_User1 extends Launch {
	
	  @Test
	  public void Login_User1_Seller() throws InterruptedException {
		  
		  WebElement Language= driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]"));
		 
		      Language.click();
			  
			  Thread.sleep(5000);
			  
			  WebElement Enter_Mobile_Number = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
			                                                    
			  Enter_Mobile_Number.click();
			  
			  Thread.sleep(5000);	 
			  
			  Enter_Mobile_Number.sendKeys("8999144992");
			  
	          WebElement Login= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
	         
	          Login.click();
	         
	          Thread.sleep(8000);
	  
	          WebElement Verify= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]"));
	        
	          Verify.click();
	        
	          Thread.sleep(5000);
	     
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  	  
     }	  
	  
	  public void KL_Quite() throws InterruptedException {
		  
		 driver.quit();
     
}

}  

	


