package Basics_pgm;

import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLinks {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.18.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		System.out.println("The no. of tags are "+tags.size());
		
		for(int i=0;i<tags.size();i++)
		{
			WebElement links=tags.get(i);
			String l=links.getAttribute("href");
		//	System.out.println("The links are ---- "+l);
			
			URL url=new URL(l);					
			HttpURLConnection httpconnect=(HttpURLConnection)url.openConnection();	
			httpconnect.setConnectTimeout(3000);
			httpconnect.connect();
			int code =	httpconnect.getResponseCode();
			
			System.out.println("the code is "+code);
			
			if (code==200)
			{
				System.out.println("The link is "+l+" and the code is"+httpconnect.getResponseMessage());
			}
			else
			{
				System.out.println("The link is "+l+" and the code is"+httpconnect.getResponseMessage());
			}
			
		}
	}

}
