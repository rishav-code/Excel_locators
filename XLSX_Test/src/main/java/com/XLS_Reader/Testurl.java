package com.XLS_Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testurl {
	static TakeLocator tl = new TakeLocator();

	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * 
		 * driver.get("http://orangehrm.com"); WebElement search
		 * =driver.findElement(By.name("q")); search.sendKeys("atmecs"); WebElement
		 * searchclick = driver.findElement(By.className("gNO89b"));
		 * searchclick.click();
		 */
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cta_button_3749854_7956a89e-6f16-4650-8d49-9f825d5cc7d6")).click();
		driver.findElement(By.id(tl.locator("firstname"))).click();
		driver.findElement(By.id(tl.locator("firstname"))).sendKeys("rishav");
		driver.findElement(By.id(tl.locator("last name"))).sendKeys("kumar");
		driver.findElement(By.id(tl.locator("url_here"))).click();
		driver.findElement(By.id(tl.locator("Bussiness email"))).sendKeys("rishav@gmail.com");
		driver.findElement(By.id(tl.locator("job title"))).sendKeys("engineer");
		driver.findElement(By.id(tl.locator("no of employees"))).click();
		
	
		
		driver.findElement(By.xpath(tl.locator("features"))).click();
		
		
		driver.navigate().back();
		driver.findElement(By.xpath(tl.locator("Services"))).click();
		
		driver.navigate().back();
		
	}
}