package mobileAppLaunch;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login_User2 extends Launch {
	
	  @Test
	  public void Login_User2_Buyer() throws InterruptedException {
		  
		  WebElement Language= driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]"));
		 
		      Language.click();
			  
			  Thread.sleep(5000);
			  
			  WebElement Enter_Mobile_Number = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
			                                                    
			  Enter_Mobile_Number.click();
			  
			  Thread.sleep(5000);	 
			  
			  Enter_Mobile_Number.sendKeys("7038799247");
			  
	          WebElement Login= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
	         
	          Login.click();
	         
	          Thread.sleep(10000);
	  
	          WebElement Verify= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]"));
	        
	          Verify.click();
	        
	          Thread.sleep(10000);
	     
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  	  
     }	  
	  
	  public void KL_Quite() throws InterruptedException {
		  
		 driver.quit();
     
}

}  

	


