package com.selenium.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome1_Orange {

	@Test
	public static void orange()
	{
		System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	
		
		//driver.findElement(By.xpath("//input[@id='txtPassword'] ")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='txtPassword'] ")).sendKeys("YWRtaW4xMjM=");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		System.out.println(driver.manage());
		//driver.quit();
		
	}
	
}
