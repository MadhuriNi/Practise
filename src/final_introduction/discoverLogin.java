package final_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class discoverLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discover.com/");
		
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//use customised xpath and css and regular expressions in xpath and css
		
		By userID=By.xpath("//input[@id='userid-content']");                     //customised xpath
		driver.findElement(userID).sendKeys("madhuri2689");  
		
		By pass=By.cssSelector("input[id='password-content']");                  //customised css
		driver.findElement(pass).sendKeys("vanita786$");
		
		By logIn=By.xpath("//input[contains(@value,'Log I')]");                  //regular expression xpath
		driver.findElement(logIn).submit();
		
		/*By login1=By.cssSelector("input[value*='Log In']");                    //regular expression css
		driver.findElement(login1).submit();*/
				
		
	}

}
