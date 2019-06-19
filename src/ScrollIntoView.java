import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.openqa.selenium.JavascriptExecutor;


public class ScrollIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='mCSB_4_container']/p[11]"));
		System.out.println("Th element is -----"+ele);
		
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)", ele);
		
	}

}
