package final_handleWebElemets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://spicejet.com");
		
		By check1=By.cssSelector("input[name*=friendsandfamily]");
		driver.findElement(check1).click();
		
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int i=checkboxes.size();
		System.out.println("The number of checkboxes are : "+i);
		
		for(int j=0;j<i;j++)
		{
			System.out.println("inside for");
			WebElement c=checkboxes.get(j);
			String check_name=c.getAttribute("innerHTML");
			System.out.println("The name is "+check_name);
		}
		
	}

}
