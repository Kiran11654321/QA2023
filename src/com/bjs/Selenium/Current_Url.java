package com.bjs.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Current_Url {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https:\\www.gmail.com");
		driver.manage().window().maximize();// to maximize the window
		Thread.sleep(5000);

		String expectedtitle = "Gmail";
		String t = driver.getTitle();// to get the title of the current tab
		System.out.println(t);

		if (expectedtitle.equalsIgnoreCase(t)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String ExpectedUrl = "https:\\www.gmail.com";
		String url = driver.getCurrentUrl();// to get the current url
		System.out.println(url);// to print the current url

		if (ExpectedUrl.equalsIgnoreCase(url)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.close();// to close the current tab
	}

}
