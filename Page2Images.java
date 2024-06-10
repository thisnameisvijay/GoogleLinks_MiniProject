package testcases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page2Images {
  public static WebDriver driver;
  
  public Page2Images(WebDriver driver) {
	  this.driver=driver;
  }
  //xpath of about results
  public static WebElement aboutresults()
  {
	  //WebElement aboutresults = driver.findElement(By.xpath("//*[@id='result-stats']"));
	  WebElement aboutresults = driver.findElement(By.xpath("//div[@id=\"result-stats\"]"));
	  return aboutresults;
  }
  //xpath of images
  public static WebElement images() 
  {
      //WebElement images = driver.findElement(By.xpath("//*[@id='bqHHPb']/div/div/div/div[1]/div[1]/a/div/span"));
	  //WebElement images = driver.findElement(By.xpath("(//div[@class='YmvwI'])[2]"));
	 // WebElement images = driver.findElement(By.xpath("(//div[@data-hveid='CBMQAA']//div[@class='YmvwI']"));
	  
	 WebElement images = driver.findElement(By.xpath("//div[text()='Images']"));
	  return images;
  }
}
