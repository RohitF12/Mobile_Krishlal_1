package Test_Case_Payment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User1;

public class TC_ID_22 extends Launch{
	
    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
        Login_User1 Enter_1 = new Login_User1();
    	
        Enter_1.Login_User1_Seller();
        
        Thread.sleep(5000); 
	
}
    
    @Test (priority = 1)
	public void  TC_ID_22_01 () throws InterruptedException{
    	
    	Thread.sleep(25000); 
    	
    	//Click on payment button
    
    	  TouchAction Payment_tab = new TouchAction(driver);
    	  Payment_tab.tap(PointOption.point(910, 2150)).perform();
    	  
    	  Thread.sleep(5000);
    	  
    	// click on filter_icon  
    	  
        WebElement filter_icon= driver.findElement(By.xpath("//android.view.View[@content-desc=\"￼ Filter\"]"));
     	  
        filter_icon.click(); 
        
        Thread.sleep(5000);
    	  
    	//Enter_Start_Date  
    	  
        WebElement Enter_Start_Date= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Start Date\"]"));
   	  
        Enter_Start_Date.click(); 
        
        Thread.sleep(5000);
    	
       // 1st date of month
        
        WebElement month= driver.findElement(By.xpath("//android.view.View[@index='7']"));
     	  
        month.click(); 
        
        Thread.sleep(5000);
        
        //click ok
        
        WebElement ok= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
   	  
        ok.click(); 
        
        Thread.sleep(5000);
        
    	//Enter_End_Date  
  	  
        WebElement Enter_End_Date= driver.findElement(By.xpath("//android.view.View[@content-desc=\"End Date\"]"));
   	  
        Enter_End_Date.click(); 
        
        Thread.sleep(5000);
        
        //select Date
        
        WebElement Select_Date= driver.findElement(By.xpath("//android.view.View[@index='22']"));
     	  
        Select_Date.click(); 
        
        Thread.sleep(5000);
        
        //click ok
        
        WebElement ok_1= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
   	  
        ok_1.click(); 
        
        Thread.sleep(5000);
        
       //click on All
        
        WebElement All= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"All\"]"));
     	  
        All.click(); 
        
        Thread.sleep(5000);
        
       //click on Paid 
        
        WebElement Paid = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Paid\"]"));
     	  
        Paid.click(); 
        
        Thread.sleep(5000);
        
      //click on Apply  
    	  
        WebElement Apply = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Apply\"]"));
   	  
        Apply.click();   
    	  
        Thread.sleep(5000);  
    }
}
