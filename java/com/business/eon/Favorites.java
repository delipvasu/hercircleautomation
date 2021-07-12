package com.business.eon;

import com.utility.Utilities;
import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Pages.BaseLoginPage;
import com.Pages.FavoritesPage;
import com.Pages.Paybillspage;

public class Favorites  extends Utilities{
	
	
	public void AddFunds() throws Exception
	{
		
		
		Wait(20);
	    findElement(FavoritesPage.ADDFunds).click();
	    System.out.println("Clcik on Add Funds");
		
	}
	
	public void AddMoney2() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.AddMoney2).click();
		System.out.println("Click on Add money2");
		
	}
	
	
	
	
	public void Mobilenumber(ResourceBundle rb)
	{
		Wait(20);
		type(FavoritesPage.EonMobilenumber, "Lilinumber", "Mobilenumber",rb);
		System.out.println("Enter the Mobile number");
	}
	public void EonCardnmber(ResourceBundle rb)
	{
		
		Wait(20);
		type(FavoritesPage.EonCardnumber, "Eoncard", "Eoncardnumber",rb);
		System.out.println("Enter the Eon Cardnumber");
		}
	
	public void Checkout() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.Checkout).click();
		System.out.println("Click on Checkout button");
		/*Wait(20);
		getText(FavoritesPage.referencenumber);*/
	}
	
	public void cardvalidation() throws Exception
	{
		
		Wait(20);
		Assert.assertEquals(getText(FavoritesPage.errormessage), "Please enter a valid card number.");
		System.out.println("Check the validation");
		
	}
	
	/*public void TOPMobilenumber()
	{
		Wait(20);
		type(FavoritesPage.EonMobilenumber, "639502206807", "Mobilenumber");
		System.out.println("Enter the Mobile number");
	}

	
	
	
	
	*/
	public void Eoncardlitevalidnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(FavoritesPage.EonCardnumber, "litecard", "Eoncardnumber",rb);
		System.out.println("Enter the Eon valid card number");
		
	}
	
	public void Eoncardstartervalidnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(FavoritesPage.EonCardnumber, "Startercard", "Eoncardnumber",rb);
		System.out.println("Enter the Eon valid card number");
		
	}
	public void Eoncardplusvalidnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(FavoritesPage.EonCardnumber, "pluscard", "Eoncardnumber",rb);
		System.out.println("Enter the Eon valid card number");
		
	}
	public void Eoncardprovalidnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(FavoritesPage.EonCardnumber, "procard", "Eoncardnumber",rb);
		System.out.println("Enter the Eon valid card number");
		
	}
	public void Eoncardcybervalidnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(FavoritesPage.EonCardnumber, "cybercard", "Eoncardnumber",rb);
		System.out.println("Enter the Eon valid card number");
		
	}
	
	public void Refnumber() throws Exception
	{
		
		
		Thread.sleep(10000);
		getText(FavoritesPage.Refnumber);
		Wait(20);
		getText(FavoritesPage.validdate);
		
		
	}
	
	
	
	
	/*public void RecipentMobileno() throws InterruptedException
	{
		
		Thread.sleep(10000);
		type(FavoritesPage.Mobile, "09502206807", "REFMobilenumber");
		System.out.println("Enter the Mobile number");
		
		
	}
	*/
	
	public void selecttheitem() throws Exception
	{
		
		Wait(20);
	findElement(FavoritesPage.Selectitem).click();
	System.out.println("Click on Select the item");
		
    }
    public void globalitem() throws Exception
    {
    	Wait(20);
    	findElement(FavoritesPage.GlobalPhp).click();
    	findElement(FavoritesPage.GlobalPhp).click();
    	System.out.println("Enter the Global");
    	
    	
    	
     }
    public void talkphp15() throws Exception
    {
    	Wait(20);
    	findElement(FavoritesPage.TalkPhp).click();
    	findElement(FavoritesPage.TalkPhp).click();
    	System.out.println("Click on talkphp");
    	
    }
    
    
    public void smartitem() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.smartprepaidphp).click();
    	findElement(FavoritesPage.smartprepaidphp).click();
    	System.out.println("Click on Smartprepaidphp");
    
    	}
    
    public void globeprepaidFaviorite() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.favoriterepaid).click();
    	findElement(FavoritesPage.favoriterepaid).click();
    	System.out.println("Click on Faviorite");
    	
    	
    	
    }
    
    
   public void Suncellularitem() throws Exception
   {
	   
	   Wait(20);
	   findElement(FavoritesPage.Sunprepaid).click();
	   findElement(FavoritesPage.Sunprepaid).click();
	   System.out.println("Click on Suncellular prepaid card");
	   
	   
   }
    
    public void Globalwith() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.Globalpaywith).click();
    	System.out.println("Click on Globalpay button");
    	
    }
    
    
    public void buyload() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.Buyload).click();
    	System.out.println("Click on Buyload");
    	
    }
    
    public void Airasia() throws Exception
    {
    	Wait(50);
    	findElement(FavoritesPage.Airasia).click();
    	System.out.println("Click on air aisa");
    	
    }
    
    
    
    /*public void bookingnumber()
    {
    	Wait(20);
    	type(FavoritesPage.Bokkingnumber, "123456", "Bookingnumber");
    	System.out.println("Enter the booking number");
    	
    }
    */
    
    
    public void smart() throws Exception
    {
    	
    	
    	Wait(20);
    	findElement(FavoritesPage.smart).click();
    	System.out.println("Click the smart");
    	
    }
    
    
    
    public void Suncellular() throws Exception
    
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.Suncellular).click();
    	System.out.println("Click the Suncellular");
    	
    }
    
    
    public void globe() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.globe).click();
    	System.out.println("Click on Globe");
    	
    }
    
    
    public void TNT() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.TNT).click();
    	System.out.println("Click on TNT");
    	
   }
    
    
    
    public void TM() throws Exception
    {
    	Wait(20);
    	findElement(FavoritesPage.TM).click();
    	System.out.println("Click on Tm");
    	}
    
    public void Tmphp() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.TMPhP).click();
    	findElement(FavoritesPage.TMPhP).click();
    	System.out.println("Click on TMPhp");
    	
    }
    
    
    
    
    public void talkphp() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.TalkPhp).click();
    	System.out.println("Click on Talkphp");
    	
    }
    
	
    public void Manage() throws Exception
    {
    	Wait(20);
    	findElement(FavoritesPage.Manage).click();
    	System.out.println("Click on manage");
    	
    	
    }
  /*  public void preferredname()
    {
    	
    	Wait(20);
    	type(FavoritesPage.preferredname, "vasu", "preferredname");
    	System.out.println("Enter the prefrred name");
    	
    	
    }
    */
    public void Asia() throws Exception
    {
    	
    	Thread.sleep(30000);
    	findElement(FavoritesPage.Asia).click();
    	System.out.println("Click on Asia");
    	
    }
    
    
    
    
   /* public void Accountnumber()
    {
    	
    	Wait(20);
    	type(FavoritesPage.othercardAccountnumber, "060001156037", "OtherAccountnumber");
    	System.out.println("Enter the Account number");
    	
    }
    */
    
   public void Topup() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.Topups).click();
    	System.out.println("Clcik on Topup");
    	
    }
    
    public void AddFavoriteicon() throws Exception
    {
    	
    	Thread.sleep(3000);
    	findElement(FavoritesPage.Addfavoriteicon).click();
    	System.out.println("Click on Favorite");
    	
    }
    
    public void DeleteArrow() throws Exception
    {
    	Wait(20);
    	findElement(FavoritesPage.Delete).click();
    	System.out.println("Clcik on Delete the Button");
    	Wait(20);
    	findElement(FavoritesPage.DeleteArrow).click();
    	System.out.println("Click on Delete Arrow");
    	Wait(20);
    	findElement(FavoritesPage.DeleteFavorite).click();
    	System.out.println("Click on Contine button");
    	Wait(20);
    	findElement(FavoritesPage.ManageFavorite);
    	System.out.println("Click on ManageFavoritepage");
    	
    }
    
    
    public void Addfavorite() throws Exception
    {
    	
    	
    	Thread.sleep(3000);
        findElement(FavoritesPage.AddFavorite).click();
        System.out.println("Click on Favorite");
    }
    
    public void Edit() throws Exception
    {
    	Wait(20);
    	findElement(FavoritesPage.Edit).click();
    	System.out.println("Click Edit Button");
    	Wait(20);
    	findElement(FavoritesPage.Editedicon).click();
    	System.out.println("Click edit icon");
 }
    
    
    
    
    
    public void Selectthebill() throws Exception
    {
    	
    	Wait(20);
        findElement(FavoritesPage.SelectBill).click();
        System.out.println("Select the bill icon" );
     }
    
    
    
    public void SelectAirasiathebill() throws Exception
    {
    	
    	Wait(20);
        findElement(FavoritesPage.SelectthrbillAirasia).click();
        System.out.println("Select the bill icon" );
     }
    public void billSelected() throws Exception
    {
    	
    	Wait(20);
    	findElement(FavoritesPage.Allserve).click();
    	System.out.println("Click on Allserve");
    	
    }
   /* public void billname()
    {
    	
    	Wait(20);
    	type(FavoritesPage.BillName, "vamsi", "Billname");
    	System.out.println("Click on Billname");
    	
    	
    }
    public void editedbillname()
    {
    	
    	Wait(20);
    	type(FavoritesPage.BillName, "vamsikumar", "Billname");
    	System.out.println("Click on Billname");
    	
    	
    }
    
	public void RecipientMobileno()
	{
		
		Wait(20);
		type(FavoritesPage.EonMobilenumber, "639502206807", "Mobilenumber");
		System.out.println("Enter the Mobile number");
		
	}

	
	public void Emailnumber()
	{
		Wait(20);
		type(FavoritesPage.Eonemail, "vasukumar14356@gmail.com", "Emailnumber");
		System.out.println("Enter the Mobilenumber");
	}
	
	public void name()
	{
		Wait(20);
		type(FavoritesPage.Recipentname, "vasu", "Billname");
		System.out.println("Enter the Bill name");
	}
	*/
	public void save() throws Exception
	{
		Thread.sleep(20000);
		findElement(FavoritesPage.Save).click();
		System.out.println("Click on Save Button");
		
	}
	
	public void reviewsave() throws Exception
	{
		Wait(20);
		findElement(FavoritesPage.Save).click();
		System.out.println("Click on Save Button");
	}
	
	public void reviewEdit() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.reviewpageedit).click();
		System.out.println("Click on reviewEdit");
		
	}
	
	public void Toastermessage() throws Exception
	{
		
		
		Wait(20);
		getText(FavoritesPage.Toastermessage);
		Assert.assertEquals(getText(FavoritesPage.Toastermessage), "Please fill in the Required Fields");
		System.out.println("Check the validations");
	}
	
	
	
	public void hearticon() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.hearticon).click();
		System.out.println("Enter the element");
		
	}
	
	/*public void AddfavoriteName()
	{
		
	Wait(20);
	type(FavoritesPage.AddFavoritesname, "vasufavorite", "Favoritename");
	System.out.println("Add with Favorite Name");
		
		
		
	}
	*/
	
	
	
	
	
	
	public void AddtoFavorites() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.AddtofavoriteButton).click();
		Wait(20);
		Assert.assertEquals(getText(FavoritesPage.Toastermessage), "Favorite Saved!");
		System.out.println("Check the validations");
		
	}
	
	
	public void VisaCard() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.visamastercard).click();
		System.out.println("Click on Visa Mastercard");
		
	}
	
	public void Selectthemastercard() throws Exception
	{
		Thread.sleep(50000);
		findElement(FavoritesPage.Selecttheothercard).click();
		System.out.println("Click on othercard");
		
	}
	
	public void Done() throws Exception
	{
		Wait(20);
		findElement(FavoritesPage.Done).click();
		System.out.println("Click on done button");
		Assert.assertEquals(getText(FavoritesPage.Toastermessage), "Favorite Saved!");
		System.out.println("Check the validations");
		
		
		
	}
	
	
	public void UpdatedDone() throws Exception
	{
		Wait(20);
		findElement(FavoritesPage.Done).click();
		System.out.println("Click on done button");
		Assert.assertEquals(getText(FavoritesPage.Toastermessage), "Favorite Updated!");
		System.out.println("Check the validations");
		
		
		
	}
	
	
	public void updatedToaster() throws Exception
	{
		Wait(20);
		Assert.assertEquals(getText(FavoritesPage.Toastermessage), "Updated Successfully");
		System.out.println("Check the validations");
	}
	
	public void ReviewDelete() throws Exception
	{
		
		Wait(20);
		findElement(FavoritesPage.Deletereview).click();
		System.out.println("Click on delete button");
		Assert.assertEquals(getText(FavoritesPage.Toastermessage), "Deleted successfully");
		
		
	}
	

	public void Delete() throws Exception
	{
		Wait(20);
		findElement(FavoritesPage.Delete).click();
		System.out.println("Click on Delete button");
		
	}
	
}
