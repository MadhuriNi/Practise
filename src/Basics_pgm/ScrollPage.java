package Basics_pgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("scroll(0,400)");
	}

}
