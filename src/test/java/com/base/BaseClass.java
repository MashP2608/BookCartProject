package com.base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.gherkin.Argument;

public class BaseClass {
	public static WebDriver driver;
	String[] allWindows;
	String parentWindow;

	public void printMessage(String string) {
		System.out.println(string);

	}

	public void launchBrowser() {

		driver = new ChromeDriver();
	}

	public void loadUrl() {

		driver.get("https://bookcart.azurewebsites.net/");

		driver.manage().window().maximize();

	}

	public void loadUrlLogin() {

		driver.get("https://bookcart.azurewebsites.net/login");

		driver.manage().window().maximize();

	}

	public WebElement findElementById(String string) {
		WebElement findElement = driver.findElement(By.id("string"));
		return findElement;

	}

	public WebElement findElementByXpath(String webElement) {
		WebElement findElement = driver.findElement(By.xpath("string"));
		return findElement;
	}

	public void click(WebElement element) {
		element.click();

	}

	public String getTextMessage(WebElement element) {

		String text = element.getText();
		return text;

	}

	public Set<String> getWindowHandles() {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}

	public String getWindowHandle() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public void windowHandle() {

		for (String eachWindow : allWindows) {

			if (!parentWindow.equalsIgnoreCase(eachWindow)) {
				driver.switchTo().window(eachWindow);
			}

		}

	}

	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);

	}
}
