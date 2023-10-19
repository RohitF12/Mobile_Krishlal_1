package Test_Case_Contact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User1;
import mobileAppLaunch.Login_User2;

public class TC_ID_14 extends Launch{
	
    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
	    Login_User1 Enter = new Login_User1();
	
	    Enter.Login_User1_Seller();

	}
    
    @Test (priority = 1)
	public void  TC_ID_14() throws InterruptedException {
    	
	    //Select Contact from the 
		 
		 TouchAction Click_Contact  = new TouchAction(driver);
		    
		 Click_Contact.tap(PointOption.point(368, 2160)).perform();
		 
		 Thread.sleep(7000);
    	
    //  click on search filed and search this contact
		  
	    WebElement Click_Search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
	  		 
	    Click_Search.click();
			 
		Thread.sleep(7000);
		
		Click_Search.sendKeys("I_");
		
		//  click on name display at first with search name
		
		 TouchAction click_on_contact  = new TouchAction(driver);
		    
		 click_on_contact.tap(PointOption.point(135, 732)).perform();
		 
		 Thread.sleep(7000);
		 
	 //  Check profile icon is display or not
		 
       	 WebElement profile= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));

	     Assert.assertEquals(true, profile.isDisplayed());

        System.out.println("Profile name is displayed = True");

   	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	    Thread.sleep(3000);
   	   
		  WebElement Payment_Received = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Payment Received\"]"));
	  		 
		  Payment_Received.click();
				 
		  Thread.sleep(7000);
		  
		 
		 // Enter the received Ammount
		 
		  WebElement Enter_Ammount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
	  		 
		  Enter_Ammount.click();
				 
		  Thread.sleep(7000);
		 
		  Enter_Ammount.sendKeys("1999");
		 
		  Thread.sleep(5000);
		 
		 //click on save button
		  
		  WebElement Saved_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
	  		 
		  Saved_button.click();
				 
		  Thread.sleep(7000);
		  
		  // ammount is displayed
		  
		  System.out.println("Allocation ammount is displayed= 1999");
		 
}
}