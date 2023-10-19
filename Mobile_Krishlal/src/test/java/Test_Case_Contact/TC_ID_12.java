package Test_Case_Contact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User2;

public class TC_ID_12 extends Launch {
	
	
    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
	    Login_User2 Enter = new Login_User2();
	
	    Enter.Login_User2_Buyer();

	}
    
    @Test (priority = 1)
	public void  TC_ID_12() throws InterruptedException {
    	
	    //Select Contact from the 

//		 WebElement Click_on_Contact = driver.findElement(By.xpath("android.view.View[index='3']"));
//		  		 
//		 Click_on_Contact.click();
		 
		 TouchAction Click_Contact  = new TouchAction(driver);
		    
		 Click_Contact.tap(PointOption.point(368, 2160)).perform();
		 
		 Thread.sleep(7000);
		 
		 //Click on Add contact button 
    	
		 WebElement Add_Contact = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
  		 
		 Add_Contact.click();
		 
		 Thread.sleep(7000);
		 
		 //Click on enter mobile number
		 
		 WebElement Enter_number = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
  		 
		 Enter_number.click();
		 
		 Thread.sleep(7000);
    	
		 Enter_number.sendKeys("9099091280");
    	
		 Thread.sleep(3000);
    	
	   //click on save button
		 
        WebElement Click_on_Save_1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
  		 
   	    Click_on_Save_1.click();
		 
	    Thread.sleep(7000);
	    
	    driver.navigate().back();
		 
	    Thread.sleep(5000);
	    
		//Enter_Name
		 
        WebElement Enter_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]"));
  		 
        Enter_Name.click();
		 
	    Thread.sleep(7000); 
		 
	    Enter_Name.sendKeys("Ronaldo");
		 
		//Click on save 
	    
	    WebElement Save = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
	  		 
	    Save.click();
			 
		Thread.sleep(7000);
		
		//  click on search filed and search this contact
		  
	    WebElement Click_Search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
	  		 
	    Click_Search.click();
			 
		Thread.sleep(7000);
		
		Click_Search.sendKeys("Ronaldo");
		
		//  click on name display at first with search name
		
		 TouchAction Search_Name  = new TouchAction(driver);
		    
		 Search_Name.tap(PointOption.point(314, 729)).perform();
		 
		 Thread.sleep(7000);

		 // check for name display
		 
		String Contact_saved_Name = driver.findElement(By.xpath("//android.view.View[@index='9']")).getTagName();
			  
		System.out.println("display_contact_Name = " + Contact_saved_Name); 	
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on massege icon to check
		
	    WebElement messege = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[10]"));
		 
	    messege.click();
			 
		Thread.sleep(7000);
		
		//send hi messge
		
	    WebElement Send_Messege = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText"));
		 
	    Send_Messege.click();
			 
		Thread.sleep(7000);
		
		Send_Messege.sendKeys("Hi");
		
		Thread.sleep(7000);
		
		//click on send
		
	    WebElement send_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View"));
		 
	    send_1.click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		//Click on calling button
		
	    WebElement Calling_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[11]"));
 		 
	    Calling_button.click();
			 
		Thread.sleep(7000);
		
		//Select the calling icon
		
		 TouchAction Calling_1  = new TouchAction(driver);
		    
		 Calling_1.tap(PointOption.point(762, 1615)).perform();
				 
	     Thread.sleep(10000);	
	     
	    driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
	   driver.navigate().back();
		
		Thread.sleep(5000);

}
}