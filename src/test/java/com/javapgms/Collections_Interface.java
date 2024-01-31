package com.javapgms;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections_Interface {
// It will support dissimilar data types.
	// It is dynamic memory allocation
	// No memory wastage like array

	public static void main(String[] args) {

		// 1. List
		// 2. Set
		// 3. Map

		// 1. List :( Interface)
		// LinkedArrayList(c)
		// vector(c)
		// 2. Set:(Interface)
		// Hashset(c)
		// Linked hashset(c)
		// Treeset(c)
		// 3. Map:(Interface)
		// Hashmap(c)
		// Linked hashmap(c)
		// Treemap(c)
		// Hashtable(c)
		// concurrent hashmap(C)

		// List:
		// ArrayList:
		// Syntax:
		ArrayList ex = new ArrayList();
		// List interface ex object name
		// ArrayList() class
		ex.add(100);
		ex.add(1100);
		ex.add(1200);
		ex.add(1300);
		ex.add(1400);
		ex.add(1500);
		ex.add(1600);
		ex.add("MAhesh");
		ex.add("Mahesh");
		ex.add("MAhesh");
		ex.add("MAheSh");
		System.out.println(ex);

		// Generics:
		// It will support particular datatypes or object only It is a features of jdk
		// 1.5
		// In the generics, we can mention only wrapper class
		// < >- This is generic symbol, is used to define the particular datatype If we
		// need integer datatype,

		// syntax:
		ArrayList<Integer> ex2 = new ArrayList<Integer>();
		ex2.add(100);
		ex2.add(1100);
		ex2.add(1200);
		ex2.add(1300);
		ex2.add(1400);
		ex2.add(1500);
		ex2.add(1600);
		// ex2.add("MAhesh"); during the excution its throws an exception

		System.out.println(ex2);

		// Set:
		// It ignore the duplicate value It is value based
		// Hashset:
		// It will print random order

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		System.out.println(set);

		// Map:
		// It is key and value pair
		// Here key+value is a one entry
		// Key ignore the duplicate value and value allow the duplicate
		// Hashmap:
		// It is a random order(based on key)

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Java");
		map.put(20, "Java");
		map.put(30, "sql");
		map.put(40, ".net");
		map.put(50, "sales");
		map.put(50, "fire");
		System.out.println(map);

	}
}
