package Baseclass;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.net.URL;
//import org.testng.annotations.Test;
import java.util.ResourceBundle;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.automationtesting.excelreport.Xl;
import org.testng.annotations.BeforeTest;

import Commonfiles1.Commonfiles;

//import com.healthplix.Genericmethod.Genericfunaction;

//import com.healthplix.Genericmethod.Genericfunaction;
/*import atu.testng.reports.exceptions.ATUReporterException;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;*/
import bsh.org.objectweb.asm.Label;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public abstract class Mobilebaseclass extends Commonfiles{

public WebDriver driver;
public static DesiredCapabilities dc;
AppiumDriverLocalService appiumService;
String appiumServiceUrl;
/*ATUTestRecorder recorder;*/


public WebDriver getDriver() {
return driver;
}


public void setDriver(WebDriver driver) {
this.driver = driver;
}



public ResourceBundle rbConfig = ResourceBundle.getBundle("config");
public ResourceBundle rb = ResourceBundle.getBundle(rbConfig.getString("runtest") + "Env");

/*public static void startAppiumServer() {

appiumservice = AppiumDriverLocalService.buildDefaultService();
   if (service.isRunning() == true) {
    service.stop();
   } else {
    service.start();
   }
  }

public static void stopAppiumServer() {
   service.stop();
   System.out.println("service::" + service.isRunning());

  }
*/

/*@BeforeMethod

public void browser1s() throws InterruptedException,IOException {
	
	 //DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	//  Date date = new Date();
	  //Created object of ATUTestRecorder
	  //Provide path to store videos and file name format.
	  recorder = new ATUTestRecorder("D:\\software\\SBLAutomation\\ReactStalkbuylove\\","TestVideo-"+dateFormat.format(date),false);
	  //To start video recording.
	   recorder.start();  

	if (rb.getString("browser").equalsIgnoreCase("Chrome")){
	
	//if (rb.getString("browser").equalsIgnoreCase("Firefox")) {

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-popup-blocking");
		System.setProperty("webdriver.chrome.driver", "C:\\HercirclemobileAutomation\\Webdriver\\chromedriver.exe");
		//options.setBinary("C:\\HercirclemobileAutomation\\driver\\chromedriver3.exe");
		setDriver(new ChromeDriver(options));
		
	}
	
	driver.get(rb.getString("SBLURl"));
	windowMaximize(driver);
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
			System.out.println("Click on offer");
		
	}


@AfterMethod
 
public void Aftermethod()  {

	for (Cookie ck : driver.manage().getCookies()) {
		System.out.println((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
				+ ck.getExpiry() + ";" + ck.isSecure()));
	}
	//recorder.stop();
//driver.close();
	
}		
*/







//public void browser1s() throws InterruptedException,IOException {

@BeforeMethod
public void Applaunch()
{
	appiumService = AppiumDriverLocalService.buildDefaultService();
	appiumService.start();
    appiumServiceUrl = appiumService.getUrl().toString();
    System.out.println("Appium Service Address : - "+ appiumServiceUrl);
	
	
       
//startAppiumServer();
dc = new DesiredCapabilities();;
//dc.setCapability("AVD", "emulator-5554");
dc.setCapability("UDID", "emulator-5554");
dc.setCapability("deviceName", "Nexus_5X_API_29");
dc.setCapability("AVD", "emulator-5554");
//dc.setCapability("platformVersion", "5.0.2");
//dc.setCapability("deviceName", "J7AAGF03P6802CH");
   dc.setCapability("platformVersion", "10");
dc.setCapability("platformName", "Android");
//dc.setCapability("chromedriverExecutable", "D:\\vasu\\squareyards\\driver\\chromedriver3.exe");
//dc.setCapability("browserName", "Chrome");
dc.setCapability("automationName", "UiAutomator2");
dc.setCapability("noReset", "True");
dc.setCapability("fullReset", "False");


//in.edge.square/in.edge.square.beatsactivities.BeatsHomeActivity
dc.setCapability("appPackage", "com.rf.hercircle");
dc.setCapability("appActivity", "com.rf.hercircle.MainActivity");







//.facebook.katana/com.facebook.katana.LoginActivity
  try
   {
	  
driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 driver.navigate().to("https://www.squareyards.com/");
 
   }
   catch(Exception e)
   {
  System.out.println(e);
   }

}





@AfterMethod
public void Aftermethod() throws Exception  {

/*for (Cookie ck : driver.manage().getCookies()) {
System.out.println((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
+ ck.getExpiry() + ";" + ck.isSecure()));
}*/
//stopAppiumServer();
//recorder.stop();
//driver.close();
Thread.sleep(5000);
//Xl.generateReport("Report_Excel.xlsx");
	   System.out.println("Stop driver");
		driver.quit();
		System.out.println("Stop appium service");
		appiumService.stop();
}
   
   
   @BeforeSuite
   
   public void Deletefile()
   {
 
  File file = new File("D:\\vasu\\squareyards\\test-output");
       
       if(file.delete())
       {
           System.out.println("File deleted successfully");
       }
       else
       {
           System.out.println("Failed to delete the file");
       }
   }
 
 
 
   
}
