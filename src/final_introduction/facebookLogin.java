package final_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		
	/*	By email=By.className("inputtext");
		By pass=By.className("inputtext");
		By login=By.id("u_0_2"); */
		
	/*	By email=By.xpath("//input[@type='email']");
		By pass=By.xpath("//input[@name='pass']");
		By login=By.xpath("//input[@value='Log In']"); */
		
		By email=By.cssSelector("input[id='email']");
		By pass=By.cssSelector("input[name='pass']");
		By login=By.cssSelector("[value='Log In']");
		
		driver.findElement(email).sendKeys("madhuri.nirmale@gmail.c");
		driver.findElement(pass).sendKeys("madhu525525");
		driver.findElement(login).submit();
		
		

	}

}

