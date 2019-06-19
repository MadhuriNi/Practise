package final_handleWebElemets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class checkboxAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));
		System.out.println("Total number of checkboxes are : " + checkboxes.size());

	}

}
