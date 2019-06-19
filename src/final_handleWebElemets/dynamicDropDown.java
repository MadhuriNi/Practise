package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		//By depart=By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
		By depart = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
		driver.findElement(depart).click();
		
	    By city=By.cssSelector("a[text='Pune (PNQ)']");
	    driver.findElement(city).click();
	    
	    Thread.sleep(10000);
	    
		
		//By arr_city=By.xpath("(//a[@value='BOM'])[2]");  //by index
		By arr_city=By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']");    //parent child relationship
		driver.findElement(arr_city).click();
		
		
	//	$x("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='ATQ']")   parent child
		
	}

}
