package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com"); 
		
		By nested_frames=By.xpath("//a[@href='/nested_frames']");
		driver.findElement(nested_frames).click();
		
	//	WebElement middle_frame=driver.findElement(By.xpath("/html/frameset/frame[2]"));
		
		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());
	
		
		

	}

}
