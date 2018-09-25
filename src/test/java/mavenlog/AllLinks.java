package mavenlog;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllLinks extends MavenLog4j {

	
	public WebDriver driver;
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	
		}
	
	@AfterMethod
	public void CloseApp()
	{
		//Close my application
		
		driver.quit();
	}
	@Test
	public void allLinks()
	{
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("alllinks count "+allLinks.size());
		for(int i=1; i<allLinks.size();i++)
		{
			System.out.println("alllinks display"+allLinks.get(i).getText());
		}
	}

}
