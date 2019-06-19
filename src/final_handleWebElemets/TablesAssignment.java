package final_handleWebElemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		WebElement table=driver.findElement(By.cssSelector("table[id='product']"));
		int row_count=table.findElements(By.tagName("tr")).size();
		System.out.println("The total number of rows are : "+row_count);
		
		int column_count=table.findElements(By.xpath("//tbody/tr[2]/td")).size();
		System.out.println("The total number of columns are : "+column_count);
		
		
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]/td[1]")).getText());
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]/td[2]")).getText());
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]/td[3]")).getText());
	}

}

