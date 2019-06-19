package captureScreenshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Utility;

import java.io.*;

public class FacebookScreenshot {

	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		Utility.CaptureScreenshot(driver,"Screenshot1");
		
		driver.manage().window().maximize();
		
		Utility.CaptureScreenshot(driver,"Screenshot2");
		
		driver.get("https://www.facebook.com");
		
		Utility.CaptureScreenshot(driver,"Screenshot3");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("madhuri.nirmale@gmail.com");
		
		Utility.CaptureScreenshot(driver,"Screenshot4");
		
		driver.quit();
		
		
	}
	
}
