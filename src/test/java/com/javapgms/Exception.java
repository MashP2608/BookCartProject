package com.javapgms;

public class Exception {
	public static void main(String[] args) {

		// Exception is like a error, the program will terminated that line itself

		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		// System.out.println(10 / 0);
		System.out.println("4");
		System.out.println("5");
		System.out.println("End");

		// Throwable:
		// Super class of exception throwable Exception
		// Error
		// Exception:
		// 1. Unchecked exception(Run time exception)
		// 2. Checked exception(Compile time exception)
		// Unchecked exception:
		// 1. ArithmaticException
		// 2. NullPointException
		// 3. InputMismatchException
		// 4. ArrayIndexOutOfBoundExcepion
		// 5. StringIndexOutOfBoundExcepion
		// 6. IndexOutOfBoundExcepion
		// 7. NumberFormatException
		// Checked exception:
		// 1. IOException
		// 2. SQLException
		// 3. FileNotFoundException
		// 4. ClassNotFoundException

		// Exception Handling:
		// 1. Try
		// 2. Catch
		// 3. Finally
		// 4. Throw
		// 5. Throws

		System.out.println("start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("dont/by zero");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("end");
	}

}
