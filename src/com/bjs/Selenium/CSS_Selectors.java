package com.bjs.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_6e7cffe3a7f0b3e22d6b2576adffdae28dca2367a61cc78527acfa5f&mfadid=adm");
		//WebElement search_box=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//(tagname#id) using tagname & ID
		//WebElement search_box=driver.findElement(By.cssSelector("input.nav-input"));// (tagname.classname)using tagname & class name
		//WebElement search_box=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));// (tagname[attribute name = 'ATTRIBUTE VALUE'])using tagname & Attribute
		//WebElement search_box=driver.findElement(By.cssSelector("input.nav-input[id='twotabsearchtextbox']"));// (tagname.classname[attribute name = 'ATTRIBUTE VALUE'])using tagname, class name and attribute
		//WebElement search_box=driver.findElement(By.cssSelector("input[id^='twotabs']"));// (tagname[attribute name^='attribute value'])using sustring starts(^) with
		//WebElement search_box=driver.findElement(By.cssSelector("input[id$='textbox']"));// (tagname[attribute name$='attribute value']) using substring ends($) with
		WebElement search_box=driver.findElement(By.cssSelector("input[id*='arch']"));
		search_box.click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
