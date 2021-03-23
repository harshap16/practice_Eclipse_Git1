package com.selenium.maven1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_JavaScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./utilities/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor je=(JavascriptExecutor)driver;
		JavascriptExecutor webdriver;
		// Set up the JS object
		//JavascriptExecutor jscript = (JavascriptExecutor)webdriver;
		// Issue command to enter the text
		je.executeScript("document.getElementById('textbox').value = 'Some Text';");

	}

}
