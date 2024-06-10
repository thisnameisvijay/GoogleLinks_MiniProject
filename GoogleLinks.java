package MainDemo.java;

import java.io.IOException;
//import java.time.Duration;
import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UserSetup.DriverSetup;
import UserSetup.ScreenShot;
import testcases.java.Page1Search;
import testcases.java.Page2Images;
import testcases.java.Page3News;
import testcases.java.Page4Videos;

public class GoogleLinks {
   public static WebDriver driver;
   public static String browser="chrome";
   public static WebElement allLinks,search,searchoptions,clickgooglesearch,aboutresults,images,News,videos;
   public static Page1Search page1Search;
   public static Page2Images page2Images;
   public static Page3News page3News;
   public static Page4Videos page4Videos;
   
   //creating method for every step 
   //launch browser
   public static void launchbrowser(String browser)
   {
	   driver=DriverSetup.launchdriver(browser);
   }
   
   //Goto https://www.google.com/
   public static void openUrl()
   {
	   driver.get("https://www.google.com");
       driver.manage().window().maximize(); 
   }
   
   //Find the number of links in the web page.
   public static void linkCount() 
   {
	   page1Search=new Page1Search(driver);
	   List<WebElement> allLinks = Page1Search.allLinks();
	      System.out.println("Number of links in the web page: " + allLinks.size());
	    //Print all the link names
	      System.out.println("Link names:");
	      for(WebElement link : allLinks) {
	    	  System.out.println(link.getText());   
	      }    
   }
   
   //Type "Cognizant" in search text box
   public static void enterCognizant()
   {
	   WebElement search= Page1Search.search();
	   search.sendKeys("Cognizant");
   }
   
   //Find the number of search options displayed
   public static void displayOptions() 
   {
	   
	   List<WebElement> searchoptions = Page1Search.searchoptions();
	   System.out.println("Number of search options dispalyed: " + searchoptions.size());
	   try {
		ScreenShot.getscreenshot(driver,"optionsdisplayed");
	} catch (IOException e) {
		e.printStackTrace();
	}
	 //Print all the search options
	   System.out.println("searchoptions names:");
       for(WebElement opt:searchoptions) 
       {
       System.out.println(opt.getText());
       }   
   }
   
   //Click on Google Search button
   public static void clickGoogle()
   {
	   WebElement clickgooglesearch = Page1Search.clickgooglesearch();
	   clickgooglesearch.click();
   }
   
   //Print results displayed as “About for XXXXX” & Take full page screen shot of the search results page
   public static void results() 
   {
	   page2Images =new Page2Images(driver);
	   WebElement aboutresults = Page2Images.aboutresults();
	   System.out.println(aboutresults.getText());	 
	   try {
		ScreenShot.getscreenshot(driver,"searchresults");
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   
   //Click “Images” in the google & Take full page screen shot of the search results page
   public static void displayImages() 
   {
	   WebElement images = Page2Images.images();
	   images.click();
	   try {
		ScreenShot.getscreenshot(driver,"Images");
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   
   //Click “News” in the google & Take full page screen shot of the search results page
   public static void displayNews() 
   {
	    page3News=new Page3News(driver);
	   WebElement news = Page3News.news();
	   news.click();
	   try {
		ScreenShot.getscreenshot(driver,"news");
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   
   //Click “Videos” in the google & Take full page screen shot of the search results page
   public static void displayVideos() 
   {
	    page4Videos=new Page4Videos(driver);
	   WebElement videos = Page4Videos.videos();
	   videos.click();
	   try {
		ScreenShot.getscreenshot(driver,"videos");
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   
   //Close the browser window
   public static void closeBrowser()
   {
	   driver.quit();
   }
   
   //calling all methods 
   public static void main(String[] args) 
   {
	   launchbrowser(browser);
	   openUrl();
	   linkCount();
	   enterCognizant();
	   displayOptions();
	   clickGoogle();
	   results();
	   displayImages();
	   displayNews();
	   displayVideos();
	   closeBrowser();   
   }
   
}

