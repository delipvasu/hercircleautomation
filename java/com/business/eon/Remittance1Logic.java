package com.business.eon;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.BaseLoginPage;
import com.Pages.Remittance1Page;
import com.Pages.TopUpPage;
import com.utility.Utilities;

public class Remittance1Logic extends Utilities{

	
 
public void Remittance() throws Exception
 {
    Wait(30);
    //findElement(RemittancePage.EONImage).click();
	verifyElementPresentAndClick(Remittance1Page.Remitt, "Remittance");
	System.out.println("Click on Remmitance");
	
	

}
 
 public void UnionBank() throws Exception
 {
	 
	 Wait(40);
	 verifyElementPresentAndClick(Remittance1Page.Unionbank, "Unionbank");
	 System.out.println("Click on union bank");
	 
	 
 }
 
 
 
 
 public void EonAccount() throws Exception
 {
     Thread.sleep(40000);
     //new WebDriverWait(driver, 120).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    // loadingpage(RemittancePage.loading, 120); 
     //verifyElementDisplayed(RemittancePage.loading);
	 //waitForElementAndClickIfPresent(RemittancePage.Eonaccount, 40, "EON Account");
	 verifyElementPresentAndClick(Remittance1Page.Eonaccount, "EON Account");
	 System.out.println("Click on Eon account");
	 
 }
 
 public void ownAccount() throws Exception
 {
	 Wait(40);
	 findElement(Remittance1Page.OwnAccount).click();
	 System.out.println("Click on OwnAccount Dropdwon");
	 
 }
 
 public void ThridPartyAccount() throws Exception
 {
	 
	 Wait(40);
	 findElement(Remittance1Page.Thridparty).click();
	 System.out.println("Click on thridparty Account");
	 
	 
 }
 /*public void EonLitethridpartyaccountnumber()
 
 {
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001168305","accountnumber");
	 System.out.println("Enter the Eon Lite Account number");
 }
 
public void EonPlusthridpartyaccountnumber()
 
 {
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001155070","accountnumber");
	 System.out.println("Enter the Eon Plus Account number");
 }

public void EonProthridpartyaccountnumber()

{
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001155104","accountnumber");
	 System.out.println("Enter the Pro Account number");
}
 
public void Unionthridpartyaccountnumber()
 
 {
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"109453247817","accountnumber");
	 System.out.println("Enter the Account number");
 }

public void EonStarterthridpartyaccountnumber13()

{
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001156037","accountnumber");
	 System.out.println("Enter the Eon Starter Account number");
}

public void EonLitethridpartyaccountnumber13()

{
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001156987","accountnumber");
	 System.out.println("Enter the Eon Lite Account number");
}

public void EonPlusthridpartyaccountnumber13()

{
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001156003","accountnumber");
	 System.out.println("Enter the Eon Plus Account number");
}

public void EonProthridpartyaccountnumber13()

{
	 Wait(20);
	 type(Remittance1Page.thridpartyAccountnumber,"060001167315","accountnumber");
	 System.out.println("Enter the Pro Account number");
}*/

public void Scrollthepage1() throws InterruptedException

{
     
	Swipe("UP", 1);
	Thread.sleep(3000);
	
}
 
 /*public void EmailAddress() throws InterruptedException
 {
	 
	 Wait(30);
	 type(Remittance1Page.emailaddress, "amit.chaudhary@collabera.com", "EmailAddress");
	 System.out.println("Enter the email Address");
	 Thread.sleep(3000);
 }
 
 public void EmailAddressValidation() throws Exception {
	 Wait(30);
	 type(Remittance1Page.emailaddress, "eon.123collabera", "EmailAddress");
	 System.out.println("Enter wrong e-mail Address");
	 Wait(10);
	 Assert.assertEquals(getText(Remittance1Page.emailaddressVerify), "Please enter a valid e-mail address.");
	 
 }
 */
 public void Phonenumber1() throws Exception
 {
	//Thread.sleep(3000);
	 Wait(30);
	 findElement(Remittance1Page.mobilenumber1).sendKeys("9178017929");
	/*type(RemittancePage.mobilenumber, "9178017929", "mobilenumber");*/
	System.out.println("Enter the Mobile number");
	
 }
 
 public void MobileNumberValidation1() throws Exception {
	    Wait(30);
	 //Thread.sleep(3000);
	    findElement(Remittance1Page.mobilenumber1).sendKeys("9124563");
		/*type(RemittancePage.mobilenumber, "9124563", "mobilenumber");*/
		System.out.println("Enter the wrong Mobile number");
		Wait(10);
		Assert.assertEquals(getText(Remittance1Page.mobilenumberVerify), "Please enter 10 digits mobile number."); 
 }
 
 public void message1() throws Exception
 {
	 Wait(30);
	 findElement(Remittance1Page.message1).sendKeys("Money Transfer");
	 /*type(RemittancePage.meassage, "Transfer the Money", "meassage");*/
	 System.out.println("Money transfer");
	 
	 
 }
 
/* public void Phonenumber() throws Exception
 {
	//Thread.sleep(3000);
	 Wait(30);
	 findElement(RemittancePage.mobilenumber1).sendKeys("9178017929");
	type(Remittance1Page.mobilenumber, "9178017929", "mobilenumber");
	System.out.println("Enter the Mobile number");
	
 }
 
 public void MobileNumberValidation() throws Exception {
	    Wait(30);
	 //Thread.sleep(3000);
	    findElement(RemittancePage.mobilenumber1).sendKeys("9124563");
		type(Remittance1Page.mobilenumber, "9124563", "mobilenumber");
		System.out.println("Enter the wrong Mobile number");
		Wait(10);
		Assert.assertEquals(getText(Remittance1Page.mobilenumberVerify), "Please enter 10 digits mobile number."); 
 }
 
 public void message() throws Exception
 {
	 Wait(30);
	 findElement(RemittancePage.message1).sendKeys("Money Transfer");
	 type(Remittance1Page.message, "Money Transfer", "message");
	 System.out.println("Money transfer");
	 
	 
 }
 */
 public void Accountnumber() throws Exception
 
 {
	 
   Wait(20);
   verifyElementPresentAndClick(Remittance1Page.AccountNumber,"Account Number");
   System.out.println("Select Account");
    
  }
 
 /*public void Amount()
 {
	 Wait(20);
	 type(Remittance1Page.Amount, "1", "Amount");
	 System.out.println("Enter the Amount Value");
	 
 }
 
 public void NegativeAmount() {
	 Wait(20);
	 type(Remittance1Page.Amount, "-1", "Amount");
	 System.out.println("Enter the Negative Amount Value");
 }
 
 public void MaxAmount() {
	 Wait(20);
	 type(Remittance1Page.Amount, "1000002", "Amount");
	 System.out.println("Enter the Maximum Amount Value");
 }
 
 public void MoreDigitAmount() throws Exception {
	 Wait(20);
	 type(Remittance1Page.Amount, "01000002", "Amount");
	 System.out.println("Enter the More Digit Amount Value");
	 
 }
 
 public void Amount1()
 {
	 Wait(20);
	 type(Remittance1Page.Amount1, "1", "Amount");
	 System.out.println("Enter the Amount Value");
	 
 }
 
 public void NegativeAmount1() {
	 Wait(20);
	 type(Remittance1Page.Amount1, "-1", "Amount");
	 System.out.println("Enter the Negative Amount Value");
 }
 
 public void MaxAmount1() {
	 Wait(20);
	 type(Remittance1Page.Amount1, "1000002", "Amount");
	 System.out.println("Enter the Maximum Amount Value");
 }
 
 public void MoreDigitAmount1() throws Exception {
	 Wait(20);
	 type(Remittance1Page.Amount1, "01000002", "Amount");
	 System.out.println("Enter the More Digit Amount Value");
	 
 }
 
 public void ThridpartyAmount(){
	 
	 Wait(20);
	 type(Remittance1Page.thridAmount, "1", "Amount");
	 System.out.println("Enter the amount");
	 
 }*/
 
 public void Sourceaccount() throws Exception{
	 
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.SourceAccount, "Source Account");
	 System.out.println("Click on source ACcount");
 }
 
 public void EonAccounts() throws Exception{
	 //Wait(20);
	 Thread.sleep(10000);
	verifyElementPresentAndClick(Remittance1Page.Eonaccounts, "EON Account");
	 System.out.println("Click on Eonaccounts");
 }
 
 public void AccountSelected() throws Exception{
	 
	 Wait(20);
	 findElement(Remittance1Page.AccountSelected).click();
	 //findElement(RemittancePage.AccountSelected).click();
	 System.out.println("Click on Accont");
	 //click1(RemittancePage.AccountSelected);
		 
 }
 
 public void Back(){
	 Wait(20);
	 Back(2);
	 
	 }
 
 public void Checkout() throws Exception{
	 
	 //Wait(20);
	 Thread.sleep(30000);
	 verifyElementPresentAndClick(Remittance1Page.Checkout,"Checkout");
	 System.out.println("Click on Checkout Button");
 }
 

  public void PayNow1() throws Exception {
	  Wait(20);
	  verifyElementPresentAndClick(Remittance1Page.payButton,"Pay Now");
	  System.out.println("click on Pay now Button");
  }
 
  public void ReviewDetails1() throws Exception {
	  Wait(20);
	  if(verifyIsElementDisplayed(Remittance1Page.ReviewDetalis,"Review Details")) {
		  System.out.println("Review Details page is Displaying");
		  
	  }else {
		  System.out.println("Review Details page is not Displaying"  );
	  }
  }

 public void reivewDetails() throws Exception{
	 Wait(30);
	 verifyElementPresent(Remittance1Page.ReviewDetalis, "Review Details");
	 System.out.println("check the Detalis");
}
 
 public void paywith() throws Exception{
	 
	 Wait(20);
     verifyElementPresent(Remittance1Page.Paywith, "Pay With");
     System.out.println("Check  pay with");
	 
 }
 
 public void Detalis() throws Exception{
	 
	 Wait(20);
	 verifyElementPresent(Remittance1Page.Detalis, "Details");
	 System.out.println("detalis page");
	 
 }
 
 public void cancel() throws Exception{
	 Wait(20);
	 verifyElementPresent(Remittance1Page.cancel, "Cancel");
	 System.out.println("Cancel button is displaying");
	 
 }
 
 public void paynow() throws Exception{
	 //Wait(20);
	 Thread.sleep(30000);
	 verifyElementPresentAndClick(Remittance1Page.payButton, "Pay Now");
	 System.out.println("Click on Pay now Button");
	 
 }
 
 public void PaymentComplete() throws Exception{
	 
	 Wait(60);
	 verifyElementPresent(Remittance1Page.paymentpage, "Payment Complete!");
	 System.out.println("check the Payment Complete!");
     
	 
 }
 
 public void successfulpayment() throws Exception{
	 Wait(20);
	 verifyElementPresent(Remittance1Page.SuccessfulPayment,"Successful Payment");
	 System.out.println("check the Successful Payment");
	 
 }
 
 
 public void totalpayments() throws Exception{
	 
	 Wait(20);
	 System.out.println(getText(Remittance1Page.TotalSuccessfulPayments));
	 verifyElementPresent(Remittance1Page.TotalSuccessfulPayments, "Total Successful Payments");
	 System.out.println("Chcek the Total Successful Payments");
 }
 
 
 public void recipet() throws Exception{
	 Wait(20);
	 verifyElementPresent(Remittance1Page.SaveReceipt, "Save Receipt/s");
	 System.out.println("Check the Save Receipt");
	 
 }
 
 public void back() throws Exception{
	 
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.Back, "Back");
	 System.out.println("Click on back button");
	 
 }
 
 public void  SaveReceipt() throws Exception {
	 Wait(20);
	 verifyIsElementDisplayed(Remittance1Page.SuccessfulPayment,"Successful Payment");
		 System.out.println("Sccessfull payment button displayed");
	 
	 verifyElementPresentAndClick(Remittance1Page.Saverecipet,"Save Receipt/s");
	 System.out.println("click on SaveReceipt Button");
	 
	 Wait(10);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Unable to share receipt");
	 
		 
		}
	 
 
 
	public void Unsucessfull_Payments() throws Exception {
		Wait(20);
		if (verifyElementPresentAndClick(Remittance1Page.unsuccessfulpayments, "1 unsuccessful payments")) {
			System.out.println(" 1 Unsuccessful payment button displayed");
			Back(1);
			System.out.println("click on back button");

		} else {
			System.out.println("Successful payment button is displaying");
		}

	}
 
 public void OtherBanks() throws Exception {
	 Thread.sleep(4000);
	// Wait(40);
	 verifyElementPresentAndClick(Remittance1Page.Otherbank,"Other Banks");
	 System.out.println("click on Other Banks option");
	 
 }
 
 public void TransferUpTo() throws Exception {
	 Wait(20);
	 if(verifyIsElementDisplayed(Remittance1Page.Transferupto,"Transfer up to ₱20,000.00")) {
		 System.out.println("Other bank Transfer page will displayed");
		 
	 } else {
			System.out.println("Other bank Transfer page will not displayed");
		}
	 
 }
 
 public void SelectBanks() throws Exception {
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.selectBank,"Select Bank");
	 System.out.println("click on Select Banks");
	 Thread.sleep(40000);
 }
 
 public void SelectAsiaUniBank() throws Exception {
	 Wait(30);
	 findElement(Remittance1Page.AsiaUnitedBank).click();
	 System.out.println("click on Asia United Banks");
	 
 }
 
 public void SendTo() throws Exception {
	 Wait(20);
	 verifyIsElementDisplayed(Remittance1Page.sendTo,"Send To");
	 System.out.println("Send To is displaying");
	 
 }
 
/* public void InputAccountNumber()
 {
	 
	 Wait(20);
	 type(Remittance1Page.inputAccountNumber, "3590333624", "Input Account Number");
	 System.out.println("Enter the Other Bank Account Number");
	 
 }*/
 
 
 public void ChooseSourceAccount() throws Exception {
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.chooseSourceAccount,"Choose Source Account");
	 System.out.println("click on Choose to source Account");
	 
 }
 
 public void TransferWith() throws Exception {
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.transferWith,"Transfer with");
	 System.out.println("Click on transfer with option");
	 
 }
 
 public void InstaPay() throws Exception {
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.instaPay,"instaPay");
	 System.out.println("Select instaPay Payment Options");
	 
 }
 
 public void PESONET() throws Exception {
	 Wait(20);
	 verifyElementPresentAndClick(Remittance1Page.PESONet,"PESONet");
	 System.out.println("Select PESONet Payment Options");
 }
 
 
 public void SelectEonCyberCard() throws Exception {
	 //Wait(30);
	 Thread.sleep(30000);
	 verifyElementPresentAndClick(Remittance1Page.SelectEonCyberCard,"EON Cyber Card");
	 System.out.println("Select EON Cyber Card payment options from Account List");
 }
 
 public void SelectEonVpLite() throws Exception {
	 //Wait(30);
	 Thread.sleep(30000);
	 verifyElementPresentAndClick(Remittance1Page.SelectEonVpLite,"EON VP Lite");
	 System.out.println("Select EON VP Lite payment options from Account List");
 }
 
 public void SelectEonVpPlus() throws Exception {
	 //Wait(30);
	 Thread.sleep(30000);
	 verifyElementPresentAndClick(Remittance1Page.SelectEonVpPlus,"EON VP Plus");
	 System.out.println("Select EON VP Plus payment options from Account List");
 }
 
 public void SelectEonVpPro() throws Exception {
	 //Wait(30);
	 Thread.sleep(30000);
	 verifyElementPresentAndClick(Remittance1Page.SelectEonVpPro,"EON VP Pro");
	 System.out.println("Select EON VP Pro payment options from Account List");
 }
 
 public void SelectEonVpStarter() throws Exception {
	 Thread.sleep(30000);
	 //Wait(30);
	 verifyElementPresentAndClick(Remittance1Page.SelectEonVpStarter,"EON VP Starter");
	 System.out.println("Select EON VP Starter payment options from Account List");
 }
 
 public void SelectOtherMasterCard() throws Exception {
	 Wait(30);
	 findElement(Remittance1Page.OtherMasterCard).click();
	 System.out.println("Select other bank Payment option");
 }
 
 public void SelectOtharBankCardPayment() throws Exception {
	 Wait(30);
	 verifyElementPresentAndClick(Remittance1Page.SelectOtherBank,"BPI Direct BanKo");
	 System.out.println("Click on other bank card payments");
 }
 
 public void AmountValidation() throws Exception {
	 Wait(20);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Cannot enter negative amount!");
	 Wait(10);
	 findElement(Remittance1Page.Amount).clear();
	 System.out.println("Clear the Amount text field");
 }
 
 public void MaxAmountValidation() throws Exception {
	 Wait(20);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max amount to transfer is 1,000,000.00!");
	 Wait(10);
	 findElement(Remittance1Page.Amount).clear();
	 System.out.println("Clear the Amount text field");
 }
 
 public void EnterMoreDigitAmountValidation() throws Exception {
	 Wait(20);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Cannot enter more than 7 digits!");
	 Wait(10);
	 findElement(Remittance1Page.Amount).clear();
	 System.out.println("Clear the Amount text field");
 }
 
 public void AmountValidation1() throws Exception {
	 Wait(20);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Cannot enter negative amount!");
	 Wait(10);
	 findElement(Remittance1Page.Amount1).clear();
	 System.out.println("Clear the Amount text field");
 }
 
 public void MaxAmountValidation1() throws Exception {
	 Wait(20);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Max amount to transfer is 1,000,000.00!");
	 Wait(10);
	 findElement(Remittance1Page.Amount1).clear();
	 System.out.println("Clear the Amount text field");
 }
 
 public void EnterMoreDigitAmountValidation1() throws Exception {
	 Wait(20);
	 Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Cannot enter more than 7 digits!");
	 Wait(10);
	 findElement(Remittance1Page.Amount1).clear();
	 System.out.println("Clear the Amount text field");
 }
 
 public void Change_PayWith() throws Exception {
	 Wait(30);
	 verifyElementPresentAndClick(Remittance1Page.changePayWith,"EONImages.keyboard_arrow_down24px_gray");
	 System.out.println("Click on Change PayWith edit option");
	 
 }
 
 
 
 
 
 

}