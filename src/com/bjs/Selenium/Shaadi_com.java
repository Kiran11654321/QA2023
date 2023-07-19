package com.bjs.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadi_com 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shaadi.com/join-now/misspelt-shadi");
		System.out.println();
		WebElement l = driver.findElement(By.linkText("Login"));
		l.click();
		Thread.sleep(4000);
		WebElement Sign_up_free = driver.findElement(By.xpath("//a[@data-testid='sign_up_free']"));
		Sign_up_free.click();
		/*WebElement f_name= driver.findElement(By.xpath("//input[@type='text']"));
		f_name.sendKeys("Kiran");
		WebElement l_name= driver.findElement(By.name("password"));
		l_name.sendKeys("N B");*/
		WebElement Gender = driver.findElement(By.xpath("//span[normalize-space()='Myself']"));
		Gender.click();
		Thread.sleep(4000);
		WebElement Male_btn= driver.findElement(By.xpath("//span[normalize-space()='Male']"));
		Male_btn.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kiran");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("N B");
		driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("04");
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1995");
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root _3cx-YID9QwTbPurYgxgt5D _1Zc7UeUcTcj8aBk5grOZF4 MuiButton-contained _1If1p9mJUJxVvZo5sl7itQ revisedreg_cta__0fZ8B']//span[@class='MuiButton-label ATunj9U0v3tGlruSTeS74']//span//p[@class='MuiTypography-root revisedreg_ctaText__7U99_ MuiTypography-body1'][normalize-space()='Continue']")).click();
		Thread.sleep(4000);
		driver.close();
		

	}

}
