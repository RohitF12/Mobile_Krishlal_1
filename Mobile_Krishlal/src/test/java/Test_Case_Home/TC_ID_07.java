package Test_Case_Home;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User2;

public class TC_ID_07 extends Launch{
	
    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
	    Login_User2 Enter = new Login_User2();
	
	    Enter.Login_User2_Buyer();

	}

    @Test (priority = 1)
	public void  TC_ID_07 () throws InterruptedException {
	
		 WebElement Searchproduct1 = driver.findElement(By.xpath("//android.widget.ImageView[@index='4']"));
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 Searchproduct1.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 WebElement Searchproduct = driver.findElement(By.xpath("//android.widget.EditText[@index='2']"));
		 
		 Searchproduct.click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		 Searchproduct.sendKeys("Graphics Card");
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
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
		  
//		  WebElement FiveHundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"500km\"]"));
//		  
//		  FiveHundred_Km.click();
//		  
//		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		  
		  //All 
		  
//		  WebElement All = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\" All \"]"));
//		  
//		  All.click();
		  
		  
		  WebElement Select_Product = driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
			 
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
		  Select_Product.click();
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	}
	
        @Test (priority = 2)
    	public void  TC_ID_07_01 () throws InterruptedException {
    	
        	//Product image
        	      
  		    WebElement Select_Product = driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
			 
  		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
  			 Assert.assertEquals(true, Select_Product.isDisplayed());
			  
			 System.out.println("Product image is dispaly = True " );
			 
			 Thread.sleep(10000);
			 
			 
	        //Product_Name
			 
			  String Product_Name = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
			  
			  System.out.println("Product name is = " + Product_Name);	
    	
    	    //Location_of_the_product
    	
	         String Location_of_the_product = driver.findElement(By.xpath("//android.view.View[@index='5']")).getTagName();
			  
			  System.out.println("Location_of_the_product = " + Location_of_the_product);
    	
    	 
	    	 //Delivery_charges
		    	
		       String Delivery_charges = driver.findElement(By.xpath("//android.view.View[@index='9']")).getTagName();
				  
			   System.out.println("Delivery charges of the product = " + Delivery_charges);
    	
    	      
		     //Ammount
		    	
		       String Ammount = driver.findElement(By.xpath("//android.view.View[@index='7']")).getTagName();
				  
			   System.out.println("Total Ammount of the product = " + Ammount);
    	
    	
			  //Unit
		    	
		       String Unit = driver.findElement(By.xpath("//android.view.View[@index='8']")).getTagName();
				  
			   System.out.println("Unit of the product = " + Unit);
    	
    	     //Description
    	
		       String Description = driver.findElement(By.xpath("//android.view.View[@index='11']")).getTagName();
				  
			   System.out.println("Description of product = " + Description);
	
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
        
        @Test (priority = 3)
    	public void  TC_ID_07_02 () throws InterruptedException {
        	
        	
      	  //Click_on_quantity_field
			  
			  WebElement Quantity_Field1 = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
			  
			  Quantity_Field1.click();
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  Quantity_Field1.sendKeys("4");
        
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
			  WebElement Enquiry_Now_1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]")); 
			  
			  Enquiry_Now_1.click();  
			  
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  
			  System.out.println("Error messege display = (Quantity should be 2-3!!)");
           
        
        }
               
        @Test (priority = 4)
        public void  TC_ID_07_03 () throws InterruptedException {
        
         	  //Click_on_quantity_field_2
			  
      			  WebElement Quantity_Field1 = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
      			  
      			  Quantity_Field1.click();
      			  
      			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      			  
      			  Quantity_Field1.sendKeys("2");
              
      			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      			  
      			  //Click on Enquiry now button
                
    			  WebElement Enquiry_Now_2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]")); 
      			  
      			  Enquiry_Now_2.click();  
      			  
      			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      			  
      			  //Type Additional field "NA"
      			  
      			 WebElement Additional_Field = driver.findElement(By.xpath("//android.widget.EditText[@index='0']")); 
      			  
      		     Additional_Field.click();
      		    
      		     Additional_Field.sendKeys("NA");
      		     
      		     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      		     
      		     //click on Ok button
      		     
      			 WebElement OK_Button = driver.findElement(By.xpath("//android.widget.Button[@index='2']")); 
     			  
      			 OK_Button.click();
      		     
      		     
      		     
        } 
        
        @Test (priority = 5)
        public void  TC_ID_07_04 () throws InterruptedException {   
        
        
       	 //Product_Name_Display
	    	
			   String Product_Name_Display = driver.findElement(By.xpath("//android.view.View[@index='3']")).getTagName();
						  
			   System.out.println("Product name appeared  = " + Product_Name_Display); 
			   
		//Location_display  	   
			   
			   String Location_display = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
				  
			   System.out.println("Product name location is = " + Location_display); 
			   
			   
		//Order_Date  	   
			   
			   String Order_Date = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();
				  
			   System.out.println("Order date display is = " + Order_Date); 	   
			   
			   
		//Quantity_unit  	   
					   
				String Quantity_unit = driver.findElement(By.xpath("//android.view.View[@index='6']")).getTagName();
						  
				System.out.println("Quantity and unit is = " + Quantity_unit); 	   
					   	   
			   		   
		//Order_Id	   
			   
			   String Order_Id = driver.findElement(By.xpath("//android.view.View[@index='9']")).getTagName();
				  
			   System.out.println("Order Id of the product = " + Order_Id); 		   
			   
			   
		//Order_Status	   
			   
			   String Order_Status = driver.findElement(By.xpath("//android.view.View[@index='13']")).getTagName();
				  
			   System.out.println("Status of order = " + Order_Status); 	
			   
		//Contact_person_name	   
			   
			   String Contact_person_name = driver.findElement(By.xpath("//android.view.View[@index='20']")).getTagName();
				  
			   System.out.println("Contact person name display is = " + Contact_person_name); 
        
} 
        }
















