package com.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitstudy {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");

	}

	@Before
	public void Before() {
		System.out.println("Before");

	}

	@Test
	public void metho3() {
		System.out.println("Payment is completed 3");

	}

	@Test
	public void metho2() {
		System.out.println("Payment is completed 2");
	}

	@Test
	public void metho1() {
		System.out.println("Payment is completed");

	}

	@After
	public void after() {
		System.out.println("After ");

	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("AfterClass");

	}
}