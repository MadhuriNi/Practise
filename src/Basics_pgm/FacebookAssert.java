package Basics_pgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class FacebookAssert {

	WebDriver driver;

	@Test(dataProvider="data")
	public void fb_assert(String user,String password) {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		By id = By.cssSelector("input[id='email']");
		By pass = By.cssSelector("input[name='pass']");
		By login = By.id("loginbutton");
				
		System.out.println("The user id is "+user+" The password is "+password);	
		
		driver.findElement(id).sendKeys(user);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(login).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		By string=By.cssSelector("span[class='_1vp5']");	
				
		Assert.assertEquals(string, "Madhuri");
		
		//driver.quit();

	}
	
	
	@DataProvider(name="data")
	public Object[][] getData()
	{
		Object[][] arr=new Object[2][2];
		
		arr[0][0]="madhuri@gmail.com";
		arr[0][1]="pass";
		
		arr[1][0]="madhuri.nirmale@gmail.com";
		arr[1][1]="madhu525525";
		
		return arr;
	}

}
