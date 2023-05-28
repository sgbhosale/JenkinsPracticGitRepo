package LoginClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
public WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Binaries\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
		
	}

	
	@Test
	public void test()
	{
		driver.get("https://google.com");
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
	}

}
