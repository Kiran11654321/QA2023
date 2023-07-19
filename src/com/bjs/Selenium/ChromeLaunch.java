package com.bjs.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "D:\\Softwares\\Selenium components\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
