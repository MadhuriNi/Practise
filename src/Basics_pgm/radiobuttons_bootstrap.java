package Basics_pgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons_bootstrap {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
	List<WebElement> radio_buttons =	driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	
	for(int i=0;i<radio_buttons.size();i++)
	{
			WebElement ele =radio_buttons.get(i);
			String s =ele.getAttribute("value");
			
			System.out.println("Radio Buttons name is "+s );
			
			if(s.equals("PYTHON"))
			{
			ele.click();
			}
	}

}
}


