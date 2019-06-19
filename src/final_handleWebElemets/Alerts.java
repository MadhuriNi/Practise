package final_handleWebElemets;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		Thread.sleep(5000);
		
		By confirm_alert=By.xpath("//input[@value='Confirmation Alert']");
		driver.findElement(confirm_alert).click();
		
		Alert alt=driver.switchTo().alert();
		String alt_text=alt.getText();
		
		System.out.println("The alert text is : "+alt_text);
		alt.accept();
		//alt.dismiss();
		
		Assert.assertEquals(alt_text, "Are you sure you want to give us the deed to your house?");

	}

}
