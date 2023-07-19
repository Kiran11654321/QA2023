package com.bjs.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebElement signup = driver.findElement(By.id("email"));// By ID Locator
		//WebElement signup = driver.findElement(By.name("email"));// By Name Locator
		//WebElement signup = driver.findElement(By.className("inputtext"));// By className Locator
		//WebElement signup = driver.findElement(By.linkText("Forgotten password?"));// By Link Text Locator
		WebElement signup = driver.findElement(By.partialLinkText("Forgo"));// By Partial Link Text
		signup.click();
		Thread.sleep(5000);
		driver.close();

	}

}
