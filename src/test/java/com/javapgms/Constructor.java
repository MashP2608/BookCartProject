package com.javapgms;

public class Constructor {

	// Constructor:
     	// Class name and constructor name must be same. It doesn’t have any return type.
	    // We don’t want to call constructor which is creating object itself. It will
	    // automatically invoke the default constructor.
	    // It will support in method overloading but won’t support in method overriding
	public Constructor() {
		System.out.println("I am A Constructor");

	}

	public Constructor(int a) {
		System.out.println("its a parameterised constructor with integer");

	}

	public Constructor(String a) {
		System.out.println("its a parameterised constructor with string");

	}

	public Constructor(double a) {

		System.out.println("its a parameterised constructor with floating points");
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor("Mahesh");
		Constructor c3 = new Constructor(2.5);

	}
}
