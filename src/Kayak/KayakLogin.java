package Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KayakLogin {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.kayak.com/");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@class='_e _mj _rq']")).click();
		
		System.out.println("------------Clicked on Adult----------");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//button[@id='whui']")).click();
		
		System.out.println("--------------------Clicked on increment-------------------");
		
	}

}
