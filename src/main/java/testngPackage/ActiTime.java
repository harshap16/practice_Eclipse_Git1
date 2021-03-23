package testngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActiTime {

	@Test
	public static void actiTimeLogin() {
		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		// driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("aMahesh");
		// driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("aKumar1");

		/**************************
		 * 1. Wait until an element is visible / clickable
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, timeout);
		 * wait.until(ExpectedConditions.visibilityOf(element));
		 * wait.until(ExpectedConditions.elementToBeClickable(element)); 2. Scroll until
		 * the element is within the the display
		 * 
		 * Actions action = new Actions(driver); action.moveToElement(element); 3. Use
		 * JS Executor to interact directly with the DOM
		 * 
		 * JavascriptExecutor javascript = (JavascriptExecutor) driver;
		 * javascript.executeScript("var element = document.querySelector('locator');
		 * element.value = 'whatever';")
		 ***************************************************/
		/********************************************************************
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//fieldset//input[@placeholder
		 * = 'Password']"))); WebElement passInput =
		 * driver.findElement(By.xpath("//fieldset//input[@placeholder = 'Password']"));
		 * // this xPath does the trick passInput.click();
		 * passInput.sendKeys("password");
		 *****************************************************************/

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='createUserPanel_firstNameField']")));
		WebElement firstName = driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']"));
		firstName.click();
		//firstName.sendKeys("aMahesh");
		firstName.sendKeys("aRavi2");

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='createUserPanel_lastNameField']")));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']"));
		lastName.click();
		lastName.sendKeys("aKumar2");
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("aravi2@gmail.com");
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		driver.findElement(By.xpath("//span[text()='Close'][1]")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		//driver.findElement(By.xpath("//div[text()='+ New Tasks']")).click();
		//driver.findElement(By.xpath("(//div[@class='dropdownButton'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("aBSK2");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		//Create a New Project
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("aProj1");
		

	}

}
