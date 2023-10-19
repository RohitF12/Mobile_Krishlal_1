package Test_Case_Payment;

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

public class TC_ID_20 extends Launch {
		
	    @Test (priority = 0)
		public void  Login2App() throws InterruptedException {
		
	        Login_User1 Enter_1 = new Login_User1();
	    	
	        Enter_1.Login_User1_Seller();
	        
	        Thread.sleep(5000); 
		
	}
	    
	    @Test (dependsOnMethods = { "Login2App" })
		public void  TC_ID_20_01 () throws InterruptedException{
	    	
	    	Thread.sleep(25000); 
	    	
	    	//Click on payment button
	    
	    	  TouchAction Payment_tab = new TouchAction(driver);
	    	  Payment_tab.tap(PointOption.point(910, 2150)).perform();
	    	  
	    	  Thread.sleep(5000);
	           		  
	     	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    	  
			  //Upcoming button 
	     	  
	          WebElement Upcoming= driver.findElement(By.xpath("//android.view.View[@index='3']"));
	     	  
	     	  Upcoming.click();
	     	  
	     	  // click on contact "I_0012"
	     	  
	     	  TouchAction Contact_0012 = new TouchAction(driver);
	     	  Contact_0012.tap(PointOption.point(372, 1271)).perform();
	    	  
	    	  Thread.sleep(5000);
	     	  
	    	  //Total_Paid_Amount 
	    	  
	    		String Total_Paid_Amount = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
	  		  
	    		System.out.println("Total_Paid_Amount = " + Total_Paid_Amount); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	  
	    	  //Total_Received_Amount
	    		
	    		String Total_Received_Amount = driver.findElement(By.xpath("//android.view.View[@index='7']")).getTagName();
	  		  
	    		System.out.println("Total_Received_Amount = " + Total_Received_Amount); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	  
	    	  //Payment_Received_button
	    	  
	    		String Payment_Received_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Payment Received\"]")).getTagName();
	  		  
	    		System.out.println("Payment_Received_button = " + Payment_Received_button); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    		
	    		Thread.sleep(5000);
	    	  
	    		//Messege_Icon
	    	  
	    		String Messege_Icon = driver.findElement(By.xpath("//android.view.View[@index='12']")).getTagName();
	  		  
	    		System.out.println("Messege_Icon Display = " + Messege_Icon); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	  
	    		//Call_Icon
	    	  
	    		String Call_Icon = driver.findElement(By.xpath("//android.view.View[@index='13']")).getTagName();
	  		  
	    		System.out.println("Call_Icon dispaly= " + Call_Icon); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	   
}
	    
	    @Test (dependsOnMethods = { "TC_ID_20_01" })
			public void  TC_ID_20_02 () throws InterruptedException{
	    	
	        //payment received button
	    	
	        WebElement Payment_Received_button= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Payment Received\"]"));
	     	  
	        Payment_Received_button.click();
	    	
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    	
	    	//Enter_Received_Ammount
	    	
    	    WebElement Enter_Received_Ammount= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
	     	  
    	    Enter_Received_Ammount.click();
	    	
    	    Thread.sleep(5000);
    	    
    	    Enter_Received_Ammount.sendKeys("1000");
	    	
    	    Thread.sleep(5000);
	    	
	    	//Click on Save button
	    	
    	    WebElement Save= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
	     	  
    	    Save.click();
	    	
    	    Thread.sleep(5000);
    	    
    	    driver.navigate().back();
    	    
    	    Thread.sleep(5000);
	    	
	    	// Payment saved is displayed
	    		    
}
	    @Test (dependsOnMethods = { "TC_ID_20_02" })
	 			public void  TC_ID_20_03 () throws InterruptedException{

               System.out.println("Ammount is display in list");
               
               driver.navigate().back();
               
               Thread.sleep(5000);

}
	    @Test (dependsOnMethods = { "TC_ID_20_03" })
			public void  TC_ID_20_04 () throws InterruptedException{

             // Click on To_pay contact
	    	
	    	  TouchAction To_pay = new TouchAction(driver);
	    	  To_pay.tap(PointOption.point(399, 699)).perform();
	    	  
	    	  Thread.sleep(5000);
	          
	    	//Total_Paid_Amount 
	    	  
	    		String Total_Paid_Amount = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
	  		  
	    		System.out.println("Total_Paid_Amount = " + Total_Paid_Amount); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	  
	    	  //Total_Received_Amount
	    		
	    		String Total_Received_Amount = driver.findElement(By.xpath("//android.view.View[@index='7']")).getTagName();
	  		  
	    		System.out.println("Total_Received_Amount = " + Total_Received_Amount); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	  
	    	  //Payment_Received_button
	    	  
	    		String Payment_Received_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Payment Received\"]")).getTagName();
	  		  
	    		System.out.println("Payment_Received_button = " + Payment_Received_button); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    	  
	    		Thread.sleep(5000);
	    		
	    		//Messege_Icon
	    	  
	    		String Messege_Icon = driver.findElement(By.xpath("//android.view.View[@index='12']")).getTagName();
	  		  
	    		System.out.println("Messege_Icon Display = " + Messege_Icon); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    	  
	    		//Call_Icon
	    	  
	    		String Call_Icon = driver.findElement(By.xpath("//android.view.View[@index='13']")).getTagName();
	  		  
	    		System.out.println("Call_Icon dispaly= " + Call_Icon); 	
	    		
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		
	    		Thread.sleep(5000);
	    		
	    }
	    	   
	    @Test (dependsOnMethods = { "TC_ID_20_04" })
	  	public void  TC_ID_20_05 () throws InterruptedException{

	    // Click on payment_Received   

	    	WebElement Payment_Received_button_1= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Payment Received\"]"));
	     	  
	    	Payment_Received_button_1.click();
	    	
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

    		System.out.println("There is no Remaining Amount");
    		
    		Thread.sleep(5000);

	    }
	    @Test (dependsOnMethods = { "TC_ID_20_05" })
		  	public void  TC_ID_20_06 () throws InterruptedException{
	    
	 		//Messege_Icon
	    	  
    		WebElement Messege_Icon_1 = driver.findElement(By.xpath("//android.view.View[@index='12']"));  		  
    			
    		Messege_Icon_1.click();
    		
    		Thread.sleep(5000);
	    
	    
	 		//Send HI Messege
	    	  
    		WebElement Messege = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));  		  
    			
    		Messege.click();
    		
    		Thread.sleep(5000);
	    
    		Messege.sendKeys("HI");
	    
    		Thread.sleep(5000);
    		
    		//click on send button
	    
    		WebElement Send = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View"));  		  
			
    		Send.click();
    		
    		Thread.sleep(5000);
	    
    		driver.navigate().back();
    		
    		Thread.sleep(5000);
    		
    		driver.navigate().back();
    			
    		Thread.sleep(5000);
    		
}
	    
	    
	    @Test (dependsOnMethods = { "TC_ID_20_06" })
	  	public void  TC_ID_20_07 () throws InterruptedException{ 

	    //click on calling_button	
	    	
    	WebElement calling_button = driver.findElement(By.xpath("//android.view.View[@index='13']"));  		  
			
    	calling_button.click();
    		
    	Thread.sleep(5000);	
    	
    	//Select_Truecaller
	    	
  	  TouchAction Select_Truecaller = new TouchAction(driver);
  	  Select_Truecaller.tap(PointOption.point(309, 1615)).perform();	
  	  
  	  // Move back screen
	    	
  	  driver.navigate().back();
  	  
  	Thread.sleep(5000);
  	
  	  driver.navigate().back();
  	  
  	Thread.sleep(5000);
  	
  	  driver.navigate().back();
  	  
  	Thread.sleep(5000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    
}
}