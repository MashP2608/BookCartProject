package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HaripoterPage extends BaseClass {
	public HaripoterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[text()='HP1']")
	private WebElement clik1;

	@FindBy(xpath = "//strong[text()='HP2']")
	private WebElement clik2;
	@FindBy(xpath = "//strong[text()='HP3']")
	private WebElement clik3;
	@FindBy(xpath = "//strong[text()='HP4']")
	private WebElement clik4;
	@FindBy(xpath = "//strong[text()='HP5']")
	private WebElement clik5;

	@FindBy(xpath = "//strong[text()='HP6']")
	private WebElement clik6;
	@FindBy(xpath = "//strong[text()='HP7']")
	private WebElement clik7;
	@FindBy(xpath = "//strong[text()='HP8']")
	private WebElement clik8;

	@FindBy(xpath = "//td[text()='HP1']")
	private WebElement clikMsg1;

	@FindBy(xpath = "//td[text()='HP2']")
	private WebElement clikMsg2;

	@FindBy(xpath = "//td[text()='HP3']")
	private WebElement clikMsg3;
	@FindBy(xpath = "//td[text()='HP4']")
	private WebElement clikMsg4;
	@FindBy(xpath = "//td[text()='HP5']")
	private WebElement clikMsg5;
	@FindBy(xpath = "//td[text()='HP6']")
	private WebElement clikMsg6;
	@FindBy(xpath = "//td[text()='HP7']")
	private WebElement clikMsg7;

	public WebElement getClikMsg1() {
		return clikMsg1;
	}

	public WebElement getClikMsg2() {
		return clikMsg2;
	}

	public WebElement getClikMsg3() {
		return clikMsg3;
	}

	public WebElement getClikMsg4() {
		return clikMsg4;
	}

	public WebElement getClikMsg5() {
		return clikMsg5;
	}

	public WebElement getClikMsg6() {
		return clikMsg6;
	}

	public WebElement getClikMsg7() {
		return clikMsg7;
	}

	public WebElement getClik1() {
		return clik1;
	}

	public WebElement getClik2() {
		return clik2;
	}

	public WebElement getClik3() {
		return clik3;
	}

	public WebElement getClik4() {
		return clik4;
	}

	public WebElement getClik5() {
		return clik5;
	}

	public WebElement getClik6() {
		return clik6;
	}

	public WebElement getClik7() {
		return clik7;
	}

	public void haripotterMethod1() {
		click(clik1);

	}

	public void haripotterMethod2() {

		click(clik2);
	}

	public void haripotterMethod3() {
		click(clik3);

	}

	public void haripotterMethod4() {

		click(clik4);
	}

	public void haripotterMethod5() {

		click(clik5);
	}

	public void haripotterMethod6() {
		click(clik6);

	}

	public void haripotterMethod7() {
		click(clik7);

	}

	public void getTextMessageAfter1() {
		String textMessage1 = getTextMessage(clikMsg1);
		printMessage(textMessage1);
	}

	public void getTextMessageAfter2() {
		String textMessage2 = getTextMessage(clikMsg2);
		printMessage(textMessage2);
	}

	public void getTextMessageAfter3() {
		String textMessage3 = getTextMessage(clikMsg3);
		printMessage(textMessage3);
	}

	public void getTextMessageAfter4() {
		String textMessage4 = getTextMessage(clikMsg4);
	}

	public void getTextMessageAfter5() {
		String textMessage5 = getTextMessage(clikMsg5);
		printMessage(textMessage5);
	}

	public void getTextMessageAfter6() {
		String textMessage6 = getTextMessage(clikMsg6);
		printMessage(textMessage6);
	}

	public void getTextMessageAfter7() {
		String textMessage7 = getTextMessage(clikMsg7);
		printMessage(textMessage7);
	}

}
