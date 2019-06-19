package final_handleWebElemets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radio_buttons=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	
		
		for(int i=0;i<radio_buttons.size();i++)
		{
			WebElement ra_bu=radio_buttons.get(i);
			String name=ra_bu.getAttribute("value");
			System.out.println("outside if the name is "+name);
			
			if(name.equalsIgnoreCase("Ruby"))
			{
				System.out.println("inside if the name is "+name);
				ra_bu.click();
			}
			
		}
	}

}
