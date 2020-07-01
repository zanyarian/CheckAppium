package Check.AppiumMaven;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.GCheckout;
import PageObjects.GFormPage;
import PageObjects.GProducts;
import PageObjects.Preferences;
import PageObjects.apiDemoHome;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;

public class myTest extends baseclass {
	
@Test
public void APIDemo() throws IOException, InterruptedException{
	System.out.println("api");

	AndroidDriver<AndroidElement> driver = baseclass.mydriver("APIDemo");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
apiDemoHome api = new apiDemoHome(driver);
Preferences p = new Preferences(driver);
api.Preferences.click();
p.Preferences.click();
p.Settings.click();
p.Edit.sendKeys("HELLO");
p.OK.get(1).click();


}

/*
 * @DataProvider public Object[][] myDataProvider(){
 * 
 * Object mine[][]= {{"first"}}; return mine;
 * 
 * 
 * }
 */
@Test
public void General() throws IOException, InterruptedException {
	System.out.println("gENERAL");
	AndroidDriver<AndroidElement> driver = baseclass.mydriver("GeneralStoreApp");
	GFormPage form = new GFormPage(driver);
	GProducts prod = new GProducts(driver);
	GCheckout Last = new GCheckout(driver);
	form.getName().sendKeys("Sunny");
	form.getButton().click();
	/*
	 * driver.findElementByAndroidUIAutomator(
	 * "new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\"))"
	 * +
	 * ".scrollIntoView(new UiSelector().textMatches(\"Nike Blazer Mid '77\").instance(0))"
	 * ); double price1=0, price2 =0; Thread.sleep(2000);
	 * 
	 * int j = 0; int size =
	 * driver.findElementsByClassName("android.widget.LinearLayout").size();
	 * 
	 * for (int i = 0; i < size; i++) { String text = prod.shoes.get(i).getText();
	 * if (text.equals("Nike Blazer Mid '77")) { prod.AddCart.get(i).click(); j = i;
	 * System.out.println(j + "\t size " + size); String price =
	 * prod.Price.getText().replace("$", ""); price1 = Double.valueOf(price); break;
	 * }
	 * 
	 * } Thread.sleep(4000); size =
	 * driver.findElementsByClassName("android.widget.LinearLayout").size();
	 * 
	 * driver.findElementByAndroidUIAutomator(
	 * "new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Converse All Star\").instance(0))"
	 * ); for (int i = 0; i < size; i++) {
	 * 
	 * String text = prod.shoes.get(i).getText(); if
	 * (text.contains("Converse All Star")) { prod.AddCart.get(i).click();
	 * System.out.println(i + "\t size " + size); String price =
	 * prod.Price.getText().replace("$", ""); price2 = Double.valueOf(price); break;
	 * 
	 * }
	 * 
	 * } prod.button.click(); Thread.sleep(5000);
	 * 
	 * double sum = price1 + price2; String total =
	 * Last.total.getText().split(" ")[1]; System.out.println(price1 +"\t"+price2
	 * +"\t sum "+sum + "\t total " + total);
	 * 
	 * TouchAction a = new TouchAction(driver); a.tap(new
	 * TapOptions().withElement(element(Last.check))).perform();
	 * Last.proceed.click(); Thread.sleep(5000);
	 * 
	 * //Get the Set of Context Handles Set<String> Context =
	 * driver.getContextHandles(); for (String context : Context)
	 * System.out.println(context);
	 */
//Switch to Context
//	driver.context("WEBVIEW_com.androidsample.generalstore");
}
}
