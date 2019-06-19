package final_handleWebElemets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.manage().window().maximize();
		
		String exp_date="23";
		
		By calendar=By.xpath("//input[@name='travel_date']");
		driver.findElement(calendar).click();
		
		Thread.sleep(1000);
		
		//pick the month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().equalsIgnoreCase("Apil"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		System.out.println("got the month "+((WebElement) By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText());
		
		//grab the common attribute put it in list and iterate
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		for(int i=0;i<=dates.size();i++)
		{
			String act_date=dates.get(i).getText();
			if(act_date.equals(exp_date))
			{
				dates.get(i).click();
				System.out.println("the date is clicked");
				break;
			}
			else {
				System.out.println("the date is not matching -- actual date is " +act_date +" and exp date is 23");
				
			}
		}

	}

}
