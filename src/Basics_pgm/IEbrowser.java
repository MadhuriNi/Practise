package Basics_pgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer_x64_3.6.0//IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}


