//object repository  (to store all the locators in the form of objects)
package testcases.java;    

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1Search {
     public static WebDriver driver;
	
	
	public Page1Search (WebDriver driver){   
    	 this.driver=driver;
     }
	//xpath of links in the webpage
	public static List<WebElement> allLinks() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		return allLinks;
	}
	//xpath of search text box
	public static WebElement search() {
		WebElement search = driver.findElement(By.id("APjFqb"));
		return search;
	}
	//xpath of list of search options displayed
	public static List<WebElement> searchoptions() {
		List<WebElement> searchoptions = driver.findElements(By.xpath("//*[@id='Alh6id']/div[1]/div/ul/li"));
		return searchoptions;	
	}
	//xpath of google search
	public static WebElement clickgooglesearch() {
		WebElement clickgooglesearch =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]"));
	    return clickgooglesearch;
	}
}
