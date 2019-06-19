package Basics_pgm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdown_bootsrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
				
		List<WebElement> drop = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		for(int i=0; i<drop.size();i++)
		{
			WebElement ele = drop.get(i);
			String drop_name=ele.getAttribute("innerHTML");
			
			System.out.println("The name of the dropdown is "+drop_name);
			
			
			if(drop_name.equals("CSS"))
			{
				ele.click();
			}
		}
		
		driver.quit();
	}

}



