package Test_Case_Sell_Your_Product;

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
import mobileAppLaunch.Login_User1;

public class TC_ID_15 extends Launch{
	
    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
        Login_User1 Enter_1 = new Login_User1();
    	
        Enter_1.Login_User1_Seller();
        
        Thread.sleep(5000); 
	
}
    
    @Test (priority = 1)
	public void  TC_ID_15_01 () throws InterruptedException{
    	
    	//click on + button to sell your product
    	
		 WebElement Click_on_sell_your_product = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		 		 
		 Click_on_sell_your_product.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    	//click on sell_your_product
    		
		 WebElement sell_your_product = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sell your Product\"]"));
			 		 
		 sell_your_product.click();
			 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	// click on Add your product
    	
		 WebElement Add_Product = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
 		 
		 Add_Product.click();
			 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 //Enter Item Name
		 
		 WebElement Item_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
 		 
		 Item_Name.click();
			 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 Item_Name.sendKeys("Hackathon");
		 
		 Thread.sleep(5000);
		 
		 //Select category
		 
		 WebElement Category = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Category *\"]"));
 		 
		 Category.click();
			 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 //select category
		 
	     WebElement Category_1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Covered Smut\"]"));
 		 
	     Category_1.click();
		 
		 Thread.sleep(5000);
		 
		 //Enter_Price
		 
	     WebElement Enter_Price = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
 		 
	     Enter_Price.click();
		 
		 Thread.sleep(5000);
		 
		 Enter_Price.sendKeys("1000");
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.navigate().back();
		 
		 //Market_Price
		 
	     WebElement Market_Price = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
 		 
	     Market_Price.click();
		 
		 Thread.sleep(5000);
		 
		 Market_Price.sendKeys("1100");
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.navigate().back();
		 
		 //Select_Unit
		 
	     WebElement Select_Unit = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Unit *\"]"));
 		 
	     Select_Unit.click();
		 
		 Thread.sleep(5000);
		 
		 //select unit acer
		 
	     WebElement Select_Unit_1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Acre\"]"));
 		 
	     Select_Unit_1.click();
	     
	     Thread.sleep(5000);
	     
	     //Coverage Area (Within KM Range)
	     
	     WebElement Coverage_Area = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
 		 
	     Coverage_Area.click();
	     
	     Thread.sleep(5000);
	     
	     Coverage_Area.sendKeys("90");
	     
	     Thread.sleep(5000);
	     
	     driver.navigate().back();
	     
	     //Description
	     
	     WebElement Description = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
 		 
	     Description.click();
	     
	     Thread.sleep(5000);
	     
	     Description.sendKeys("Hackathon Serise");
	     
	     Thread.sleep(5000);
	     
	     driver.navigate().back();
	     
	     //Min_Quantity
	     
         WebElement Min_Quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[6]"));
 		 
         Min_Quantity.click();
         
         Thread.sleep(5000);
         
         Min_Quantity.sendKeys("2");
	     
	     Thread.sleep(5000);
	     
	     driver.navigate().back();
	     
	     
        //Max_Quantity
	     
         WebElement Max_Quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[7]"));
 		 
         Max_Quantity.click();
         
         Thread.sleep(5000);
         
         Max_Quantity.sendKeys("4");
	     
	     Thread.sleep(5000);
	     
	     driver.navigate().back();
	     
	     Thread.sleep(5000);

	     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));

	     Thread.sleep(5000);
	     
	     //Mobile number already set by default
	
        //enter the email address
	     
	     WebElement Email_Address = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
	 	
	     Email_Address.click();
	     
	     Thread.sleep(5000);
	     
	     Email_Address.sendKeys("rfulzele@reyan.co.in");
		     
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
		 
		 Thread.sleep(5000);
	     
	     //Minimum_delivery_Rate 
	     
	     WebElement Minimum_delivery_Rate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[11]"));
 		
	     Minimum_delivery_Rate.click();
	     
	     Thread.sleep(5000);
	     
	     Minimum_delivery_Rate.clear();
	     
	     Thread.sleep(5000);
	     
	     Minimum_delivery_Rate.sendKeys("80");
		     
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
	    
		 //Click on  Post_Now
	     
	     WebElement Post_Now = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Post Now\"]"));
	 		
	     Post_Now.click();
	     
	     Thread.sleep(5000);
	     
	     driver.navigate().back();
	     
	     Thread.sleep(5000);
	     
	     //Logout user
	     
	     Logout_user logout1 = new Logout_user();
	     
	     logout1.logout();
	     
	     Thread.sleep(5000);
	     
    }
    
    @Test (priority = 2)
	public void  TC_ID_15_02 () throws InterruptedException{
	     
	     
	     //Login with buyer
	     
	   //login with the buyer again
		 
		 Login_U2 Enter_11 = new Login_U2();
	   	
	     Enter_11.Login_Buyer_U2();
	       
	     Thread.sleep(30000);
	     
	    // check for validation 
	     
	    //Now click on search product filed and search product with name "Hackthon" 
	     
	     WebElement Search_Product = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]"));
	 		
	     Search_Product.click();
	     
	     Thread.sleep(5000);
	     
	     WebElement Search_Product_with_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
	 		
	     Search_Product_with_Name.click();
	     
	     Thread.sleep(5000);
	     
	     Search_Product_with_Name.sendKeys("Hackathon");
	     
	     
	   //click on different Km range to check Product visibility
			
			//10 Km
			 
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
			  
			  //100 Km
			  
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
	     
    @Test (priority = 3)
 	public void  TC_ID_15_03 () throws InterruptedException{   
	     
	     
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
    	
    
    @Test (priority = 4)
 	public void  TC_ID_15_04 () throws InterruptedException{   
    
    //Click_on_quantity_field
	  
	  WebElement Quantity_Field1 = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	  
	  Quantity_Field1.click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  Quantity_Field1.sendKeys("8");

	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	  WebElement Enquiry_Now_1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]")); 
	  
	  Enquiry_Now_1.click();  
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  System.out.println("Error messege display = (Quantity should be 2-3!!)");
    	
    }
    
    @Test (priority = 5)
 	public void  TC_ID_15_05 () throws InterruptedException{ 
    	
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
    	
    	
    @Test (priority = 6)
   	public void  TC_ID_15_06 () throws InterruptedException{ 	
    	
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
		   
		   Thread.sleep(5000);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(5000);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(5000);
		   
		   driver.navigate().back();
		   
            Thread.sleep(5000);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(25000);
		   
		   //click on profile icon to logout
		   
//		   WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[1]")); 
//			  
//		   Profile.click(); 
		   
		   TouchAction Profile_Icon_1 = new TouchAction(driver);
		   Profile_Icon_1.tap(PointOption.point(962, 200)).perform();
		   
		   Thread.sleep(5000);
		   
		   //Click on logout 
		   
//		   WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")); 
//			  
//		   Logout.click(); 
		   
		 	TouchAction touchAction_1 = new TouchAction(driver);
		    touchAction_1.tap(PointOption.point(327, 1947)).perform(); 
		   
		   Thread.sleep(5000);
		   
		   WebElement Logout_button_2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
			  
		   Logout_button_2.click(); 
		   
		   Thread.sleep(5000);
		   
    }
    
    @Test (priority = 7)
   	public void  TC_ID_15_07 () throws InterruptedException{  	
    	
		   
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
 	
 	  Thread.sleep(15000);
				
// click on Accepted button
				

	    WebElement Accepted_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Accept\"]")); 
					  
	    Accepted_button.click();
	    
	    Thread.sleep(5000);
				   	 
	    
// click on ammount
		

	    WebElement ammount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText/android.widget.Button")); 
					  
	    ammount.click();
	    
	    Thread.sleep(10000);
	    
	    driver.navigate().back();

//click on delivered button
	    
	    WebElement delivered_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Deliverd\"]")); 
		  
	    delivered_button.click();
	    
	   
////click on delivered_STATUS
//	    
//	    WebElement delivered_STATUS = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText/android.widget.Button")); 
//		  
//	    delivered_STATUS.click();	    
	    
	    
	    
	    Thread.sleep(10000);
        driver .navigate().back();

    	Thread.sleep(5000);
				   	 
		driver .navigate().back();

		Thread.sleep(5000);
				 	   
		driver.navigate().back();
//		
//		Thread.sleep(5000);
//	 	   
//		driver.navigate().back();
//		
//		Thread.sleep(5000);
//	 	   
//		driver.navigate().back();
//		
//		Thread.sleep(5000);
//	 	   
//		driver.navigate().back();
//				 	   
	    Thread.sleep(20000);

	   TouchAction touchAction_Sell122 = new TouchAction(driver);
	   touchAction_Sell122.tap(PointOption.point(953, 204)).perform();
					 
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	   Thread.sleep(11000);
					
		//click on logout
					
	 TouchAction touchAction_1234 = new TouchAction(driver);
	 touchAction_1234.tap(PointOption.point(327, 1947)).perform(); 
					
	  Thread.sleep(15000);
				      
	//Click on logout button
					   
	 WebElement Logout_button_12 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
						  
	  Logout_button_12.click(); 
	  
	  Thread.sleep(15000);

    	
    	
    }
    	
    @Test (priority = 8)
   	public void  TC_ID_15_08 () throws InterruptedException{  	
	     
    	//login with the buyer again
		 
   	 Login_U2 Enter_1121 = new Login_U2();
   				   	
       Enter_1121.Login_Buyer_U2();
   				       
       Thread.sleep(25000);
   					 
      //select the Order 
   				       
   	 TouchAction touchAction_order_select = new TouchAction(driver);
   	 touchAction_order_select.tap(PointOption.point(721, 2160)).perform();
   				  	 
   	  Thread.sleep(10000);
   					 
   	//Click on Buying_button 
   				   
   	 TouchAction touchAction_Buying_select = new TouchAction(driver);
   	 touchAction_Buying_select.tap(PointOption.point(526, 372)).perform();
   					   	 
   	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   	
 	  Thread.sleep(10000);
				   	
   	//Click on Product button
   					   	
   	 WebElement Product_button_12= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Product\"] ")); 
   					   	  
   	Product_button_12.click();
   					   	 
   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   	 
	  Thread.sleep(10000);

   					   	 
   	 // select the Product from top list

   	 TouchAction touchAction_213 = new TouchAction(driver);
    	touchAction_213.tap(PointOption.point(558, 758)).perform(); 
   					   	 
   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   					          
   	 // accepted_status should be dispaly
   					   	 
   	// String Order_Status_1 = driver.findElement(By.xpath("//android.view.View[@index='16']")).getTagName();
   						  
   	// System.out.println("Status changed and display = " + Order_Status_1); 
   						    
   					 
   	 driver.navigate().back();
   	 
   	 //accepted_status
   	 
   	String accepted_status = driver.findElement(By.xpath("//android.view.View[@index='14']")).getTagName();
	  
	System.out.println("accepted status= " + accepted_status); 	
	
	 //Delivered_status
	
	String Delivered_status = driver.findElement(By.xpath("//android.view.View[@index='15']")).getTagName();
	  
	System.out.println("Delivered status = " + Delivered_status); 
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
  	TouchAction Home_tab = new TouchAction(driver);
  	Home_tab.tap(PointOption.point(145, 2142)).perform(); 
  	
  	Thread.sleep(5000);
		
}
    
    @Test (priority = 9)
   	public void  TC_ID_15_09 () throws InterruptedException{ 
    	
    	//click on home button
   	
      	Thread.sleep(25000);
      	
      	 //click on location_update button
    	
		 WebElement Location_Update = driver.findElement(By.xpath("//android.view.View[@index='1']"));
			 			 
		 Location_Update.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		 
		 //search the address name with Goa
	    
		 WebElement Search_Goa = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]"));
		 
		 Search_Goa.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		 Thread.sleep(5000);
		 
		 WebElement Search_Goa_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));

		 Search_Goa_1.click();
		 
		 Thread.sleep(5000);
		 			 
		 Search_Goa_1.sendKeys("Goa");
		 
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
      	
		 Thread.sleep(15000);
		 
    	//click on + button to sell your product
    	
		 WebElement Click_on_sell_your_product = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		 		 
		 Click_on_sell_your_product.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	//click on sell_your_product
   		
		 WebElement sell_your_product = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sell your Product\"]"));
			 		 
		 sell_your_product.click();
			 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
	// click on Add your product
	    	
			 WebElement Add_Product = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
	 		 
			 Add_Product.click();
				 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 	 
    
			 Thread.sleep(5000);
			 
			 //Enter Item Name
			 
			 WebElement Item_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
	 		 
			 Item_Name.click();
			 
			 Thread.sleep(5000);
				 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 Item_Name.sendKeys("Hackathon_1");
			 
			 Thread.sleep(5000);
			 
			 //Select category
			 
			 WebElement Category = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Category *\"]"));
	 		 
			 Category.click();
				 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 Thread.sleep(5000);
			
			 //select category
			 
		     WebElement Category_1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Covered Smut\"]"));
	 		 
		     Category_1.click();
			 
			 Thread.sleep(5000);
			 
			 //Enter_Price
			 
		     WebElement Enter_Price = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
	 		 
		     Enter_Price.click();
			 
			 Thread.sleep(5000);
			 
			 Enter_Price.sendKeys("1000");
			 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 driver.navigate().back();
			 
			 //Market_Price
			 
		     WebElement Market_Price = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
	 		 
		     Market_Price.click();
			 
			 Thread.sleep(5000);
			 
			 Market_Price.sendKeys("1100");
			 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 driver.navigate().back();
			 
			 Thread.sleep(5000);
			 
			 //Select_Unit
			 
		     WebElement Select_Unit = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Unit *\"]"));
	 		 
		     Select_Unit.click();
			 
			 Thread.sleep(5000);
			 
			 //select unit acer
			 
		     WebElement Select_Unit_1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Acre\"]"));
	 		 
		     Select_Unit_1.click();
		     
		     Thread.sleep(5000);
		     
		     //Coverage Area (Within KM Range)
		     
		     WebElement Coverage_Area = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
	 		 
		     Coverage_Area.click();
		     
		     Thread.sleep(5000);
		     
		     Coverage_Area.sendKeys("90");
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     
		     //Description
		     
		     WebElement Description = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
	 		 
		     Description.click();
		     
		     Thread.sleep(5000);
		     
		     Description.sendKeys("Hackathon Serise");
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     
		     //Min_Quantity
		     
	         WebElement Min_Quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[6]"));
	 		 
	         Min_Quantity.click();
	         
	         Thread.sleep(5000);
	         
	         Min_Quantity.sendKeys("2");
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     
		     
	        //Max_Quantity
		     
	         WebElement Max_Quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[7]"));
	 		 
	         Max_Quantity.click();
	         
	         Thread.sleep(5000);
	         
	         Max_Quantity.sendKeys("4");
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     
		     Thread.sleep(5000);

		     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));

		     Thread.sleep(5000);
		     
		     //Mobile number already set by default
		
	        //enter the email address
		     
		     WebElement Email_Address = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
		 	
		     Email_Address.click();
		     
		     Thread.sleep(5000);
		     
		     Email_Address.sendKeys("rfulzele@reyan.co.in");
			     
			 Thread.sleep(5000);
			 
			 driver.navigate().back();
			 
			 Thread.sleep(5000);
		     
		     //Minimum_delivery_Rate 
		     
		     WebElement Minimum_delivery_Rate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[11]"));
	 		
		     Minimum_delivery_Rate.click();
		     
		     Thread.sleep(5000);
		     
		     Minimum_delivery_Rate.clear();
		     
		     Thread.sleep(5000);
		     
		     Minimum_delivery_Rate.sendKeys("80");
			     
			 Thread.sleep(5000);
			 
			 driver.navigate().back();
		    
			 //Click on  Post_Now
		     
		     WebElement Post_Now = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Post Now\"]"));
		 		
		     Post_Now.click();
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     
		     
		     Thread.sleep(20000);
		     
		     //Logout user
		     
		     //click on profile icon to logout
			   
//			   WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[1]")); 
//				  
//			   Profile.click(); 
			   
			   TouchAction Profile_Icon_11 = new TouchAction(driver);
			   Profile_Icon_11.tap(PointOption.point(962, 200)).perform();
			   
			   Thread.sleep(5000);
			   
			   //Click on logout 
			   
//			   WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")); 
//				  
//			   Logout.click(); 
			   
			 	TouchAction touchAction_1 = new TouchAction(driver);
			    touchAction_1.tap(PointOption.point(327, 1947)).perform(); 
			   
			   Thread.sleep(5000);
			   
			   WebElement Logout_button_2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Logout\"]")); 
				  
			   Logout_button_2.click(); 
			   
			   Thread.sleep(15000);
    
		   	 Login_U1 Enter_1121 = new Login_U1();
			   	
		       Enter_1121.Login_Seller_U1();
		   				       
		       Thread.sleep(25000);
    
//		       WebElement Search_Product = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]"));
//		 		
//			     Search_Product.click();
//			     
//			     Thread.sleep(10000);
//			     
//			     WebElement Search_Product_with_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
//			 		
//			     Search_Product_with_Name.click();
//			     
//			     Thread.sleep(5000);
//			     
//			     Search_Product_with_Name.sendKeys("Hackathon_1");
//			     
//			     Thread.sleep(5000);
//			     
//			   //click on different Km range to check Product visibility
//					
//					//10 Km
//					 
//					  WebElement Ten_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"10km\"]"));
//					  
//					  Ten_km.click();
//					  
//					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//					  
//					  //25 km
//					  
//					  WebElement TwentyFive_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"25km\"]"));
//					  
//					  TwentyFive_km.click();
//					  
//					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//					  
//					  //50 km
//					  
//					  WebElement Fifty_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"50km\"]"));
//					  
//					  Fifty_Km.click();
//					  
//					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//					  
//					  //100 Km
//					  
//					  WebElement hundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"100km\"]"));
//					  
//					  hundred_Km.click();
//					  
//					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//					  
//					  //200 Km
//					  
//					  WebElement Twohundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"200km\"]"));
//					  
//					  Twohundred_Km.click();
//					  
//					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//					  
//					  //500 Km
//					  
////					  WebElement FiveHundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"500km\"]"));
////					  
////					  FiveHundred_Km.click();
////					  
////					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////					  
//					  //All 
//					  
////					  WebElement All = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\" All \"]"));
////					  
////					  All.click();
//					  
//			
}}