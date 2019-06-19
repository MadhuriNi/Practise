package Basics_pgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Selenium 3.0 -- Firefox 48+	
		
	//	https://github.com/mozilla/geckodriver/releases	
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.19.0-win64//geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		
		
	}

}
