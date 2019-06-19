package Basics_pgm;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	Logger logger =	Logger.getLogger("logsDemo");
	PropertyConfigurator.configure("Log4j.properties");
	
	logger.info("This is the start of the program");
	
	System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	logger.info("Opening firefox browser !!");

	driver.get("http://www.ksrtc.in/oprs-web/");
	logger.info("Opening the ksrtc site !!!!!!!");
	
	driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
	logger.info("Serach button is being clicked !!");
	
	
	
	
	

	}

}
