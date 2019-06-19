package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com");

		// Static DropDown
		By curr = By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']");
		Select s = new Select(driver.findElement(curr));

		s.selectByValue("USD");

		// Updated looped DropDown
		By passenger = By.cssSelector("div#divpaxinfo");
		driver.findElement(passenger).click();

		Thread.sleep(500);

		By incr = By.cssSelector("span[id=hrefIncAdt]");

		for (int i = 1; i < 5; i++) {
			driver.findElement(incr).click();
		}

		By done = By.xpath("//input[@value='Done']");
		driver.findElement(done).click();

	}

}
