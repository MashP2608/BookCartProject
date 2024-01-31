package com.selenium;

import org.testng.annotations.Test;

public class Testng {
	@Test(priority = 1)
	public void methot() {
		System.out.println("Name");

	}

	@Test(priority = 10)
	public void methot2() {
		System.out.println("Age");

	}

	@Test(priority = -1)
	public void methot3() {
		System.out.println("work");

	}

	@Test(priority = -5)
	public void methot6() {
		System.out.println("sagar");

	}

	@Test()
	public void methot0() {
		System.out.println("Home");

	}
}
