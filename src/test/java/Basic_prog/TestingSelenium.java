package Basic_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingSelenium {
	@Test
	public void add() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://way2automation.com");
		String title= driver.getTitle();
		System.out.println("title is =========="+ title);
			}

	
	

}
