package final_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("The title we got from Chrome is "+title);
		driver.close();
			

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com");
		String title1=driver1.getTitle();
		System.out.println("The title we got from firefox is "+title1);
		driver1.close();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("the title is "+driver.getTitle());
		
		System.out.println("the current url is "+driver.getCurrentUrl());
		System.out.println("the page source is "+driver.getPageSource());
		
		driver.get("http://yahoo.com");
		System.out.println("the title is "+driver.getTitle());
		driver.navigate().back();
		System.out.println("the title is after coming back "+driver.getTitle());
		driver.navigate().forward();
		System.out.println("the title is after going forward "+driver.getTitle());
		
		
		
		driver.quit();
		
		
		
	}

}


