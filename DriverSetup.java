package UserSetup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
      public static WebDriver driver;
      
      public static String browsertype;
  	  public static WebDriver launchdriver(String browser) {
  		browsertype = browser;
  			driver = new ChromeDriver();
  	
  		driver.manage().window().maximize();	
  		driver.manage().deleteAllCookies();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
  		return driver;
   }
}








