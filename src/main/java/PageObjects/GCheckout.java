package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GCheckout {

	public GCheckout(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
public WebElement total;

@AndroidFindBy(xpath="//android.widget.CheckBox")
public WebElement check;

@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
public WebElement proceed;



}
