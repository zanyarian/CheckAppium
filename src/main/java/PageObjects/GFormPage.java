package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GFormPage {
	
	public GFormPage(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement Name;
	
	

	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement Button;
	
	
	public WebElement getName() {
		return Name;
	}

	public WebElement getButton() {
		return Button;
	}
	

}
