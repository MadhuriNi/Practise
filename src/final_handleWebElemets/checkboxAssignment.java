package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		By checkbox1 = By.xpath("//input[@name='checkBoxOption1']");
		driver.findElement(checkbox1).click(); // check

		if (driver.findElement(checkbox1).isSelected() == true) {
			System.out.println("The checkbox is selected");
			driver.findElement(checkbox1).click(); // uncheck
			System.out.println("The check box is selected :" + driver.findElement(checkbox1).isSelected());
		}

	}

}
