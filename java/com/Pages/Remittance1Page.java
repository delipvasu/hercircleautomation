package com.Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class Remittance1Page {

	
	public static By EONImage=By.xpath("//android.view.View[@text='EONImages.Asset21']");
	
	public static By Remitt=By.xpath("//android.view.View[@resource-id='$b15']");
	
	public static By Eonaccount=By.xpath("//android.view.View[@text='EON Account']");
	
	public static By Unionbank=By.xpath("//android.view.View[@text='Unionbank']");
	
	public static By Otherbank=By.xpath("//android.view.View[@text='Other Banks']");
	
	public static By RemittanceCenter=By.xpath("//android.view.View[@text='Remittance Center']");
	
	//public static By OwnAccount=By.xpath("(//android.view.View[@text='EONImages.radio_button_unchecked24px'])[1]");
	public static By OwnAccount=By.xpath("//android.view.View[@resource-id='b4-b2-Column1']");
	//public static By Thridparty=By.xpath("(//android.view.View[@text='EONImages.radio_button_unchecked24px'])[2]");
	public static By Thridparty=By.xpath("//android.view.View[@resource-id='b4-b3-Column1']");
	//public static By AccountNumber=By.xpath("//android.view.View[@text='Account Number']");
	public static By AccountNumber=By.xpath("//android.widget.TextView[@text='Account Number']");
	//public static By Amount=By.xpath("//android.widget.EditText[@index='0']");
	public static By Amount=By.xpath("//android.widget.EditText[@resource-id='b4-b8-Input_Amount']");
	public static By Amount1=By.xpath("//android.widget.EditText[@resource-id='b4-b5-Input_Amount']");
	
	public static By ThridpartyAmount=By.xpath("//android.widget.EditText[@index='1']");
	
	//public static By SourceAccount=By.xpath("//android.view.View[@text='Source Account']");
	public static By SourceAccount=By.xpath("//android.view.View[@resource-id='b4-$b11']");
	public static By Eonaccounts=By.xpath("//android.view.View[@text='EON Account']");
	
    public static By AccountSelected=By.id("b3-l1-0-$b1");
   
	public static By loading=By.id("$b9");
   //public static By AccountSelected=By.xpath("//android.view.View[@id='EONDetails']/*/*/*");
	
	public static By Checkout=By.xpath("//android.widget.Button[@text='Checkout']");

	public static By ReviewDetalis=By.xpath("//android.view.View[@text='Review Details']");
	
	public static By payButton=By.xpath("//android.widget.Button[@text='Pay Now']");
	
	public static By cancel=By.xpath("//android.widget.Button[@text='Cancel']");
	
	public static By paymentpage=By.xpath("//android.view.View[@text='Payment Complete!']");
	
	public static By SuccessfulPayment=By.xpath("//android.view.View[@text='Successful Payment']");
	
	public static By unsuccessfulpayments=By.xpath("//android.widget.Button[@text='1 unsuccessful payments']");
	
	public static By Saverecipet=By.xpath("//android.widget.Button[@text='Save Receipt/s']");
	
	//public static By thridpartyAccountnumber=By.xpath("(//android.widget.EditText[@index='0'])[1]");
	public static By thridpartyAccountnumber=By.xpath("//android.widget.EditText[@resource-id='b4-b7-Input_CreditsAccountNumberTst']");
	
	public static By thridAmount=By.xpath("(//android.widget.EditText[@index='0'])[2]");
	
	public static By SourceAmount=By.xpath("//android.view.View[@text='Source Account']");
	
	//public static By emailaddress=By.xpath("(//android.widget.EditText[@index='0'])[3]");
	public static By emailaddress=By.xpath("//android.widget.EditText[@resource-id='b4-Input_Email']");
	//public static By mobilenumber=By.xpath("//android.view.View[@text='Mobile Number']");
	//public static By mobilenumber=By.xpath("(//android.widget.EditText[@resource-id='b4-b13-Input_MobileNumber']");
	public static By mobilenumber1=By.xpath("(//android.widget.EditText[@index='0'])[4]");
	public static By message1=By.xpath("//android.widget.EditText[@resource-id='b4-Input_Message']");
	public static By message=By.xpath("//android.widget.EditText[@resource-id='b4-Input_Message2']");
	public static By mobilenumber=By.xpath("(//android.widget.EditText[@index='0'])[5]");
	public static By emailaddressVerify=By.xpath("(//android.widget.TextView[@text='Please enter a valid e-mail address.'])");
	
	public static By mobilenumberVerify=By.xpath("(//android.widget.TextView[@text='Please enter 10 digits mobile number.'])");
	
	public static By ThirdCheckout=By.xpath("//android.widget.Button[@text='Checkout']");
	

	//Amit

	public static By EonImages=By.xpath("//android.widget.Image[@text='EONImages.otherbank']");
	
	public static By Paywith=By.xpath("//android.view.View[@text='Pay With']");
	
	public static By Detalis=By.xpath("//android.view.View[@text='Details']");
	
	public static By Total=By.xpath("//android.view.View[@text='Total']");
	
	public static By totalamount=By.id("//b8-Content");
	
	public static By SaveReceipt=By.xpath("//android.widget.Button[@text='Save Receipt/s']");
	
	public static By Back=By.xpath("//android.widget.Button[@text='Back']");
	
	//public static By TotalSuccessfulPayments=By.xpath("//android.view.View[@text='Total Successful Payments']");
	public static By TotalSuccessfulPayments=By.xpath("//android.view.View[@resource-id='b1-Bottom']");
	
	
	

	
	public static By ToOtherbank=By.xpath("//android.view.View[@text='To other banks']");
	
	public static By Transferupto=By.xpath("//android.view.View[@text='Transfer up to ₱20,000.00 this is a short description\r\n" + 
			"']");
	
	public static By sendTo=By.xpath("//android.view.View[@text='Send To']");
	
	public static By selectBank=By.xpath("//android.view.View[@text='Select Bank']");
	
	public static By inputAccountNumber=By.xpath("//android.widget.EditText[@resource-id='b4-b4-Input_CreditsAccountNumber']");
	
	public static By chooseSourceAccount=By.xpath("//android.view.View[@text='Choose Source Account']");
	
	public static By transferWith=By.xpath("//android.view.View[@text='Transfer with']");
	
	public static By AsiaUnitedBank=By.xpath("//*[@text='Asia United Bank']");
	
	//public static By instaPay=By.xpath("//android.view.View[@resource-id='b4-b11-Placeholder3']");
	public static By instaPay=By.xpath("//android.widget.Image[@text='EONImages.instapay']");
	
	//public static By PESONet=By.xpath("//android.view.View[@resource-id='b4-b12-Placeholder7']");
	public static By PESONet=By.xpath("//android.widget.Image[@text='EONImages.PesoNet']");
	
	public static By PESONetTerm=By.xpath("//android.view.View[@text='Money sent before 3PM will be received by the recipient on or before 10PM. free of charge.']");
	
	public static By instaPayTerms=By.xpath("//android.view.View[@text='Money will be received by the recipient instantly! Send up to Php 50,000 free of charge. Currently available for selected banks(if this option is disabled, then your recipient's bank is not enrolled in INSTAPAY).']");
	
	
	public static By SelectEonCyberCard=By.xpath("//android.view.View[@text='EON Cyber Card']");
	
	public static By SelectEonVpLite=By.xpath("//android.view.View[@text='EON VP Lite']");
	
	public static By SelectEonVpPlus=By.xpath("//android.view.View[@text='EON VP Plus']");
	
	public static By SelectEonVpPro=By.xpath("//android.view.View[@text='EON VP Pro']");
	
	public static By SelectEonVpStarter=By.xpath("//android.view.View[@text='EON VP Starter']");
	
	public static By OtherMasterCard=By.xpath("//android.view.View[@resource-id='b5-cardHeader']");
	
	public static By SelectOtherBank=By.xpath("//android.view.View[@text='BPI Direct BanKo']");
	
	public static By SelectOtherBankCard=By.xpath("//android.view.View[@text='**** **** **** 2256']");
	
	public static By SearchOtherBank=By.xpath("//android.widget.EditText[@text='Input_SearchBankName']");
	
	public static By changePayWith=By.xpath("//android.widget.Image[@text='EONImages.keyboard_arrow_down24px_gray']");
    

	
}
