package Basics_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("hittingggggggg");
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		
		System.out.println("opened !!! ");
		
		driver.findElement(By.xpath(".//*[@id='newsletter']/div[2]/div[3]/a")).click();
		
		System.out.println("clicked joined now !!!!!");
	}

}
