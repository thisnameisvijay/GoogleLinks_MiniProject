package UserSetup;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
     public static String filepath = ".\\Screenshots\\";
     WebDriver driver;
     
     public  void Screenshot(WebDriver driver)
     {
    	 this.driver=driver;
     }
     public static void getscreenshot(WebDriver driver,String fileName)throws IOException
     {
    	 DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy h-m-s");
    	 Date date=new Date();
    	 //capturing screenshot as File
    	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 try
    	 {
    		 //save screenshot in the desired location
    		 FileUtils.copyFile(src, new File(filepath+fileName+"_"+dateFormat.format(date)+".png"));
    	 }
    	 catch(IOException e)
    	 {
    		 System.out.println(e.getMessage());
    	 }
    	 System.out.println("Screenshot saved successfully.");
    	 
     }
}
