package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import annotation.Author;

import Baseclass.baseclass;
import Businesslogic.loginpage;
//@Listeners(Commonfiles1.ListenerDriver.class)
public class Verifythefbloginpage extends baseclass{
@Author(name = "vasu")
@Test(description="verify the login page ")

public void loginfbpage() throws InterruptedException
{
	
	 loginpage Rpt=new loginpage(driver);
	 Rpt.male();
	 Rpt.Register();
	 Rpt.firstnameasseration();
	 Rpt.lastnameasseration();
	 Rpt.Emailasseration();
	 Rpt.fristname();
	 Rpt.lastname();
	 Rpt.day();
	 Rpt.Addemail();
	 longScrollDown(driver);
	 Rpt.Register();
	 Rpt.password();
	 Rpt.conformpassword();
	 Rpt.Register();
	 Rpt.registercompletemessage();
	 Rpt.continue1();
	 Rpt.Electronics();
	 Rpt.camera();
	 Rpt.Addcart();
	 Rpt.Addcart1();
	 Rpt.Addcardcheckthemeassge();
	 Rpt.qty();
	 Rpt.remove();
	 Rpt.cartempty();
	 Rpt.logout();
	 
	 
	 
	 
	 
	
	
	
}

}
