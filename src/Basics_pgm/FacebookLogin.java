package Basics_pgm;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		
		driver.get("https://www.facebook.com/");
		
		System.out.println("URL opened");
		
		// By using xpath, id and name
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("madhuri.nirmale@gmail.com");  // entering email id
		driver.findElement(By.name("pass")).sendKeys("madhu525525");                              //entering password
		
		driver.findElement(By.id("loginbutton")).click();         //login clicked
		
		System.out.println("Inside facebook"); 
		
		
		
		
	}

}
