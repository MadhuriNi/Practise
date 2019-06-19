package Basics_pgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath(".//*[@id='txtJourneyDate']")).click();
		
		List<WebElement> date=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tr//td//a"));
		
		for(int i=0;i<date.size();i++)
		{
			String d=date.get(i).getText();
			System.out.println("The date got is ------"+d);
			
			if(d.equals("21"))
			{
				date.get(i).click();
			}
			
			
		}
		
		
		
		
		
	}

}
