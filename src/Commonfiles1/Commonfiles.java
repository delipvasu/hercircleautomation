package Commonfiles1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.base.Function;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author Vasu
 *
 */
public class Commonfiles {
	
	
	public static  WebDriver driver;
	public AndroidDriver androidDriver;
    /**************************************************************************************************************/
    /**
     * waitForPageLoad() is used for wait till the page is loaded.
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /**************************************************************************************************************/
    public  void waitForDomElement(WebDriver dri)
    {
        dri.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }

    /********************************************************************************************************/
    /**
     * waitForLinkNamePresent() is used for wait till webelement link is present or not.
     * @param linkName
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /**********************************************************************************************************/
    public void waitForLinkNamePresent(String linkName)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(linkName)));
    }
   /* public AndroidElement ScrollToElement(String by, String using) {
        AndroidElement element = null;
        int numberOfTimes = 10;
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width / 2);
        // Swipe up to scroll down
        int startPoint = (int) (size.height - 10);
        int endPoint = 10;

        for (int i = 0; i < numberOfTimes; i++) {
            try {
                new TouchActions(driver)
                    .longPress(point(anchor, startPoint))
                    .moveTo(point(anchor, endPoint))
                    .release()
                    .perform();
                element = (AndroidElement) driver.findElement(by, using);
                i = numberOfTimes;
            } catch (NoSuchElementException ex) {
                System.out.println(String.format("Element not available. Scrolling (%s) times...", i + 1));
            }
        }
        return element;
    }*/

    /************************************************************************************************************/
    /**
     * waitForPartialLinkPresent() is used for wait till webelement partial link is present or not.
     * @param partialLinkName
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /************************************************************************************************************/
    //    public void waitForPartialLinkPresent(String partialLinkName)
    //    {
    //        WebDriverWait wait=new WebDriverWait(driver, 30); //Variable for future use.
    //    }

    /************************************************************************************************************/
    /**
     * waitForXpathPresent() is used for wait till any webelement is present or not.
     * @param wbxpath
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /*************************************************************************************************************/
    public void waitForXpathPresent(WebElement wbxpath,WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(wbxpath));
    }

    /************************************************************************************************/
    /**
     * waitForIdPresent() is used for wait till ID of webelement is present or not
     * @param wbID
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /****************************************************************************************************/
    public void waitForIdPresent(String wbID)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(wbID)));
    }
    /****************************************************************************************************/
    /**
     * waitForNamePresent() is used for wait till Name of webelement is present or not
     * @param wbNAME
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /****************************************************************************************************/
    public void waitForNamePresent(String wbNAME)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(wbNAME)));
    }

    /**************************************************************************************************/
    /**
     * waitForVisibleElement() is used for wait till element is visible or not
     * @param wbVisibleElement
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /*******************************************************************************************************/
    public void waitForVisibleElement(String wbVisibleElement)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(wbVisibleElement)));
    }

    /************************************************************************************************************/
    /**
     *  waitForInvisibleElement() is used for wait till element is invisible/hidden or not.
     * @param wbInvisibleElement
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /**************************************************************************************************************/
    public void waitForInvisibleElement(String wbInvisibleElement)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(wbInvisibleElement)));
    }

    /*************************************************************************************************************/
    /**
     * waitForIsElementClickable() is used for wait till element is clickable or not
     * @param wbIsClickable
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /************************************************************************************************************/
    public void waitForIsElementClickable(WebElement wbIsClickable,WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(wbIsClickable));
    }
   /*
    * click on Element 
    * 
    * 
    */
    
    public void FindelementClick(By element,WebDriver driver)
    {
    	
    	waitForDomElement(driver);
    	driver.findElement(element).click();
    	
    }
    
    public void Findelement(By element,WebDriver driver)
    {
    	
    	waitForDomElement(driver);
    	driver.findElement(element);
    	
    }
    
    
    
    /*
     * send the value in textfiled 
     * 
     * 
     */
    
    
    public void Sendkeys(By element, String value,WebDriver driver,ResourceBundle rb)
    {
    	
    	waitForDomElement(driver);
        driver.findElement(element).sendKeys(rb.getString(value));
        System.out.println("Enter teh value"+value);
    }
    
  
    
    
    
    /************************************************************************************************************/
    /**
     * verifyText() is used to verify the expected value with the actual value.
     * @param wb
     * @param expectedMsg
     * @return
     * @author Vasu
     * @since 2018-05-15
     */
    /**********************************************************************************************************/
    public boolean verifyText(WebElement wb,String expectedMsg)
    {
        boolean flag=false;
        String actMsg=wb.getText();
        if(expectedMsg.equals(actMsg))
        {
            flag=true;
            System.out.println("msg is verified==pass");
        }
        else
        {
            System.out.println("msg is not verified==fail");
        }
        return flag;
    }

    /****************************************************************************************************/
    /**
     * acceptAlert() is used to click on "OK" button of the alert pop up.
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /*******************************************************************************************************/
    public void acceptAlert(WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
        String alrt=driver.switchTo().alert().getText();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Reporter.log("Error Message:"+alrt,true);
    }

    /***************************************************************************************************/
    /**
     * dismissAlert() is used to "CANCEL" button of the alert pop up.
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /******************************************************************************************************/
    public void dismissAlert()
    {
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
        String alrt=driver.switchTo().alert().getText();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        Reporter.log("Expected result:"+alrt,true);
    }

    /*******************************************************************************************************/
    /**
     * getTextAlert() is used to get the textname of the webelement.
     * @param xpath
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /********************************************************************************************************/
    public void getTextAlert(String xpath)
    {
        Alert alert=driver.switchTo().alert();
        String alrt=alert.getText();
        System.out.println("WebElement Name:" +alrt);
    }

    /*******************************************************************************************************/
    /**
     * pageForRefresh() is used to refresh the page
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /******************************************************************************************************/
    public void pageForRefresh(WebDriver driver)
    {
        driver.navigate().refresh();
    }
   
    public void backtoPage(WebDriver driver)
    {
        driver.navigate().back();
    }

    /*******************************************************************************************************/
    /**
     * deleteAllCookies() is used to delete all cookies.
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /*********************************************************************************************************/
    public static void deleteAllCookies()
    {
        driver.manage().deleteAllCookies();
    }

    /********************************************************************************************************/
    /**
     * deleteCookiesName() is used to delete the specified name cookies.
     * @param driver
     * @param name
     * @author Vasu
     * @since 2018-05-15
     */
    /*******************************************************************************************************/
    public void deleteCookiesName(String name)
    {
        driver.manage().deleteCookieNamed(name);
    }

    /********************************************************************************************************/
    /**
     * FluentWait class is used for waiting the Webelement in the application
     * Waiting 50 seconds for an element to be present on the page, checking
     * for its presence once every 2 seconds.
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /*********************************************************************************************************/
    public void fluentSleepingMode()
    {
        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
        wait.withTimeout(50,TimeUnit.SECONDS);
        wait.pollingEvery(2,TimeUnit.SECONDS);
        wait.ignoring(NoSuchElementException.class);
    }

    /*************************************************************************************************/
    /**
     * windowMaximize() is used to maximize the window of the browser
     * @param driver
     * @author Vasu
     * @since 2018-05-15
     */
    /***************************************************************************************************/
    public static void windowMaximize(WebDriver driver)
    {
        driver.manage().window().maximize();   
    }

   
    
    /*************************************************************************************************/
    /**
     * pageLoadTimeOut() Sets the amount of time to wait for a page load to complete
     *  before throwing an error.
     *  If the timeout is negative, page loads can be indefinite.
     *  @author Vasu
     *  @since 2018-05-15
     */
    /*****************************************************************************************************/
    public void pageLoadTimeOut()
    {
        driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.SECONDS);
    }

    /*****************************************************************************************************/
    /**
     * setScriptTimeOut() Sets the amount of time to wait for an
     * asynchronous script to finish execution before throwing an error.
     * If the timeout is negative, then the script will be allowed to run indefinitely.
     * @author Vasu
     * @since 2018-05-15
     */
    /****************************************************************************************************/
    public void setScriptTimeOut()
    {
        driver.manage().timeouts().setScriptTimeout(500,TimeUnit.SECONDS);
    }

    /**
     * The purpose of this method to sleep for a particular time when the element is not visible
     * @throws InterruptedException
     * @author Vasu
     * @since 2018-05-15
     */
    public void waitForSomeTime() throws InterruptedException
    {
        Thread.sleep(3000);
    }

    /****************************************************************************
     * Purpose:Highlight the element to visible at time of Execution
     * @Author:Vasu
     * @param:By element
     ***************************************************************************/
    public void HighlightOnElement(WebElement element,WebDriver driver) 
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: blue; border: 2px solid Magenta;");
    }

    /****************************************************************************
     * Purpose:Highlight the element to visible at time of Execution
     * @Author:Vasu
     * @param:By element
     ***************************************************************************/
    public void HighlightOnElement1(List<WebElement> element) 
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: blue; border: 2px solid Magenta;");
    }



    /****************************************************************************
     * Purpose:Highlight the element to visible at time of Execution
     * @Author:Vasu
     * @param:By element
     * @throws InterruptedException
     ***************************************************************************/
    public void SelectVisibleText(WebElement element,String locatortext,WebDriver driver) throws InterruptedException
    {
        try
        {
            //HighlightOnElement(element);
            Select se=new Select(element);
            List<WebElement> list=se.getOptions();
            Reporter.log("Values:",true);
            for(int index=1;index<list.size();index++)
            {
                String s1=list.get(index).getText();
                Reporter.log(s1,true);
                if(s1.trim().equalsIgnoreCase(locatortext))
                {
                    se.selectByVisibleText(locatortext);
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /****************************************************************************
     * Purpose:Highlight the element to visible at time of Execution
     * @Author:Vasu
     * @param:By element
     * @throws InterruptedException
     ***************************************************************************/
    public void SelectByIndex(WebElement element,String locatorIndex,WebDriver driver) throws InterruptedException
    {
        try
        {
            HighlightOnElement(element, driver);
            Select se=new Select(element);
            List<WebElement> list=se.getOptions();
            for(int index=0;index<list.size();index++)
            {
                String s1=list.get(index).getText();
                if(s1.trim().equalsIgnoreCase(locatorIndex))
                {
                    se.selectByIndex(index);
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    /****************************************************************************
     * Purpose:Highlight the element to visible at time of Execution
     * @Author:Vasu
     * @param:By element
     * @throws InterruptedException
     ***************************************************************************/
    public void SelectByValue(WebElement element,String locatorValue,WebDriver driver) throws InterruptedException
    {
        try
        {
            HighlightOnElement(element, driver);
            Select se=new Select(element);
            se.selectByValue(locatorValue);
            List<WebElement> list=se.getOptions();
            for(int index=0;index<list.size();index++)
            {
                String s1=list.get(index).getText();
                if(s1.trim().equalsIgnoreCase(locatorValue))
                {
                    se.selectByValue(locatorValue);
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Thread.sleep(10000);
    }
    /****************************************************************************
     * Purpose:Boostrap Dropdown
     * @param string 
     * @Author:Vasu
     * @param:By element
     * @throws InterruptedException
     ***************************************************************************/
    public void selectValueFromDropdown(String locateValue, String string,WebDriver driver) throws InterruptedException
    {
        List<WebElement> selectallvalue=driver.findElements(By.xpath("//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li"));
        try
        {
            for(int i=1;i<selectallvalue.size();i++)
            {
                WebElement Allelement=selectallvalue.get(i);
                String listofelement=Allelement.getText();
                /*Reporter.log(listofelement,true);*/
                if(listofelement.trim().equalsIgnoreCase(locateValue))
                {
                    Allelement.click();
                    break;
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
   
/***************************************************************************************************************************************/
   
    public void selectValueFromDropdown1(String locateValue) throws InterruptedException
    {
        List<WebElement> selectallvalue=driver.findElements(By.xpath(".//*[@id='inboxForm:userListId_panel']/div/ul/li"));
        try
        {
            for(int i=1;i<selectallvalue.size();i++)
            {
                WebElement Allelement=selectallvalue.get(i);
                String listofelement=Allelement.getText();
                /*Reporter.log(listofelement,true);*/
                if(listofelement.trim().contains(locateValue))
                {
                    Allelement.click();
                    break;
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
   

    /**
     * To upload file
     * @param filepath
     * @throws AWTException
     * @author Vasu
     */

    public void UpLoadFile(String filepath) throws AWTException
    {
        StringSelection stringselection = new StringSelection(filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    /****************************************************************************
     * Purpose:Check Textbox Field Empty OR Not
     * @Author:Vasu
     * @param:By element
     * @throws InterruptedException
     ***************************************************************************/
    public void VerifyTextField(WebElement element,WebDriver driver) throws InterruptedException
    {
        waitForSomeTime();
        HighlightOnElement(element, driver);
        if(element.getAttribute("value").isEmpty()){
            Reporter.log("TexyBox Is Empty",true);

        }
        else{
            //Store the value
            HighlightOnElement(element, driver);
            String TextBox=element.getAttribute("value");
            System.out.println("Textbox Value Is:=  "  +TextBox);
            waitForSomeTime();
            waitForSomeTime();
        }

    }

   
   
    public String getValueFromDropDown(WebElement element,WebDriver driver)
    {
        List<WebElement> options = new Select(element).getOptions();
        for (WebElement option : options)
        {
            HighlightOnElement(option, driver);
            String DropdownValues=option.getText();
            Reporter.log("Expected result:"+DropdownValues,true);
        }

        return null;
    }




    public void ScroolDown(WebDriver driver)  
    {        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        System.out.println("Scroll Down The Page");
    }
    
    public void longScrollDown(WebDriver driver)
    {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)", "");
        System.out.println("Long Scroll Down Page");
    }
    

    public void ScroolUp()  
    {        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-1000)", "");
    }

    public void waitForelementPresent(WebElement element,WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver,350);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Generating Alert

    public void CaptchaAlertandAccept () throws InterruptedException
    { 
        //Generating Alert Using Javascript Executor
        JavascriptExecutor javascript = (JavascriptExecutor) driver;
        javascript.executeScript("alert('Please Enter Captcha..');");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    public WebElement fluentWait(final WebElement element,WebDriver driver)
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(240, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement pleasewait = wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                return element;
            }
        }
                );
        return pleasewait;
    };

    //For Visibility of element


    public void isElementNotDisplayed(final WebElement elementId, final int timeoutInSeconds)
    {
        try {
            ExpectedCondition condition = new ExpectedCondition<Boolean>() {
                public Boolean apply(final WebDriver webDriver) {
                    WebElement element =elementId;
                    return !element.isDisplayed();
                }
            };
            Wait w = new WebDriverWait(driver, timeoutInSeconds);
            w.until(condition);
        } catch (Exception ex) {
            System.out.println("Exception Is:"+ex);
            // if it gets here it is because the element is still displayed after timeoutInSeconds
            // insert code most suitable for you
        }
        return;
    }


    // fluemt Wait 


    public WebElement fluientWaitforElement(WebElement element, int timoutSec, int pollingSec) {

        FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(timoutSec, TimeUnit.SECONDS)
                .pollingEvery(pollingSec, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, TimeoutException.class).ignoring(StaleElementReferenceException.class);

        for (int i = 0; i < 2; i++) {
            try {
                //fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We are processing through trillions of data events, this insight may take more than 15 minutes to complete.']")));
                fWait.until(ExpectedConditions.visibilityOf(element));
                fWait.until(ExpectedConditions.elementToBeClickable(element));
            } catch (Exception e) {

                System.out.println("Element Not found trying again - " + element.toString().substring(70));
                e.printStackTrace();

            }
        }

        return element;

    }
   //window handle  
    public void windowhandle(WebDriver driver){
   
    for (String handle : driver.getWindowHandles()) {
		 
    	System.out.println(handle);

    	driver.switchTo().window(handle);

    	}
    }
    
    public void switchtoparentwindow(WebDriver driver)
    {
    	String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
    	String subWindowHandler = null;

    	Set<String> handles = driver.getWindowHandles(); // get all window handles
    	Iterator<String> iterator = handles.iterator();

    	subWindowHandler = iterator.next();

    	driver.switchTo().window(subWindowHandler); // switch to popup window

    	// Now you are in the popup window, perform necessary actions here

    	driver.switchTo().window(parentWindowHandler);
    }
    
    public void scrollToMobileElement(String scrollTo) {
    	androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + scrollTo + "\"));");

    } 
    
    public void scrollToElement(MobileElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    
    
    
    public void VerifyTextFieldisEditable(WebElement element,WebDriver driver) throws InterruptedException
    {
        waitForSomeTime();
        HighlightOnElement(element, driver);
        WebElement fieldName = element;
        fieldName.sendKeys("Environment");
        String fieldNameVal = fieldName.getAttribute("value");
        if(fieldNameVal.contentEquals("Environment")){
        Reporter.log("Field is editable",true);
        }
        else{
        Reporter.log("Field is non editable" + fieldNameVal,true);
     }
       
    
    }
}
