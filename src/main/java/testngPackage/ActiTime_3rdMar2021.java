package testngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTime_3rdMar2021 {

	
	@Test
	public static void actiTime()
	{
		System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");	
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.close();
		
		
		
		
		
		
		
	}
	
	
	
	
}
