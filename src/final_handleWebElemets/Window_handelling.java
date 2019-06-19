package final_handleWebElemets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");*/
		
		By help=By.cssSelector("a[target='_blank']");
		driver.findElement(help).click();
		
		System.out.println("The title of parent is : "+driver.getTitle());
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String parent_id=it.next();
		System.out.println("the parent id is : "+parent_id.toString());
		
		String child_id=it.next();
		System.out.println("the child id is : "+child_id.toString());
		
		driver.switchTo().window(child_id);
		System.out.println("the title of child is : "+driver.getTitle());
	}

}
