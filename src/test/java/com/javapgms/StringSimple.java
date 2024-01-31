package com.javapgms;

public class StringSimple {

	public static void main(String[] args) {

		String s = "Mahesh is Man";
		System.out.println(s);

		// It is used to print the particular character charAt():

		char charAt = s.charAt(5);
		System.out.println(charAt);

		// Equalsignorecase():
		// It is like a equals() method but it is not case sensitive
		boolean equals = s.equals("mahesh");
		System.out.println(equals);
		boolean equals2 = s.equals("Mahesh");
		System.out.println(equals2);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);

		// contains():
		// Contains() is a method , is used to check the particular character or word in
		// the string

		boolean contains = s.contains("m");
		System.out.println(contains);

		// split():
		// split() is a method, is used to split the string by space or character or
		// word or whatever
		String[] split = s.split(s);
		System.out.println("e");

		// toUpperCase() and toLowerCase():
		// toUpperCase() is used to convert the string into uppercase
		// toLowerCase() is used to convert the string into lowercase

		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);

		// subString();
		// It is used to print from, which character we want in the string index
		String substring = s.substring(5);
		System.out.println(substring);

		// replace():
		// replace() is a method ,it is used to replace the index character or word
		String replace = s.replace("Man", "Boy");

		System.out.println(replace);

		// Litral
		String s1 = "Mahesh";
		System.out.println(System.identityHashCode(s1));
		String s2 = "Mahesh";
		System.out.println(System.identityHashCode(s2));
		// Non-litral
		String s3 = new String("Mahesh");
		System.out.println(System.identityHashCode(s3));

		String s4 = new String("Mahesh");
		System.out.println(System.identityHashCode(s4));

	}

}
