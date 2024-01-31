package com.pagemanager;

import com.pages.BeginingPage;
import com.pages.HaripoterPage;
import com.pages.LoginPage;

public class PageObjectManager {
	private BeginingPage beginingPage;
	private LoginPage loginPage;
	private HaripoterPage haripoterPage;

	public HaripoterPage getHaripoterPage() {
		return (haripoterPage == null) ? haripoterPage = new HaripoterPage() : haripoterPage;
	}

	public BeginingPage getBeginingPage() {

		return (beginingPage == null) ? beginingPage = new BeginingPage() : beginingPage;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}
}
