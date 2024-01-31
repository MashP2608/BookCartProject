package com.javapgms;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {

		String str = "mahesh";

		String ans = "";

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			ans = ans + str.charAt(i);

		}

		if (str.equals(ans)) {

			System.out.println("Its a paliandrome");

		} else {

			System.out.println("Its not a  paliandrome");

		}

	}
}
