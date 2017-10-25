package com.veso.test.testapp.playground.lambdas;


import android.util.ArraySet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class LambdasTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, (a, b) -> a.compareTo(b));

		Thread t = new Thread(() -> {
			System.out.println("printing shit from thread!");
		});

		//ArraySet array =
		//LinkedList<> list =
		ArrayList array;
		HashMap map;
		TreeMap map2;
		HashSet hs;
		ArraySet as;
	}

	private void someMethod(){
		Object o = new Object();

	}
}
