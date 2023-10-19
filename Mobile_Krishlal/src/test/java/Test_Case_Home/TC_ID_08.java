package Test_Case_Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User2;

public class TC_ID_08 extends Launch{
	
	
    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
	    Login_User2 Enter = new Login_User2();
	
	    Enter.Login_User2_Buyer();

	}

    @Test (priority = 1)
	public void  TC_ID_08 () throws InterruptedException {
    	
    	//click on location_update button
    	
		 WebElement Location_Change = driver.findElement(By.xpath("//android.view.View[@index='5']"));
		 		 
		 Location_Change.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    	
	    //click on location_update button
	    	
		 WebElement Location_Update = driver.findElement(By.xpath("//android.view.View[@index='1']"));
			 			 
		 Location_Update.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		 
		 //search the address name with Goa
	    
		 WebElement Search_Goa = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
		 
		 Search_Goa.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		 			 
		 Search_Goa.sendKeys("Goa");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(5000);
	
       
		 //Select Goa from drop down list
		 
		  WebElement Select_Goa = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Goa International Airport (GOI), Dabolim, Goa, India\"]"));
			 
		  Select_Goa.click();
		 
		 //Select objSelect =new Select(driver.findElement(By.xpath("android.view.View[index='1']")));
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 Thread.sleep(10000);

		 //How to reach optional type NA
		 
		 WebElement Reach_optional = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
		 
		 Reach_optional.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 Reach_optional.sendKeys("NA");
		 
		 //click on other
		 
		 WebElement Click_Other = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
		 
		 Click_Other.click();
		 
		 //Click on save button
		 
		 WebElement Select_Save = driver.findElement(By.xpath("//android.widget.Button[@index='7']"));
		 
		 Select_Save.click();
		 
		 Thread.sleep(5000);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //check that address should update below profile section
		 
			String Address_Display = driver.findElement(By.xpath("//android.view.View[@index='1']")).getTagName();
			  
			System.out.println("Adress location of profile = " + Address_Display); 	
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

}
    @Test (priority = 2)
	public void  TC_ID_08_01 () throws InterruptedException {
    
    
	//click on location_update button
	
	 WebElement Location_Change = driver.findElement(By.xpath("//android.view.View[@index='5']"));
	 		 
	 Location_Change.click();
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
    //click on location_update button
    	
	 WebElement Location_Update = driver.findElement(By.xpath("//android.view.View[@index='1']"));
		 			 
	 Location_Update.click();
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 
	 //search the address name with Lonavala, Maharashtra
    
	 WebElement Search_Lonavala = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	 			 
	 Search_Lonavala.sendKeys("Lonavala, Maharashtra");
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   
	 //Select Lonavala, Maharashtra from drop down list
	 
	 WebElement Select_Lonavala = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Lonavala, Maharashtra, India\"]"));
		 
	 Select_Lonavala.click();
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 //How to reach optional type NA
	 
	 WebElement Reach_optional = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
	 
	 Reach_optional.click();
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 Reach_optional.sendKeys("NA");
	 
	 //click on other
	 
	 WebElement Click_Other = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
	 
	 Click_Other.click();
	 
	 //Click on save button
	 
	 WebElement Select_Save = driver.findElement(By.xpath("//android.widget.Button[@index='7']"));
	 
	 Select_Save.click();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 //check that address should update below profile section
	 
		String Address_Display = driver.findElement(By.xpath("//android.view.View[@index='1']")).getTagName();
		  
		System.out.println("Adress location of profile = " + Address_Display); 	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}}