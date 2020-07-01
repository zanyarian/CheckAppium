package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class apiDemoHome {
	public apiDemoHome(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='android.widget.TextView']")
	public WebElement Preferences;
	
}
