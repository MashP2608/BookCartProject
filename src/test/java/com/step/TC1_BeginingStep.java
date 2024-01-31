package com.step;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;
import com.pages.BeginingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_BeginingStep extends BaseClass {

	PageObjectManager manager = new PageObjectManager();

	@When("User Select the browser")
	public void user_select_the_browser() {

		launchBrowser();

	}

	@When("User Vist the given URL")
	public void user_vist_the_given_url() {

		loadUrl();

	}

	@Then("User should  validate the success messge after loaded url {string}")
	public void user_should_validate_the_success_messge_after_loaded_url(String string) throws InterruptedException {
		Thread.sleep(1000);
		manager.getBeginingPage().allSuccessMsg();

	}

	@When("User click the login")
	public void user_click_the_login() throws InterruptedException {
		Thread.sleep(1000);
		manager.getBeginingPage().loginClick();

	}

	@Then("User should  validate the success messge after click {string}")
	public void user_should_validate_the_success_messge_after_click(String string) throws InterruptedException {
		Thread.sleep(1000);
		manager.getBeginingPage().loginClickMsg();

	}

	@Then("User should  validate the success messge after loaded url with message {string}")
	public void user_should_validate_the_success_messge_after_loaded_url_with_message(String string)
			throws InterruptedException {
		Thread.sleep(1000);
		manager.getBeginingPage().priceSuccessMsg();
	}

}