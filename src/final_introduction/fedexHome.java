package final_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fedexHome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://home.fedex.com/Corporate/Pages/default.aspx");
		
	
		//By entry=By.xpath("//input[@id='keywordtext']");                //customised xpath
		//By entry=By.cssSelector("input[id='keywordtext']");             //customised css
		//By entry=By.cssSelector("input#keywordtext.searchfield");       //customised css  tagname#id.classname
		//By entry=By.xpath("//input[contains(@id,'keywordte')]");        //regular expression xpath 
		  By entry=By.cssSelector("input[id*='keywordte']");              //regular expression css
		
		driver.findElement(entry).sendKeys("corp load");
		
		By go=By.xpath("//*[@id='s4-titlerow']/div[1]/div/table/tbody/tr[3]/td/div/div[2]/button");

		
		if(driver.findElement(go).isDisplayed()==true)
		{
			Thread.sleep(1000);
			System.out.println("element is displayed");
			driver.findElement(go).click();
		}else {
			System.out.println("not displayed");
		}
		
	}

}


