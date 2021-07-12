
package com.Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class BaseLoginPage {

//		Login / Register ::
//	LOGO 
	public static By objLOGOIcon = By.xpath("//*[@id='z5LoginLogoImageView']");
	
	public static By pictures=By.id("com.android.packageinstaller:id/permission_allow_button");
	
	public static By location=By.id("com.android.packageinstaller:id/permission_allow_button");
	
	public static By username=By.xpath("//android.widget.EditText[@resource-id='Input_TextVar']");
	
	public static By ShowAll=By.xpath("//android.widget.Button[@text='SHOW All']");
	public static By password=By.xpath("//android.widget.EditText[@resource-id='Input_TextVar2']");
	
	public static By Otp=By.xpath("//android.view.View[@index='1']/android.view.View[@resource-id='b1-$b2']");
	
	public static By Login=By.xpath("//android.widget.Button[@text='LOGIN']");
	public static By timeout=By.xpath("//*[@text='The connection has timed out']");
	
	public static By Logo=By.xpath("//android.widget.Image[@text='EONImages.EON_positive']");
	
	public static By seeallaccount=By.id("b3-l1-0-b1-Column1");
	
	
	public static By OtpField1=By.xpath("//android.view.View[@resource-id='b1-b2-Column1']/*[@index='0']");
    public static By OtpField2=By.xpath("//android.view.View[@resource-id='b1-b2-Column2']/*[@index='0']");
    public static By OtpField3=By.xpath("//android.view.View[@resource-id='b1-b2-Column3']/*[@index='0']");
    public static By OtpField4=By.xpath("//android.view.View[@resource-id='b1-b2-Column4']/*[@index='0']");
    public static By OtpField5=By.xpath("//android.view.View[@resource-id='b1-b2-Column5']/*[@index='0']");
    public static By OtpField6=By.xpath("//android.view.View[@resource-id='b1-b2-Column6']/*[@index='0']");
	
	public static By notification1=By.xpath("//*[@id='b2-rightAction1']/*[@index='0']");
	
	public static By cart=By.xpath("//android.view.View[@text='EONImages.shopping_cart24px2']");
	
	public static By seeting=By.xpath("//android.view.View[@text='EONImages.settings24px2']");
	
	public static By upgrade=By.xpath("//android.widget.Button[@text='UPGRADE']");
	
	public static By avalibleAmount=By.xpath("//android.view.View[@id='b7-AvailableBalanceAmount']");

	
	public static By currentbalamount=By.xpath("//android.view.View[@id='b7-CurrentBalanceAmount']");
	
	public static By avaliblebalance=By.xpath("//android.view.View[@text='Available Balance']");
	
	public static By cuurentbalance=By.xpath("//android.view.View[@text='Current Balance']");
	
	public static By Accountdetalis=By.xpath("//android.view.View[@text='Account Details']");
	
	public static By Showall=By.xpath("//android.view.View[@text='Show all']");
	
	public static By doublearrow=By.xpath("//android.widget.Image[@text='EONImages.double_arrowblack48dp3']");
	
	public static By mostpopular=By.xpath("//android.view.View[@text='Most Popular']");
	
	//EONImages.EON_positive
	public static By homepageArrow=By.xpath("//*[@text='EONImages.arrow_up']");
	
	//EONImages.arrow_up
	
    public static By notification=By.xpath("//android.view.View[@text='13']");
    public static By notificationPage=By.xpath("//android.view.View[@resource-id='b2-HeaderText']");

	public static By  Tops=By.xpath("//android.view.View[@text='Top Ups']");
	
	public static By Remmitance=By.xpath("//android.view.View[@text='Remmitance']");
	
	public static By BuyLoad=By.xpath("//android.view.View[@text='Buy Load']");
	
	public static By PayBills=By.xpath("//android.view.View[@text='Pay Bills']");
	
	public static By AddFunds=By.xpath("//android.view.View[@text='Add Funds']");
	
	public static By Insurance=By.xpath("//android.view.View[@text='Insurance']");
	
	public static By AddAccount=By.xpath("//*[@text='Add Account']");

   public static By linkOtherCard=By.xpath("//android.view.View[@text='Link your other Mastercard or Visa card']");
	public static By storevalueard=By.xpath("//android.view.View[@text='Store Value Card']");
	
    //public static By linkOtherCard=By.xpath("//android.view.View[@text='Link your other Mastercard or Visa card Use your existing Mastercard or Visa debit or prepaid card to get log-in access to the EON Bank PH app and website. *Open to all VISA/Mastercard issuing banks']");

    public static By bankIssuer=By.xpath("//android.view.View[@text='Bank Issuer']");
    public static By inputCardNumber=By.xpath("//android.widget.EditText[@resource-id='InputCardNumber']");
    public static By expiryDate=By.xpath("//android.widget.EditText[@resource-id='Input_ExpiryDate']");
    public static By cvv=By.xpath("//android.widget.EditText[@resource-id='InputCVV']");
    public static By Continue=By.xpath("//android.widget.Button[@text='Continue']");
    public static By AsiaUB=By.xpath("//android.widget.CheckedTextView[@text='Asia United Bank']");


	
	public static By openvirtualAccount=By.xpath("//android.widget.Button[@text='OPEN AN EON VIRTUAL ACCOUNT']");
	
	//Open a Virtual EON Account Get one instantly with only an ID and a selfie.
	
	public static By scrollArrow=By.xpath("//android.view.View[@text='For a detailed Terms of Use, expand this']");
    
	public static By Registration=By.xpath("//*[@text='Registration']");
	
	public static By AcceptandContinue=By.xpath("//android.widget.Button[@text='ACCEPT & CONTINUE']");
	
	
	
	public static By AGREE=By.xpath("//android.widget.Button[@text='AGREE']");
	public static By Toastermessage=By.xpath("//android.widget.Toast[1]");
	public static By Toastermessage1=By.xpath("//android.widget.Toast[@text='Successfully added a new ‘Virtual EON Account’']");
	public static By PrepaidToastermessage=By.xpath("//android.widget.Toast[@text='Card Added']"); 
	public static By PrepaidToaster=By.xpath("//android.widget.Toast[@text='Prepaid Card Added!']"); 

	public static By linkyourexistingcard=By.xpath("//android.view.View[@text='Link your existing EON card']");
	
	public static By Seletedthecard=By.xpath("//android.widget.Spinner[@text='Select Type of Card']");
	
	public static By Creditcard=By.xpath("//android.widget.CheckedTextView[@text='EON Credit Card']");
	
	public static By Prepaid=By.xpath("//android.widget.CheckedTextView[@text='EON Prepaid Card']");
	
	public static By prepaidcardcheckin=By.xpath("//android.widget.Spinner[@text='EON Prepaid Card']");
	
    public static By prepaidcardNumber=By.xpath("//android.widget.EditText[@index='0']");
    
	public static By Creditcardcheckingthepage=By.xpath("//android.widget.Spinner[@text='EON Credit Card']");
	
	public static By ReviewTermsOfUse=By.xpath("//android.widget.Button[@text='Review Terms Of Use']");
	
	public static By creditcardnumber=By.id("$b5");
	
	public static By ExpiryDate=By.xpath("//android.view.View[@text='Expiry Date']");
	
	public static By CVV=By.xpath("//android.view.View[@text='CVV']");
	
	public static By invalidvalidation=By.xpath("//*[@text='Please enter a valid card number.']");
	
	public static By Continuebutton=By.xpath("//android.widget.Button[@text='Continue']");
	
	public static By SeeAllAccount=By.xpath("//android.view.View[@text='See All Account']");
	
	public static By AccountDetails=By.xpath("//android.view.View[@text='Account Details']");
	
	public static By ProductsServices=By.xpath("//android.view.View[@text='Products & Services']");
	
	public static By cybercard=By.xpath("//android.widget.CheckedTextView[@text='EON Cyber Card']");
	
	public static By checkcybercard=By.xpath("//android.widget.Spinner[@text='EON Cyber Card']");
	
	public static By CyberaccountNumber=By.xpath("//android.widget.EditText[@index='0']");
	
	
	public static By Enrollmyaccount=By.xpath("//android.widget.Button[@text='Enroll my account']");
	
	
	

	/*public static By bankIssuer=By.xpath("//android.view.View[@text='Bank Issuer']");
	public static By inputCardNumber=By.xpath("//android.widget.EditText[@resource-id='InputCardNumber']");
	public static By expiryDate=By.xpath("//android.widget.EditText[@resource-id='Input_ExpiryDate']");
	public static By cvv=By.xpath("//android.widget.EditText[@resource-id='InputCVV']");
	public static By Continue=By.xpath("//android.widget.Button[@text='Continue']");
	public static By AsiaUB=By.xpath("//android.widget.CheckedTextView[@text='Asia United Bank']");
  public static By linkOtherCard=By.xpath("//android.view.View[@resource-id='b5-cardHeader']");
	*/
	
   public static By unsuccessfulpayments=By.xpath("//*[@text='1 unsuccessful payments']");
	
	
	
	}

	
	
	
	
			
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	
	



