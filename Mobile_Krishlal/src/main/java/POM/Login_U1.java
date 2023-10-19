package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mobileAppLaunch.Launch;

public class Login_U1 extends Launch{
	
	public void Login_Seller_U1() throws InterruptedException {
	
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

}}
