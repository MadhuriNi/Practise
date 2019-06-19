package Basics_pgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class InstaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		
		driver.get("https://www.instagram.com");
		
		//driver.get("https://www.facebook.com");
		
		System.out.println("insta opened !!!!");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[2]/p/a")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		System.out.println("Login clicked !!!!");
		
		//driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[1]/div/input")).sendKeys("madhuri.nirmale@gmail.com"); //by xpath
		
		driver.findElement(By.name("username")).sendKeys("madhuri.nirmale@gmail.com"); // By name
		
		//driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[2]/div/input")).sendKeys("madhu525525"); //by xpath
		
		driver.findElement(By.name("password")).sendKeys("madhu525525"); // By name
		
		driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/span/button")).click();
		
		System.out.println("Entered the insta account");	
		 
		driver.findElement(By.xpath(".//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")).click();
		
		System.out.println("going to home page...............");
		
		driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/header/div[2]/div[1]/div/button")).click();
		
		System.out.println("clicking log out .............");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[4]/button")).click();
		
	}

}
