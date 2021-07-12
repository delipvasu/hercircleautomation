package Asseration;

import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Baseclass.baseclass;



//import junit.framework.Assert;

public class Loginvalidation  extends baseclass{

WebDriver driver;

public Loginvalidation(WebDriver driver)
{
	this.driver=driver;
}

public void lastnameasseration() throws InterruptedException
{
	
	waitForSomeTime();
	String actual_error2= driver.findElement(pages.loginpage.Lastname).getText();
	String expeted_error2= "Last name is required.";
	Assert.assertEquals(actual_error2,expeted_error2);
	
}


public void password() throws InterruptedException
{
	
	waitForSomeTime();
	String actual_error2= driver.findElement(pages.loginpage.passwordrequired).getText();
	String expeted_error2= "Password is required.";
	Assert.assertEquals(actual_error2,expeted_error2);
	waitForDomElement(driver);
	driver.findElement(pages.loginpage.password1).sendKeys(rb.getString("password1"));
	
	
}

	
	
	
	

	
	
	
}




