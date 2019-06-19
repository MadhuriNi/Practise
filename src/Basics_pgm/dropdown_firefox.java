package Basics_pgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_firefox {

	public static void main(String[] args) {
		
		//List<WebElement> year ;
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.xpath(".//*[@id='month']"));		
		Select sel1=new Select(dd);		
		sel1.selectByIndex(1);
		
		WebElement dd1=driver.findElement(By.xpath(".//*[@id='day']"));
		Select sel2=new Select(dd1);
		sel2.selectByValue("1");
		
		WebElement dd2=driver.findElement(By.xpath(".//*[@id='year']"));
		Select sel3=new Select(dd2);
		sel3.selectByVisibleText("2000");
		
		List<WebElement> month = sel1.getOptions();
		
		int total_month = month.size();
		
		System.out.println("Total no. of months "+total_month);
		
		for(WebElement ele:month)
		{	
			System.out.println("Months are "+ele.getText());
		}
		
		
		
		
	}

}
