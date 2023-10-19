package Test_Case_Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;
import mobileAppLaunch.Login_User1;
	
	public class TC_ID_25 extends Launch {

		@Test (priority=0)	
			public void Login () throws InterruptedException {
				Login_User1 Test = new Login_User1();
				Test.Login_User1_Seller();
			}
		@Test	(priority=1)


		public void TC_ID_25_01 () throws InterruptedException {
		
	    	Thread.sleep(20000);
		
			TouchAction Menu = new TouchAction(driver);

			Menu.tap(PointOption.point(950, 192)).perform();
			
			Thread.sleep(5000);
			
			
			TouchAction Report = new TouchAction(driver);

			Report.tap(PointOption.point(304, 1080)).perform();
			
			Thread.sleep(15000);
			
			// Report from date
			
//			TouchAction ReportFromDateField = new TouchAction(driver);
//
//			ReportFromDateField.tap(PointOption.point(349, 522)).perform();
			
//            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//			
//            from.click();
//				
//			Thread.sleep(5000);
//			
//	        // From Date
//			
//			WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//			
//			FromDate_1.clear();
//				
//			Thread.sleep(5000);
//			
//			FromDate_1.sendKeys("01");
//			
//			Thread.sleep(5000);
//			
//			//Select From month
//			
//			WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//			
//			FromMonth_1.clear();
//				
//			Thread.sleep(5000);
//			
//			FromMonth_1.sendKeys("Oct");
//			
//			Thread.sleep(5000);
//			
//	
//			//select Year
//			
//			WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//			
//			FromYear_1.clear();
//				
//			Thread.sleep(5000);
//			
//			FromYear_1.sendKeys("2023");
//			
//			Thread.sleep(5000);
//			
//			// click on set
//			
//			
//			WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//		
//			
//			SetButton_1.click();
//				
//			Thread.sleep(5000);
//			
//	//select To Date
//			
//            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//			
//            To_.click();
//				
//			Thread.sleep(5000);
//			
//			// date
//			
//			WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//			
//			ToDate.clear();
//				
//			Thread.sleep(5000);
//			
//			ToDate.sendKeys("07");
//			
//			Thread.sleep(5000);
//			
//			//month
//			
//			WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//			
//			ToMonth.clear();
//				
//			Thread.sleep(5000);
//			
//			ToMonth.sendKeys("Oct");	
//			
//			Thread.sleep(5000);
//			
//// Year			
//
//			WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//			
//			ToYear.clear();
//				
//			Thread.sleep(5000);
//			
//			ToYear.sendKeys("2023");
//			
//			Thread.sleep(5000);
//			
//			//click set
//			
//          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//          Set_1.click();
//          
//          Thread.sleep(5000);
          
			
			// click on view Report
			
			WebElement View_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
			
			View_Report.click();
			
			Thread.sleep(10000);
			
			driver.navigate().back();
			
			
	}
		
		@Test	(priority=2)


		public void TC_ID_25_02 () throws InterruptedException {
		
	    	Thread.sleep(10000);
			
			TouchAction Report = new TouchAction(driver);

			Report.tap(PointOption.point(304, 1080)).perform();
			
			Thread.sleep(15000);
			
			// Report from date
			
//			TouchAction ReportFromDateField = new TouchAction(driver);
//
//			ReportFromDateField.tap(PointOption.point(349, 522)).perform();
			
//            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//			
//            from.click();
//				
//			Thread.sleep(5000);
//			
//	        // From Date
//			
//			WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//			
//			FromDate_1.clear();
//				
//			Thread.sleep(5000);
//			
//			FromDate_1.sendKeys("01");
//			
//			Thread.sleep(5000);
//			
//			//Select From month
//			
//			WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//			
//			FromMonth_1.clear();
//				
//			Thread.sleep(5000);
//			
//			FromMonth_1.sendKeys("Oct");
//			
//			Thread.sleep(5000);
//			
//	
//			//select Year
//			
//			WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//			
//			FromYear_1.clear();
//				
//			Thread.sleep(5000);
//			
//			FromYear_1.sendKeys("2023");
//			
//			Thread.sleep(5000);
//			
//			// click on set
//			
//			
//			WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//		
//			
//			SetButton_1.click();
//				
//			Thread.sleep(5000);
//			
//	//select To Date
//			
//            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//			
//            To_.click();
//				
//			Thread.sleep(5000);
//			
//			// date
//			
//			WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//			
//			ToDate.clear();
//				
//			Thread.sleep(5000);
//			
//			ToDate.sendKeys("07");
//			
//			Thread.sleep(5000);
//			
//			//month
//			
//			WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//			
//			ToMonth.clear();
//				
//			Thread.sleep(5000);
//			
//			ToMonth.sendKeys("Oct");	
//			
//			Thread.sleep(5000);
//			
//// Year			
//
//			WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//			
//			ToYear.clear();
//				
//			Thread.sleep(5000);
//			
//			ToYear.sendKeys("2023");
//			
//			Thread.sleep(5000);
//			
//			//click set
//			
//          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//          Set_1.click();
//          
//          Thread.sleep(5000);
//          
//			
			// click on view Report
			
			WebElement View_chart_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));
			
			View_chart_Report.click();
			
			Thread.sleep(10000);
			
			driver.navigate().back();
			
			
	}
		@Test	(priority=3)
		public void TC_ID_25_03 () throws InterruptedException {
			
		   	Thread.sleep(10000);
			
					TouchAction Report = new TouchAction(driver);

					Report.tap(PointOption.point(304, 1080)).perform();
					
					Thread.sleep(15000);
					
					// Report from date
					
//					TouchAction ReportFromDateField = new TouchAction(driver);
		//
//					ReportFromDateField.tap(PointOption.point(349, 522)).perform();
//					
//		            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//					
//		            from.click();
//						
//					Thread.sleep(5000);
//					
//			        // From Date
//					
//					WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//					
//					FromDate_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromDate_1.sendKeys("01");
//					
//					Thread.sleep(5000);
//					
//					//Select From month
//					
//					WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//					
//					FromMonth_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromMonth_1.sendKeys("Oct");
//					
//					Thread.sleep(5000);
//					
//			
//					//select Year
//					
//					WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//					
//					FromYear_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromYear_1.sendKeys("2023");
//					
//					Thread.sleep(5000);
//					
//					// click on set
//					
//					
//					WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//				
//					
//					SetButton_1.click();
//						
//					Thread.sleep(5000);
//					
//			//select To Date
//					
//		            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//					
//		            To_.click();
//						
//					Thread.sleep(5000);
//					
//					// date
//					
//					WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//					
//					ToDate.clear();
//						
//					Thread.sleep(5000);
//					
//					ToDate.sendKeys("07");
//					
//					Thread.sleep(5000);
//					
//					//month
//					
//					WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//					
//					ToMonth.clear();
//						
//					Thread.sleep(5000);
//					
//					ToMonth.sendKeys("Oct");	
//					
//					Thread.sleep(5000);
//					
//		// Year			
//
//					WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//					
//					ToYear.clear();
//						
//					Thread.sleep(5000);
//					
//					ToYear.sendKeys("2023");
//					
//					Thread.sleep(5000);
//					
//					//click set
//					
//		          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//		          Set_1.click();
//		          
//		          Thread.sleep(5000);
//		          
					
					// click on view Report
					
					WebElement Top_Ten_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[3]"));
					
					Top_Ten_Report.click();
					
					Thread.sleep(10000);
					
					driver.navigate().back();
			
			
	
	}
		
		@Test	(priority=4)
		public void TC_ID_25_04 () throws InterruptedException {
	
	
		   	Thread.sleep(10000);
			
					TouchAction Report = new TouchAction(driver);

					Report.tap(PointOption.point(304, 1080)).perform();
					
					Thread.sleep(15000);
					
					// Report from date
					
//					TouchAction ReportFromDateField = new TouchAction(driver);
		//
//					ReportFromDateField.tap(PointOption.point(349, 522)).perform();
					
//		            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//					
//		            from.click();
//						
//					Thread.sleep(5000);
//					
//			        // From Date
//					
//					WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//					
//					FromDate_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromDate_1.sendKeys("01");
//					
//					Thread.sleep(5000);
//					
//					//Select From month
//					
//					WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//					
//					FromMonth_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromMonth_1.sendKeys("Oct");
//					
//					Thread.sleep(5000);
//					
//			
//					//select Year
//					
//					WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//					
//					FromYear_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromYear_1.sendKeys("2023");
//					
//					Thread.sleep(5000);
//					
//					// click on set
//					
//					
//					WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//				
//					
//					SetButton_1.click();
//						
//					Thread.sleep(5000);
//					
//			//select To Date
//					
//		            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//					
//		            To_.click();
//						
//					Thread.sleep(5000);
//					
//					// date
//					
//					WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//					
//					ToDate.clear();
//						
//					Thread.sleep(5000);
//					
//					ToDate.sendKeys("07");
//					
//					Thread.sleep(5000);
//					
//					//month
//					
//					WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//					
//					ToMonth.clear();
//						
//					Thread.sleep(5000);
//					
//					ToMonth.sendKeys("Oct");	
//					
//					Thread.sleep(5000);
//					
//		// Year			
//
//					WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//					
//					ToYear.clear();
//						
//					Thread.sleep(5000);
//					
//					ToYear.sendKeys("2023");
//					
//					Thread.sleep(5000);
//					
//					//click set
//					
//		          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//		          Set_1.click();
//		          
//		          Thread.sleep(5000);
		          
					
					// click on view Report
					
					WebElement Total_Summary_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[4]"));
					
					Total_Summary_Report.click();
					
					Thread.sleep(10000);
					
					driver.navigate().back();
			
			
			
			
			
	}
		@Test	(priority=5)
		public void TC_ID_25_05 () throws InterruptedException {
	
	
		   	Thread.sleep(10000);
			
					TouchAction Report = new TouchAction(driver);

					Report.tap(PointOption.point(304, 1080)).perform();
					
					Thread.sleep(15000);
					
					// Report from date
					
//					TouchAction ReportFromDateField = new TouchAction(driver);
		//
//					ReportFromDateField.tap(PointOption.point(349, 522)).perform();
					
//		            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//					
//		            from.click();
//						
//					Thread.sleep(5000);
//					
//			        // From Date
//					
//					WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//					
//					FromDate_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromDate_1.sendKeys("01");
//					
//					Thread.sleep(5000);
//					
//					//Select From month
//					
//					WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//					
//					FromMonth_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromMonth_1.sendKeys("Oct");
//					
//					Thread.sleep(5000);
//					
//			
//					//select Year
//					
//					WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//					
//					FromYear_1.clear();
//						
//					Thread.sleep(5000);
//					
//					FromYear_1.sendKeys("2023");
//					
//					Thread.sleep(5000);
//					
//					// click on set
//					
//					
//					WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//				
//					
//					SetButton_1.click();
//						
//					Thread.sleep(5000);
//					
//			//select To Date
//					
//		            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//					
//		            To_.click();
//						
//					Thread.sleep(5000);
//					
//					// date
//					
//					WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//					
//					ToDate.clear();
//						
//					Thread.sleep(5000);
//					
//					ToDate.sendKeys("07");
//					
//					Thread.sleep(5000);
//					
//					//month
//					
//					WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//					
//					ToMonth.clear();
//						
//					Thread.sleep(5000);
//					
//					ToMonth.sendKeys("Oct");	
//					
//					Thread.sleep(5000);
//					
//		// Year			
//
//					WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//					
//					ToYear.clear();
//						
//					Thread.sleep(5000);
//					
//					ToYear.sendKeys("2023");
//					
//					Thread.sleep(5000);
//					
//					//click set
//					
//		          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//		          Set_1.click();
//		          
//		          Thread.sleep(5000);
//		          
					
					// click on view Report
					
					WebElement View_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[5]"));
					
					View_Report.click();
					
					Thread.sleep(10000);
					
					driver.navigate().back();
			
	
	
	
	}@Test	(priority=6)
	public void TC_ID_25_06 () throws InterruptedException {
		
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
//	          
				
				// click on view Report
				
				WebElement View_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[6]"));
				
				View_Report.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
	
	}
	
	
	@Test	(priority=7)
	public void TC_ID_25_07 () throws InterruptedException {
		
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
//				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
	          
			  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));

			  Thread.sleep(5000);
			  
				// click on Mandi_Rate
				
				WebElement Mandi_Rate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));
				
				Mandi_Rate.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
		
		
		
	}
	
	
	
	@Test	(priority=8)
	public void TC_ID_25_08 () throws InterruptedException {
	
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
//	          
			  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));
//
			  Thread.sleep(5000);
				
			// click on view_mandi_changes
				
				WebElement view_mandi_changes = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[3]"));
				
				view_mandi_changes.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
	
	
	
	}
	
	@Test	(priority=9)
	public void TC_ID_25_09 () throws InterruptedException {
	
	
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
	          
			  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));

	          
	          Thread.sleep(5000);
	          
				
				// click on view Report
				
				WebElement Booking_status_Report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[4]"));
				
				Booking_status_Report.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
	
	
	
	
	}
	
	
	
	@Test	(priority=10)
	public void TC_ID_25_10 () throws InterruptedException {
	
	
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
//	          
			  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));
//
			  Thread.sleep(5000);
				
				// click on view Report
				
				WebElement Receipt_summary_report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[5]"));
				
				Receipt_summary_report.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
	
	}
	
	@Test	(priority=11)
	public void TC_ID_25_11 () throws InterruptedException {
	
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
//				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
	                    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));
//
			  Thread.sleep(5000);
	          
				
				// click on view Report
				
				WebElement credit_summary_report = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[6]"));
				
				credit_summary_report.click();				
				Thread.sleep(10000);
				
				driver.navigate().back();
	}
	
	@Test	(priority=12)
	public void TC_ID_25_12 () throws InterruptedException {
		
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
//	          
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));
//
	            Thread.sleep(5000);
//	          
				
				// click on view Report
				
				WebElement Latest_Mandi_Rate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[7]"));
				
				Latest_Mandi_Rate.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
	
	}
	@Test	(priority=13)
	public void TC_ID_25_13 () throws InterruptedException {
		
	   	Thread.sleep(10000);
		
				TouchAction Report = new TouchAction(driver);

				Report.tap(PointOption.point(304, 1080)).perform();
				
				Thread.sleep(15000);
				
				// Report from date
				
//				TouchAction ReportFromDateField = new TouchAction(driver);
	//
//				ReportFromDateField.tap(PointOption.point(349, 522)).perform();
				
//	            WebElement from  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));
//				
//	            from.click();
//					
//				Thread.sleep(5000);
//				
//		        // From Date
//				
//				WebElement FromDate_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				FromDate_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromDate_1.sendKeys("01");
//				
//				Thread.sleep(5000);
//				
//				//Select From month
//				
//				WebElement FromMonth_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				FromMonth_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromMonth_1.sendKeys("Oct");
//				
//				Thread.sleep(5000);
//				
//		
//				//select Year
//				
//				WebElement FromYear_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				FromYear_1.clear();
//					
//				Thread.sleep(5000);
//				
//				FromYear_1.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				// click on set
//				
//				
//				WebElement SetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//			
//				
//				SetButton_1.click();
//					
//				Thread.sleep(5000);
//				
//		//select To Date
//				
//	            WebElement To_ = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));
//				
//	            To_.click();
//					
//				Thread.sleep(5000);
//				
//				// date
//				
//				WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
//				
//				ToDate.clear();
//					
//				Thread.sleep(5000);
//				
//				ToDate.sendKeys("07");
//				
//				Thread.sleep(5000);
//				
//				//month
//				
//				WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
//				
//				ToMonth.clear();
//					
//				Thread.sleep(5000);
//				
//				ToMonth.sendKeys("Oct");	
//				
//				Thread.sleep(5000);
//				
//	// Year			
//
//				WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
//				
//				ToYear.clear();
//					
//				Thread.sleep(5000);
//				
//				ToYear.sendKeys("2023");
//				
//				Thread.sleep(5000);
//				
//				//click set
//				
//	          WebElement Set_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//	          Set_1.click();
//	          
//	          Thread.sleep(5000);
//	          
          driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1100)"));

		  Thread.sleep(5000);
          
				
				// click on view Report
				
				WebElement customer_pay_details = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[8]"));
				
				customer_pay_details.click();
				
				Thread.sleep(10000);
				
				driver.navigate().back();
	}}