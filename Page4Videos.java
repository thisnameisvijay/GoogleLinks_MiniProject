package testcases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page4Videos {
	public static WebDriver driver;
	  
	  public Page4Videos(WebDriver driver) {
		  this.driver=driver;
	  }
	  //xpath of videos
	  public static WebElement videos() {
		 // WebElement videos =driver.findElement(By.xpath("//*[@id='cnt']/div[3]/div/div/div[1]/div[1]/div/a[5]/div"));
		  WebElement videos =driver.findElement(By.xpath("//*[text()='Videos']"));
		  return videos;
	  }
}


