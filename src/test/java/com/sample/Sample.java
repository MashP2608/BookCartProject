package com.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://bookcart.azurewebsites.net/register");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
		element.click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		

		
	}

}
