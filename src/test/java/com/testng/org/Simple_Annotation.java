package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {

	public WebDriver driver;

	@BeforeSuite
	private void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("setup");
	}

	@BeforeTest
	private void profile() {
		driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]")).click();
		System.out.println("profile successfully clicked");
	}

	@BeforeClass
	private void usernamepas() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		System.out.println("sign in to homepage");
	}

	@BeforeMethod
	private void refresh() {
		driver.navigate().refresh();
		System.out.println("Homepage refreshed");
	}

	@Test
	private void searchTV() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("smart TV");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("search smart TV completed");
	}

	@Test
	private void searchwatch() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("G-shock watches");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("G-shock watches search completed");
	}

	@Test
	private void searchIphones() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Iphone 13 Pro");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Iphone search completed");
	}

	@Test
	private void searchheadphones() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sony Headphones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("headphones search completed");
	}

	@Test
	private void searchcamera() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Canon 5d mark iv");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("camera search completed");
	}

	@Test
	private void searchbat() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kashmir willow wood bat");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("bat search completed");
	}

	@Test
	private void searchlaptop() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ASUS ROG Strix G17");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("laptop search completed");
	}

	@AfterMethod
	private void account() {
		driver.findElement(By.xpath("//a[@role='button']")).click();
		System.out.println("account action performed");
	}

	@AfterClass
	private void signout() {
//		driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]")).click();
		WebElement signout = driver.findElement(By.linkText("Sign Out"));
		signout.click();
		System.out.println("signed out successfully");
	}

	@AfterTest
	private void clearcookies() {
		driver.manage().deleteAllCookies();
		System.out.println("cookies cleared");
	}

	@AfterSuite
	private void close() {
		driver.close();
		System.out.println("close the browser");
	}

}
