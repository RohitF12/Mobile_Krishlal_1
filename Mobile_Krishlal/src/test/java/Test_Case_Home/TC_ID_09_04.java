package Test_Case_Home;



import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POM.Move_2_Half_Screen;
import POM.Scroll_Up;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User1;
import mobileAppLaunch.Login_User2;

public class TC_ID_09_04 extends Launch {

    @Test (priority = 0)
	public void  Login2App() throws InterruptedException {
	
        Login_User1 Enter_1 = new Login_User1();
    	
        Enter_1.Login_User1_Seller();
        
        Thread.sleep(5000); 
	
}
    
    @Test (priority = 1)
	public void  TC_ID_09_01 () throws InterruptedException {
    	
    	//Select the mandi Rate
    	
		 TouchAction Mandi_Rate = new TouchAction(driver);
		    
		 Mandi_Rate.tap(PointOption.point(245, 1311)).perform();
				 
	     Thread.sleep(20000);
	     
//Move to half the screen
		 
		 Move_2_Half_Screen MoveHalf = new Move_2_Half_Screen ();
		 
		 MoveHalf.Move_Screen_Half();
		 
		 Thread.sleep(5000);
		 
//select the State
		 
		 //set a default state 
		 
		 WebElement State = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View/android.view.View"));
  		 
		 State.click();
		 
		 Thread.sleep(5000); 
		 
         WebElement State_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
  		 
         State_1.click();
		 
		 Thread.sleep(7000); 
		  
		 Move_2_Half_Screen MoveHalf_1 = new Move_2_Half_Screen ();
		 
		 MoveHalf_1.Move_Screen_Half();
		 
		 Thread.sleep(7000); 
		 
		 //select district
		 
		 WebElement District = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View"));
  		 
		 District.click();
		 
		 Thread.sleep(5000); 
		 
         WebElement District_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
  		 
         District_1.click();
		 
		 Thread.sleep(5000); 
		 
		 
		 Move_2_Half_Screen MoveHalf_2 = new Move_2_Half_Screen ();
		 
		 MoveHalf_2.Move_Screen_Half();
		 
		 Thread.sleep(7000);
		 
		 //select comodity
		 
		 WebElement comodity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[6]/android.view.View/android.view.View"));
  		 
		 comodity.click();
		 
		 Thread.sleep(5000); 
		 
         WebElement comodity_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));  		 
         comodity_1.click();
		 
		 Thread.sleep(7000); 
		 
		 Move_2_Half_Screen MoveHalf_3 = new Move_2_Half_Screen ();
		 
		 MoveHalf_3.Move_Screen_Half();
		 
		 Thread.sleep(7000);
		 
		 //select start date
		 
		 WebElement Start_date = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View[1]/android.widget.Spinner"));
  		 
		 Start_date.click();
		 
		 Thread.sleep(5000); 
		 
         WebElement Start_date_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));  		 
         Start_date_1.click();
		 
		 Thread.sleep(7000); 
		 
		 //select End date
		 
		 WebElement End_date = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View[2]/android.widget.Spinner"));
  		 
		 End_date.click();
		 
		 Thread.sleep(5000); 
		 
         WebElement End_date_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));  		 
         End_date_1.click();
		 
		 Thread.sleep(7000); 	 
		 
//		 //start date
//		 
//		 TouchAction Start = new TouchAction(driver);
//		    
//		 Start.tap(PointOption.point(755, 1021)).perform();
//				 
//	     Thread.sleep(5000);
//	     
//		 WebElement Start_date = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View[1]/android.widget.Spinner"));
//		 
//	     Start_date.click();
//	 
//	     Thread.sleep(5000);
//	     
//		 
//		 //End date
//		 
//		 TouchAction end = new TouchAction(driver);
//		    
//		 end.tap(PointOption.point(718, 1117)).perform();
//				 
//	     Thread.sleep(5000);
//	     
//         WebElement End_date_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));  		 
//         End_date_1.click();
 
		 
			//click on search 
		 
	        WebElement search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View[3]/android.widget.Button"));
	  		 
	        search.click();
		 
	        Thread.sleep(5000);
	   	 
	        driver.quit();
	        
	        Thread.sleep(5000);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}}