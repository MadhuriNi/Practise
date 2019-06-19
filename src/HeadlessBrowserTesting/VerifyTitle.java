package HeadlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void verifyFacebookTitle(){
		
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The title is "+driver.getTitle());
		
	}

}
