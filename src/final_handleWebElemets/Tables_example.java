package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Tables_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20250/ind-vs-aus-match-14-icc-cricket-world-cup-2019");
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        System.out.println("the count of rows are : "+count);
        
        
        int score_records=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        System.out.println("the score records are : "+score_records);
        
        int sum=0;
        
        for(int i=0;i<score_records-2;i++)
        {
        	
        	String score=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
        	System.out.println("The score is "+score);
        	int scoreint=Integer.parseInt(score);
        	
        	sum=sum+scoreint;
        }
        
       
        String ext=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extras= Integer.parseInt(ext);
        sum=sum+extras;
        
        
        System.out.println("the score is "+driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
        System.out.println("The total sum we got is "+sum);
        System.out.println("the total is "+driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        
    
	}

}
