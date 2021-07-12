package com.business.eon;




import java.util.ResourceBundle;

import org.testng.Assert;

import com.Pages.BaseLoginPage;
import com.Pages.Remittance1Page;
import com.Pages.TopUpPage;
import com.utility.Utilities;

public class TopUpLogic extends Utilities {
	
	
	public void EasyTrip() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.easyTrip).click();
		System.out.println("Click on EasyTrip");
		Thread.sleep(10000);
		
	}
	
	public void TopUps_Any_EasyTrip() throws Exception {
		Wait(20);
		verifyElementPresentAndClick(TopUpPage.Any, "Any");
		Thread.sleep(2000);
		verifyElementPresentAndClick(TopUpPage.Any, "Any");
		System.out.println("Select Any");
		Thread.sleep(10000);
	}
	 public void Payor_Name_EasyTrip(ResourceBundle rb) throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.payorName, "name", "Payor's Name",rb);
		System.out.println("Enter the Payor Name");
		
	 }
	 public void Account_Number1_EasyTrip(ResourceBundle rb) throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.easyTripAcctNum, "EasytripAccount", "Account Number",rb);
		System.out.println("Enter the Account Number");
		
	 }
	 public void Selected_Item() throws Exception
	 {
	    //Wait(20);
	    Thread.sleep(10000);
	    verifyElementPresentAndClick(TopUpPage.SelectedItemArrow, "EONImages.keyboard_arrow_down24px");
		System.out.println("Click on Selected Item arrow Icon");
		
		}
	 public void Min_Amount_Validation(ResourceBundle rb) throws Exception {
		 Wait(20);
		 findElement(TopUpPage.amount).clear();
		 Wait(5);
		 type(TopUpPage.amount, "Minamount", "Amount",rb);
		 System.out.println("Enter the Min Amount Value");
		 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Mininum amount is: 100");
		 Thread.sleep(2000);
		 //Wait(10);
		 findElement(TopUpPage.amount).clear();
		 System.out.println("Clear the Amount text field");
	 }
	 
	 public void Max_Amount_Validation(ResourceBundle rb) throws Exception
	 {
		 Wait(20);
		 type(TopUpPage.amount, "maxamount", "Amount",rb);
		 System.out.println("Enter the Max Amount Value");
		 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Maximum amount is: 10000");
		 Thread.sleep(2000);
		 //Wait(10);
		 findElement(TopUpPage.amount).clear();
		 System.out.println("Clear the Amount text field");
		 
	 }
	 
 public void EasyTrip_Amount(ResourceBundle rb){
		 
		 Wait(20);
		 type(TopUpPage.amount, "EasyTripAmount", "Amount",rb);
		 System.out.println("Enter the Amount Value");
		 
	 }
 public void legends() throws Exception
	{
		Wait(30);
		findElement(TopUpPage.legends).click();
		System.out.println("Click on legends");
		Thread.sleep(10000);
		
	}
 
 public void Beep_Card_Number1(ResourceBundle rb) throws Exception
 {
	 
	Wait(30);
	type(TopUpPage.cardNumber, "Beepload", "Card Number",rb);
	System.out.println("Enter the Card Number");
	
 }
 
 public void TopUps_Beep_Load_500() throws Exception {
		Wait(20);
		verifyElementPresentAndClick(TopUpPage.beepLoad500, "Beep Load 500");
		System.out.println("Select Beep Load 500");
	}
 
 public void calldutyReceiptmobile(ResourceBundle rb) throws Exception
 {
	 
	Wait(30);
	type(TopUpPage.autoSweepSOAcctnum, "Mobilenumbers", "Mobilenumber",rb);
	System.out.println("Enter the Account Number");
	
 }
 
 public void Emailaddress(ResourceBundle rb) throws Exception
 {
	 
	Wait(30);
	type(TopUpPage.autoSweepPlateNum, "EmailAddress", "Plate Number",rb);
	System.out.println("Enter the Plate Number");
	
 }
 
 
 public void Recipientname(ResourceBundle rb)
 {
	 
	 Wait(20);
	 type(TopUpPage.RecipientName, "Name", "Name", rb);
	 System.out.println("Enter the Reciptname");
 }
 
 public void TopUps_garenashells() throws Exception {
		Wait(20);
		verifyElementPresentAndClick(TopUpPage.garenashells, "Autosweep RFID PhP 3000");
	    System.out.println("Select Autosweep RFID PhP 3000");
	}
 
 public void Callduty() throws Exception
	{
		Wait(30);
		findElement(TopUpPage.callduty).click();
		System.out.println("Click on call duty");
		
		
	}
	
	 
	/*public void TopUps() throws Exception
	 {
	    //Wait(20);
	    verifyElementPresentAndClick(TopUpPage.TopUps, "Top Ups");
		System.out.println("Click on Top Ups");
		Thread.sleep(5000);
		
		}
	
	public void TopUps_Search() throws Exception {
		Wait(20);
		verifyElementPresentAndClick(TopUpPage.search, "SearchPayBills");
		System.out.println("Click on Search Icon");
	}
	
	public void SkyCable() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.skycable).click();
		System.out.println("Click on skyCable");
		Thread.sleep(10000);
		
	}
	
	public void Cignal() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.cignal).click();
		System.out.println("Click on cignal");
		Thread.sleep(10000);
		
	}
	
	public void Allserve() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.allServe).click();
		System.out.println("Click on Allserve");
		Thread.sleep(10000);
		
	}
	
	public void Audition() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.audition).click();
		System.out.println("Click on Audition");
		Thread.sleep(10000);
		
	}
	
	public void Cabal() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.cabal).click();
		System.out.println("Click on Cabal");
		Thread.sleep(10000);
		
	}
	
	public void Call_Of_Duty() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.callOffDuty).click();
		System.out.println("Click on Call Of Duty");
		Thread.sleep(10000);
		
	}
	
	public void Counter_Strike() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.conterStrike).click();
		System.out.println("Click on Conter Strike");
		Thread.sleep(10000);
		
	}
	
	public void Cross_Fire() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.crossFire).click();
		System.out.println("Click on Cross Fire");
		Thread.sleep(10000);
		
	}
	
	public void Dota() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.dota).click();
		System.out.println("Click on DOTA-2");
		Thread.sleep(10000);
		
	}
	
	public void DragonNest() throws Exception
	{
		Wait(20);
		findElement(TopUpPage.dragonNest).click();
		System.out.println("Click on DragonNest");
		Thread.sleep(10000);
		
	}
	
	
	
	
	
	
	public void GameTime() throws Exception
	{
		Wait(30);
		findElement(TopUpPage.gameTime).click();
		System.out.println("Click on GameTime");
		Thread.sleep(10000);
		
	}
	
	public void Recipient_Mobile_Num() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.Mobile, "09178017929", "Recipient Mobile No.");
		System.out.println("Enter the Recipient Mobile No.");
		
	 }
	 
	 public void Recipient_Mobile_Num_Format() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.RecipientMobNo, "639178017929", "Recipient Mobile No.");
		System.out.println("Enter the Recipient Mobile No. with format add prefix 63");
		
	 }
	 
	
	 public void Beep_Card_Number2() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.cardNumber, "6378050041626627", "Card Number");
		System.out.println("Enter the Card Number");
		
	 }
	 
	
	 
	 
	 public void Account_Number2_EasyTrip() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.easyTripAcctNum, "520001035100", "Account Number");
		System.out.println("Enter the Account Number");
		
	 }
	 
	 public void Account_Number3_EasyTrip() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.easyTripAcctNum, "520000107691", "Account Number");
		System.out.println("Enter the Account Number");
		
	 }
	 
	
	 
	 public void Plate_Number_AutoSweep() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.autoSweepPlateNum, "UBNK01", "Plate Number");
		System.out.println("Enter the Plate Number");
		
	 }
	 
	 public void Account_Number_GameTime() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.gameTimeAcctNum, "10000617", "Account Number");
		System.out.println("Enter the Account Number");
		
	 }
	 
	 public void Recipient_Email() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.RecipientEmail, "amit.chaudhary@collabera.com", "Recipient Email Address");
		System.out.println("Enter the Recipient Email Address");
		
	 }
	 
	 public void Recipient_Name() throws Exception
	 {
		 
		Wait(30);
		type(TopUpPage.RecipientName, "Jom", "Recipient Name");
		System.out.println("Enter the Recipient Name");
		
	 }
	 
	
	 public void Pay_With() throws Exception
	 {
	    //Wait(20);
	    Thread.sleep(10000);
	    verifyElementPresentAndClick(TopUpPage.Paywith, "Pay with");
		System.out.println("Click on Pay with option");
		
		}
	 
	 public void TopUps_SkyCable_150() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.SkyCable150, "Sky Cable 150");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.SkyCable150, "Sky Cable 150");
			System.out.println("Select Sky Cable 150");
		}
	 
	 public void TopUps_SkyCable_99() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.SkyCable99, "Sky Cable 99");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.SkyCable99, "Sky Cable 99");
			System.out.println("Select Sky Cable 99");
		}
	 
	 public void TopUps_SkyCable_250() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.SkyCable250, "Sky Cable 250");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.SkyCable250, "Sky Cable 250");
			System.out.println("Select Sky Cable 250");
		}
	 
	 public void TopUps_SkyCable_450() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.SkyCable450, "Sky Cable 450");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.SkyCable450, "Sky Cable 450");
			System.out.println("Select Sky Cable 450");
		}
	 
	 public void TopUps_Cignal_HD175() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Hd175, "HD175");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Hd175, "HD175");
			System.out.println("Select HD175");
		}
	 
	 public void TopUps_Cignal_HD300() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Hd300, "HD300");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Hd300, "HD300");
			System.out.println("Select HD300");
		}
	 
	 public void TopUps_Cignal_HD200() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Hd200, "HD200");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Hd200, "HD200");
			System.out.println("Select HD200");
		}
	 
	 public void TopUps_Cignal_START250() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Start250, "START250");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Start250, "START250");
			System.out.println("Select START250");
		}
	 
	 public void TopUps_Allserve_20() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Allserve20, "ALLSERVE20");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Allserve20, "ALLSERVE20");
			System.out.println("Select ALLSERVE20");
		}
	 
	 public void TopUps_Allserve_50() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Allserve50, "ALLSERVE50");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Allserve50, "ALLSERVE50");
			System.out.println("Select ALLSERVE50");
		}
	 
	 public void TopUps_Allserve_100() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Allserve100, "ALLSERVE100");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Allserve100, "ALLSERVE100");
			System.out.println("Select ALLSERVE100");
		}
	 
	 public void TopUps_Allserve_300() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Allserve300, "ALLSERVE300");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Allserve300, "ALLSERVE300");
			System.out.println("Select ALLSERVE300");
		}
	
	 public void TopUps_Audition_Playpark20() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Playpark20, "PLAYPARK20");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Playpark20, "PLAYPARK20");
			System.out.println("Select PLAYPARK20");
		}
	 
	 public void TopUps_Audition_Playpark50() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Playpark50, "PLAYPARK50");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Playpark50, "PLAYPARK50");
			System.out.println("Select PLAYPARK50");
		}
	 
	 public void TopUps_Audition_Playpark75() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Playpark75, "PLAYPARK75");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Playpark75, "PLAYPARK75");
			System.out.println("Select PLAYPARK75");
		}
	 
	 public void TopUps_Audition_Playpark100() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.Playpark100, "PLAYPARK100");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.Playpark100, "PLAYPARK100");
			System.out.println("Select PLAYPARK100");
		}
	 
	 public void TopUps_CallOf_Duty_GarenaShells20() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.garenaShells20, "Garena Shells 20");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.garenaShells20, "Garena Shells 20");
			System.out.println("Select Garena Shells 20");
		}
	 
	 public void TopUps_CallOf_Duty_GarenaShells50() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.garenaShells50, "Garena Shells 50");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.garenaShells50, "Garena Shells 50");
			System.out.println("Select Garena Shells 50");
		}
	 
	 public void TopUps_CallOf_Duty_GarenaShells100() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.garenaShells100, "Garena Shells 100");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.garenaShells100, "Garena Shells 100");
			System.out.println("Select Garena Shells 100");
		}
	 
	 public void TopUps_CallOf_Duty_GarenaShells200() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.garenaShells200, "Garena Shells 200");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.garenaShells200, "Garena Shells 200");
			System.out.println("Select Garena Shells 200");
		}
	 
	 public void TopUps_Counter_Strike_Steam50() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.steam50, "Steam 50");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.steam50, "Steam 50");
			System.out.println("Select Steam 50");
		}
	
	 public void TopUps_Counter_Strike_Steam100() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.steam100, "Steam 100");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.steam100, "Steam 100");
			System.out.println("Select Steam 100");
		}
	 
	 public void TopUps_Counter_Strike_Steam250() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.steam250, "Steam 250");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.steam250, "Steam 250");
			System.out.println("Select Steam 250");
		}
	 
	 public void TopUps_Counter_Strike_Steam500() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.steam500, "Steam 500");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.steam500, "Steam 500");
			System.out.println("Select Steam 500");
		}
	 
	 public void TopUps_Cross_Fire_Ecoin20() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.ecoin20, "ECOINS20");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.ecoin20, "ECOINS20");
			System.out.println("Select ECOINS20");
		}
	 
	 public void TopUps_Cross_Fire_Ecoin50() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.ecoin50, "ECOINS50");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.ecoin50, "ECOINS50");
			System.out.println("Select ECOINS50");
		}
	 
	 public void TopUps_Cross_Fire_Ecoin100() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.ecoin100, "ECOINS100");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.ecoin100, "ECOINS100");
			System.out.println("Select ECOINS100");
		}
	 
	 public void TopUps_Cross_Fire_Ecoin200() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.ecoin200, "ECOINS200");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.ecoin200, "ECOINS200");
			System.out.println("Select ECOINS200");
		}
	 
	 public void TopUps_DragonNest_2900CC() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.CC2900, "2900 CC");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.CC2900, "2900 CC");
			System.out.println("Select 2900 CC");
		}
	
	 public void TopUps_DragonNest_10000CC() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.CC10000, "10000 CC");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.CC10000, "10000 CC");
			System.out.println("Select 10000 CC");
		}
	
	 public void TopUps_DragonNest_30000CC() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.CC30000, "30000 CC");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.CC30000, "30000 CC");
			System.out.println("Select 30000 CC");
		}
	
	 public void Scroll_TopUps_Page() {
	      
	 	Swipe("UP", 3);
	 	System.out.println("Scroll the page in up Direction");
	 }
	
	 public void TopUps_Beep_Load_200() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.beepLoad200, "Beep Load 200");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.beepLoad200, "Beep Load 200");
			System.out.println("Select Beep Load 200");
		}
	 
	
	
	 
	 
	
	 
	
	 
	 
	 
	 public void TopUps_AutoSweep_RFID_PHP200() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.autoSweepRFIDp200, "Autosweep RFID PhP 200");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.autoSweepRFIDp200, "Autosweep RFID PhP 200");
			System.out.println("Select Autosweep RFID PhP 200");
		}
	 
	 public void TopUps_AutoSweep_RFID_PHP500() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.autoSweepRFIDp500, "Autosweep RFID PhP 500");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.autoSweepRFIDp500, "Autosweep RFID PhP 500");
			System.out.println("Select Autosweep RFID PhP 500");
		}
	 
	 public void TopUps_AutoSweep_RFID_PHP1000() throws Exception {
			Wait(20);
			verifyElementPresentAndClick(TopUpPage.autoSweepRFIDp1000, "Autosweep RFID PhP 1000");
			Thread.sleep(2000);
			verifyElementPresentAndClick(TopUpPage.autoSweepRFIDp1000, "Autosweep RFID PhP 1000");
			System.out.println("Select Autosweep RFID PhP 1000");
		}
	 
	
	 
	 public void HeartIcon() throws Exception {
		 
		 Wait(20);
		 verifyElementPresentAndClick(TopUpPage.hearticon,"b6-l1-0-b3-Placeholder1");
		 System.out.println("Click on Heart Icon");
	 }
	 
	 public void Manage() throws Exception {
		 
		 Wait(20);
		 verifyElementPresentAndClick(TopUpPage.manage,"Manage");
		 System.out.println("Click on Manage button");
	 }
	 
	 public void Manage_Options() throws Exception {
		 
	     Wait(20);
	     findElement(TopUpPage.manageOptions).click();
	     System.out.println("Click on three dot horizontal icon");
	     
	 }
	 
	 public void Manage_Delete() throws Exception {
		 
		 Wait(20);
		 verifyElementPresentAndClick(TopUpPage.managedelete,"Delete");
		 System.out.println("Click on Delete Option");
	 }
	 
	 public void Manage_Delete_RedIcon() throws Exception {
		 
		 Wait(20);
		 verifyElementPresentAndClick(TopUpPage.managedeleteicon,"EON_WB_Favorites.Path671");
		 System.out.println("Click on Delete Favourite Name");
	 }
	 
	 public void Favourite_Delete_Validation() throws Exception
	 {
	    //Wait(10);
		 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Deleted successfully");
	     System.out.println("checking Favourite Delete validation");
	    
	    }
	 
	 
	  public void Save() throws Exception {
		  
	     Wait(20);
	     findElement(TopUpPage.Save).click();
	     System.out.println("Click on Save Button");
	     //Wait(10);
	     Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Updated successfully");
	     System.out.println("checking Update validation");
	     }
	 
	 public void Review_Edit_Icon() throws Exception {
		 
	     Wait(20);
	     findElement(TopUpPage.Editwithreviewscreen).click();
	     System.out.println("Click on edit button");
	    
	 }
	 
	 public void Review_Delete_Icon() throws Exception {
	    
	     Wait(20);
	     findElement(TopUpPage.Deletereview).click();
	     System.out.println("Click on Delete Icon");
	     Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Deleted successfully");
	     System.out.println("checking Delete validation");
	    
	    }
	 
public void Favourite_Name() {
		 
		 Wait(20);
		 type(TopUpPage.favouritesName, "EonProAccount", "InputNickName");
		 System.out.println("Enter the Favourite Name");
		 
	 }

public void Add_Favourite() throws Exception {
	
	 Wait(20);
	 verifyElementPresentAndClick(TopUpPage.addFavourite,"Add to favorites");
	 System.out.println("Click on Add to favorites button");
	 //Wait(10);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Favorite Saved!");
     System.out.println("checking Favorite save validation");
	 
}

public void Beep_Edit_Validation() throws Exception {
	
	 Wait(20);
	 findElement(TopUpPage.beepEditCardNumber).clear();
	 Wait(5);
	 type(TopUpPage.beepEditCardNumber, "35-.", "CardNumber");
	 System.out.println("Enter the the card number with special character");
	 Wait(20);
	 findElement(TopUpPage.Save).click();
	 //Wait(10);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Please Check Invalid Fields.");
	 System.out.println("checking fields validation");
	 Thread.sleep(2000);
	 //Wait(10);
	 findElement(TopUpPage.beepEditCardNumber).clear();
	 System.out.println("Clear the Card Number field");
	 Wait(5);
	 type(TopUpPage.beepEditCardNumber, "6378059900482510", "CardNumber");
	 System.out.println("Enter the card number");
	 
}


	 */
	 
	 
}
