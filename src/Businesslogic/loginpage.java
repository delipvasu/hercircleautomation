package Businesslogic;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Baseclass.baseclass;

public class loginpage extends baseclass{
	
	WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void logouthercircle() throws InterruptedException
	{
		
		    /*waitForSomeTime();
		    FindelementClick(pages.HercircleLoginpage.menutoggle, driver);
		    System.out.println("Click on menutoggle");*/
		    waitForSomeTime();
		    FindelementClick(pages.HercircleLoginpage.Settings, driver);
		    System.out.println("Click on settings");
		    waitForDomElement(driver);
		    FindelementClick(pages.HercircleLoginpage.logout, driver);
		    System.out.println("Click on logout");
		
	}
	
	public void webhercircleLogin() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.HercircleLoginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.HercircleLoginpage.UserName, "hercircleusername", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.HercircleLoginpage.Password, "hercirclepassword", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.HercircleLoginpage.Login, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.HercircleLoginpage.notification, driver);
	    waitForSomeTime();
	    FindelementClick(pages.HercircleLoginpage.menutoggle, driver);
	    System.out.println("Click on menutoggle");
	    waitForDomElement(driver);
	    Findelement(pages.HercircleLoginpage.afterloginverifyname, driver);
	    logouthercircle();
	  }
	
	
	
	
	
	public void webhercircleLogin1() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.HercircleLoginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.HercircleLoginpage.UserName, "hercircleusername1", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.HercircleLoginpage.Password, "hercirclepassword1", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.HercircleLoginpage.Login, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.HercircleLoginpage.notification, driver);
	    System.out.println("Click on notification");
	    logouthercircle();
	   
	    
	  }
	    
	    
	    
	  
	
	public void webhercircleLogin2() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.HercircleLoginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.HercircleLoginpage.UserName, "hercircleusername2", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.HercircleLoginpage.Password, "hercirclepassword2", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.HercircleLoginpage.Login, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.HercircleLoginpage.notification, driver);
	    logouthercircle();
	  }
	public void webhercircleLogin3() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.HercircleLoginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.HercircleLoginpage.UserName, "hercircleusername3", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.HercircleLoginpage.Password, "hercirclepassword3", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.HercircleLoginpage.Login, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.HercircleLoginpage.notification, driver);
	    logouthercircle();
	  }
	
	public void webhercircleLogin4() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.HercircleLoginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.HercircleLoginpage.UserName, "hercircleusername4", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.HercircleLoginpage.Password, "hercirclepassword4", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.HercircleLoginpage.Login, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.HercircleLoginpage.notification, driver);
	    logouthercircle();
	  }
	
	
	
	
	public void mobilelogout() throws InterruptedException
	{
		
		waitForDomElement(driver);
	    FindelementClick(pages.loginpage.settings, driver);
	    System.out.println("Click on setting");
	    waitForSomeTime();
	    FindelementClick(pages.loginpage.logout1, driver);
	    System.out.println("Click on logout button");
	    waitForDomElement(driver);
		Findelement(pages.loginpage.signin, driver);
		System.out.println("after logout check the home screen");
		
	}
	
	
	
	
	public void Mobilehercirclelogin() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.loginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.loginpage.username, "hercircleusername", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.loginpage.Passwordhercircle, "hercirclepassword", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.loginpage.hercirclelogin, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.loginpage.notification, driver);
	    System.out.println("Check the notification Button");
	    waitForSomeTime();
	    FindelementClick(pages.loginpage.menutoggle, driver);
	    System.out.println("Click on menu toggle");
	    waitForSomeTime();
	    Findelement(pages.loginpage.Srideviname, driver);
	    System.out.println("verify the after login check the user name");
	    mobilelogout();
	   }
	
	
	
	public void Mobilehercirclelogin1() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.loginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.loginpage.username, "hercircleusername1", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.loginpage.Passwordhercircle, "hercirclepassword1", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.loginpage.hercirclelogin, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.loginpage.notification, driver);
	    System.out.println("Check the notification Button");
	    waitForSomeTime();
	    FindelementClick(pages.loginpage.menutoggle, driver);
	    System.out.println("Click on menu toggle");
	    waitForSomeTime();
	    Findelement(pages.loginpage.srilathareddy, driver);
	    System.out.println("verify the after login check the user name");
	    mobilelogout();
	   }
	
	
	public void Mobilehercirclelogin2() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.loginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.loginpage.username, "hercircleusername2", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.loginpage.Passwordhercircle, "hercirclepassword2", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.loginpage.hercirclelogin, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.loginpage.notification, driver);
	    System.out.println("Check the notification Button");
	    waitForSomeTime();
	    FindelementClick(pages.loginpage.menutoggle, driver);
	    System.out.println("Click on menu toggle");
	    waitForSomeTime();
	    Findelement(pages.loginpage.snehal, driver);
	    System.out.println("verify the after login check the user name");
	    mobilelogout();
	   }
	
	
	
	
	
	
	public void Mobilehercirclelogin3() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.loginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.loginpage.username, "hercircleusername3", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.loginpage.Passwordhercircle, "hercirclepassword3", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.loginpage.hercirclelogin, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.loginpage.notification, driver);
	    System.out.println("Check the notification Button");
	    waitForSomeTime();
	    FindelementClick(pages.loginpage.menutoggle, driver);
	    System.out.println("Click on menu toggle");
	    waitForSomeTime();
	    Findelement(pages.loginpage.mukesh123, driver);
	    System.out.println("verify the after login check the user name");
	    mobilelogout();
	   }
	
	
	public void Mobilehercirclelogin4() throws InterruptedException
	{
		
		waitForDomElement(driver);
		FindelementClick(pages.loginpage.signin, driver);
		System.out.println("Click on Signin Buton");
		waitForDomElement(driver);
		Sendkeys(pages.loginpage.username, "hercircleusername4", driver, rb);
		System.out.println("Enter the Username");
		Sendkeys(pages.loginpage.Passwordhercircle, "hercirclepassword4", driver, rb);
		System.out.println("Enter the Password");
	    FindelementClick(pages.loginpage.hercirclelogin, driver);
	    System.out.println("Click on LoginButton");
	    waitForDomElement(driver);
	    Findelement(pages.loginpage.notification, driver);
	    System.out.println("Check the notification Button");
	    waitForSomeTime();
	    FindelementClick(pages.loginpage.menutoggle, driver);
	    System.out.println("Click on menu toggle");
	    waitForSomeTime();
	    Findelement(pages.loginpage.krishnablity, driver);
	    System.out.println("verify the after login check the user name");
	    mobilelogout();
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void homepagevalidations()
	{
		waitForDomElement(driver);
	    Findelement(pages.loginpage.connect, driver);
	    System.out.println("checking the findelement");
	    waitForDomElement(driver);
	    Findelement(pages.loginpage.connect, driver);
	    Findelement(pages.loginpage.engage, driver);
	    Findelement(pages.loginpage.grow, driver);
	    Findelement(pages.loginpage.goals, driver);
	    Findelement(pages.loginpage.help, driver);
	    System.out.println("Check the home menu bars");
	    waitForDomElement(driver);
	    FindelementClick(pages.loginpage.grow, driver);		
	    System.out.println("Click on grow Button");
	    waitForDomElement(driver);
	    FindelementClick(pages.loginpage.Jobs, driver);
	    System.out.println("Click on jobs");
	    FindelementClick(pages.loginpage.jobid, driver);
	    System.out.println("Click on job id 786");
	    
	}
	
	
	
	
	
	
	
	
	
	public void facebookLogin()
	{
		
		driver.findElement(pages.loginpage.facebookLogin).click();
		System.out.println("Click on facebook");
	}
	
	public void male() throws InterruptedException
	{
		
		waitForDomElement(driver);
	    driver.findElement(pages.loginpage.male).click();	
	    waitForSomeTime();
	    longScrollDown(driver);
	    
	}
	
	public void Login() throws InterruptedException
	{
		
		windowhandle(driver);
		driver.findElement(pages.loginpage.loginfb).click();
		System.out.println("Click fb Login");
		
	}
	
	
	public void firstnameasseration() throws InterruptedException
	{
		
	    waitForDomElement(driver);
		String actual_error2= driver.findElement(pages.loginpage.usernamevalidation).getText();
		String expeted_error2= "First name is required.";
		Assert.assertEquals(actual_error2,expeted_error2);
		System.out.println("Frist name rquired");
		
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
	
	
	public void conformpassword() throws InterruptedException
	{
		
		waitForSomeTime();
		String actual_error2= driver.findElement(pages.loginpage.passwordrequired).getText();
		String expeted_error2= "Password is required.";
		Assert.assertEquals(actual_error2,expeted_error2);
		waitForDomElement(driver);
		driver.findElement(pages.loginpage.Password2).sendKeys(rb.getString("password1"));		
	}
	
	
	
	
	
	public void Emailasseration() throws InterruptedException
	{
	
		
		waitForSomeTime();
		String actual_error2= driver.findElement(pages.loginpage.Email).getText();
		String expeted_error2= "Email is required.";
		Assert.assertEquals(actual_error2,expeted_error2);
		
	
	}
	
	public void continue1()
	{
		waitForDomElement(driver);
		driver.findElement(pages.loginpage.Continue).click();
		System.out.println("Click on continue button");
		
	}
	public void Electronics() throws InterruptedException
	{
	waitForSomeTime();
	WebElement ele = driver
			.findElement(pages.loginpage.Electronics);

	// + "//div[@contains='Hi'][@class='pull-right font-size-24 pr-0
	// text-right user-detail visible-md-block visible-lg-block']"
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
	System.out.println("Mouse over The Collection");
	
	}
	
	public void camera() throws InterruptedException
	{
		
		waitForDomElement(driver);
		WebElement element = driver.findElement(pages.loginpage.cameraphoto);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		System.out.println("Click on Dresses");
		waitForSomeTime();		
	}
	
	public void Addcart()
	{
		
		waitForDomElement(driver);
		ScroolDown(driver);
        driver.findElement(pages.loginpage.addcart).click();
        System.out.println("Click on Addcart");
	}
	public void Addcart1() throws InterruptedException
	{
		
		waitForSomeTime();
		longScrollDown(driver);
        driver.findElement(pages.loginpage.addcart1).click();
        System.out.println("Click on Addcart");
	}
	public void Addcardcheckthemeassge() throws InterruptedException
	{
		
		waitForSomeTime();
        driver.findElement(pages.loginpage.productAddingmessage);
        System.out.println("Click on Addcart");
	}
	
	
	public void qty() throws InterruptedException
	{
		
		waitForDomElement(driver);
        driver.findElement(pages.loginpage.qty).click();
        System.out.println("Click on product qty");
        waitForDomElement(driver);
        driver.findElement(pages.loginpage.qtycount);
        System.out.println("print the count");
	}
	
	public void remove() throws InterruptedException
	{
		waitForSomeTime();
		driver.findElement(pages.loginpage.removeproduct).click();
		System.out.println("Remove the product");
		
		
	}
	
	public void cartempty()
	{
		
		waitForDomElement(driver);
		String actual_error2= driver.findElement(pages.loginpage.cartempty).getText();
		System.out.println("empty cart"+actual_error2);
		
		
	}
	
	public void logout() throws InterruptedException
	{
		
	 waitForSomeTime();
	 driver.findElement(pages.loginpage.logout).click();
	 System.out.println("Click on log out");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	public void registercompletemessage() throws InterruptedException
	{
		waitForSomeTime();
		String actual_error2= driver.findElement(pages.loginpage.registercomplete).getText();
		String expeted_error2= "Your registration completed";
		Assert.assertEquals(actual_error2,expeted_error2);
		
	}
	
	
	
	public void Register()
	{
		
		waitForDomElement(driver);
        driver.findElement(pages.loginpage.Register).click();
        System.out.println("Click on Register");
	}
	
     public String random_email1(){
	    
	    double d=Math.random();
	    d=d*10000;
	    int a= (int) d;
	    String no= String.valueOf(a);
	    String email="Vasu"+no+"@gmail.com";
	    System.out.println("email"+email);
	    return email;

	}
     
     public void Addemail() throws InterruptedException
     {
    	 waitForSomeTime();
    	 driver.findElement(pages.loginpage.email).sendKeys(random_email1());
    	 System.out.println("Click on Addemail");
    	 
     }
 
     public void fristname() throws InterruptedException
     {
    	waitForSomeTime();
    	driver.findElement(pages.loginpage.fristname).sendKeys(rb.getString("name"));
    	System.out.println("enter the frist name");
    	 
     }
     
     public void lastname() throws InterruptedException
     {
    	 
    	 waitForSomeTime();
    	//driver.findElement(pages.loginpage.lastname).sendKeys(rb.getString("lastname"));
    	 Sendkeys(pages.loginpage.lastname, "lastname", driver, rb);
    	 System.out.println("Enter the last name");
    	 /*FindelementClick(pages.loginpage.lastname, driver);
    	Sendkeys(pages.loginpage.lastname, "lastname", driver, rb);
*/      }
     
     
    
     
     
     
	
	public void fbusername()
	{
		
		waitForDomElement(driver);
		driver.findElement(pages.loginpage.fbusername).sendKeys(rb.getString("username"));
		System.out.println("Enter the username");
		
	}
	
	
	public void fbpassword()
	{
		
		waitForDomElement(driver);
        driver.findElement(pages.loginpage.fbpassword).sendKeys(rb.getString("password"));	
        System.out.println("Enter the password");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void login() throws InterruptedException
	{
		
		driver.findElement(pages.loginpage.username).sendKeys(rb.getString("usernameRPT"));
		waitForDomElement(driver);
		driver.findElement(pages.loginpage.Lastname).sendKeys(rb.getString("passwordRPT"));
		waitForSomeTime();
	    driver.findElement(pages.loginpage.Login).click();
        System.out.println("Enter the login button");
        waitForSomeTime();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://ubotp-tst.outsystemsenterprise.com/RPTMSV2/");
        
      
        
        
       /* Set <String> windowHandles = driver.getWindowHandles();

        System.out.println(windowHandles.size());

        for(String winHandle : driver.getWindowHandles()){

            driver.switchTo().window(winHandle);

        }

        driver.navigate().to("https://ubotp-tst.outsystemsenterprise.com/RPTMSV2/");
		
	}
	*/}

	
        
        public void AddIndividual() throws InterruptedException
        {
        	waitForSomeTime();
            driver.findElement(pages.loginpage.Addbutton).click();
        	
        }

        public void day() throws InterruptedException
        {
        	
        	waitForDomElement(driver);
        	WebElement test=driver.findElement(pages.loginpage.Day);
        	SelectByValue(test, "4", driver);
        	
        	
        }
        
        
        
        
        
        public void checking() throws InterruptedException
       {
            waitForDomElement(driver);
        	driver.findElement(pages.loginpage.addbutton).click();
        	ScroolDown(driver);
        	waitForSomeTime();
            driver.findElement(pages.loginpage.a1).sendKeys("1");
            WebElement test=driver.findElement(pages.loginpage.a1);
            SelectByValue(test, "vasu", driver);
            longScrollDown(driver);
            longScrollDown(driver);
            }

}