package final_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(1000);
		

		By first=By.cssSelector("input[type='email']"); //customised css 
		driver.findElement(first).sendKeys("madhuri");
		
		By pass=By.cssSelector("input[id*='passwo']"); //regular expression css
		driver.findElement(pass).sendKeys("nirmale");
		
		By login=By.xpath("//div[@id='theloginform']/form/div[3]/input");  //absolute xpath
		driver.findElement(login).submit();
		
		
		
		

	}

}
