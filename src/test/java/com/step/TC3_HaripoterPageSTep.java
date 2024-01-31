package com.step;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_HaripoterPageSTep extends BaseClass {
	PageObjectManager manager = new PageObjectManager();

	@When("User click First the book in list")
	public void user_click_first_the_book_in_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod1();
		Thread.sleep(3000);

	}

	@When("User click the Second book in list")
	public void user_click_the_second_book_in_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod2();
		Thread.sleep(3000);

	}

	@When("User click the Third book in list")
	public void user_click_the_third_book_in_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod3();

		Thread.sleep(3000);
	}

	@When("User click the Four book in  list")
	public void user_click_the_four_book_in_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod4();

		Thread.sleep(3000);
	}

	@When("User click the Five book list")
	public void user_click_the_five_book_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod5();

		Thread.sleep(3000);
	}

	@When("User click the Six book list")
	public void user_click_the_six_book_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod6();

		Thread.sleep(3000);
	}

	@When("User click the Seven book list")
	public void user_click_the_seven_book_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod7();

		Thread.sleep(3000);
	}

	@When("User click the Eight book list")
	public void user_click_the_eight_book_list() throws InterruptedException {
		manager.getHaripoterPage().haripotterMethod7();

		Thread.sleep(3000);
	}

	@Then("User should valid the success message1 {string}")
	public void user_should_valid_the_success_message1(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter1();

		Thread.sleep(3000);
	}

	@Then("User should valid the success message2 {string}")
	public void user_should_valid_the_success_message2(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter2();
		Thread.sleep(3000);
	}

	@Then("User should valid the success message3 {string}")
	public void user_should_valid_the_success_message3(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter3();
		Thread.sleep(3000);
	}

	@Then("User should valid the success message4 {string}")
	public void user_should_valid_the_success_message4(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter4();

		Thread.sleep(3000);
	}

	@Then("User should valid the success message5 {string}")
	public void user_should_valid_the_success_message5(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter5();
		Thread.sleep(3000);
	}

	@Then("User should valid the success message6 {string}")
	public void user_should_valid_the_success_message6(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter6();
		Thread.sleep(3000);
	}

	@Then("User should valid the success message7 {string}")
	public void user_should_valid_the_success_message7(String string) throws InterruptedException {
		manager.getHaripoterPage().getTextMessageAfter7();
		Thread.sleep(3000);
	}

}
