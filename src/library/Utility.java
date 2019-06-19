package library;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

public class Utility {

	public static void CaptureScreenshot(WebDriver driver, String screenshotName)
	{
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			System.out.println("Screenshot taken !!!");
			
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is "+e.getMessage());
		} 
	}
	
	
}
