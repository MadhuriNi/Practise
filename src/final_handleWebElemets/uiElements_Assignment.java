package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uiElements_Assignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		By from = By.xpath("//input[@id='FromTag']");
		WebElement from_city = driver.findElement(from);
		from_city.sendKeys("pune");
		Thread.sleep(5000);
		from_city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		from_city.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		Thread.sleep(5000);

		By to = By.cssSelector("input[id='ToTag']");
		WebElement to_city = driver.findElement(to);
		to_city.sendKeys("orl");
		Thread.sleep(5000);
		to_city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		to_city.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		By date = By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ");
		driver.findElement(date).click();

		Thread.sleep(1000);

		By adults = By.id("Adults");
		WebElement adults1 = driver.findElement(adults);
		Select s = new Select(adults1);
		s.selectByValue("4");

		Thread.sleep(1000);

		By more_options = By.xpath("//a[contains(@id,'MoreOptions')]");
		driver.findElement(more_options).click();

		By preferred_airlines = By.xpath("//input[@id='AirlineAutocomplete']");
		driver.findElement(preferred_airlines).sendKeys("emira");
		Thread.sleep(5000);
		driver.findElement(preferred_airlines).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(preferred_airlines).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		By submit = By.cssSelector(".booking.large");
		driver.findElement(submit).click();

	}

}
