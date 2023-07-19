package com.bjs.Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Boolean 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.shadi.com/");
		WebElement Join_btn = driver.findElement(By.linkText("Join Now"));
		Join_btn.click();
		Thread.sleep(2000);
		
		WebElement F_name = driver.findElement(By.name("first_name"));
		F_name.sendKeys("Kiran");
		Thread.sleep(2000);
		
		WebElement L_name = driver.findElement(By.name("last_name"));
		L_name.sendKeys("N B");
		Thread.sleep(2000);
		
		WebElement M1 = driver.findElement(By.xpath("(//label[text()='Male'])[1]"));
		M1.click();
		
		WebElement F2 = driver.findElement(By.xpath("(//label[text()='Female'])[2]"));
		System.out.println(F2.isSelected());// Boolean function, which returns true or false
		
		WebElement Month = driver.findElement(By.name("dob_m"));
		Select m = new Select(Month);
		m.selectByVisibleText("Apr");
		Thread.sleep(2000);
		
		WebElement Date = driver.findElement(By.name("dob_d"));
		Select d = new Select(Date);
		d.selectByVisibleText("12");
		Thread.sleep(2000);
		
		WebElement Year = driver.findElement(By.name("dob_y"));
		Select y = new Select(Year);
		y.selectByVisibleText("1995");
		Thread.sleep(2000);
		
		WebElement Religion = driver.findElement(By.name("religion"));
		Select r = new Select(Religion);
		r.selectByVisibleText("Hindu");
		Thread.sleep(2000);
		
		WebElement Education = driver.findElement(By.name("education"));
		Select e = new Select(Education);
		e.selectByVisibleText("Bachelors");
		Thread.sleep(2000);
		
		WebElement Country = driver.findElement(By.name("country_id"));
		Select c = new Select(Country);
		c.selectByVisibleText("India");
		Thread.sleep(2000);
		
		//WebElement Sign_in = driver.findElement(By.xpath("//span[text()='Sign in']"));
		//Sign_in.click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String s: handles) 
		{
			driver.switchTo().window(s);
		}
		WebElement email = driver.findElement(By.xpath("//button[text()='Sign up with Email']"));
		email.click();
		
		WebElement email_txt = driver.findElement(By.id("txtEmailAddress"));
		email_txt.sendKeys("kiranbaindur@gmail.com");
		
		WebElement email_pwd = driver.findElement(By.id("txtPassword"));
		email_pwd.sendKeys("Kiran_116");
		
		WebElement submit = driver.findElement(By.id("submitButton"));
		submit.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
