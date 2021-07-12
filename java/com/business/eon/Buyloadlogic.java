package com.business.eon;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Pages.BaseLoginPage;
import com.Pages.Buyloadpage;
import com.Pages.FavoritesPage;
import com.Pages.TopUpPage;
import com.utility.Utilities;

public class Buyloadlogic extends Utilities{
	
	public void buyload() throws Exception
	{   
		
    	findElement(Buyloadpage.Buyload).click();
    	System.out.println("Click on Buyload");
		}
	
	
	public void PrepaidCard() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.EOnprepaidAccount).click();
		System.out.println("Eon prepaid card");
		
	}
	public void topup() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.topup).click();
		System.out.println("Click on Top up");
		
	}
	
	
	
	
	
	public void EasyTrip() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.easyTrip).click();
		System.out.println("Click on EasyTrip");
		Thread.sleep(10000);
		
	}
	
	
	
	
	
	
	
	public void managefavorites() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.ManageFavorites).click();
		System.out.println("Click on manage Favorites");
	}
	
	
	public void favorites() throws Exception
	{
		
		
		Wait(20);
		findElement(Buyloadpage.paybills).click();
		System.out.println("Click on pay bill favorites");
		
	}
	
	
	public void favpaybill() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.paybills).click();
		System.out.println("Click on paybills");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void globe() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.globe).click();
		System.out.println("Click on Globe");
		
	}
	
	public void smart() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.smart).click();
		System.out.println("Click ");
		
	}
	
	public void Suncelluar() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.Suncller).click();
		System.out.println("Click on suncelluar");
		
	}
	
	public void TNT() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.TNT).click();
		System.out.println("Click on TNT");
	}
	
	
	public void TM() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.TM).click();
		System.out.println("Click on TM");
	}
	
	
	public void recipentMobilenumber(ResourceBundle rb) throws InterruptedException
	{
		
		Wait(20);
		type(Buyloadpage.RecipientMobilenumber, "Mobilenumber", "mobile", rb);
		System.out.println("Enter the Mobilenumber");
	}
	
	
	public void FavrecipentMobilenumber(ResourceBundle rb) throws InterruptedException
	{
		
		Wait(20);
		type(Buyloadpage.Accountnumber, "Mobilenumber", "mobile", rb);
		System.out.println("Enter the Mobilenumber");
	}
	public void Selectitem() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.Selectitem).click();
		System.out.println("Click on Select item");
		
	}
	public void Suncelluardropdown() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.sunprepaid).click();
		System.out.println("Click on sunprepaid button");
		
		
	}
	
	public void  showmore() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.showmore).click();
		Wait(20);
		findElement(Buyloadpage.ManageAccount).click();
		Wait(20);
		findElement(Buyloadpage.Eon).click();
		System.out.println("Click on Eon account");
		Wait(20);
		findElement(Buyloadpage.editback).click();
		Wait(20);
		findElement(Buyloadpage.save).click();
		Wait(20);
		
	}
	
	
	
	
	
	public void pro() throws Exception
	{
		
		Wait(100);
		findElement(Buyloadpage.pro).click();
		System.out.println("Click on pro");
		
	}
	
	
	
	
	
	public void plus() throws Exception
	{
		
		Wait(100);
		findElement(Buyloadpage.Plus).click();
		System.out.println("Click on plus Button");
		
	}
	
	public void lite() throws Exception
	{
		
		Wait(100);
		findElement(Buyloadpage.Lite).click();
		System.out.println("Click on lite card");
		
	}
	
	
	public void Starter() throws Exception
	{
		
		Wait(100);
		findElement(Buyloadpage.Starter).click();
		System.out.println("Enter the Starter Card");
		
		
	}
	public void backtomainpage() throws Exception{
		
		Wait(20);
		Swipe("UP", 4);
		findElement(Buyloadpage.Backtomainpage).click();
		System.out.println("Click on back to main page");
		
	}
	
	
	public void Swipe()
	{
		
		Wait(20);
		Swipe("UP", 3);
		
	}
	
	public void ADDTOFAVORITES() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.ADDTOFAVORITES).click();
		System.out.println("Click on Favorites");
	}
	
	
	public void favoritestoaster() throws Exception
	{
		
		Wait(20);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Please Select the star of the transaction that you wish to save as Favorites. Only succesful Transaction are allowed to be saved.");
		System.out.println("Check the toaster");
		
	}
	
	public void Star() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.Star).click();
		System.out.println("Click on star button");
		
	}
	
	public void editfav() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.editfavorites).click();
		System.out.println("enter the editfav");
		
		
	}
	
	public void savefav() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.FavSave).click();
		System.out.println("Click on save button");
		
	}
	
	public void editfavname(ResourceBundle rb)
	{
		
		Wait(20);
		type(Buyloadpage.FavAccountnumber, "number", "name", rb);
		System.out.println("Enter the name");
	}
	
	public void favyes() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.Favyes).click();
		System.out.println("Click on Yes Button");
		
	}
	
	public void cross() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.crossmar).click();
		System.out.println("click on cross");
	}
	
	public void ADDAFAVORITES() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.ADDAFAVORITES).click();
		System.out.println("click on add Favorites");
		Thread.sleep(10000);
	}
	
	
	public void MANAGEADDAFAVORITES() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.ManageADDAFAVORITES).click();
		System.out.println("click on add Favorites");
		Thread.sleep(10000);
	}
	
	
	
	
	
	
	
	
	
	
	
	public void Eoncyber() throws Exception
	{
		
		Wait(100);
		findElement(Buyloadpage.pro);
		Swipe("UP", 1);
		findElement(Buyloadpage.EonCybecard).click();
		System.out.println("Click on Eon cyber card");
		
	}
	
	public void Eonaccount() throws Exception
	{
		Wait(20);
        findElement(Buyloadpage.EonAccount).click();
        System.out.println("Enter the EonAccount");
	}
	
	
	public void FavEonaccount() throws Exception
	{
		Wait(20);
        findElement(Buyloadpage.FavEonaccount).click();
        System.out.println("Enter the EonAccount");
	}
	public void visacard() throws Exception
	
	{
		
		Wait(20);
		findElement(Buyloadpage.VISA).click();
		System.out.println("Click on Visa card");
		
	}
	
	public void Paypal() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.paypal).click();
		System.out.println("Click on pay pal Account");
		
	}
	
	
	public void globedropdown() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.globetxt15).click();
		System.out.println("Select the text");
		
	}
	
	public void Continue() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.Continue).click();
		System.out.println("Click Continue Button");
		
	}
	
	public void Waitfortime()
	{
		
		Wait(30);
		
		
	}
	
	
	
	public void pleaseconfromtheotp() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.pleaseconfromotp);
		System.out.println("please confrom the otp");
		
	}
	
	
	public void paywithpaypal() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.Paywithpaypal).click();
		System.out.println("Enter the pay pal Account");
		
	}
	
	public void DefalutLanguage() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.DefaultLanguage).click();
		System.out.println("Default lanaguage");
	}
	
	public void Taglish() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.TAGLISH).click();
		System.out.println("Enter the taglish");
		
	}
	
	
	public  void English() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.English).click();
		System.out.println("Click on English");
	}
	
	public void MAGLogin() throws Exception
	{
		Wait(20);
		getText(Buyloadpage.TAGLISHLogin);
		System.out.println("Check the Login button");
		
		
	}
	public void TaglishLanguage() throws Exception
	{
		
		Wait(20);
		getText(Buyloadpage.TaglishLanguage);
		System.out.println("Check the TaglishLanguage");
	}
	
	
	
	public void TaglishLanguageclick() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.TaglishLanguage).click();
		System.out.println("Check the TaglishLanguage");
	}
	public void TaglishLanguagec() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.TaglishLanguage).click();
		System.out.println("Check the TaglishLanguage");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void paypalusernaame(ResourceBundle rb) throws Exception
	{
		
		Wait(20);
		type(Buyloadpage.paypalusername, "paypalloginusername", "username", rb);
		System.out.println("enter the username");
		Wait(20);
		findElement(Buyloadpage.nextbutton).click();
		System.out.println("Click on Next Button");
		Wait(20);
		type(Buyloadpage.Paypalpassword, "paypalloginpassword", "password", rb);
		System.out.println("Paypal Password");
		Wait(20);
		findElement(Buyloadpage.paypallogin).click();
		System.out.println("Click on Login Button");
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void Cancel() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.Cancel).click();
		System.out.println("Click on Cancel");
		
	}
	
	
	public void Sendmoney() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.sendmoney).click();
		System.out.println("Click on send money");
		
		
	}

	public void Eon() throws Exception
	{
		Wait(20);
		findElement(Buyloadpage.eonAccount).click();
		System.out.println("Clickon Eon");
		
		
	}
	
	
	public void Addmore() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.AddMore).click();
		System.out.println("Enter the Add more button");
		
	}
	
	public void smartdropdown() throws Exception
	{
		
		Wait(20);
		findElement(Buyloadpage.smartprepaid15).click();
		System.out.println("Enter the SmartDropdown");
		
	}
	
public void Scrollthepage() throws InterruptedException
	
	{
        Thread.sleep(5000);		
		Swipe("UP", 2);
		
	}



public void Paynow() throws Exception
{
	Wait(20);
	findElement(Buyloadpage.PAYNOW).click();
	System.out.println("Click on pay Now");
	Wait(20);
	findElement(Buyloadpage.pleaseconfromotp);
    System.out.println("Showing the Otp Page");	
    Thread.sleep(3000);
    findElement(Buyloadpage.Continue).click();
    System.out.println("Click on Continue Button");
}

public void Transaction() throws Exception
{
	Wait(20);
	Swipe("UP", 3);
	Assert.assertEquals(getText(Buyloadpage.TransactionComplete),"Transaction Complete!");
	
	
}


public void successful2() throws Exception
{
	
	Wait(20);
	findElement(Buyloadpage.Successfull);
	System.out.println("showing the successfull transaction 2");
	
	
	
}











public void TNTdropdown() throws Exception
{
	Wait(20);
	findElement(Buyloadpage.TNT15).click();
	System.out.println("Click on Tnt dropdown");
}

public void TMdropdown() throws Exception
{
	Wait(20);
	findElement(Buyloadpage.TMphp).click();
	System.out.println("Click on TM ");
	
}

public void prepaidcardnumber(ResourceBundle rb)
{
	
  Wait(20);	
  type(Buyloadpage.Prepaidnumber, "Prepaidnumber", "Prepaidnumber", rb);
  System.out.println("enter prppaid number");
	
	
}




public void Gametime() throws Exception
{
	
	
	Wait(20);
	findElement(Buyloadpage.Gametime).click();
	System.out.println("Click on Game time");
	
	
}
public void Gametimefav() throws Exception
{
	
	
	Wait(20);
	findElement(Buyloadpage.Gametimefav).click();
	System.out.println("Click on Game time");
	
	
}
public void Account(ResourceBundle rb)
{
	
	Wait(20);
	type(Buyloadpage.Accountnumber, "Accountnumber", "number", rb);
	System.out.println("Enter the Account number");
	
}


public void payrsname(ResourceBundle rb) throws InterruptedException
{
	
	Thread.sleep(10000);
	type(Buyloadpage.payname, "name", "name", rb);
	System.out.println("Enter the name");
	
}

public void favpayrsname(ResourceBundle rb) throws InterruptedException
{
	
	Thread.sleep(10000);
	type(Buyloadpage.Accountnumber, "name", "name", rb);
	System.out.println("Enter the name");
	
}


public void name() throws Exception
{

	
	Wait(20);
	findElement(Buyloadpage.Any).click();
	System.out.println("Click on name");
	}

	
public void TopupAmount(ResourceBundle rb)
{
	Wait(20);
	type(Buyloadpage.TopopAmount, "TOPUPAmount", "Amount", rb);
	System.out.println("Enter the Topup Amount");
	
}
	
public void PilipinasAmount(ResourceBundle rb)
{
	Wait(20);
	type(Buyloadpage.TopopAmount, "PilipinasAmount", "Amount", rb);
	System.out.println("Enter the Topup Amount");
	
}

public void FavAccountnumber(ResourceBundle rb)
{
	Wait(20);
	type(Buyloadpage.TopopAmount, "Accountnumber9digit", "Amount", rb);
	System.out.println("Enter the Topup Amount");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
