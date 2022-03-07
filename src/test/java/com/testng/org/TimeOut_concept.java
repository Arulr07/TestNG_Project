package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut_concept {
	
	public WebDriver driver;
	
	@Test
	private void browserlaunch() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test(timeOut = 6000)
	private void login() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();		
		System.out.println("Loggined successful");
	}
	
	@Test
	private void logout() {
		driver.findElement(By.xpath("//a[@role='button']")).click();
		WebElement signout = driver.findElement(By.linkText("Sign Out"));
		signout.click();
		driver.manage().deleteAllCookies();
		driver.close();
		System.out.println("logged out and closed successfully");
	}

}
