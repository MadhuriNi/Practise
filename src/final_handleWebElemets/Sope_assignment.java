package final_handleWebElemets;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sope_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		driver.manage().window().maximize();
		
		By checkbox=By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input");
		driver.findElement(checkbox).click();
		String name=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println("The checkbox name is : "+name);
	
		WebElement dd=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dd);
		s.selectByVisibleText(name);
		
		WebElement text_box=driver.findElement(By.xpath("//input[@id='name']"));
		text_box.sendKeys(name);
		
		By alert_bt=By.cssSelector("#alertbtn");
		driver.findElement(alert_bt).click();
		
		Alert alt=driver.switchTo().alert();
		String alert_text=alt.getText();
		
		if(alert_text.contains(name))
		{
			System.out.println("the text is present");
		}
			else
			{
			System.out.println("the text is not present");
			}
		}
		
	}


