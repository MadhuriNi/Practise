package Basics_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://wordpress.com/log-in");
		
		driver.findElement(By.cssSelector("input#usernameOrEmail")).sendKeys("demo");  // By id use # symbol
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("demo");   // By conatins operator
		driver.findElement(By.cssSelector("button[type='submit']")).click();          // By Single attribute
		
		driver.findElement(By.cssSelector("a[href$='lostpassword']")).click();        // By ends with operator
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("madhuri.nirmale@gmail.com"); //By starts with operator
		
		
	}

}
