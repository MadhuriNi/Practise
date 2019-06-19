package final_handleWebElemets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Enter the letter BENG
//Verify if the Airport Option is displayed in the suggestive box

public class AutoSuggestivedd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ksrtc.in");
		driver.manage().window().maximize();

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0,500)");

		WebElement to_place = driver.findElement(By.cssSelector("#fromPlaceName"));
		to_place.sendKeys("BENG");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);

		// to extract hidden elements use JavaScript Executor
		String text = (String) je.executeScript("return document.getElementById(\"fromPlaceName\").value;");
		System.out.println(text);

		int i=0; //in case the required text is not present search uptill 10 values and then stop
		while (!text.contains("AIPORT")) {
			
			i++;
			to_place.sendKeys(Keys.ARROW_DOWN);
			text = (String) je.executeScript("return document.getElementById(\"fromPlaceName\").value;");
			System.out.println("The place we got is : " + text);
			
			
			if(i>10)
			{
				System.out.println("Element not found");
			  break;	
			}
		}
		
		

	}

}
