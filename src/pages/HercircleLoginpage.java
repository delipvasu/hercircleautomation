package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HercircleLoginpage {
	
	public static By signin=By.xpath("//*[text()='Sign In']");
	
	public static By UserName=By.xpath("//*[@id='MainContent_txtUsername']");
	
	public static By Password=By.xpath("//*[@id='MainContent_txtPassword']");
	
	public static By Login=By.xpath("//*[@id='MainContent_btnLogin']");
	
	public static By afterloginverifyname=By.xpath("//*[text()='SRIDEVI']");
	
    public static By notification=By.xpath("//*[@id='notificationIcon']");
    
    public static By menutoggle=By.xpath("//*[@class='navbar-toggler collapsed waves-effect waves-float waves-classic']");
    
    public static By Settings=By.xpath("(//*[text()='settings'])[1]");
    
    public static By logout=By.xpath("(//*[@class='period'])[6]/*");
	
}
