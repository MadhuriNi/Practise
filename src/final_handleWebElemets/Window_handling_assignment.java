package final_handleWebElemets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		By multiple_window=By.xpath("//a[@href='/windows']");
		driver.findElement(multiple_window).click();
		
		System.out.println("The parent window title is : "+driver.getTitle());
		
		By click_here=By.xpath("//a[@href='/windows/new']");
		driver.findElement(click_here).click();
		
		Set<String> ws=driver.getWindowHandles();
		Iterator<String> it=ws.iterator();
		
		String parent_id=it.next();
		String child_id=it.next();
		
		driver.switchTo().window(child_id);
		
		System.out.println("The child window title is : "+driver.getTitle());

		String child_text=driver.findElement(By.xpath("/html/body/div/h3")).getText();
		System.out.println("The child text is : "+child_text);
		
		driver.switchTo().window(parent_id);
		
		String parent_text=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println("The parent text is : "+parent_text);
		
		
		

	}

}
