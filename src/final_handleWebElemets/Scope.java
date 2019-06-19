package final_handleWebElemets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		//1.get the total count of links on the entire page
		System.out.println("The total links on the page are : "+driver.findElements(By.tagName("a")).size());
		
		
		//2.find the links on the footer section -- limitimg webdriver scope
		WebElement footer_driver=driver.findElement(By.id("gf-BIG"));
		System.out.println("The total links on footer are "+footer_driver.findElements(By.tagName("a")).size());
		
		
		//3.find the links on the footer in the first column
		WebElement footer_firstcolumn_driver=footer_driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("The total links on footer in the first column are : "+footer_firstcolumn_driver.findElements(By.tagName("a")).size());
		
		
		//4.click on each link and see if the link is working
		for(int i=1;i<footer_firstcolumn_driver.findElements(By.tagName("a")).size();i++)
		{
			String click_on_link=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			footer_firstcolumn_driver.findElements(By.tagName("a")).get(i).sendKeys(click_on_link);
			//driver.navigate().back();		
		}
		
		
		//5.get the title of each and every tab
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		
		String parent_id=it.next();
		System.out.println("The parent window title is "+driver.getTitle());
	/*	
		String child1_id=it.next();
		driver.switchTo().window(child1_id);
		System.out.println("The first page title is "+driver.getTitle());
		
		String child2_id=it.next();
		driver.switchTo().window(child2_id);
		System.out.println("The second page title is "+driver.getTitle());
		
		String child3_id=it.next();
		driver.switchTo().window(child3_id);
		System.out.println("The third page title is "+driver.getTitle());
		
		String child4_id=it.next();
		driver.switchTo().window(child4_id);
		System.out.println("The fourth page title is "+driver.getTitle());
		*/
		while(it.hasNext())
		{
			int j=1;
			driver.switchTo().window(it.next());
			System.out.println("The "+j+"t page title is : "+driver.getTitle());
			j++;
		}
		
		
		
		
		
		
		

	}

}
