package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		Actions a =new Actions(driver);
		
		WebElement move_mouse=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		//Moves to specific element
		a.moveToElement(move_mouse).build().perform();

	}

}


