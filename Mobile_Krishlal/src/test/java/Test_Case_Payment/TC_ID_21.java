package Test_Case_Payment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User1;

public class TC_ID_21 extends Launch {
	
	@Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
        Login_User1 Enter_1 = new Login_User1();
    	
        Enter_1.Login_User1_Seller();
        
        Thread.sleep(5000); 
	
}
    
    @Test (priority = 1)
	public void  TC_ID_21_01 () throws InterruptedException{
    	
    	Thread.sleep(25000); 
    	
    	//Click on payment button
    
    	  TouchAction Payment_tab = new TouchAction(driver);
    	  Payment_tab.tap(PointOption.point(910, 2150)).perform();
    	  
    	  Thread.sleep(5000);
           		  
     	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
     	  
     	 // Passbook
     	  
          WebElement Passbook= driver.findElement(By.xpath("//android.view.View[@index='4']"));
     	  
          Passbook.click();
     	  
          Thread.sleep(5000);
          
      	//Click on payment button
          
    	  TouchAction Select_first_contact = new TouchAction(driver);
    	  
    	  Select_first_contact.tap(PointOption.point(508, 581)).perform();
    	  
    	  Thread.sleep(5000);
     	  
     	// Contact_person_Name
    	  
   		String Contact_person_Name = driver.findElement(By.xpath("//android.view.View[@index='9']")).getTagName();
		  
		System.out.println("Contact_person_Name = " + Contact_person_Name); 	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 Thread.sleep(5000);
     	  
     	//Address
		
   		String Address = driver.findElement(By.xpath("//android.view.View[@index='10']")).getTagName();
		  
		System.out.println("Address Display = " + Address); 	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	
		Thread.sleep(5000);
     	  

}
}