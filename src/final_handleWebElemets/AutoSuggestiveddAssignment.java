package final_handleWebElemets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveddAssignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		
		WebElement select_country=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		select_country.sendKeys("IND");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		select_country.sendKeys(Keys.ARROW_DOWN);
		System.out.println(select_country.getText());
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		String text=(String) je.executeScript("return document.getElementById(\"autocomplete\").value;");
		
		System.out.println("The value is : "+text);
		
		while(!text.equalsIgnoreCase("India"))
		{
			select_country.sendKeys(Keys.ARROW_DOWN);
			
			text=(String) je.executeScript("return document.getElementById(\"autocomplete\").value;");
			System.out.println("The country name is "+text);
		}
	}

}
