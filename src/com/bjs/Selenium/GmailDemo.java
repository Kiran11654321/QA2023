package com.bjs.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.gmail.com");
		driver.getPageSource();
		Thread.sleep(5000);
		driver.close();

	}

}
