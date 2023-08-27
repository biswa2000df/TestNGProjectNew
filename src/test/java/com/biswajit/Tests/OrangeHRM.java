package com.biswajit.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	WebDriver driver;
	ChromeOptions option =new ChromeOptions();
	
	@Test
	public void LaunchApp() {
		
		WebDriverManager.chromedriver().setup();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
	}
	@Test
	public void EnterLoginDetails() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
	}

}
