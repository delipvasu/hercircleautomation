/**
 * 
 */
package Commonfiles1;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;

import Baseclass.Mobilebaseclass;
import Baseclass.baseclass;





/**
 * @author Vasu
 *
 */
public  class ListenerDriver2 extends Mobilebaseclass implements ITestListener,IRetryAnalyzer,IAnnotationTransformer
{
	public WebDriver driver;
	static String failureTestCase_ScreenShotLocation = "C:\\HercirclemobileAutomation\\MobileFailureScreenShot\\";
    static String successTestCase_ScreenShotLocation = "C:\\HercirclemobileAutomation\\MobileSucussScreenShot\\";
    private int retryCnt = 0;
    private int maxRetryCnt = 1; /* maxRetryCnt (Maximiun Retry Count) as per your requirement. Here I took 1, If any failed testcases then it runs two times*/

//    ListenerDriver() {
//    	this.driver = super.driver;
//    }
    
    @Override
    public void onFinish(ITestContext arg0)
    {
        // TODO Auto-generated method stub
       
    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
       
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
       
    }

/*************************************************************************************************************/
    /* (non-Javadoc)
     * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
     *onTestFailure() is used to take the ScreenShot and store in the Specified path folder'
     * EventFiringWebDriver listenser is a webdriver class which is used to help to take ScreenShot
     * by using non-static method getScreenshotAs() pass the Output File Type as a argument.
     * FileUtils is a apache class having Static copyFile() used to store the screenshot
     * from source to destination.
     * @author Vasu
     * @since 2017-06-15
     */
/****************************************************************************************************************/
    @Override
    public void onTestFailure(ITestResult result)
    {
    	Object currentClass = result.getInstance();
        WebDriver driver = ((Mobilebaseclass) currentClass).getDriver();
    	
    	EventFiringWebDriver  fdriver=new EventFiringWebDriver(driver);
        File sourcefile =fdriver.getScreenshotAs(OutputType.FILE);
        File destinatiofile=new File(failureTestCase_ScreenShotLocation + result.getName() + getDateTimeStamp() + ".png");
        try
        {
            FileUtils.copyFile(sourcefile,destinatiofile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String filePath = destinatiofile.toString();
        String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
        Reporter.log(path,true);
    }

/********************************************************************************************************************/
    /**
     * getDateTimeStamp() is used for display the month,date and time stamp along with failed testcases.
     * @return
     * @author Vasu
     * @since 2017-06-15
     */
/********************************************************************************************************************/
    public static String getDateTimeStamp()
    {
        // creates a date time stamp that is Windows OS filename compatible
        return new SimpleDateFormat(" MMM dd   HH.mm.ss").format(Calendar.getInstance().getTime());
    }

    @Override
    public void onTestSkipped(ITestResult arg0)
    {
        // TODO Auto-generated method stub
       
    }

    @Override
    public void onTestStart(ITestResult arg0)
    {
        // TODO Auto-generated method stub
       
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
    	Object currentClass = result.getInstance();
        WebDriver driver = ((Mobilebaseclass) currentClass).getDriver();
    	
        EventFiringWebDriver  fdriver=new EventFiringWebDriver(driver);
        File sourcefile =fdriver.getScreenshotAs(OutputType.FILE);
        File destinatiofile=new File(successTestCase_ScreenShotLocation + result.getName() + getDateTimeStamp() + ".png");
        try
        {
            FileUtils.copyFile(sourcefile,destinatiofile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String filePath = destinatiofile.toString();
        String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
        Reporter.log(path,true);
       
    }

    @Override
    public boolean retry(ITestResult result)
    {
         if (retryCnt < maxRetryCnt)
         {
                System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
                retryCnt++;
                return true;
            }
        return false;
    }

    @Override
    public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod)
    {
        IRetryAnalyzer retry = testannotation.getRetryAnalyzer();
         
        if (retry == null)   
        {
            testannotation.setRetryAnalyzer(ListenerDriver2.class);
        }
       
    }

   
}