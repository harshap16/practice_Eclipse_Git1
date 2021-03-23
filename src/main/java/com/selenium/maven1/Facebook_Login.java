package com.selenium.maven1;



import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		//String str="Aadya@1988";
		// byte[] encodedString=Base64.Encoder(str.getBytes());
		
/*		
	}
	public static void orange()
	{
	*/
		System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harshapaga81@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Aadya@1988");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("QWFkeWFAMTk4OA==");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
		//driver.quit();
		//driver.findElement(By.xpath("//*[@id=\"jsc_c_nk\"]/div/div/span/div[contains(text(),'Harsha Paga')]")).click();
		
		//driver.findElement(By.xpath("//*[@id="jsc_c_nk"]/div/div/span/div[contains(text(),'Harsha Paga')]")).click();
		
		driver.findElement(By.xpath("//div[text()='Harsha Paga']")).click();
		//driver.findElement(By.xpath("//span[text()='Friends'][0]")).click();
		driver.findElement(By.xpath("//span[text()='About']")).click();
		
		  //String str="test123";
		  // Encode data on your side using BASE64
		 // byte[] encodedString = Base64.encodeBase64(str.getBytes());
		  //System.out.println("encoded value is " + new String(encodedString));
		  
		 // byte[] encodedBytes = Base64.encodeBase64("test123".getBytes());
		  //System.out.println("encodedBytes " + new String(encodedBytes));
		  

		
	}
	
}
