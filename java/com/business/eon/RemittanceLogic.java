package com.business.eon;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.BaseLoginPage;
import com.Pages.FavoritesPage;
import com.Pages.RemittancePage;
import com.utility.Utilities;

public class RemittanceLogic extends Utilities{

	
 
public void Remittance() throws Exception
 {
    Thread.sleep(4000);
    findElement(RemittancePage.EONImage).click();
	//verifyElementPresentAndClick(RemittancePage.Remmitance, "Remittance");
	System.out.println("Click on Remmitance");
	Thread.sleep(5000);
	
	
	

}
 
 public void UnionBank() throws Exception
 {
	 
	 Wait(20);
	 verifyElementPresentAndClick(RemittancePage.Unionbank, "Unionbank");
	 System.out.println("Click on union bank");
	 
	 
 }
 
 
 
 
 public void EonAccount() throws Exception
 {
     Thread.sleep(40000);
     //new WebDriverWait(driver, 120).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    // loadingpage(RemittancePage.loading, 120); 
     //verifyElementDisplayed(RemittancePage.loading);
	 //waitForElementAndClickIfPresent(RemittancePage.Eonaccount, 40, "EON Account");
	 verifyElementPresentAndClick(RemittancePage.Eonaccount, "EON Account");
	 System.out.println("Click on Eon account");
	 
 }
 
 public void ownAccount() throws Exception
 {
	 Wait(40);
	 findElement(RemittancePage.OwnAccount).click();
	 System.out.println("Click on OwnAccount Dropdwon");
	 
 }
 
 public void Thridpartyeonaccount() throws Exception
 {
	 
	 Wait(40);
	 findElement(RemittancePage.Thridparty).click();
	 System.out.println("Click on thridparty Account");
	 
	 
 }
 /*public void Eonthridpartyaccountnumber()
 
 {
	 Wait(20);
	 type(RemittancePage.thridpartyAccountnumber,"060001156987","accountnumber");
	 System.out.println("Enter the Account number");
 }
 
 public void EmailAddress()
 {
	 
	 Wait(20);
	 type(RemittancePage.emailaddress, "vasukumar14356@gmail.com", "EmailAddress");
	 System.out.println("Enter the email Address");
 }
 
 public void Phonenumber()
 {
	 
	Wait(20);
	type(RemittancePage.mobilenumber, "9502206807", "mobilenumber");
	System.out.println("Enter the Mobile number");
	 
 }
 
 
 public void message()
 {
	 Wait(20);
	 type(RemittancePage.meassage, "Transfer the Money", "meassage");
	 System.out.println("trasfer the money");
	 
	 
 }
 
 */
 
 public void Accountnumber() throws Exception
 
 {
	 
   Wait(20);
   verifyElementPresentAndClick(RemittancePage.AccountNumber,"Account Number");
   System.out.println("Select the Account");
    
  }
 
 /*public void Amount()
 {
	 
	 Wait(20);
	 type(RemittancePage.Amount, "2", "Amount");
	 System.out.println("Enter the amount");
	 
 }
 
 public void ThridpartyAmount(){
	 
	 Wait(20);
	 type(RemittancePage.thridAmount, "2", "Amount");
	 System.out.println("Enter the amount");
	 
 }
 */
 
 
 
 public void Sourceaccount() throws Exception
 {
	 
	 Wait(20);
	 verifyElementPresentAndClick(RemittancePage.SourceAccount, "Source Account");
	 System.out.println("Click on source ACcount");
 }
 
 public void EonAccounts() throws Exception
 {
	 
	
	 
	/*new WebDriverWait(getDriver(), 120).until(ExpectedConditions.invisibilityOfElementLocated(RemittancePage.Eonaccounts));
	 Wait(30);*/
	 verifyElementPresentAndClick(RemittancePage.Eonaccounts, "EON Account");
	 System.out.println("Click on Eonaccounts");
 }
 
 public void AccountSelected() throws Exception
 {
	 
	 Wait(20);
	 findElement(RemittancePage.AccountSelected).click();
	 //findElement(RemittancePage.AccountSelected).click();
	 System.out.println("Click on Accont");
	 /*click1(RemittancePage.AccountSelected);*/
		 
 }
 
 
 public void pro() throws Exception
 {
	 
	 Thread.sleep(30000);
	 findElement(RemittancePage.pro).click();
	 System.out.println("Click on pro button");
	 
 }
 
 
 
 public void Starter() throws Exception
 {
	 
	
		 Thread.sleep(20000);
		 findElement(RemittancePage.Starter).click();
		 System.out.println("Click on Starter Button");
	 }
	 
	 
	 
 
public void plus() throws Exception
 {
	 Thread.sleep(40000);
	 findElement(RemittancePage.plus).click();
	 System.out.println("Click on Plus");
 }
 
 
 
 public void lite() throws Exception
 {
	 Wait(120);
	 findElement(RemittancePage.lite).click();
	 System.out.println("Click on Lite");
	 
	 
 }
 
 
 public void Back()
 {
	 
	 Wait(20);
	 Back(2);
	 
	 
 }
 
 
 public void Checkout() throws Exception
 {
	 
	 Thread.sleep(15000);
	 verifyElementPresentAndClick(RemittancePage.Checkout,"Checkout");
	 verifyElementPresentAndClick(RemittancePage.Checkout,"Checkout");
	 System.out.println("Click on Checkout Button");
 }
 
 public void reivewDetails() throws Exception
 {
	 Thread.sleep(10000);
	 verifyElementPresent(RemittancePage.ReviewDetalis, "Review Details");
	 System.out.println("check the Detalis");
}
 
 public void paywith() throws Exception
 {
	 
	 Wait(20);
     verifyElementPresent(RemittancePage.Paywith, "Pay With");
     System.out.println("Check  pay with");
	 
 }
 
 
 public void Detalis() throws Exception
 {
	 
	 Wait(20);
	 verifyElementPresent(RemittancePage.Detalis, "Details");
	 System.out.println("detalis page");
	 
 }
 
 
 public void Edit() throws Exception 
 {
	 Wait(20);
	 findElement(RemittancePage.Editwithreviewscreen).click();
	 System.out.println("Click on edit button");
	 
 }
 
 
public void cancel() throws Exception
 {
	 Wait(20);
	 verifyElementPresent(RemittancePage.cancel, "Cancel");
	 System.out.println("Click on cancel button");
	 
 }
 
 
 public void hearicon() throws Exception
 {
	 
	 Wait(20);
	 findElement(FavoritesPage.hearticon).click();
	 System.out.println("Click on Heart icon ");
	 
 }
 
 
 
 public void paynow() throws Exception
 {
	 Wait(20);
	 verifyElementPresentAndClick(RemittancePage.payButton, "Pay Now");
	 System.out.println("Click ok Pay now Button");
	 
 }
 
 public void PaymentComplete() throws Exception
 {
	 
	 Wait(60);
	 verifyElementPresent(RemittancePage.paymentpage, "Payment Complete!");
	 System.out.println("check the Payment Complete!");
     
	 
 }
 
 public void successfulpayment() throws Exception
 {
	 Wait(60);
	 verifyElementPresent(RemittancePage.SuccessfulPayment,"Successful Payment");
	 System.out.println("check the Successful Payment");
	 Wait(30);
	 checkElementNotPresent(BaseLoginPage.unsuccessfulpayments);
	 System.out.println("Check the unsuccessful payment");
	 
 }
 
 
 public void totalpayments() throws Exception
 {
	 
	 Wait(20);
	 verifyElementPresent(RemittancePage.TotalSuccessfulPayments, "Total Successful Payments");
	 System.out.println("Chcek the Total Successful Payments");
 }
 
 
 public void recipet() throws Exception
 {
	 Wait(20);
	 verifyElementPresent(RemittancePage.SaveReceipt, "Save Receipt/s");
	 System.out.println("Check the Save Receipt");
	 
 }
 
 
 public void back() throws Exception
 {
	 
	 Wait(20);
	 verifyElementPresent(RemittancePage.Back, "Back");
	 verifyElementPresentAndClick(RemittancePage.Back, "Back");
	 System.out.println("Click on back button");
 }
 
 public void back1() throws Exception
 {
	 
	 Wait(20);
	 verifyElementPresent(RemittancePage.Back, "Back");
	 verifyElementPresentAndClick(RemittancePage.Back, "Back");
	 System.out.println("Click on back button");
	 Wait(20);
	 verifyElementPresent(RemittancePage.Remmitance, "Remittance");
	 System.out.println("Back to Remaittance");
 }
 
 
  
 
 
 
 
 
 
 
 
 
}