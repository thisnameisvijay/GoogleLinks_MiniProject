package testcases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page3News {
	public static WebDriver driver;
	  
	  public Page3News(WebDriver driver) {
		  this.driver=driver;
	  }
	  //xpath of news
	  public static WebElement news() {
		  //WebElement news =driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div[1]/div/div[1]/div[1]/div/div/a[2]"));
		  WebElement news =driver.findElement(By.xpath("//*[text()='News']"));
	      return news;
	  }
}
