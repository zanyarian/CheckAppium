package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GProducts {

public GProducts(AndroidDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
}
@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
public List<WebElement> shoes;

@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
public List <WebElement> AddCart;

@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
public WebElement Price;

@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
public WebElement button;
}
