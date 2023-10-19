package POM;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobileAppLaunch.Launch;

public class Move_2_Half_Screen extends Launch{

	
	public void Move_Screen_Half () {
		
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		 int screenHeight = size.getHeight();
		 int screenWidth = size.getWidth();
		 
		 int startX = screenWidth / 2;
		 int startY = screenHeight * 3 / 4; // Adjust this value as needed
		 int endX = startX;
		 int endY = screenHeight / 4; // Scroll to halfway point
       
	     TouchAction touchAction = new TouchAction(driver);
	     touchAction.press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(endX, endY)).release().perform();
		
		
	}
}
