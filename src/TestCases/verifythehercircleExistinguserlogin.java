package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import Businesslogic.loginpage;
import annotation.Author;
import pages.HercircleLoginpage;
@Listeners(Commonfiles1.ListenerDriver.class)
public class verifythehercircleExistinguserlogin extends baseclass{
	
	@Author(name = "vasu")
	@Test(description="verify the Existing user login page")	
   
	public void verifytheExistinguserloginpage() throws InterruptedException
	{
		
		loginpage login=new loginpage(driver);
		login.webhercircleLogin();
		login.webhercircleLogin1();
		login.webhercircleLogin2();
		login.webhercircleLogin3();
		login.webhercircleLogin4();
		
		
		
	}
	
	
	
	
	

}
