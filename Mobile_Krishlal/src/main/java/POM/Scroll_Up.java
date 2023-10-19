package POM;



import java.time.Duration;

import org.openqa.selenium.Dimension;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;

public class Scroll_Up extends Launch {
	
	public void Move_Screen_Up () {
	
//    Dimension size = driver.manage().window().getSize();
//	int screenHeight = size.getHeight();
//	int screenWidth = size.getWidth();
//	
//	int startX = screenWidth / 2;
//	int startY = screenHeight * 1 / 8; // Adjust this value as needed
//	int endX = startX;
//	int endY = screenHeight / 12; // Scroll to halfway point
//
//	TouchAction touchAction_1 = new TouchAction(driver);
//	touchAction_1.press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(endX, endY)).release().perform();
	
		//new TouchAction<>(driver).press(PointOption.point(930, 227)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(930, 227)).release().perform();
		
	    //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollTo(10)"));


		//public void scrollUp() throws Exception {

		    //The viewing size of the device
		    Dimension size = driver.manage().window().getSize();

		    //Starting y location set to 20% of the height (near bottom)
		    int starty = (int) (size.height * 0.20);
		    //Ending y location set to 80% of the height (near top)
		    int endy = (int) (size.height * 0.150);
		    //x position set to mid-screen horizontally
		    int startx = size.width / 2;

		//    scroll(startx, starty, startx, endy);
		    
		    TouchAction touchAction_1 = new TouchAction(driver);
			touchAction_1.press(PointOption.point(startx, starty)).waitAction().moveTo(PointOption.point(startx, endy)).release().perform();
		}
		
		
		
		
}
	

