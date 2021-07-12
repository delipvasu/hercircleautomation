package com.business.eon;

import com.utility.Utilities;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.sql.Driver;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Pages.BaseLoginPage;
import com.Pages.Buyloadpage;
import com.Pages.Paybillspage;
public class Paybilllogic extends Utilities {

	public void paybill() throws Exception
	{
		
		Wait(20);
		verifyElementPresentAndClick(Paybillspage.paybill, "Pay Bills");
		System.out.println("Click on bay bills");
		
	}
	
	public void NBIReferenceNumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.referencenumber, "Accountnumber9digit", "ReferenceNumber",rb);
	    System.out.println("Enter the Reference Number");	
		
		}
	
	
	public void NBIAmounnt(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Ename, "Amount", "Amount", rb);
		System.out.println("Enter the NBI Amount");
		
	}
	
	public void skycable() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.skycable).click();
		System.out.println("Click on sky cable");
		
	}
	public void searchinputnameNHA(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "NHA", "NHA",rb);
		System.out.println("search the name");
		
	}
	public void searchinputnameNBI(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "NBI", "NHA",rb);
		System.out.println("search the name");
		
	}
	public void searchinputnamehsbc(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Hsbc", "NHA",rb);
		System.out.println("search the name");
		
	}
	public void searchinputnamercbc(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "RCBC", "NHA",rb);
		System.out.println("search the name");
		
	}
	public void searchinputnamesmart(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "smart", "smartpaostpaid",rb);
		System.out.println("search the name");
		
	}
	
	public void nameidentifyinghsbc() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.Hsbc).click();
		System.out.println("Click on hsbc card");
		
   }
	
	public void nameidentifyingsmartpostpaid() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.smartpostpiad).click();
		System.out.println("Click on hsbc card");
		
   }
	
	public void nameidentifyingClark() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.Clark).click();
		System.out.println("Click on hsbc card");
		
   }
	
	
	public void lastname(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.fristname1, "lastname", "lastname", rb);
		System.out.println("enter the frist name");
		
	}
	
	public void fristname(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Amountbat, "Fristname", "Fristname", rb);
		System.out.println("Enter the Frist name");
		
	}
	
	public void middleinital(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Amount, "middile", "Middlename", rb);
		System.out.println("Enter the Middle name");
	}
	
	public void duedateli(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.duedateli, "duedate", "duedate", rb);
		System.out.println("Enter the duedate");
		
		
	}
	
	public void amountli(ResourceBundle rb)
	{
		Wait(20);
		Swipe("UP", 1);
		type(Paybillspage.amountli, "Amount", "Amount", rb);
		System.out.println("Enter the Amount");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void searchinputnameilollo(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Il", "smartpaostpaid",rb);
		System.out.println("search the name");
		
	}
	
	public void searchinputnameclark(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "clark", "smartpaostpaid",rb);
		System.out.println("search the name");
		
	}
	public void clarkname(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.referencenumber, "name", "Payorname", rb);
		System.out.println("Enter the payor's name");
		
	}
	
	public void Contractnumber(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.Accountname, "Contractnumber", "Number", rb);
		System.out.println("Enter the Contractnumber ");
		
		
	}
	
	public void clarkamount(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.banchCode, "Amount", "amount", rb);
		System.out.println("enter the Amount");
		
	}
	
	
	
	
	
	
	public void nameidentifyingrcbc() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.Rcbc).click();
		System.out.println("Click on hsbc card");
		
   }
	public void nameidentifyinglloilo() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.iloilo).click();
		System.out.println("Click on hsbc card");
		
   }
	
	public void lloiloAccount(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.referencenumber, "liaccountnummber", "liaccountnummber", rb);
		System.out.println("Enter Account");
		
		
	}
	
	
	
	public void Consumerid(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Accountname, "consumerid", "consumerid", rb);
		System.out.println("Comnsumer id");
		
	}
	
	public void billnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.consumername, "billnumber", "billnumber", rb);
		System.out.println("enter the bill Number");
		
	}
	
	
	
	
	public void hsbccardnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.referencenumber, "hsbccardnumber", "Cardnumber", rb);
		System.out.println("Enter the hasbc Crad number");
	}
	
	public void smartaccountcardnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.referencenumber, "SmartAccountnumber", "Cardnumber", rb);
		System.out.println("Enter the hasbc Crad number");
	}
	
	public void sevendigittelphonenumber(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.Accountname,"7digitPhonenumber" ,"Phonenumber", rb);
		System.out.println("Enter the 7 digit of phone number");
	}
	
	
	
	public void smartamount(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.banchCode, "Amount", "Amount", rb);
		
	}
	
	
	
	
	
	
	
	
	
	public void Rcbccardnumber(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.referencenumber, "rcbccardnumber", "Cardnumber", rb);
		System.out.println("Enter the hasbc Crad number");
	}
	
	
	
	
	
	
	public void Accountnumber(ResourceBundle rb) throws InterruptedException
	{
		Wait(20);
		type(Paybillspage.digitAccountnumber, "Accountnumber9digit", "Accountnumber",rb);
		System.out.println("Enter the Account number");
	}
	
	public void Skyname(ResourceBundle rb) throws InterruptedException
	{
		Wait(20);
		type(Paybillspage.digitAccountnumber, "name", "name",rb);
		System.out.println("Enter the Account number");
	}
	
	
	public void Amount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Amount, "cocolifeamount", "amount", rb);
		System.out.println("Enter the Amount");
		
	}
	
	public void skyAmount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.skyAmount, "Amount", "amount", rb);
		System.out.println("Enter the Amount");
		
	}
	
	public void skyaccount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.skyAmount, "Accountnumber9digit", "Accountnumber", rb);
		System.out.println("Enter the Amount");
		
	}

	public void Sendmoneyaccount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.skyAmount, "Accountnumber12digit", "Accountnumber", rb);
		System.out.println("Enter the Amount");
		
	}
	
	public void ManuAmount(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.manuAmount, "Amount", "amount",rb );
		System.out.println("Enter the AMount");
		
	}
	
	public void Toaster() throws Exception
	{
		Wait(20);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Please check required fields");
		System.out.println("Check the toaster");
		
	}
	
	
	public void prepaidToaster() throws Exception
	{
		Wait(20);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Please enter a valid Card Number");
		System.out.println("Check the toaster");
		
	}
	
	public void  virtualcardasserations() throws Exception
	{
		Wait(20);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Customer reached Maximum number of Starter Cards for Linking");
		System.out.println("Check the Account");
		
		
	}
	public void FavToaster() throws Exception
	{
		Wait(10);
		getText(BaseLoginPage.Toastermessage);
		//Assert.assertEquals(getText(BaseLoginPage.Toastermessage),"Preferred Name is required.");
		System.out.println("Check the toaster");
		
	}
	public void FavToastermessage() throws Exception
	{
		Wait(20);
		//getText(BaseLoginPage.Toastermessage);
		Assert.assertEquals(getText(BaseLoginPage.Toastermessage), "Favorite Edited!");
		System.out.println("Check the toaster");
		
	}
	
    public  void deletefavorites() throws Exception
    {
    	Wait(20);
    	findElement(Buyloadpage.deletefavorite).click();
    	System.out.println("delete the favorite");
    	
    }
    
    public void deleteToaster() throws Exception
    {
    	
    	Wait(20);
		getText(BaseLoginPage.Toastermessage);
		System.out.println("delete toaster message");
    }
	public void nameidentifyingcenss() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.ECENSUS).click();
		System.out.println("Click on Ecensus");
		
	}
	
	public void nameidentifying() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.MMDA).click();
		System.out.println("Click on MMDA");
		
	}
	public void BIR() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.BIR).click();
		System.out.println("");
		
	}
	public void Search() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.search).click();
		System.out.println("Click on search button");
		
	}
	public void searchinputnameecenus(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "inputsearch", "ecenus",rb);
		System.out.println("search the name");
		
	}
	
	
	public void searchinputMMDA(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "serchMMDA", "MMDA",rb);
		System.out.println("search the name");
		
	}
	public void searchinputPilipinasTeleserve(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "serchPilipinasTeleserve", "MMDA",rb);
		System.out.println("search the name");
		
	}
	
	public void searchinputnameBIR(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "BI", "BIR",rb);
		System.out.println("search the name");
		
	}
	
	
	public void Addmorebilles() throws Exception
	{
		
	
		findElement(Paybillspage.AddMore).click();
		System.out.println("Enter the Add more button");
		
	}
	
	
	public void Referncenumber(ResourceBundle rb) throws InterruptedException
	{
		           
		Wait(20);
		type(Paybillspage.Referncenumber, "REF", "Referncenumber", rb);
		System.out.println("Enter the REf Number");
		
	}
	public void Ename(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Ename, "name", "Ename", rb);
		System.out.println("Enter the ename");
		}
	
	public void ContactNo(ResourceBundle rb)
	{
		
		Wait(20);
        type(Paybillspage.Contactno, "Mobilenumber", "ContactNo", rb);
        System.out.println("Enter the Mobiel Number");
	}
	public void amount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.amount, "Amount", "mount", rb);
		System.out.println("Enter the Amount");
		
	}
	public void BIRamount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.BIRamount, "Amount", "mount", rb);
		System.out.println("Enter the Amount");
		
	}
	
	
	public void searchinputnameDFA(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "DFA", "DFA",rb);
		System.out.println("search the name");
		
	}
	
	
	
	public void FromType() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.FromType).click();
		System.out.println("From type selected");
		Wait(20);
		findElement(Paybillspage.Fromtypeselect).click();
		System.out.println("Click on Elemeent");
		
		
	}
	
	public void TaxType() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.TAXType).click();
		System.out.println("Click on TaxType");
		Wait(20);
		findElement(Paybillspage.TaxTypeSelect).click();
		System.out.println("Click on TaxType");
		
	}
	
	public void Returnperiod(ResourceBundle rb)
	{
		
	  Wait(20);
	  type(Paybillspage.returnperiod, "RETURNPERIOD", "date",rb);
	  System.out.println("enter the Returnperiod");
		
	}
	
	
	
	public void BIRAmount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.cocolifepay, "BIRAMOUNT", "AMOunt",rb);
		System.out.println("Enter the Amount");
		
		
	}
	public void BIReferenceNumber(ResourceBundle rb) throws InterruptedException
	{
		
		Thread.sleep(5000);
		type(Paybillspage.referencenumber, "BIRREF", "ReferenceNumber",rb);
	    System.out.println("Enter the Reference Number");	
		
		}
	
	public void TIN(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.TINNo,"TIN", "TINnumber",rb);
		System.out.println("Enter the TIN");
		
	}
	
	public void BranchCode(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.banchCode, "BRANCHCODE", "BranchCode",rb);
		System.out.println("Enter the Branch Code");
		
	}
	public void nameidentifyingMMDA() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.MMDA).click();
		System.out.println("Click on MMDA");
		
	}
	public void Ticketnumber(ResourceBundle rb) throws InterruptedException
	{
		
		Thread.sleep(20000);
		type(Paybillspage.Ticketnumber, "Ticketnumber", "MMDA",rb);
		System.out.println("enter the mmda ticket");
		
	}
	public void Amount1(ResourceBundle rb) throws Exception
	{
		Wait(20);
		type(Paybillspage.Amount, "Amount", "Amount",rb);
		System.out.println("Enter the Amount");
	  
	}
	public void violation() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.violation).click();
		System.out.println("Click on violation");
		Wait(20);
		findElement(Paybillspage.Jaywalking).click();
		System.out.println("Click on jaywalking");
		
	}
	
	public void violationcode(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.vilationcode, "violationcode", "violationcode",rb);
		System.out.println("enter the violationcode");
		
		
	}
	public void name(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Name1, "Name", "name",rb);
		System.out.println("Enter the name");
	}
	
	public void clearancefee() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.clearancefee).click();
		System.out.println("Select the clearancefee");
		Wait(20);
		findElement(Paybillspage.clearncefeeadding).click();
		System.out.println("Click on adding");
		
		
	}
	public void nameidentifyingPILIPINAS() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.PILIPINAS).click();
		System.out.println("");
		
	}
	
	public void Accountnumber2(ResourceBundle rb) throws InterruptedException
	{
		Thread.sleep(8000);
		type(Paybillspage.Accountnumber, "Accountnumber9digit", "Accountnumber",rb);
		System.out.println("Enter the Account number");
	}
	
	
	public void Accountname(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.Accountname, "CocolifeAccountname", "Account name",rb);
		System.out.println("enter the Account name");
		
	}
	
	public void manuduedate(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.manuduedate, "duedate", "manudate", rb);
		System.out.println("enter the due date");
	}
	
	public void nameidentifyingNBI() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.NBI).click();
		System.out.println("");
		
	}
	
	
	
	public void searchinputnamecocolife(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "COCO", "cocolife",rb);
		System.out.println("search the name");
		
	}
	
	public void nameidentifyingcocolife() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.COCOLIFE).click();
		System.out.println("Click on coco life");
		
	}
	
	public void Policynumber(ResourceBundle rb) throws InterruptedException
	{
		
		Thread.sleep(20000);
        type(Paybillspage.policynumber, "Policynumber", "policynumber",rb);
        System.out.println("enter the policy number");		
	}
	
	
	public void premiumnumber(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.premiumAmount, "premiumamount", "premiumamount",rb);
		System.out.println("Enter the premiumamount");
	}
	
	
	public void Loanamount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.LoanAmount, "LoanAmount", "LoanAmount",rb);
		System.out.println("Enter the Loan Amount");
			}
	
	public void duedate(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.duedte, "duedate", "duedate",rb);
		System.out.println("Enter the date");
	}
	
	
	public void CocolifeAmount(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.CocoAmount, "cocoAmount", "amount",rb);
		System.out.println("enter the cocolife amount");
		
		
		
		
	}
	
	
	public void searchinputnameMaanulife(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Manulife", "cocolife",rb);
		System.out.println("search the name");
		
	}
	public void nameidentifyingmanulife() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.Manulife).click();
		System.out.println("");
		
	}
	

	public void searchinputnamemaxicare(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "maxi", "maxicare",rb);
		System.out.println("search the name");
		
	}
	
	public void nameidentifyingmaxicare() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.Maxicare).click();
		System.out.println("");
		
	}
	
	public void ReferenceNumber(ResourceBundle rb) throws InterruptedException
	{
		Thread.sleep(10000);
		type(Paybillspage.Accountnumber, "BIllREF", "Accountnumber",rb);
		System.out.println("Enter the Account number");
	}
	
	public void BookingNumber(ResourceBundle rb) throws InterruptedException
	{
		Thread.sleep(10000);
		type(Paybillspage.Accountnumber, "Bookingnumbe", "Accountnumber",rb);
		System.out.println("Enter the Account number");
	}
	public void lastnamename(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.Accountname, "lastname", "lastname",rb);
		System.out.println("enter the Account name");
		
	}
	public void Fristname(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Name, "Firstname", "Firstname",rb);
		System.out.println("Enter the first name");
		
	}
	public void Middleintial(ResourceBundle rb)
	{
		
		
		Wait(20);
		type(Paybillspage.LoanAmount, "middleintial", "middleintial",rb);
		System.out.println("enter the middle name");
		}
	
public void telephonenumber(ResourceBundle rb)
	
	{
	
	Wait(20);
	type(Paybillspage.duedte, "phonenumber", "phonenumber",rb);
	System.out.println("enter the middle name");
	}
	
	
	
   public void datemaxicare(ResourceBundle rb)
   {
	   Wait(20);
	   type(Paybillspage.CocoAmount, "duedate", "date",rb);
	   System.out.println("Enter the date with maxicare");
	   
   }
	
   public void maxcareAmount(ResourceBundle rb)
   {
	   
	   Wait(20);
	   type(Paybillspage.paywithMMDA, "Amount", "amount", rb);
	   System.out.println("Enter the amount");
	   
   }
	
   public void nameidentifyingDFA() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.DFA).click();
		System.out.println("");
		
	}
   public void DFAAccount(ResourceBundle rb) throws InterruptedException
	{
		
		Wait(20);
		type(Paybillspage.policynumber, "DFAaccount", "Accountnumber",rb);
		System.out.println("Enter the Account number");
		
}
   
   public void MobilenumberDFA(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Accountname, "phonenumberDFA", "MobileNumber",rb);
		System.out.println("Enter the Mobilenumber");
		
	}
   
   public void DFAAmount(ResourceBundle rb)
   {
	   Wait(20);
	   type(Paybillspage.Contactno, "cocoAmount", "DFAAmount", rb);
	   System.out.println("enter the Amount");
	   
   }
   
   public void nameidentifyingNHA() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.NHA).click();
		System.out.println("");
		
	}
   
   public void BeneficiaryIndividualNumberBIN(ResourceBundle rb) throws InterruptedException
	{
		
		Wait(20);
		type(Paybillspage.policynumber, "BIN", "BIN",rb);
		System.out.println("enter the BIN number");
		}
	
	
   public void Beneficiaryname(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.benname, "name", "Beneficiaryname",rb);
		System.out.println("enter the Beneficiaryname");
		
}
   public void searchinputnameAIRASIA(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Ai", "AIRASIA",rb);
		System.out.println("search the name");
		
	}
   
   
   
   
   
   
   
   
   
   
   
   public void nameidentifyingAIRASIA() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.AirAsia).click();
		System.out.println("");
		
	}
   
   
   public void searchinputnamecebuAir(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "CE", "CebuAir",rb);
		System.out.println("search the name");
		
	}
   public void nameidentifyingcubeAir() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.CEBUAIR).click();
		System.out.println("");
		
	}
   
   public void Rolocnumber(ResourceBundle rb) throws InterruptedException
	{
		
		Thread.sleep(4000);
		type(Paybillspage.policynumber, "Rolonumber", "RoleNmber",rb);
		System.out.println("Enter the Role number");
		
	}
   
   public void Payrollname(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.Accountname, "name", "payrollname",rb);
		System.out.println("Enter the payrollname");
		
	}
   
   public void departurename(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.Contactno, "duedate", "depaturename",rb);
		System.out.println("Enter the date");
		
		
	}
   
    public void cubuAmount(ResourceBundle rb)
    {
    	
    	Wait(20);
    	type(Paybillspage.amount, "Amount", "Amount", rb);
    	System.out.println("Enter the Amount");
    	
    }
	
    public void searchinputnameBatelecI(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Bat", "BatelecI",rb);
		System.out.println("search the name");
		
	}
    
    public void searchinputnameDav(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Dav", "BatelecI",rb);
		System.out.println("search the name");
		
	
	}
    public void nameidentifyingdavlight() throws Exception
    {
    	
    	Wait(20);
    	findElement(Paybillspage.Davolight).click();
    	System.out.println("Click on Davolight");
    }
    
    public void AccountnameDavo(ResourceBundle rb)
    {
    	
    	Wait(20);
    	type(Paybillspage.payname, "Accountname", "Accountname", rb);
    	System.out.println("enter the accout name");
    	
    	
    }
    
    public void Accountid(ResourceBundle rb)
    {
    	Wait(20);
    	type(Paybillspage.Accountname, "Accountid", "Accountid", rb);
    	
    }
    
    
    
    
    public void nameidentifyingBatelecIi() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.BatelecIi).click();
		System.out.println("");
		
	}
    
    
    public void nameidentifyingBatelecI() throws Exception
    {
    	
    	Wait(20);

    	findElement(Paybillspage.BatelecI).click();
    	System.out.println("Click on bateleci");
    }
    
    
    public void AccountnumberBATELECII(ResourceBundle rb) throws InterruptedException
	{
		Thread.sleep(6000);
		type(Paybillspage.Accountnumber, "Accountnumber9digit", "Accountnumber",rb);
		System.out.println("Enter the Account number");
	}
	
    public void duedateBatelec(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.duedatebatelec, "duedate", "duedate",rb);
		System.out.println("Enter the date");
	}
    
    public void consumername2(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.consumername, "name", "consumername",rb);
		System.out.println("Enter the consumer name");
		
	}
    
    public void consumername(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.consumername, "name", "consumername",rb);
		System.out.println("Enter the consumer name");
		
	}
    
    public void BillMonth(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.BillofMonth, "BillMonth", "duedate",rb);
		System.out.println("Enter the date");
		
	}
    
    public void batelecAmount(ResourceBundle rb)
    {
    	
    	Wait(20);
    	type(Paybillspage.Amountbat, "Amount", "Amount", rb);
    	System.out.println("Enter the Amountbat");
    }
	
    
    public void DavAmount(ResourceBundle rb)
    {
    	
    	Wait(20);
    	type(Paybillspage.Contactno, "Amount", "Amount",rb);
    	System.out.println("Enter the Dav Amount");
    	
    }
    
    
	public void BillMonth2(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.Contactno, "duedate", "BillMonth",rb);
		System.out.println("enter the bill of month");
		}
	
	public void duedate2(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.LoanAmount, "duedate", "duedate2",rb);
		System.out.println("Enter the duedate of Month");
		
	}
	
	public void BookID(ResourceBundle rb)
	{
		
		Wait(20);
		type(Paybillspage.duedte, "Bookingid", "Bookid",rb);
		System.out.println("Enter the Book id");
		
	}
	
	public void Amountbatcii(ResourceBundle rb)
	{
		Wait(20);
		type(Paybillspage.returnperiod, "Amount", "Amount", rb);
		System.out.println("Click on amount");
		
	}
	
	
    
	
	
   
   
   
   
	
/*	
	
	public void NBIpaywith() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.paywithNBI).click();
		System.out.println("Click on Nbi pay with button");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Eonlogin() throws Exception 
	{
	
     
		
		
		type(BaseLoginPage.username, "Eonvpptest12", "username");
		type(BaseLoginPage.password, "Password@123", "password");
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
	}
      
	
	
	
	
	

	
	
	
	
	public void unionbanklogin() throws Exception
	{

		type(BaseLoginPage.username, "Eonvpptest13", "username");
		type(BaseLoginPage.password, "Password@123", "password");
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	public void unionbankmanilalogin() throws Exception
	{

		type(BaseLoginPage.username, "Eonvpptest12", "username");
		type(BaseLoginPage.password, "Password@123", "password");
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	public void Eonlitelogin() throws Exception
	{
	
		type(BaseLoginPage.username, "Eonvpptest07", "username");
		type(BaseLoginPage.password, "Password@123", "password");
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	
	public void Eonpluslogin() throws Exception
	{
	
		type(BaseLoginPage.username, "Eonvpptest13", "username");
		type(BaseLoginPage.password, "Password@123", "password");
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	public void Eonprologin() throws Exception
	{
	
		type(BaseLoginPage.username, "Eonvpptest13", "username");
		type(BaseLoginPage.password, "Password@123", "password");
        verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
       // verifyElementPresentAndClick(BaseLoginPage.Login, "Login");
        Wait(120);
       
  }
	
	
	public void Maylined() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.Maynilad).click();
		System.out.println("Click on Maylined");
	}
	
	
	public void identifymanilawater() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.manilawater).click();
		System.out.println("Click on manila water");
}
	
	public void manilwater()
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "manil", "manilawater");
		System.out.println("search the name");
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	public void payname()
	
	{
		Wait(20);
		type(Paybillspage.payname, "vasu", "payname");
		System.out.println("enter the pay name");
		
	}
	
	
	public void Accountnumber1() throws InterruptedException
	{
		Thread.sleep(5000);
		type(Paybillspage.Accountnumber, "674481217", "Accountnumber");
		System.out.println("Enter the Account number");
	}
	public void AccountnumberBATELEC() throws InterruptedException
	{
		Thread.sleep(5000);
		type(Paybillspage.Accountnumber, "674481217", "Accountnumber");
		System.out.println("Enter the Account number");
	}
	
	
	
	
	
	
	
	public void payorname()
	{
		Wait(20);
		type(Paybillspage.paywith, "vasu", "payorname");
		System.out.println("enter the payor name");
    }
	public void Contactno()
	{
		Wait(20);
		type(Paybillspage.Contactno, "9502206807", "Contact no");
		System.out.println("Enter the Conatct number");
		
	}
	
	public void paywithecensus() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.ECENSUSpaywith).click();
		System.out.println("Click pay with button");
	}
	
	
	
	public void Meternumber()
	{
		
		Wait(20);
		type(Paybillspage.Accountname, "123", "Meternumber");
		System.out.println("Enter the meter Number");
		
	}
	public void lastname()
	{
		
	Wait(20);
	type(Paybillspage.Contactno, "kumar", "lastname");
		System.out.println("enter the last name");
	}
	
	
	
	
	public void Middilename()
	{
		Wait(20);
		type(Paybillspage.duedte, "Grandhe", "Middilename");
		System.out.println("Enter the middile name");
		
		}
	
	public void ExpirationDate()
	{
		
		Wait(20);
		type(Paybillspage.cocolifepay, "14/02/2021","ExpirationDate");
		System.out.println("Enter the ExpirationDate");
		}
	
	
	public void DueDatepaneclo()
	{
		
		
		Wait(20);
		type(Paybillspage.paymaxicare, "05/01/2021", "duedatepaneclo");
		System.out.println("Enter duedatepancelo");
		}
	
	public void paneclopay() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.Panelco1Pay).click();
		System.out.println("Click on Pay button");
		
	}
	
	
	
	public void BIR() throws InterruptedException
	{
		Thread.sleep(6000);
	    type(Paybillspage.Accountnumber, "1234567855", "BIRNumber");
	    System.out.println("Enter the BIR number");
		}
	
	
	
	
	
	public void FromType() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.FromType).click();
		System.out.println("From type selected");
		Wait(20);
		findElement(Paybillspage.Fromtypeselect).click();
		System.out.println("Click on Elemeent");
		
		
	}
	
	
	public void TaxType() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.TAXType).click();
		System.out.println("Click on TaxType");
		Wait(20);
		findElement(Paybillspage.TaxTypeSelect).click();
		System.out.println("Click on TaxType");
		
	}
	
	
	
	
	
	
	public void BIRpay() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.paymaxicare).click();
		System.out.println("Click on pay with BIT Button");
		
	}
	
	
	
	
	
	
	
	
	
	public void fristname()
	{
		
		Wait(20);
        type(Paybillspage.fristname1, "vasu", "fristname");	
        System.out.println("enter the frist name");
		
	}
	
	

	
	
   public void paywithmaxicare() throws Exception
   {
	   
	   
	   Wait(20);
	   findElement(Paybillspage.paymaxicare).click();
	   System.out.println("click on maxicare");
	   
	   
   }
   
   
   
	
	
	
	
	public void paywithpilipinas() throws Exception
	{
		Wait(20);
        findElement(Paybillspage.paywithpilipinas).click();
        System.out.println("Click on pilipinas");
		
	}
	
	
	
	
	
	public void Amounttransfer() throws Exception
	{
		Thread.sleep(2000);
		findElement(Paybillspage.Amount).getText();
		System.out.println("amount transfer ");
		
	}
	
	public void avaliblebalance() throws Exception
	{
		
		Wait(20);
		verifyElementPresent(Paybillspage.avaliblebalance,"avaliblebalance:");
		System.out.println("check the avaliblebalance");
	}
	
	
	
	public void paywithvpstarter() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.paywith).click();
		System.out.println("Click on sky cable");

	}
	
	
	public void Search() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.search1).click();
		System.out.println("Click on search button");
		
	}
	
	
	public void TOPSearch() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.Topsearchbutton).click();
		System.out.println("Click on search button");
		
	}
	
	
	
	
	
	
	
	
	
	
	public void Search1() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.searchbutton1).click();
		System.out.println("Click on search button");
		
	}
	
	
	
	public void searchinputname()
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Maynilad Water", "Maynilad Water");
		System.out.println("search the name");
		
	}
	
	public void searchinputnameBIR()
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "B", "BIR");
		System.out.println("search the name");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	public void searchinputnamebeepload()
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Beep", "Beepload");
		System.out.println("search the name");
		
	}
	
	
	
	
	public void searchinputnamePanelco1()
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "Pan", "Panelco1");
		System.out.println("search the name");
		
	}
	
	
	
	
	
	
	
	public void nameidentifyingBIR() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.BIR).click();
		System.out.println("Click on BIR");
	}
	
	
	
	
	
	public void nameidentifyingPanelco1() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.Panelco1).click();
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	public void nameidentifyingbeep() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.AirAsia).click();
		System.out.println("");
		
	}
	
	public void nameidentifyingbeepload() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.Beepload).click();
		System.out.println("");
		
	}
	
	public void Cardnumber() throws InterruptedException
	{
		
		Thread.sleep(8000);
		type(Paybillspage.Accountnumber,"6378059900482510","cardnumber");
		System.out.println("Enter the card number");
		
	}
	
	
	
	public void bookingNumber() throws InterruptedException
	{

	
	}
	
	public void paywithAIRASIA() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.paywith).click();
		System.out.println("Click on pay button");
		
		
	}
	
	
	
	
	
	
	
	public void paywithcebuair() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.ECENSUSpaywith).click();
		System.out.println("Click on pay with button");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void NHAAmount()
	{
		Wait(20);
		type(Paybillspage.Accountname,"1", "Amount");
		System.out.println("Enter the NHA Amount");
		
		
		
	}
	
	
	
	
	
	public void paywithDFA() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.paywithpilipinas).click();
		System.out.println("Click on pay with DFA");
		
	}
	
	
	
	
	
	
	
	
	
	
	public void nameidentifying() throws Exception
	{
		Wait(40);
		findElement(Paybillspage.MAYNILADWATER).click();
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	public void searchinputnamecensus()
	{
		
		Wait(20);
		type(Paybillspage.inputsearch, "E", "E");
		System.out.println("search the name");
		
	}
	public void searchinputnameMMDA()
	{
		
		Wait(30);
		type(Paybillspage.inputsearch, "METRO", "METRO");
		System.out.println("search the name");
		
	}
	public void searchinputnamepilipinas() throws Exception
	{
		
		Wait(30);
		type(Paybillspage.inputsearch, "PILI", "PILIPINAS");
		System.out.println("search the name");
		
	}
	
	
	public void Ticketnumber() throws InterruptedException
	{
		
		Thread.sleep(20000);
		type(Paybillspage.Ticketnumber, "12345", "MMDA");
		System.out.println("enter the mmda ticket");
		
	}
	
	
	
	
	
	
	
	public void MMDApaywith() throws Exception
	{
		Wait(30);
		findElement(Paybillspage.paywithMMDA).click();
		System.out.println("Click on paywith");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Billnumber() throws InterruptedException
	{
		
		Thread.sleep(5000);
        type(Paybillspage.policynumber, "45677", "billrefrence");
        System.out.println("enter the policy number");		
	}
	
	
	
	
	

	
	
	public void consumername()
	{
		
		Wait(20);
		type(Paybillspage.cunsumername, "vasu", "consumer");
		System.out.println("Enter the Consumer name");
		
	}
	
	public void paywithBatelec() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.paywithBatelec).click();
		System.out.println("Click on paywith Button");
		
	}
	
	
	
	
	
	
	
	
	public void duedatelife()
	{
		
		Wait(20);
		type(Paybillspage.duedatelife, "12/15/2020", "duedate");
		System.out.println("Enter the date");
	}
	
	
	public void paywithManulife() throws Exception
	{
		Wait(20);
		findElement(Paybillspage.paywithlifeinsurnace).click();
		System.out.println("click on pay with Button");
		
		
		
	}
	
	
	
	public void cocolifepay() throws Exception
	{
		
		Wait(20);
		findElement(Paybillspage.cocolifepay).click();
		System.out.println("Click on lifepay");
		
		
	}
	
	
	
	
	
	*/
}
