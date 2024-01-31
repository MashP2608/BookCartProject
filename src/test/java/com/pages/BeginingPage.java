package com.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BeginingPage extends BaseClass {

	public BeginingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "//a[text()='All Categories']")
	private WebElement txtmsg;

	@FindBy(xpath = "//h3[text()='Login']")
	private WebElement loginMsg;

	@FindBy(xpath = "//h4[text()='Price Filter']")
	private WebElement priceFilter;

	public WebElement getLoginMsg() {
		return loginMsg;
	}

	public WebElement getPriceFilter() {
		return priceFilter;
	}

	public WebElement getTxtmsg() {
		return txtmsg;
	}

	public WebElement getLogin() {
		return login;
	}

	public void allSuccessMsg() {

		String textMessage = getTextMessage(txtmsg);
		printMessage(textMessage);

	}

	public void priceSuccessMsg() {

		String textMessage1 = getTextMessage(priceFilter);
		printMessage(textMessage1);

	}

	public void loginClick() {

		click(login);

	}

	public void loginClickMsg() {
		String logintMessage = getTextMessage(loginMsg);
		printMessage(logintMessage);

	}
}
