package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.Mobilebaseclass;
import Baseclass.baseclass;
//import Baseclass.baseclass;
import Businesslogic.loginpage;
import Commonfiles1.Commonfiles;
import annotation.Author;
@Listeners(Commonfiles1.ListenerDriver2.class)

public class VerifythehercircleLogin extends Mobilebaseclass {
	
@Author(name = "vasu")
@Test (priority = 0)
public void hercirclelogin() throws InterruptedException
{
	
		
		loginpage login=new loginpage(driver);
		login.Mobilehercirclelogin();
		/*login.Mobilehercirclelogin1();
		login.Mobilehercirclelogin2();
		login.Mobilehercirclelogin3();
		login.Mobilehercirclelogin4();*/
		//login.homepagevalidations();
		
		
}
/*@Test (priority = 1)
public void hercirclelogin1() throws InterruptedException
{
	
		
		loginpage login=new loginpage(driver);
		login.Mobilehercirclelogin1();
}
@Test (priority = 2)
public void hercirclelogin2() throws InterruptedException
{
	
		
		loginpage login=new loginpage(driver);
		login.Mobilehercirclelogin2();
}
@Test (priority = 3)
public void hercirclelogin3() throws InterruptedException
{
	
		
		loginpage login=new loginpage(driver);
		login.Mobilehercirclelogin3();
}
@Test (priority = 4)
public void hercirclelogin4() throws InterruptedException
{
	
		
		loginpage login=new loginpage(driver);
		login.Mobilehercirclelogin4();
}*/
}
