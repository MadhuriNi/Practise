package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdwn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com");
		
		Thread.sleep(5000);
		
	    WebElement source= driver.findElement(By.xpath("//input[@id='fromCity']"));
	    source.click();
	    WebElement source1=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	    source1.sendKeys("MUM");
	    source1.sendKeys(Keys.ARROW_DOWN);
	    source1.sendKeys(Keys.ENTER);
		

	}

}
