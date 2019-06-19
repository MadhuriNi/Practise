package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		By link=By.xpath("//*[@id='content']/a[2]");
		driver.findElement(link).click();
		
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		System.out.println("The message got is : "+driver.findElement(By.id("results")).getText());
		
		
	}

}
