package com.bjs.Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.geckodriver.driver", "D:\\Softwares\\Selenium components\\geckodriver-v0.27.0-win32\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.gmail.com");
		driver.close();
	}

}
