package mavenlog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	
	public WebDriver driver;
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	
		}
	
	@AfterMethod
	public void CloseApp() throws Exception
	{
		//Close my application
		
		Thread.sleep(3000);
		driver.quit();
	}

	
	@Test
	public void login()
	{
	driver.findElement(By.name("username")).sendKeys("lakshman");
	driver.findElement(By.name("password")).sendKeys("9985401527");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
}
