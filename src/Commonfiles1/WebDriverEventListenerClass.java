package Commonfiles1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebDriverEventListenerClass extends AbstractWebDriverEventListener {

    long startTime, endTime;

   @Override
    public void beforeNavigateTo(String arg0, WebDriver arg1) {
                 startTime = System.currentTimeMillis();
    }

    @Override
    public void afterNavigateTo(String arg0, WebDriver arg1) {

                endTime = System.currentTimeMillis();
               //System.out.println(“Page load time for ” + arg0 + ” is (in milliseconds) : ” + (endTime – startTime));

System.out.println("page load time"+ arg0 + "is (in milliseconds):" + (endTime-startTime));


     }

}