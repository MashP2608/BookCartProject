package com.step;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_LoginPageStep extends BaseClass {

	PageObjectManager manager = new PageObjectManager();

	@When("User click the register")
	public void user_click_the_register() throws InterruptedException {
		Thread.sleep(1000);
		manager.getLoginPage().register();

	}

	@Then("User shoul validate the success msg {string}")
	public void user_shoul_validate_the_success_msg(String string) throws InterruptedException {
		Thread.sleep(1000);
		manager.getLoginPage().registrationSuccessMsg();
	}

	@When("User enter  the first name {string},{string},{string},{string} and {string}")
	public void user_enter_the_first_name_and(String string1, String string2, String string3, String string4,
			String string5) throws InterruptedException {
		manager.getLoginPage().inputDetailsfname(string1);
		Thread.sleep(1000);
		manager.getLoginPage().inputDetailsLname(string2);
		Thread.sleep(1000);
		manager.getLoginPage().inputDetailsUname(string3);
		Thread.sleep(1000);
		manager.getLoginPage().inputDetailsPasword(string4);
		Thread.sleep(1000);
		manager.getLoginPage().inputDetailsConfirmPasword(string5);

	}

	@When("User select the gender")
	public void user_select_the_gender() throws InterruptedException {
		Thread.sleep(1000);
		manager.getLoginPage().genderSelect();

	}

	@When("User select the register button")
	public void user_select_the_register_button() throws InterruptedException {

		Thread.sleep(1000);
		manager.getLoginPage().clickRegistBtn();

	}

	@Then("User enter the valid credential {string} and  {string}")
	public void user_enter_the_valid_credential_and(String string1, String string2) throws InterruptedException {
		Thread.sleep(1000);
		manager.getLoginPage().loginCredential1(string1);
		Thread.sleep(1000);
		manager.getLoginPage().loginCredential2(string2);

	}

	@Then("User select the click login  option")
	public void user_select_the_click_login_option() throws InterruptedException {
		Thread.sleep(1000);
		manager.getLoginPage().loginBtnClick();

	}

	@Then("User should verify the user name")
	public void user_should_verify_the_user_name() throws InterruptedException {
		Thread.sleep(1000);
		manager.getLoginPage().SuccessMsgAfterLogin();

	}

}
