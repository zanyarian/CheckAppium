package Check.AppiumMaven;

import io.appium.java_client.android.AndroidDriver;

public class Scroll {
	AndroidDriver driver;
	public Scroll(AndroidDriver driver, String s){
		this.driver=driver;
		
	}
	public void scrollTo(String s) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text\""+s+"\");");
	}
}
