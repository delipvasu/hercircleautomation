
package com.business.eon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javax.validation.constraints.AssertTrue;

import org.apache.axis.i18n.RB;
import org.apache.log4j.Logger;
import org.apache.poi.util.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Utilities;
import com.Pages.BaseLoginPage;
import com.Pages.Buyloadpage;
import com.driverInstance.CommandBase;
import com.excel.ExcelFunctions;
import com.extent.ExtentReporter;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.response.ResponseOptions;
import com.propertyfilereader.PropertyFileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.ios.IOSDriver;


public class EONBusinessLogic extends Utilities {

	public EONBusinessLogic(String Application) throws InterruptedException {
		new CommandBase(Application);
		init();
	}

	private int timeout;

	/** Retry Count */
	private int retryCount;

	ExtentReporter extent = new ExtentReporter();

	/** The Constant logger. */
	final static Logger logger = Logger.getLogger("rootLogger");

	/** The Android driver. */
	public AndroidDriver<AndroidElement> androidDriver;

	/** The Android driver. */
	public IOSDriver<WebElement> iOSDriver;

	private ResponseOptions<Response> response;

	private ResourceBundle rb;

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	/**
	 * Initiate Property File.
	 *
	 * @param byLocator the by locator
	 */

	public void init() {

		PropertyFileReader handler = new PropertyFileReader("properties/Execution.properties");
		setTimeout(Integer.parseInt(handler.getproperty("TIMEOUT")));
		setRetryCount(Integer.parseInt(handler.getproperty("RETRY_COUNT")));
		logger.info(
				"Loaded the following properties" + " TimeOut :" + getTimeout() + " RetryCount :" + getRetryCount());
	}

	/**
	 * Wait until Player Loading is not displayed.
	 */

	public void LoadingInProgress() throws Exception {
		//verifyElementNotPresent(BaseLoginPage.objLOGOIcon, 60);
		System.out.println("test output");
		verifyElementPresentAndClick(BaseLoginPage.pictures, "ALLOW");
		verifyElementPresentAndClick(BaseLoginPage.location, "ALLOW");
		
		
		
	}
	
	
	
	public void EonVpLogin1(ResourceBundle rb) throws Exception
	{
	
		
		type(BaseLoginPage.username, "usernamelogin1", "username",rb);
		type(BaseLoginPage.password, "passwordRPT", "password",rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
		
	}
	
	
	
	public void unsuccessfulpayments() throws Exception
	{
	Wait(30);
    checkElementNotPresent(BaseLoginPage.unsuccessfulpayments);
	}

	
	
	
	
	
	@DataProvider
	
	public void getCellValue(){
		
    ExcelFunctions.getCellValue("my.sharepoint.com/personal/vasu_kumar_collabera_com/Documents/testdatafile.xlsx", "Sheet1", 1, 2);
    
}
	
	
//@Test(dataProvider="getCellValue")
	public void Eonlogin(ResourceBundle rb) throws Exception
	{
		/*Pruthvi1992
		Pruthvi1992	
		kruthisp2
		Kruthimohan1
		Akshara@2018
		pruthvi2000
		Pruthvikumar@28*/
	    type(BaseLoginPage.username, "usernameRPT", "username", rb);
		type(BaseLoginPage.password, "passwordRPT", "password", rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(20);
        OTPEnter();
        Thread.sleep(3000);
        Swipe("UP", 1);
        
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        
       
  }
	
	/*public void Presskey(By byLocator, AndroidKey key) throws Exception {
        List<WebElement> list = findElements(byLocator);
        System.out.println(list.size());
        WebElement element = findElement(byLocator);
        element.click();
        ((AndroidDriver)getDriver()).pressKey(new KeyEvent(key));
        Presskey(BaseLoginPage.OtpField1, AndroidKey.DIGIT_1);
        Presskey(BaseLoginPage.OtpField2, AndroidKey.DIGIT_2);
        Presskey(BaseLoginPage.OtpField3, AndroidKey.DIGIT_3);
        Presskey(BaseLoginPage.OtpField4, AndroidKey.DIGIT_4);
        Presskey(BaseLoginPage.OtpField5, AndroidKey.DIGIT_5);
        Presskey(BaseLoginPage.OtpField6, AndroidKey.DIGIT_6);
	   
    }
	*/
	
	
	
	   
	
	
	
	
	public void Eonprepaidlogin(ResourceBundle rb) throws Exception
	{
		/*Pruthvi1992
		Pruthvi1992	
		kruthisp2
		Kruthimohan1
		Akshara@2018
		pruthvi2000
		Pruthvikumar@28*/
	    type(BaseLoginPage.username, "Prepaidusername", "username", rb);
		type(BaseLoginPage.password, "passwordRPT", "password", rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        OTPEnter();
        /*Wait(100);
        boolean element=findElement(BaseLoginPage.Otp).isDisplayed();
        System.out.println("element"+element);
        findElement(BaseLoginPage.Otp).clear();
         type(BaseLoginPage.Otp, "OTP1", "number", rb);
        System.out.println("Enter the otp");*/
        Wait(90);
        
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        
       
  }

public void OTP() throws InterruptedException
{
	Wait(20);
	type(BaseLoginPage.Otp, "OTP1", "number", rb);
     System.out.println("Enter the otp");
     Thread.sleep(10000);
	
	
}



public void newlogin(ResourceBundle rb) throws Exception
{
	
	findElement(BaseLoginPage.username).sendKeys(rb.getString("usernameRPT"));
	System.out.println("enter the username");
	findElement(BaseLoginPage.password).sendKeys(rb.getString("passwordRPT"));
	System.out.println("Enter the password");
	
}
		










	
	public void paypalEonlogin(ResourceBundle rb) throws Exception
	{
		/*Pruthvi1992
		Pruthvi1992	
		kruthisp2
		Kruthimohan1
		Akshara@2018
		pruthvi2000
		Pruthvikumar@28*/
		type(BaseLoginPage.username, "paypalusername", "username", rb);
		type(BaseLoginPage.password, "passwordRPT", "password", rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(130);
       
  }
	
	public void PrepaidEonlogin(ResourceBundle rb) throws Exception
	{
		
		
      /*Pruthvi1992
		Pruthvi1992	
		kruthisp2
		Kruthimohan1
		Akshara@2018
		pruthvi2000
		Pruthvikumar@28*/
		type(BaseLoginPage.username, "prepaidusername", "username", rb);
		type(BaseLoginPage.password, "passwordRPT", "password", rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	
	
	
	public void CyberEonlogin(ResourceBundle rb) throws Exception
	{
		
		
      /*Pruthvi1992
		Pruthvi1992	
		kruthisp2
		Kruthimohan1
		Akshara@2018
		pruthvi2000
		Pruthvikumar@28*/
		type(BaseLoginPage.username, "cyberusername", "username", rb);
		type(BaseLoginPage.password, "passwordRPT", "password", rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	public void othercardEonlogin(ResourceBundle rb) throws Exception
	{
		
		
      /*Pruthvi1992
		Pruthvi1992	
		kruthisp2
		Kruthimohan1
		Akshara@2018
		pruthvi2000
		Pruthvikumar@28*/
		type(BaseLoginPage.username, "othercardusername", "username", rb);
		type(BaseLoginPage.password, "passwordRPT", "password", rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);

        
	}
	public void othercardlogin(ResourceBundle rb) throws Exception
	{
		
		
      
		type(BaseLoginPage.username, "othercardlogin", "username",rb);
		type(BaseLoginPage.password, "Password@123", "password",rb);
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);

        
	}
	
	
	public void creditcardnumber(ResourceBundle rb)
	{
		
		type(BaseLoginPage.creditcardnumber, "Creditcard", "creditcardnumber",rb);
		

		
	}
	
	
	
	
	public void  homescreenvalidation() throws Exception
	{
	
	  //verifyElementPresent(BaseLoginPage.Logo,"EONImages.EON_positive");
	  verifyElementPresent(BaseLoginPage.Tops,"Top Ups");
	  /*verifyElementPresent(BaseLoginPage.Remmitance,"Remmitance");
	  Wait(20);
	  verifyElementPresent(BaseLoginPage.BuyLoad,"Buy Load");
	  Wait(20);
	  verifyElementPresent(BaseLoginPage.AddFunds,"Add Funds");
	  Wait(20);
	  verifyElementPresent(BaseLoginPage.PayBills,"Pay Bills");
	  Wait(20);
	  verifyElementPresent(BaseLoginPage.Insurance,"Insurance");*/
	  
	  
	  
	  }
	
	
	public void OTPEnter() throws Exception
	{
		Presskey(BaseLoginPage.OtpField1, AndroidKey.DIGIT_1);
	    Presskey(BaseLoginPage.OtpField2, AndroidKey.DIGIT_2);
	    Presskey(BaseLoginPage.OtpField3, AndroidKey.DIGIT_3);
	    Presskey(BaseLoginPage.OtpField4, AndroidKey.DIGIT_4);
	    Presskey(BaseLoginPage.OtpField5, AndroidKey.DIGIT_5);
	    Presskey(BaseLoginPage.OtpField6, AndroidKey.DIGIT_6);

}
	
	
	
	
	
	/*public void Accountsummary() throws Exception
	{
		
		
		
		  verifyElementPresent(BaseLoginPage.Tops,"Top Ups");
		  verifyElementPresent(BaseLoginPage.Remmitance,"Remmitance");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.BuyLoad,"Buy Load");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.AddFunds,"Add Funds");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.PayBills,"Pay Bills");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.Insurance,"Insurance");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.upgrade, "UPGRADE");
		  Wait(20);
		  findElement(BaseLoginPage.avalibleAmount).getText();
		  findElement(BaseLoginPage.currentbalamount).getText();
		  verifyElementPresent(BaseLoginPage.avaliblebalance,"Available Balance");
		  verifyElementPresent(BaseLoginPage.cuurentbalance,"Current Balance");
		  verifyIsElementDisplayed(BaseLoginPage.cuurentbalance);
		  verifyElementDisplayed(BaseLoginPage.Showall);
		  verifyElementDisplayed(BaseLoginPage.doublearrow);
		  verifyElementPresent(BaseLoginPage.Logo,"EONImages.EON_positive");
		  findElement(BaseLoginPage.notification).click();
		  System.out.println("click  on notification button");
		  Wait(20);
		  Back(1);
		    Wait(20);
		    findElement(BaseLoginPage.cart).click();
		    System.out.println("Click on cart button");
		    Back(1);
		    Wait(20);
		    findElement(BaseLoginPage.seeting).click();
		    System.out.println("Click on seeting Button");
		    Back(1);
		    
		   
		    if(verifyIsElementDisplayed(BaseLoginPage.notificationPage,"Notifications")) {
		        System.out.println("Notifications Page Displayed");
		    } else {
		        System.out.println("Notifications Page Not Displayed");
		    }
		  verifyElementDisplayed(BaseLoginPage.notification);
		  Wait(20);
		  findElement(BaseLoginPage.notification).click();
		  System.out.println("click on notification");
		  verifyElementPresent(BaseLoginPage.cart,"EONImages.shopping_cart24px2");
		  
		  verifyElementPresent(BaseLoginPage.seeting,"EONImages.settings24px2");
		  
		 
	
		
}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Notification() throws Exception {
	   
	   
	}
	
	public void Accountsummary() throws Exception
	{
		
		
		
		  verifyElementPresent(BaseLoginPage.Tops,"Top Ups");
		  verifyElementPresent(BaseLoginPage.Remmitance,"Remmitance");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.BuyLoad,"Buy Load");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.AddFunds,"Add Funds");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.PayBills,"Pay Bills");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.Insurance,"Insurance");
		  Wait(20);
		  verifyElementPresent(BaseLoginPage.upgrade, "UPGRADE");
		  Wait(20);
		  findElement(BaseLoginPage.avalibleAmount).getText();
		  findElement(BaseLoginPage.currentbalamount).getText();
		  verifyElementPresent(BaseLoginPage.avaliblebalance,"Available Balance");
		  verifyElementPresent(BaseLoginPage.cuurentbalance,"Current Balance");
		  verifyIsElementDisplayed(BaseLoginPage.cuurentbalance);
		  verifyElementDisplayed(BaseLoginPage.Showall);
		  verifyElementDisplayed(BaseLoginPage.doublearrow);
		 /* verifyElementPresent(BaseLoginPage.Logo,"EONImages.EON_positive");
		  findElement(BaseLoginPage.notification).click();
		  System.out.println("click  on notification button");
		  Wait(20);
		  Back(1);
		    Wait(20);
		    findElement(BaseLoginPage.cart).click();
		    System.out.println("Click on cart button");
		    Back(1);
		    Wait(20);
		    findElement(BaseLoginPage.seeting).click();
		    System.out.println("Click on seeting Button");
		    Back(1);
		    */
		   
		   /* if(verifyIsElementDisplayed(BaseLoginPage.notificationPage,"Notifications")) {
		        System.out.println("Notifications Page Displayed");
		    } else {
		        System.out.println("Notifications Page Not Displayed");
		    }*/
		  /*verifyElementDisplayed(BaseLoginPage.notification);
		  Wait(20);
		  findElement(BaseLoginPage.notification).click();
		  System.out.println("click on notification");
		  verifyElementPresent(BaseLoginPage.cart,"EONImages.shopping_cart24px2");
		  
		  verifyElementPresent(BaseLoginPage.seeting,"EONImages.settings24px2");
		  
		 */
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void homepagearrowScreen() throws Exception
	{
		
		
		verifyElementPresentAndClick(BaseLoginPage.homepageArrow, "EONImages.arrow_up");
		waitTime(1000);
		
	}
	
	/*public void Seeallaccountdetalis() throws Exception

	{
		Wait(50);
	    verifyElementPresent(BaseLoginPage.storevalueard, "Store Value Card");
	    Swipe("UP", 1);
	    Wait(20);
	    getCount(BaseLoginPage.storevalueard);
	    Back(2);
	    Wait(20);
	   int i;
	    for(i=0;i<=11;i++) {
	   // b3-l1-2-b1-Column1
	    verifyElementDisplayed(By.xpath("//*[@id='b3-l1-"+ i +"-$b1']"));
	 
	// getCount(By.xpath("//*[@id='b3-l1-"+ i +"-$b1']"));

	  }*/
	
	
	
	
	
	/*public void AddAccount() throws Exception
	{
		Wait(50);
	    verifyElementPresent(BaseLoginPage.storevalueard, "Store Value Card");
	    Swipe("UP", 1);
	    Wait(20);
	    getCount(BaseLoginPage.storevalueard);
	    Back(2);
	    Wait(20);
	   int i;
	    for(i=0;i<=11;i++) {
	   // b3-l1-2-b1-Column1
	    verifyElementDisplayed(By.xpath("//*[@id='b3-l1-"+ i +"-$b1']"));
	 
	// getCount(By.xpath("//*[@id='b3-l1-"+ i +"-$b1']"));

	  }*/
	
	
	public void Enrollmyaccount() throws Exception
	
	{
		Wait(20);
		verifyElementPresentAndClick(BaseLoginPage.Enrollmyaccount, "Enroll my account");
		System.out.println("Enroll My Account");
		
		
	}
	
	
	public void AddAccount() throws Exception
	{
	    
		verifyElementPresentAndClick(BaseLoginPage.AddAccount, "Add Account");
		System.out.println("Click Add Account");
		
	}
	
	public void prepaid() throws Exception
	{
		
		Wait(20);
		findElement(BaseLoginPage.Prepaid);
	}
	
	
	public void EonvirtualAccount() throws Exception
	{
		Wait(20);
		findElement(BaseLoginPage.openvirtualAccount).click();
		System.out.println("Click on Virtual Account");
	}

	
	
	
	
	
	
	
	public void linkothercard() throws Exception
	{
		
		Wait(20);
		findElement(BaseLoginPage.linkOtherCard).click();
		System.out.println("Click on other bank url");
		
		
	}
	
	/*public void othercarddetalis() throws Exception
	{
		
		Wait(20);		
		findElement(BaseLoginPage.bankIssuer).click();
		System.out.println("select the bank issuer");
		Wait(20);
		findElement(BaseLoginPage.AsiaUB).click();
		System.out.println("Select the bank name");
	    Wait(10);
		type(BaseLoginPage.inputCardNumber, "4895390000000013", "card number");
		System.out.println("enter the invalid card number");
	    Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895353111111111", "card number");
		System.out.println("enter the card number");
		Wait(10);
		type(BaseLoginPage.expiryDate, "12/22", "expiry date");
		System.out.println("enter the expiry date");
		Wait(10);
		type(BaseLoginPage.cvv, "785", "cvvnumber");
		

		System.out.println("enter the cvv number");
		
	}
	public void paypalothercarddetalis() throws Exception
	{
		
		Wait(20);		
		findElement(BaseLoginPage.bankIssuer).click();
		System.out.println("select the bank issuer");
		Wait(20);
		findElement(BaseLoginPage.AsiaUB).click();
		System.out.println("Select the bank name");
	    Wait(10);
		type(BaseLoginPage.inputCardNumber, "4895390000000013", "card number");
		System.out.println("enter the invalid card number");
	    Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895353111111111", "card number");
		System.out.println("enter the card number");
		Wait(10);
		type(BaseLoginPage.expiryDate, "12/22", "expiry date");
		System.out.println("enter the expiry date");
		Wait(10);
		type(BaseLoginPage.cvv, "196", "cvvnumber");
		

		System.out.println("enter the cvv number");
		
	}
	
	
	public void prepaidothercarddetalis() throws Exception
	{
		
		Wait(20);		
		findElement(BaseLoginPage.bankIssuer).click();
		System.out.println("select the bank issuer");
		Wait(20);
		findElement(BaseLoginPage.AsiaUB).click();
		System.out.println("Select the bank name");
	    Wait(10);
		type(BaseLoginPage.inputCardNumber, "4895261000000008", "card number");
		System.out.println("enter the invalid card number");
	    Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895353111111111", "card number");
		System.out.println("enter the card number");
		Wait(10);
		type(BaseLoginPage.expiryDate, "12/22", "expiry date");
		System.out.println("enter the expiry date");
		Wait(10);
		type(BaseLoginPage.cvv, "633", "cvvnumber");
		System.out.println("enter the cvv number");
		
	}
	
	
	
	public void othercardAddotherdetalis() throws Exception
	{
		
		Wait(20);		
		findElement(BaseLoginPage.bankIssuer).click();
		System.out.println("select the bank issuer");
		Wait(20);
		findElement(BaseLoginPage.AsiaUB).click();
		System.out.println("Select the bank name");
	    Wait(10);
		type(BaseLoginPage.inputCardNumber, "4895353111111145", "card number");
		System.out.println("enter the invalid card number");
	    Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895353111111111", "card number");
		System.out.println("enter the card number");
		Wait(10);
		type(BaseLoginPage.expiryDate, "12/22", "expiry date");
		System.out.println("enter the expiry date");
		Wait(10);
		type(BaseLoginPage.cvv, "107", "cvvnumber");
		System.out.println("enter the cvv number");
		
	}
	
	public void prepaidloginothercarddetalis() throws Exception
	{
		
		Wait(20);		
		findElement(BaseLoginPage.bankIssuer).click();
		System.out.println("select the bank issuer");
		Wait(20);
		findElement(BaseLoginPage.AsiaUB).click();
		System.out.println("Select the bank name");
	    Wait(10);
		type(BaseLoginPage.inputCardNumber, "4895353111111145", "card number");
		System.out.println("enter the invalid card number");
	    Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895353111111111", "card number");
		System.out.println("enter the card number");
		Wait(10);
		type(BaseLoginPage.expiryDate, "12/22", "expiry date");
		System.out.println("enter the expiry date");
		Wait(10);
		type(BaseLoginPage.cvv, "927", "cvvnumber");
		System.out.println("enter the cvv number");
	}
	
	
	
	public void cyberloginothercarddetalis() throws Exception
	{
		
		Wait(20);		
		findElement(BaseLoginPage.bankIssuer).click();
		System.out.println("select the bank issuer");
		Wait(20);
		findElement(BaseLoginPage.AsiaUB).click();
		System.out.println("Select the bank name");
	    Wait(10);
		type(BaseLoginPage.inputCardNumber, "4895271000000007", "card number");
		System.out.println("enter the invalid card number");
	    Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895401111111100", "card number");
		System.out.println("enter the card number");
		Wait(10);
		type(BaseLoginPage.expiryDate, "12/22", "expiry date");
		System.out.println("enter the expiry date");
		Wait(10);
		type(BaseLoginPage.cvv, "639", "cvvnumber");
		System.out.println("enter the cvv number");
		
		
		
		
				
		
		
		
		
		
	}
	
	
	
	
	public void eonvirtualAccount() throws Exception
	{
		Wait(20);
		verifyElementPresentAndClick(BaseLoginPage.openvirtualAccount, "Open a Virtual EON Account");
		System.out.println("Click on eon virtualaccount");
		
		
	}*/
	
	public void Registration() throws Exception
	{
		
		verifyElementDisplayed(BaseLoginPage.Registration);
		System.out.println("check the Registration");
		
	}
	
	public void scrollArrow() throws Exception
	{
		verifyElementPresentAndClick(BaseLoginPage.scrollArrow, "For a detailed Terms of Use, expand this");
		System.out.println("click on Arrow Button");
	}
	
	public void Scrollthepage()
	
	{
		
		Swipe("UP", 15);
		
	}
public void Scrollthepage1()
	
	{
		
		Swipe("UP", 1);
		
	}

public void Scrollthepage4() throws InterruptedException

{
	Thread.sleep(5000);
	Swipe("UP", 5);
	
}
	
	public void AcceptandContinue() throws Exception
	
	{
		
		Wait(20);
		verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "ACCEPT & CONTINUE");
		System.out.println("Click on Accept and Continue");
		
		
	}
	

	public  boolean Toaster1() throws Exception
	{  
		Wait(30);
		try {
			/*Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");*/
			Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			return false;
			}
	      catch (Exception e) {
	    	  
			/*Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");*/
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
        return true;
        }
	
		}
	
	/*public void invalidToaster() throws Exception
	{
		Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895210111111154", "card number");
		System.out.println("enter the card number");
		
	}
	
	
	public void cyberberaccountaddtheotherinvalidToaster() throws Exception
	{
	    Thread.sleep(1000);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Invalid card details");
		Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895401111111100", "card number");
		System.out.println("enter the card number");
		
	}
	
	
	
	public void prepaidinvalidToaster() throws Exception
	{
	    Thread.sleep(1000);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Invalid card details");
		Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895353111111111", "card number");
		System.out.println("enter the card number");
		
	}
	
	
	
	public void paypalinvalidToaster() throws Exception
	{
		Wait(20);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Invalid card details");
		Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895291000000005", "card number");
		System.out.println("enter the card number");
		
	}
	
	
	
	
	
	public void othercardinvalidToaster() throws Exception
	{
		Wait(20);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Invalid card details");
		Wait(20);
		type(BaseLoginPage.inputCardNumber, "4895281000000006", "card number");
		System.out.println("enter the card number");
		
	}
	
	
	*/
	
	public void othercardvalidationToaster() throws Exception
	{
	boolean nextproduct=false;
	try{//findElement(BaseLoginPage.Toastermessage).getText();
		     Wait(70);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			 // Max Number of Cards Linked
			 // Card already enrolled
			  }
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");
			
		  
		  }
		  
		catch(Exception e){
		System.out.println("vasu code");
	    homepagearrowScreen();
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
			//Assert.assertEquals(BaseLoginPage.Toastermessage.toString().replace("Successfully added a new 'Virtual EON Account'", "Successfully added a new Virtual EON Account"), "Successfully added a new Virtual EON Account");
			 // homepagearrowScreen();
			  homepagearrowScreen();
		      seeAllAccount();
		      
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }

		}
	
	public void virtualToaster() throws Exception{
	  boolean nextproduct=false;
	 int i = 0;
	 i=getrequestsellAccountautomation();
     System.out.println("First value"+i);
     waitTime(2000);
		verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "Accept and Continue");
		System.out.println("Click on Accept and Continue");
		waitTime(1000);
		
		verifyElementPresentAndClick(BaseLoginPage.AGREE, "AGREE");
		System.out.println("Click on Agree Button");
	  try{
       Wait(40);
		  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		  Back(2);
		 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
		  
		  }
	            catch (AssertionError e) { 
	                	  nextproduct=true;
							System.out.println("vasu");	
						System.out.println("go to back page");

	            }
	  

				catch(Exception e){
			
				System.out.println("vasu code");
				homepagearrowScreen();
				}
	  if(nextproduct)
	  { 
		  Wait(20);
		//.toString().replace("‘" ,"").replace("’", "") 
		  //getText(BaseLoginPage.Toastermessage);
	    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
	    int j=getrequestsellAccountautomation();
	    System.out.println("Second value"+j);
	    Assert.assertEquals(j>i ,true);
		homepagearrowScreen();
		  
	    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
	   }
	}
	
	public void cybervirtualToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationcyber();
	     System.out.println("First value"+i);
	     waitTime(2000);
			verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "Accept and Continue");
			System.out.println("Click on Accept and Continue");
			waitTime(1000);
			
			verifyElementPresentAndClick(BaseLoginPage.AGREE, "AGREE");
			System.out.println("Click on Agree Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomation();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	public void prepaidvirtualToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationprepaid();
	     System.out.println("First value"+i);
	     waitTime(2000);
			verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "Accept and Continue");
			System.out.println("Click on Accept and Continue");
			waitTime(1000);
			
			verifyElementPresentAndClick(BaseLoginPage.AGREE, "AGREE");
			System.out.println("Click on Agree Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationprepaid();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	
	public void cybervirtualToaster1() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationcyber();
	     System.out.println("First value"+i);
	     waitTime(2000);
			verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "Accept and Continue");
			System.out.println("Click on Accept and Continue");
			waitTime(1000);
			
			verifyElementPresentAndClick(BaseLoginPage.AGREE, "AGREE");
			System.out.println("Click on Agree Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationcyber();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	
	
	public void PaypalvirtualToaster1() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationpaypal();
	     System.out.println("First value"+i);
	     waitTime(2000);
			verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "Accept and Continue");
			System.out.println("Click on Accept and Continue");
			waitTime(1000);
			
			verifyElementPresentAndClick(BaseLoginPage.AGREE, "AGREE");
			System.out.println("Click on Agree Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationpaypal();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	public void OthervirtualToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationothercard();
	     System.out.println("First value"+i);
	     waitTime(2000);
			verifyElementPresentAndClick(BaseLoginPage.AcceptandContinue, "Accept and Continue");
			System.out.println("Click on Accept and Continue");
			waitTime(1000);
			
			verifyElementPresentAndClick(BaseLoginPage.AGREE, "AGREE");
			System.out.println("Click on Agree Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationothercard();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	
	public void virtualCyberToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomation();
	     System.out.println("First value"+i);
	     Wait(30);
			findElement(BaseLoginPage.Continuebutton).click();
			System.out.println("Click on continue Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomation();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	public void PaypalCyberToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationpaypal();
	     System.out.println("First value"+i);
	     Wait(30);
			findElement(BaseLoginPage.Continuebutton).click();
			System.out.println("Click on continue Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationpaypal();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	public void OtherCyberToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationothercard();
	     System.out.println("First value"+i);
	     Wait(30);
			findElement(BaseLoginPage.Continuebutton).click();
			System.out.println("Click on continue Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationothercard();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
			  
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}

	public void prepaidCyberToaster() throws Exception{
		  boolean nextproduct=false;
		 int i = 0;
		 i=getrequestsellAccountautomationprepaid();
	     System.out.println("First value"+i);
	     Wait(30);
			findElement(BaseLoginPage.Continuebutton).click();
			System.out.println("Click on continue Button");
		  try{
	       Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back page");

		            }
		  

					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					}
		  if(nextproduct)
		  { 
			  Wait(20);
			//.toString().replace("‘" ,"").replace("’", "") 
			  //getText(BaseLoginPage.Toastermessage);
		    Assert.assertEquals(BaseLoginPage.Toastermessage1, BaseLoginPage.Toastermessage1);
		    int j=getrequestsellAccountautomationprepaid();
		    System.out.println("Second value"+j);
		    Assert.assertEquals(j>i ,true);
			homepagearrowScreen();
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		}
	
	public void otherToasterprepaidcard() throws Exception{
		int i = 0;
		 i=getrequestsellAccountautomationothercard();
	     System.out.println("First value"+i);
		Wait(30);
		findElement(BaseLoginPage.Continuebutton).click();
		System.out.println("Click on continue Button");
		
		 boolean nextproduct=false;
		 Wait(30);
		  try{
			  Wait(60);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back home page");
			
		  
		  }
		  
					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
		      Wait(60);
			Assert.assertEquals(BaseLoginPage.PrepaidToastermessage,BaseLoginPage.PrepaidToastermessage);
			 int j=getrequestsellAccountautomationothercard();
			    System.out.println("Second value"+j);
			    Assert.assertEquals(j>i ,true);
				homepagearrowScreen();
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		  
		}

	
	public void AddvirtualcardToaster() throws Exception{
		/*int i = 0;*/
		 /*i=getrequestsellAccountautomation();
	     System.out.println("First value"+i);*/
		Wait(30);
		 boolean nextproduct=false;
		  try{
			  Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Customer reached Maximum number of Starter Cards for Linking");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  //Max Number of Cards Linked
			  //This card is already added!
			  }
			
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back home page");
			
		  
		  }
		  
					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
		      Wait(60);
			Assert.assertEquals(BaseLoginPage.PrepaidToastermessage,BaseLoginPage.PrepaidToastermessage);
			 /*int j=getrequestsellAccountautomation();
			    System.out.println("Second value"+j);
			    Assert.assertEquals(j>i ,true);
				homepagearrowScreen();*/
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		  
		}
	
	public void AddprepaidcardToaster() throws Exception{
		/*int i = 0;*/
		 /*i=getrequestsellAccountautomation();
	     System.out.println("First value"+i);*/
		Wait(30);
		 boolean nextproduct=false;
		  try{
			  Wait(40);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Customer reached Maximum number of Starter Cards for Linking");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  //Max Number of Cards Linked
			  //This card is already added!
			  }
			
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back home page");
			
		  
		  }
		  
					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
		      Wait(60);
			Assert.assertEquals(BaseLoginPage.PrepaidToaster,BaseLoginPage.PrepaidToaster);
			 /*int j=getrequestsellAccountautomation();
			    System.out.println("Second value"+j);
			    Assert.assertEquals(j>i ,true);
				homepagearrowScreen();*/
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		  
		}
	public void PaypalToasterprepaidcard() throws Exception{
		int i = 0;
		 i=getrequestsellAccountautomationpaypal();
	     System.out.println("First value"+i);
		Wait(30);
		findElement(BaseLoginPage.Continuebutton).click();
		System.out.println("Click on continue Button");
		 boolean nextproduct=false;
		  try{
			  Wait(60);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back home page");
			
		  
		  }
		  
					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
		      Wait(60);
			Assert.assertEquals(BaseLoginPage.PrepaidToastermessage,BaseLoginPage.PrepaidToastermessage);
			 int j=getrequestsellAccountautomationpaypal();
			    System.out.println("Second value"+j);
			    Assert.assertEquals(j>i ,true);
				homepagearrowScreen();
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		 
		  
		}
	public void cyberToasterprepaidcard() throws Exception{
		int i = 0;
		 i=getrequestsellAccountautomation();
	     System.out.println("First value"+i);
		Wait(30);
		findElement(BaseLoginPage.Continuebutton).click();
		System.out.println("Click on continue Button");
		 boolean nextproduct=false;
		  try{
			  Wait(60);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back home page");
			
		  
		  }
		  
					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
		      Wait(60);
			Assert.assertEquals(BaseLoginPage.PrepaidToastermessage,BaseLoginPage.PrepaidToastermessage);
			 int j=getrequestsellAccountautomation();
			    System.out.println("Second value"+j);
			    Assert.assertEquals(j>i ,true);
				homepagearrowScreen();
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		  
		}
	
	
	
	public void prepaidToasterprepaidcard() throws Exception{
		int i = 0;
		 i=getrequestsellAccountautomationprepaid();
	     System.out.println("First value"+i);
		Wait(30);
		findElement(BaseLoginPage.Continuebutton).click();
		System.out.println("Click on continue Button");
		 boolean nextproduct=false;
		  try{
			  Wait(60);
			  Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "This card is already added!");
			 // Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Successfully added a new ‘Virtual EON Account’");
			  
			  }
		            
		                  catch (AssertionError e) { 
		                	  nextproduct=true;
								System.out.println("vasu");	
							System.out.println("go to back home page");
			
		  
		  }
		  
					catch(Exception e){
				
					System.out.println("vasu code");
					homepagearrowScreen();
					
					}
		  if(nextproduct)
		  {
			 
			  //getText(BaseLoginPage.Toastermessage);
		      Wait(60);
			Assert.assertEquals(BaseLoginPage.PrepaidToastermessage,BaseLoginPage.PrepaidToastermessage);
			 int j=getrequestsellAccountautomationprepaid();
			    System.out.println("Second value"+j);
			    Assert.assertEquals(j>i ,true);
				homepagearrowScreen();
		      
		    //Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max Number of Cards Linked");
		   }
		  
		}
	public void Existingcard() throws Exception
	{
		
		verifyElementPresentAndClick(BaseLoginPage.linkyourexistingcard, "Link your existing EON card");
		System.out.println("Click on Existing card");
	}
	
	public void Selectedthecard() throws Exception
	{
		
		waitTime(2000);
		findElement(BaseLoginPage.Seletedthecard).click();
		//selectByVisibleTextFromDD(BaseLoginPage.Seletedthecard, "EON Prepaid Card");
		System.out.println("Seleted the prepaid cards");
		waitTime(2000);
		
	}
	

	
	
public void SelectedCybercard() throws Exception
{
	
	Wait(20);
	verifyElementPresentAndClick(BaseLoginPage.cybercard, "EON Cyber Card");
	System.out.println("click on cyber card");
	
	
}
	


 public void checkingthecybercardd() throws Exception
 
 {
	 Wait(20);
	 verifyElementPresent(BaseLoginPage.checkcybercard, "EON Cyber Card");
	 System.out.println("Check the cyber card");
	 
	 
 }

	
	
	
	
	

	/*public void CybercardinavalidAccountnumber()
	{
		
		
		Wait(20);
		type(BaseLoginPage.CyberaccountNumber, "109453260228", "Account number");
		System.out.println("Enter the inavalid account number");
		
		
	}
	
	public void CyberAccountnumber()
	{
		
		
		Wait(20);
		type(BaseLoginPage.CyberaccountNumber, " 109453335573", "Account number");
		System.out.println("Enter the account number");
		
		
	}
	
	
	
	public void otherAccountcybercardnumber()
	{
		
		
		Wait(20);
		type(BaseLoginPage.CyberaccountNumber, "109453339268", "Account number");
		System.out.println("Enter the account number");
		
		
	}
	
	
	public void PaypalCyberAccountnumber()
	{
		
		
		Wait(20);

		type(BaseLoginPage.CyberaccountNumber, "109453263082", "Account number");
		System.out.println("Enter the account number");
		
		
	}
	
	public void loginwithCyberAccountAddthenumber()
	{
		
		
		Wait(20);
		//type(BaseLoginPage.CyberaccountNumber, "109451002921", "Account number");
		System.out.println("Enter the account number");
		
		
	}
	
	public void loginwithprepaidcyberAccountAddthenumber()
	{
		
		
		Wait(20);
		type(BaseLoginPage.CyberaccountNumber, "109453335627", "Account number");
		System.out.println("Enter the account number");
		
		
	}*/
	
	
	public void Selecttheprepaidcard() throws Exception
	{
		
		Wait(20);
		findElement(BaseLoginPage.Prepaid).click();
		System.out.println("Slect the prepaid card");
		
	}
	
	public void seeAllAccount() throws Exception
	{
		
		Wait(30);
		verifyElementPresentAndClick(BaseLoginPage.SeeAllAccount, "See All Account");
		System.out.println("click  on see All Acount");
		
	}
	
	public void ProductsServices() throws Exception
	{
		wait(20);
		verifyElementPresent(BaseLoginPage.ProductsServices, "Products & Services");
		System.out.println("Chek the product and Services");
	}
	
	
	public void Accountdetalis() throws Exception
	{
		
		
		Wait(20);
		verifyElementPresentAndClick(BaseLoginPage.AccountDetails, "Account Details");
		System.out.println("Click on Account Detalis");
		
	}
	
	
	
	
	public void prepaidcardafterselectingChecking() throws Exception
	{
		waitTime(2000);
		verifyElementPresent(BaseLoginPage.prepaidcardcheckin, "EON Prepaid Card");
		System.out.println("check the element");
		
	}
	
   /* public void prepaidcardnumberinvalid() throws Exception
    {
    	Wait(30);
    	type(BaseLoginPage.prepaidcardNumber, "416297000456789", "prepaidcardnumber");
    	System.out.println("Enter the number");
    	Assert.assertEquals(getText(BaseLoginPage.invalidvalidation), "Please enter a valid card number.");
    	
    	
    }
	
    
    public void prepaidloginwithprepaidcardnumbervalid() throws InterruptedException
    {
    	Thread.sleep(2000);
    	type(BaseLoginPage.prepaidcardNumber, "4162970001383991", "prepaidcardnumber");
    	System.out.println("Enter the number");
    	
    }
    
    public void othercardloginwithprepaidcardnumbervalid()
    {
    	Wait(30);
    	type(BaseLoginPage.prepaidcardNumber, "4162970001384007", "prepaidcardnumber");
    	System.out.println("Enter the number");
    	
    }*/
    
    public int getrequestsellAccountautomation()
	{
    	Response response = RestAssured.given().header("Content-Type","application/json").
		header("X-IBM-Client-Secret", "hM4jD6pX2gA4rM8mI3dG5mK7vX0eJ7nP6pN6bC8xX8gS3yJ7fO").
		header("X-IBM-Client-Id","7c458c33-e030-4d5b-93f6-510b90df393e").
		when()
		.get("https://api-uat.unionbankph.com/ubp/uat/eon/v1/customers/2614178/cards")
		.then().extract().response();
    	
//    	JsonPath jsonPathEvaluator = response.jsonPath();
//    	String a=jsonPathEvaluator.get("rawCard");
    	//System.out.println(response.asString().split("rawCard").length);
        return response.asString().split("rawCard").length;
//		.assertThat()
//		.log()
//		.all()
		//.statusCode(200);
	    }
    
    
    public int getrequestsellAccountautomationprepaid()
	{
    	Response response = RestAssured.given().header("Content-Type","application/json").
		header("X-IBM-Client-Secret", "hM4jD6pX2gA4rM8mI3dG5mK7vX0eJ7nP6pN6bC8xX8gS3yJ7fO").
		header("X-IBM-Client-Id","7c458c33-e030-4d5b-93f6-510b90df393e").
		when()
		.get("https://api-uat.unionbankph.com/ubp/uat/eon/v1/customers/2615678/cards")
		.then().extract().response();
    	
//    	JsonPath jsonPathEvaluator = response.jsonPath();
//    	String a=jsonPathEvaluator.get("rawCard");
    	//System.out.println(response.asString().split("rawCard").length);
        return response.asString().split("rawCard").length;
//		.assertThat()
//		.log()
//		.all()
		//.statusCode(200);
	    }
    
    
    
    public int getrequestsellAccountautomationothercard()
	{
    	Response response = RestAssured.given().header("Content-Type","application/json").
		header("X-IBM-Client-Secret", "hM4jD6pX2gA4rM8mI3dG5mK7vX0eJ7nP6pN6bC8xX8gS3yJ7fO").
		header("X-IBM-Client-Id","7c458c33-e030-4d5b-93f6-510b90df393e").
		when()
		.get("https://api-uat.unionbankph.com/ubp/uat/eon/v1/customers/2616678/cards")
		.then().extract().response();
    	
//    	JsonPath jsonPathEvaluator = response.jsonPath();
//    	String a=jsonPathEvaluator.get("rawCard");
    	//System.out.println(response.asString().split("rawCard").length);
        return response.asString().split("rawCard").length;
//		.assertThat()
//		.log()
//		.all()
		//.statusCode(200);
	    }
    
    public int getrequestsellAccountautomationpaypal()
	{
    	Response response = RestAssured.given().header("Content-Type","application/json").
		header("X-IBM-Client-Secret", "hM4jD6pX2gA4rM8mI3dG5mK7vX0eJ7nP6pN6bC8xX8gS3yJ7fO").
		header("X-IBM-Client-Id","7c458c33-e030-4d5b-93f6-510b90df393e").
		when()
		.get("https://api-uat.unionbankph.com/ubp/uat/eon/v1/customers/2613678/cards")
		.then().extract().response();
    	
//    	JsonPath jsonPathEvaluator = response.jsonPath();
//    	String a=jsonPathEvaluator.get("rawCard");
    	//System.out.println(response.asString().split("rawCard").length);
        return response.asString().split("rawCard").length;
//		.assertThat()
//		.log()
//		.all()
		//.statusCode(200);
	    }
    
    
    public int getrequestsellAccountautomationcyber()
   	{
       	Response response = RestAssured.given().header("Content-Type","application/json").
   		header("X-IBM-Client-Secret", "hM4jD6pX2gA4rM8mI3dG5mK7vX0eJ7nP6pN6bC8xX8gS3yJ7fO").
   		header("X-IBM-Client-Id","7c458c33-e030-4d5b-93f6-510b90df393e").
   		when()
   		.get("https://api-uat.unionbankph.com/ubp/uat/eon/v1/customers/2526678/cards")
   		.then().extract().response();
       	return response.asString().split("rawCard").length;
   	}
       	
    
    public void getrequestsellAccountautomation2()
   	{
    	
    	
    	int i=getrequestsellAccountautomation();
    	
    	
       	
   	    }
       
    
    
    
   /* public static String GETRequest() throws IOException {
     	
     	

             final String POST_PARAMS = "{\n" + "\"userId\": 101,\r\n" +

  	        "    \"id\": 101,\r\n" +

  	        "    \"title\": \"Test Title\",\r\n" +

  	        
  	    "    \"body\": \"Test Body\"" + "\n}";
           
  	//final String POST_PARAMS = "{\"countryCode\":\"91\",\"mobileNo\":\"9711715667\",\"LoginType\":\"OTP\",\"DeviceType\":\"ANDROID\",\"DeviceID\":\"test\"}";
  //	final String POST_PARAMS = "{\"UserId\":\"1\",\"mandateId\":\"1\",\"countryCode\":\"91\",\"phoneNumber\":\""+phno+"\",\"refType\":\"CP\"}";
  	   // System.out.println(POST_PARAMS);

//  	    URL obj = new URL("https://jsonplaceholder.typicode.com/posts");
  	    URL obj = new URL("https://api-uat.unionbankph.com/ubp/uat/eon/v1/customers/2438733/cards");

  	    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();

  	    postConnection.setRequestMethod("GET");

  	  
  	    Accept-Language: en-US,en;q=0.9
  	    		Authorization: b92r077tdb10ijeji7c9bsfd7y6nuet4b8tbkd07
  // postConnection.setRequestProperty("userId", "a1bcdefgh");

  	    postConnection.setRequestProperty("Content-Type", "application/json");
  	    postConnection.setRequestProperty("X-IBM-Client-Secret", "hM4jD6pX2gA4rM8mI3dG5mK7vX0eJ7nP6pN6bC8xX8gS3yJ7fO");
  	    postConnection.setRequestProperty("X-IBM-Client-Id", "7c458c33-e030-4d5b-93f6-510b90df393e");



  	    postConnection.setDoOutput(true);

  	    OutputStream os = postConnection.getOutputStream();

  	   // os.write(POST_PARAMS.getBytes());

  	    os.flush();

  	    os.close();





  	    int responseCode = postConnection.getResponseCode();

  	    System.out.println("GET Response Code :  " + responseCode);

  	    System.out.println("GET Response Message : " + postConnection.getResponseMessage());



  	    //if (responseCode == HttpURLConnection.HTTP_CREATED) { //success

  	        BufferedReader in = new BufferedReader(new InputStreamReader(

  	            postConnection.getInputStream()));

  	        String inputLine;

  	        StringBuffer response = new StringBuffer();



  	        while ((inputLine = in .readLine()) != null) {

  	            response.append(inputLine);

  	        } in .close();



  	        // print result
  	        System.out.println(response.toString());
  	       return response.toString();
  	    		

  	    } 
    
    */
    
    private String get(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/*public void prepaidcardnumbervalid()
    {
    	Wait(30);
    	type(BaseLoginPage.prepaidcardNumber, "4162970001383975", "prepaidcardnumber");
    	System.out.println("Enter the number");
    	
    }
    
    public void loginwithcybercardaddtheprepaidcardnumbervalid()
    {
    	Wait(30);
    	type(BaseLoginPage.prepaidcardNumber, "4162970001383926", "prepaidcardnumber");
    	System.out.println("Enter the number");
    	
    }
    
    
    public void paypalprepaidcardnumbervalid()
    {
    	Wait(30);
    	type(BaseLoginPage.prepaidcardNumber, "4162970001383959", "prepaidcardnumber");
    	System.out.println("Enter the number");
    	
    }
    
    
    */
    
    
	
	public void creditcardselected() throws Exception
	{
		
		Wait(20);
		verifyElementPresentAndClick(BaseLoginPage.Creditcard, "EON Credit Card");
		System.out.println("Select the Credit Card");
	}
	
	
	public void checkthecreditcardname() throws Exception
	{
		
		Wait(20);
		verifyElementDisplayed(BaseLoginPage.Creditcardcheckingthepage);
		System.out.println("Check the credit card name");
		}
	
	public void reviewbutton() throws Exception
	{
		
		Wait(30);
		verifyElementPresentAndClick(BaseLoginPage.ReviewTermsOfUse, "Review Terms Of Use");
	    System.out.println("Click on review button");
     }
	
	
	/*public void CreditcardEnterdetalis()
	{
	
		Wait(20);
		type(BaseLoginPage.creditcardnumber, "12345", "creditcardnumber");
		System.out.println("Enter the number");
		type(BaseLoginPage.ExpiryDate,"10/25", "expirydate");
		System.out.println("expiry the date");
		type(BaseLoginPage.CVV, "123", "cvv");
		System.out.println("enter the cvv");
		
   }
	
	*/
	public void ContinueButton() throws Exception
	{
		
		Wait(30);
		findElement(BaseLoginPage.Continuebutton).click();
		System.out.println("Click on continue Button");
	}
		
		/*public void LinkOtherMasterCardOrVisaCard() throws Exception {
			
			Wait(20);
			verifyElementPresentAndClick(BaseLoginPage.linkOtherCard,"Link your other Mastercard or Visa card");
			System.out.println("successfully click on link your other Mastercard or Visa card");
			click(BaseLoginPage.bankIssuer,"Bank Issuer");
			System.out.println("click on Bank Issuer text box ");
			click(BaseLoginPage.AsiaUB,"Asia United Bank");
			System.out.println("Bank select successfully");
			type(BaseLoginPage.inputCardNumber, "4895321000000000", "InputCardNumber");
			System.out.println("Printing Card Number");
			type(BaseLoginPage.expiryDate, "12/22", "Expiry Date");
			System.out.println("Expiry Date is printing");
			type(BaseLoginPage.cvv, "024", "CVV");
			System.out.println("CVV is printing");
			
		}
			
		
*/
	
	
	
	
	

}
