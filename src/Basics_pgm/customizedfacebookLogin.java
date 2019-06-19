package Basics_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customizedfacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("madhuri.nirmale@gmail.com");  //single attribute
		
		driver.findElement(By.xpath("//input[@class='inputtext'][@name='email']")).sendKeys("madhuri.nirmale@gmail.com");  //multiple attributes
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("madhu525525");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.findElement(By.xpath("//*[text()='Log In']")).click();
		
		//driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div/div/div/input")).sendKeys("Madhuri");
		
	}

}





