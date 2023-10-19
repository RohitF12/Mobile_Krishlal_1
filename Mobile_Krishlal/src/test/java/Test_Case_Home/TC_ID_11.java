package Test_Case_Home;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Login_U1;
import POM.Login_U2;
import POM.Logout_user;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User2;

public class TC_ID_11 extends Launch {
	
	@Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
        Login_User2 Enter_1 = new Login_User2();
    	
        Enter_1.Login_User2_Buyer();
        
        Thread.sleep(5000); 
	
}
	
	   @Test (priority = 1)
	    public void  TC_ID_11_01() throws InterruptedException {
		  
	//scroll down
		   
		  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));

	//Select view all product
		  
		   WebElement View_All_Product= driver.findElement(By.xpath("(//android.view.View[@content-desc=\"View All\"])[2]"));
		   
		   View_All_Product.click();
					 
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				 
		   Thread.sleep(5000);
			
//Search the Product "Flower Buffe"
			
			 WebElement Search_Product= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
			   
			 //WebElement Search_Product= driver.findElement(By.xpath("android.widget.EditText[index='2']"));

			 Search_Product.click();
						 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			 
			 Search_Product.sendKeys("Flower Buffe");
					 
			 Thread.sleep(5000);
			 
//click on different Km range to check Product visibility
			
			//11 Km
			 
			  WebElement Ten_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"10km\"]"));
			  
			  Ten_km.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //25 km
			  
			  WebElement TwentyFive_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"25km\"]"));
			  
			  TwentyFive_km.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //50 km
			  
			  WebElement Fifty_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"50km\"]"));
			  
			  Fifty_Km.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //110 Km
			  
			  WebElement hundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"100km\"]"));
			  
			  hundred_Km.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //200 Km
			  
			  WebElement Twohundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"200km\"]"));
			  
			  Twohundred_Km.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //500 Km
			  
//			  WebElement FiveHundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"500km\"]"));
//			  
//			  FiveHundred_Km.click();
//			  
//			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			  
			  //All 
			  
//			  WebElement All = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\" All \"]"));
//			  
//			  All.click();
			  
			  
			  WebElement Select_Product = driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
				 
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 
			  Select_Product.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}   
		   
	   @Test (priority = 2)
	    public void  TC_ID_11_02() throws InterruptedException {
	    
	   //Product image Display
		      
			 WebElement Select_Product = driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
			 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			 Assert.assertEquals(true, Select_Product.isDisplayed());
			  
			 System.out.println("Product image is dispaly = True " );
			 
			 Thread.sleep(11000);
			 
			 
	   //Product_Name_Display
			 
			  String Product_Name = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
			  
			  System.out.println("Product name is = " + Product_Name);	
		
		//Location_of_the_Product
		
	         String Location_of_the_Product = driver.findElement(By.xpath("//android.view.View[@index='5']")).getTagName();
			  
			  System.out.println("Location_of_the_Product = " + Location_of_the_Product);
		
		      
		//Ammount
		    	
		       String Ammount = driver.findElement(By.xpath("//android.view.View[@index='7']")).getTagName();
				  
			   System.out.println("Total Ammount of the Product = " + Ammount);
		
		
		//Unit
		    	
		       String Unit = driver.findElement(By.xpath("//android.view.View[@index='8']")).getTagName();
				  
			   System.out.println("Unit of the Product = " + Unit);
		
		 //Description
		
		       String Description = driver.findElement(By.xpath("//android.view.View[@index='11']")).getTagName();
				  
			   System.out.println("Description of Product = " + Description);

	    //Contact_Person_Name
		    	
			   String Contact_Person_Name = driver.findElement(By.xpath("//android.view.View[@index='14']")).getTagName();
						  
			   System.out.println("contact person name display = " + Contact_Person_Name);  
			   
			   
		//Quantity_Field
		    	
			  String Quantity_Field = driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).getTagName();
							  
			  System.out.println("Quantity_Field number display = " + Quantity_Field);  
			  
		//Click_on_quantity_field
			  
			  WebElement Quantity_Field1 = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
			  
			  Quantity_Field1.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  Quantity_Field1.sendKeys("1");
			  
		//click on Enquiry_Now button
				   
			  WebElement Enquiry_Now = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]")); 
			  
			  Enquiry_Now.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  System.out.println("Error messege display = (Quantity should be 2-3!!)");
	    
	    
	    }	   
	   
	   public void  TC_ID_11_03() throws InterruptedException {
		    
	    	  //Click_on_quantity_field
			  
				  WebElement Quantity_Field1 = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
				  
				  Quantity_Field1.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  Quantity_Field1.sendKeys("7");
	      
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
				  WebElement Enquiry_Now_1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]")); 
				  
				  Enquiry_Now_1.click();  
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  System.out.println("Error messege display = (Quantity should be 2-3!!)");
	    
	    }
	    
	    @Test (priority = 4)
	    public void  TC_ID_11_04() throws InterruptedException {
	    	
	   	  //Click_on_quantity_field_2
			  
			  WebElement Quantity_Field_1= driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
			  
			  Quantity_Field_1.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  Quantity_Field_1.sendKeys("2");
	    
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //Click on Enquiry now button
	      
			  WebElement Enquiry_Now_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]")); 
			  
			  Enquiry_Now_button.click();  
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  //Type Additional field "NA"
			  
			 WebElement Additional_Field = driver.findElement(By.xpath("//android.widget.EditText[@index='0']")); 
			  
		     Additional_Field.click();
		    
		     Additional_Field.sendKeys("NA");
		     
		     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		     
		     //click on Ok button
		     
			 WebElement OK_Button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]")); 
			  
			 OK_Button.click();
		     
			 Thread.sleep(5000);
		     
	    }
	    
	    @Test (priority = 5)
	    public void  TC_ID_11_05() throws InterruptedException {   
	    
	    
	  //Product_Name_Display
	    	
			   String Product_Name_Display = driver.findElement(By.xpath("//android.view.View[@index='3']")).getTagName();
						  
			   System.out.println("Product name appeared  = " + Product_Name_Display); 
			   
		//Location_display  	   
			   
			   String Location_display = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
				  
			   System.out.println("Product name location is = " + Location_display); 
			   
			   
		//Order_Date  	   
			   
			   String Order_Date = driver.findElement(By.xpath("//android.view.View[@index='5']")).getTagName();
				  
			   System.out.println("Order date display is = " + Order_Date); 	   
			   
			   
		//Quantity_unit  	   
					   
				String Quantity_unit = driver.findElement(By.xpath("//android.view.View[@index='6']")).getTagName();
						  
				System.out.println("Quantity and unit is = " + Quantity_unit); 	   
					   	   
			   		   
		//Order_Id	   
			   
			   String Order_Id = driver.findElement(By.xpath("//android.view.View[@index='9']")).getTagName();
				  
			   System.out.println("Order Id of the Product = " + Order_Id); 		   
			   
			   
		//Order_Status	   
			   
			   String Order_Status = driver.findElement(By.xpath("//android.view.View[@index='13']")).getTagName();
				  
			   System.out.println("Status of order = " + Order_Status); 	
			   
		//Contact_person_name	   
			   
			   String Contact_person_name_1 = driver.findElement(By.xpath("//android.view.View[@index='20']")).getTagName();
				  
			   System.out.println("Contact person name display is = " + Contact_person_name_1); 
			   
		   
	//login with different user
			   
			   driver.navigate().back();
			   
			   Thread.sleep(5000);
			   
			   driver.navigate().back();
			   
			   Thread.sleep(5000);
			   
			   driver.navigate().back();
			   
			   //scroll up
			   
			   //The viewing size of the device
			    org.openqa.selenium.Dimension size = driver.manage().window().getSize();

			    //Starting y location set to 20% of the height (near bottom)
			    int starty = (int) (size.height * 0.20);
			    //Ending y location set to 80% of the height (near top)
			    int endy = (int) (size.height * 0.1);
			    //x position set to mid-screen horizontally
			    int startx = size.width / 2;

//			    scroll(startx, starty, startx, endy);
			    
			    TouchAction touchAction_100 = new TouchAction(driver);
				touchAction_100.press(PointOption.point(startx, starty)).waitAction().moveTo(PointOption.point(startx, endy)).release().perform();
			    
			 //   scroll(startx, starty, startx, endy);
			   
			   
			   //click on profile icon to logout
			   
			   WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[1]")); 
				  
			   Profile.click(); 
			   
			   Thread.sleep(5000);
			   
			   //Click on logout 
			   
//			   WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")); 
//				  
//			   Logout.click(); 
			   
			 	TouchAction touchAction_1 = new TouchAction(driver);
			    touchAction_1.tap(PointOption.point(327, 1947)).perform(); 
			   
			   Thread.sleep(5000);
			   
			   WebElement Logout_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
				  
			   Logout_button.click(); 
			   
			   Thread.sleep(5000);
			   
	}

	    @Test (priority = 6)
	    public void  TC_ID_11_06() throws InterruptedException { 
	    	
	    Login_U1 Enter = new Login_U1();
		    	
		Enter.Login_Seller_U1();
		        
		Thread.sleep(25000); 
		        
		TouchAction touchAction_order = new TouchAction(driver);
		touchAction_order.tap(PointOption.point(721, 2160)).perform();
		  	 
		 Thread.sleep(5000);	

	    TouchAction touchAction_Sell = new TouchAction(driver);
	    touchAction_Sell.tap(PointOption.point(880, 370)).perform();
		 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		//Click on Product button
		
		 WebElement Product_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Product\"] ")); 
		  
		 Product_button.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		 
		// select the Product from top list

		 TouchAction touchAction_221 = new TouchAction(driver);
		 touchAction_221.tap(PointOption.point(558, 758)).perform(); 
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	       
	     // click on accept_button
		 
		 WebElement accept_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Accept\"]")); 
		  
		 accept_button.click();
		 
		 // click on ammount button
		 
		 WebElement accept_ammount_button_1 = driver.findElement(By.xpath("//android.widget.Button[@index='0']")); 
		  
		 accept_ammount_button_1.click();
		 
		 Thread.sleep(5000);
		 
	 	 
		 // Print the changed status
		 
		  String Status_1 = driver.findElement(By.xpath("//android.view.View[@index='15']")).getTagName();
			  
		  System.out.println("Status changed and display = " + Status_1); 
		  
	    }
		  
		    @Test (priority = 7)
		    public void  TC_ID_11_07() throws InterruptedException { 	  
		  
		   
	    //logout the seller user
	    
		   driver.navigate().back();
		   
		   Thread.sleep(5000);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(15000);
		
		   
		   //click on profile icon to logout
		   
//		   WebElement Profile_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView")); 

//		   Profile_1.click(); 
		   
		   
		   TouchAction Profile_Icon = new TouchAction(driver);
		   Profile_Icon.tap(PointOption.point(948, 182)).perform();
		   
		   
		   Thread.sleep(5000);
		   
		   //Click on logout 
		   
	       //	WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")); 
			  
	       //   Logout.click(); 
		   
		 	TouchAction touchAction_1 = new TouchAction(driver);
		    touchAction_1.tap(PointOption.point(327, 1947)).perform(); 
		   
		   Thread.sleep(7000);
		   
		   WebElement Logout_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
			  
		   Logout_button.click(); 
		   
		   Thread.sleep(5000);

		 
		 
		   
		 //login with the buyer again
		 
		   Login_U2 Enter_11 = new Login_U2();
	   	
	       Enter_11.Login_Buyer_U2();
	       
	       Thread.sleep(25000);
	       
		 
	       //select the Order 
	       
	       TouchAction touchAction_order = new TouchAction(driver);
		   touchAction_order.tap(PointOption.point(721, 2160)).perform();
		  	 
		   Thread.sleep(5000);
		 
		 //Click on Buying_button 
		   
	       TouchAction touchAction_Buying = new TouchAction(driver);
	       touchAction_Buying.tap(PointOption.point(526, 372)).perform();
		   	 
		   	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		   	
		   	//Click on Product button
		   	
		   	 WebElement Product_button_1= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Product\"] ")); 
		   	  
		   	  Product_button_1.click();
		   	 
		   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		   	 
		   	 // select the Product from top list

		   	 TouchAction touchAction_21 = new TouchAction(driver);
		   	touchAction_21.tap(PointOption.point(558, 758)).perform(); 
		   	 
		   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		          
		     // accepted_status should be dispaly
		   	 
			  String Order_Status = driver.findElement(By.xpath("//android.view.View[@index='15']")).getTagName();
			  
			  System.out.println("Status changed and display = " + Order_Status); 
			  
			  Thread.sleep(5000);
			 
			  
		    }
		    
		    @Test (priority = 8)
		    public void  TC_ID_11_08() throws InterruptedException { 
			  		  
			  
		      driver .navigate().back();

		      Thread.sleep(5000);
		 	   
		 	  driver.navigate().back();
		 	   
		 	  Thread.sleep(15000);
		 	  
		 	  //CLICK ON PROFILE

		     TouchAction touchAction_PROFILE = new TouchAction(driver);
		     touchAction_PROFILE.tap(PointOption.point(953, 204)).perform();
			 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			
			Thread.sleep(11000);
			
			//click on logout
			
			 TouchAction touchAction_123 = new TouchAction(driver);
		    touchAction_123.tap(PointOption.point(327, 1947)).perform(); 
			Thread.sleep(11000);
		      
		   //Click on logout button
			   
		  WebElement Logout_button_11 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
				  
		  Logout_button_11.click(); 
			   
			   
//		 TouchAction touchAction_Sell12 = new TouchAction(driver);
//		 touchAction_Sell12.tap(PointOption.point(953, 204)).perform();
			   
			   Thread.sleep(5000);
			   
			   
		//login with the seller again
				 
		Login_U1 Enter_112 = new Login_U1();
			   	
		Enter_112.Login_Seller_U1();
			       
		Thread.sleep(25000);
				
	//click on order  at button
			       
		TouchAction touchAction_order = new TouchAction(driver);
		touchAction_order.tap(PointOption.point(721, 2160)).perform();
				  	 
		Thread.sleep(5000);
				 
	//Click on Selling_button 
				   
	    TouchAction touchAction_Buying = new TouchAction(driver);
		touchAction_Buying.tap(PointOption.point(858, 372)).perform();
				   	 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				
	//click on Product button
				
		WebElement Product_button_1= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Product\"] ")); 
				   	  
		Product_button_1.click();
				   	 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				
				
	//select the order from list
				
		 TouchAction touchAction_21 = new TouchAction(driver);
	 	touchAction_21.tap(PointOption.point(558, 758)).perform(); 
				   	 
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				
 // click on delivered button
				

	    WebElement Delivered_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Deliverd\"]")); 
					  
		Delivered_button.click();
				   	 
//select the qnty at botton 	 
				   	 
//				   	 
//	    WebElement Delivered_Ammount_button = driver.findElement(By.xpath("//android.widget.Button[@index='0']")); 
//					  
//		Delivered_Ammount_button.click();
//				   	 
//	    Thread.sleep(5000);
//				   	 
//    	 driver.navigate().back();
				   	 
//    //Check the status
//				   	 
//		String Delivered_Status = driver.findElement(By.xpath("//android.view.View[@index='18']")).getTagName();
//					  
//		System.out.println("Status changed and display = " + Delivered_Status); 
//					     
//        Thread.sleep(5000);
		    }
        
        @Test (priority = 9)
	    public void  TC_ID_11_09() throws InterruptedException {  
        
        
				   	 
  //Logout the user
       
        driver .navigate().back();

    	Thread.sleep(5000);
				   	 
		driver .navigate().back();

		Thread.sleep(5000);
				 	   
		driver.navigate().back();
				 	   
	    Thread.sleep(15000);

	   TouchAction touchAction_Sell12 = new TouchAction(driver);
	   touchAction_Sell12.tap(PointOption.point(953, 204)).perform();
					 
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	   Thread.sleep(11000);
					
		//click on logout
					
	 TouchAction touchAction_1234 = new TouchAction(driver);
	 touchAction_1234.tap(PointOption.point(327, 1947)).perform(); 
					
	  Thread.sleep(7000);
				      
	//Click on logout button
					   
	 WebElement Logout_button_12 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
						  
	  Logout_button_12.click(); 
					   
	  TouchAction touchAction_Sell123 = new TouchAction(driver);
	 touchAction_Sell123.tap(PointOption.point(322, 1389)).perform();
					   
     Thread.sleep(5000);
						   
	//login with the buyer again
					 
	 Login_U2 Enter_1121 = new Login_U2();
				   	
    Enter_1121.Login_Buyer_U2();
				       
    Thread.sleep(25000);
					 
   //select the Order 
				       
	 TouchAction touchAction_order_select = new TouchAction(driver);
	 touchAction_order_select.tap(PointOption.point(721, 2160)).perform();
				  	 
	  Thread.sleep(5000);
					 
	//Click on Buying_button 
				   
	 TouchAction touchAction_Buying_select = new TouchAction(driver);
	 touchAction_Buying_select.tap(PointOption.point(526, 372)).perform();
					   	 
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
					   	
	//Click on Product button
					   	
	 WebElement Product_button_12= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Product\"] ")); 
					   	  
	Product_button_12.click();
					   	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
					   	 
	 // select the Product from top list

	 TouchAction touchAction_213 = new TouchAction(driver);
 	touchAction_213.tap(PointOption.point(558, 758)).perform(); 
					   	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
					          
	 // accepted_status should be dispaly
					   	 
	// String Order_Status_1 = driver.findElement(By.xpath("//android.view.View[@index='16']")).getTagName();
						  
	// System.out.println("Status changed and display = " + Order_Status_1); 
						    
					 
	 driver.navigate().back();
					 
					 	       
	    }
		   
		   

}
