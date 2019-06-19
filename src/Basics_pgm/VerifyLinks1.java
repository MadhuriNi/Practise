package Basics_pgm;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLinks1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
	
		System.out.println("The number of tags are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			
			String urll=ele.getAttribute("href");
			
			VerifyLinkActive(urll);					
			
		}		
		
	}

	private static void VerifyLinkActive(String urll) throws Throwable {		
			URL url=new URL(urll);
			
			HttpURLConnection httpconnect=(HttpURLConnection)url.openConnection();
			httpconnect.setConnectTimeout(3000);
			httpconnect.connect();
			
			int response=httpconnect.getResponseCode() ;
			
			if(response==200)
			{
				System.out.println("The link is "+urll+" and the code is"+httpconnect.getResponseMessage());
			}else{
				System.out.println("The link is "+urll+" and the code is"+httpconnect.getResponseMessage());
			}
		}
		
	}


