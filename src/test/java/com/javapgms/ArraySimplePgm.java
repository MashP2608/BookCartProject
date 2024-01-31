package com.javapgms;

import java.util.Iterator;

public class ArraySimplePgm {
	public static void main(String[] args) {

		int num[] = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		System.out.println(num[4]);

		// using for loop concept
		for (int i = 0; i < 5; i++) {

			System.out.print(num[i]);
		}
		System.out.println();
		// using enhanced for loop

		for (int i : num) {
			System.out.print(i +"  ");

		}
	}

}
