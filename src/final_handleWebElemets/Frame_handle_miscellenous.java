package final_handleWebElemets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handle_miscellenous {
	
  public static	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.manage().window().maximize();
		
		int frame_number=switch_to_frame(By.xpath("//*[@id='recaptcha-anchor']/div[1]"));
		driver.switchTo().frame(frame_number);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();  //clicking on the captcha
		driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		int frame_number1=switch_to_frame(By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(frame_number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click(); //clicking on the verify button
		
	

	}
	
	public static int switch_to_frame(By by)
	{
		int i;
		int tot_frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The total number of frames are "+tot_frames);
		
		for(i=0;i<tot_frames;i++)
		{
			driver.switchTo().frame(i);
			
			int count=driver.findElements(by).size();
			
			if(count>0)
			{
				System.out.println("Element is present");
				System.out.println("The object is present in the frame : "+i);
				
				break;
			}
			else
			{
				System.out.println("Element is not present");
			}
		}
		
		driver.switchTo().defaultContent();
		return i;
	}

}
