package Basics_pgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.19.0-win64//geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		System.out.println("hittttttinggggggg");
		
		driver.get("http://www.qaclickacademy.com/");
		
		System.out.println("its a hit !!!");
		
		System.out.println("Title is : "+driver.getTitle());
		
		// System.out.println(driver.getPageSource());
		
		System.out.println("The current url is : "+driver.getCurrentUrl());
		
		driver.close();
	
	}

}
