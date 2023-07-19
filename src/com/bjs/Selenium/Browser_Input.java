package com.bjs.Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Input 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		System.out.println("Enter the browser");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			//ChromeDriver c = new ChromeDriver();
			WebDriver c = new ChromeDriver();
			test(c);
			
		}
		else
		{
			//FirefoxDriver f = new FirefoxDriver();
			WebDriver f = new FirefoxDriver();
			test(f);
			
		}

	}
	//Non polymorphic approach
	
	/*public static void test(FirefoxDriver driver)
	{
		driver.get("https:\\www.gmail.com");
		String fTitle = driver.getTitle();
		System.out.println(fTitle);
		String fUrl = driver.getCurrentUrl();
		System.out.println(fUrl);
	}
	public static void test(ChromeDriver driver)
	{
		driver.get("https:\\www.gmail.com");
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);
	}*/
	
	//Polymorphic approach
	public static void test(WebDriver driver)
	{
		driver.get("https:\\www.gmail.com");
		String Title = driver.getTitle();
		System.out.println(Title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		driver.close();
	}
	
}
