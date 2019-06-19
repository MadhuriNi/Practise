package final_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		
		By user=By.cssSelector("input[id='username']");
		By pass=By.cssSelector("input[type='password']");
		By login=By.cssSelector("input[type='submit']");
		
		driver.findElement(user).sendKeys("abcd");
		driver.findElement(pass).sendKeys("efgh");
		driver.findElement(login).submit();

	}

}
