package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbegin {

	public static void main(String[] args) throws InterruptedException {

		// Automation:
		// Performing any task by using a tool or machine is called as automation
		// Advantages:
		// 1. Save the time.
		// 2. Faster
		// 3. Requires less manual effort
		// 4. Restless.
		// 5. Accuracy will be more
		// 6. Multi-task
		// 7. Requires less human resources
		// Automation testing:
		// Testing an application by using any automation tools is called as automation
		// testing.
		// Automation Tool:
		// It’s a software or an application which is used to automate any applications.
		// Ex: Selenium, QTP, Appium, AutoIT etc,

		// Selenium Archirtecture
		// a) languageBinding b)API(WebDriver)
		// c)Driver excecution files (exe)
		// d)Browser

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone14");
		Thread.sleep(2500);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Purple'][1]")).click();
		Thread.sleep(2500);
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		System.out.println("Child Ids");

		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {
			System.out.println(string);

		}

		driver.switchTo().window(parentId);
	}

}
