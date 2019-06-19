package Basics_pgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		
		Actions act=new Actions(driver);
		//Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		System.out.println("The no. of elements are "+elements.size());
		

		
		for(int i=0;i<elements.size();i++)
		{
				WebElement eles = elements.get(i);
				
				boolean status=eles.isEnabled();
				
				System.out.println("The elements are "+eles.getAttribute("innerHTML")+" the status is ---- "+status);
			
		
		}
		
		
	}

}



