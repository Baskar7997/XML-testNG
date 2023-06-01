package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SuiteExample {
	WebDriver driver;
	long startTime;
	 long endTime;
	
 @BeforeSuite
  public void launchBrowser() {
	 startTime = System.currentTimeMillis();
	 driver = new ChromeDriver();
  }
	 
	   @Test(priority = 1)
         public void openGoogle()   {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
           driver.get("https://www.google.co.in/");     	 
        }
	
	   @Test(priority = 2)
         public void openBing()  {
	  	   driver.get("https://www.bing.com/");
    	}
	
	    @Test(priority = 3)
           public void openYahoo() {					
   	       driver.get("https://www.yahoo.com/");   	      	  	   
        }
	
 @AfterSuite
  public void closeBrowser() {
   driver.quit();
    endTime = System.currentTimeMillis();
    long totalTime =endTime-startTime;
	System.out.println("total time=  "+totalTime);
	}		
 }



