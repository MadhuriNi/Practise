package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		WebElement iframe_box=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(iframe_box);
		
		driver.findElement(By.id("draggable")).click();
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, dest).build().perform();
		
		driver.switchTo().defaultContent(); //comes back to parent window
	}

}
