package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//span[text()='Register']")
	private WebElement register;

	@FindBy(id = "mat-input-2")
	private WebElement firstNnme;

	@FindBy(id = "mat-input-3")
	private WebElement lastNnme;

	@FindBy(id = "mat-input-4")
	private WebElement userName;

	@FindBy(id = "mat-input-5")
	private WebElement passWord;

	@FindBy(id = "mat-input-6")
	private WebElement confirmPassword;

	@FindBy(xpath = "//span[@class=\"mat-radio-outer-circle\"]")
	private WebElement gender;

	@FindBy(xpath = "//span[text()='Register']")
	private WebElement ClickRegister;

	@FindBy(xpath = "//h3[text()='User Registration']")
	private WebElement resgisterMsg;

	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement UserNameLogin;

	@FindBy(xpath = "//input[@data-placeholder=\"Password\"]")
	private WebElement passwordLogin;

	@FindBy(xpath = "//button[@class=\"mat-focus-indicator mat-raised-button mat-button-base mat-primary\"]")
	private WebElement loginBtn;

	@FindBy(xpath = "//mat-icon[text()='account_circle']")
	private WebElement useNameSuccessMsg;

	public WebElement getUseNameSuccessMsg() {
		return useNameSuccessMsg;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getFirstNnme() {
		return firstNnme;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getUserNameLogin() {
		return UserNameLogin;
	}

	public WebElement getPasswordLogin() {
		return passwordLogin;
	}

	public WebElement getResgisterMsg() {
		return resgisterMsg;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirsNnme() {
		return firstNnme;
	}

	public WebElement getLastNnme() {
		return lastNnme;
	}

	public WebElement getuserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getClickRegister() {
		return ClickRegister;
	}

	public void register() {
		click(ClickRegister);

	}

	public void registrationSuccessMsg() {
		String message = getTextMessage(resgisterMsg);
		printMessage(message);

	}

	public void inputDetailsfname(String name) {
		sendKeys(firstNnme, name);

	}

	public void inputDetailsLname(String firstname) {
		sendKeys(lastNnme, firstname);

	}

	public void inputDetailsUname(String name) {
		sendKeys(userName, name);

	}

	public void inputDetailsPasword(String name) {
		sendKeys(passWord, name);

	}

	public void inputDetailsConfirmPasword(String name) {
		sendKeys(confirmPassword, name);

	}

	public void genderSelect() {

		click(gender);

	}

	public void clickRegistBtn() {
		click(ClickRegister);

	}

	public void loginCredential1(String string) {
		sendKeys(UserNameLogin, string);

	}

	public void loginCredential2(String string) {
		sendKeys(passwordLogin, string);

	}

	public void loginBtnClick() {
		click(loginBtn);

	}

	public void SuccessMsgAfterLogin() {
		String message2 = getTextMessage(useNameSuccessMsg);
		printMessage(message2);

	}

}
