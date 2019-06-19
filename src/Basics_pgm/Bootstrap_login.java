package Basics_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrap_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.goibibo.com");		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("4076686560");
		
		
		
		
	}

}
