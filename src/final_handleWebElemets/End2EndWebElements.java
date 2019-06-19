package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2EndWebElements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");

		driver.manage().window().maximize();

		By source = By.cssSelector("input[id*='originStation1_CTXT']");
		driver.findElement(source).click();

		By source_city = By.cssSelector("a[text='Pune (PNQ)']");
		driver.findElement(source_city).click();

		Thread.sleep(1000);

		By dest_city = By.xpath("(//a[@text='Mumbai (BOM)'])[2]");
		driver.findElement(dest_city).click();

		By date = By.cssSelector(".ui-state-default.ui-state-highlight");
		driver.findElement(date).click();

		By dept_date = By.cssSelector("#Div1");
		if (driver.findElement(dept_date).getAttribute("style").contains("0.5")) {
			System.out.println("Departure Date is disabled");
		}

		Thread.sleep(1000);

		By passenger = By.id("divpaxinfo");
		driver.findElement(passenger).click();

		Thread.sleep(1000);

		By passenger_inc = By.xpath("//span[@id='hrefIncAdt']");
		driver.findElement(passenger_inc).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".buttonN")).click();

		// By curr=By.xpath("//select[conatins(@name,'ListCurrency')]");
		By curr = By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']");
		WebElement currency = driver.findElement(curr);

		Select s = new Select(currency);
		s.selectByValue("USD");

		By submit = By.cssSelector("input[type='submit']");
		driver.findElement(submit).click();

	}

}
