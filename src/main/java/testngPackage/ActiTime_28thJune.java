package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTime_28thJune {

	public static void main(String[] args) {
		actiTimeLogin1();
	}
	
	@Test
	public static void actiTimeLogin1()
	{
		//System property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");
		//code to suppress the console log warning in selenium chrome browser
		System.setProperty("webdriver.chrome.silentOutput","true");
		//instatitate a ChromeDriver class
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
		
		
	}
	
	
}
