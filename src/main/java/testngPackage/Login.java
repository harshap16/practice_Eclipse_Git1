package testngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	static{
		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
	}
	@Test
	public void testValidLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		//driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Harsha");
		//driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Paga1");
		/********************************************************************
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//fieldset//input[@placeholder = 'Password']")));
	    WebElement passInput = driver.findElement(By.xpath("//fieldset//input[@placeholder = 'Password']")); // this xPath does the trick
	    passInput.click();
	    passInput.sendKeys("password");
		*****************************************************************/
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='createUserPanel_firstNameField']")));
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']"));
		firstName.click();
		firstName.sendKeys("aRavi1");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='createUserPanel_lastNameField']")));
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']"));
		lastName.click();
		lastName.sendKeys("zKumar1");
						
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("zravi1@gmail.com");
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Tasks']")).click();
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='dropdownButton']")).isSelected();
		
		
		
		
	}
	

}
