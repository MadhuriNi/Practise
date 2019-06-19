package Basics_pgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class alertDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		
		
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(200);

		String alt_actual=alt.getText();
		alt.accept();
		
		System.out.println("The text on Alert pop up is --------"+alt_actual);
		
		Assert.assertEquals(alt_actual, "Please add the start place");
			
		
		
	}

}
