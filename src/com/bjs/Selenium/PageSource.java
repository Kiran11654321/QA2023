package com.bjs.Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSource 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		System.out.println("Enter the browser");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver c = new ChromeDriver();
			run(c);
		}
		else
		{
			WebDriver f = new FirefoxDriver();
			run(f);
		}
	}
	public static void run(WebDriver driver)
	{
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getPageSource());
		driver.close();
	}

}


