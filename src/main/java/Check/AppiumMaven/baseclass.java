package Check.AppiumMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class baseclass {
//	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> mydriver(String app) throws IOException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// startAppiumServer();
	//startEmulator();
		/*
		 * capabilities.setCapability("no", true);
		 * capabilities.setCapability("newCommandTimeout", 100000);
		 * capabilities.setCapability("noReset", true);
		 */
		capabilities.setCapability("autoGrantPermissions", true);
		if (app.equalsIgnoreCase("GeneralStoreApp"))
			capabilities.setCapability("appWaitActivity", "com.androidsample.generalstore.MainActivity");

		String path = System.getProperty("user.dir") + "\\src\\main\\java\\Check\\AppiumMaven\\myproperties.properties";
		System.out.println(app);
		System.out.println("path" + path);
		FileInputStream f1 = new FileInputStream(new File(path));
		Properties prop = new Properties();
		prop.load(f1);

		File appDir = new File("src");
		File myapp = new File(appDir, prop.getProperty(app));
		capabilities.setCapability(MobileCapabilityType.APP, myapp.getAbsolutePath());
		System.out.println("abs: " + myapp.getAbsolutePath());
		String device = prop.getProperty("device");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		System.out.println(device);
		/*
		 * String address = service.getUrl().toString(); System.out.println(address);
		 */
		driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;

	}

	/*
	 * public static AppiumDriverLocalService startAppiumServer() { boolean flag =
	 * checkIfServerIsRunnning(4723); if (!flag) {
	 * 
	 * service = AppiumDriverLocalService.buildDefaultService(); service.start(); }
	 * return service;
	 * 
	 * }
	 * 
	 * public static boolean checkIfServerIsRunnning(int port) {
	 * System.out.println("checking server connection"); boolean isServerRunning =
	 * false; ServerSocket serverSocket; try { serverSocket = new
	 * ServerSocket(port); serverSocket.close(); } catch (IOException e) { // If
	 * control comes here, then it means that the port is in use isServerRunning =
	 * true; } finally { serverSocket = null; } return isServerRunning; }
	 */
	/*
	 * public static void startEmulator() throws IOException, InterruptedException {
	 * System.out.println("emulator");
	 * Runtime.getRuntime().exec(System.getProperty("user.dir") +
	 * "\\src\\main\\start.bat"); Thread.sleep(20000); }
	 */
	/*
	 * public static void Screenshot(String s) throws IOException {
	 * 
	 * File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir") +
	 * "\\" + s + ".png")); }
	 */	 
}
