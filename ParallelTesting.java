package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ParallelTesting {

	@Test
	public void openGoogle() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");  
		 driver.quit();
	}
	@Test
      public void openBing() {
    	  ChromeDriver driver = new ChromeDriver();
    	  driver.get("https://www.bing.com/");
    	  driver.quit();
	}
}
