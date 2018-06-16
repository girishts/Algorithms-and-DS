package com.practice.anagrams2;

import java.util.ArrayList;
import java.util.List;


public class Dummy {
	
	public static void main(String[] args) {
		func1();
		func2();
	}

	private static void func2() {
		List<Integer> list =new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.forEach(item -> System.out.println(item));
	}

	private static void func1() {
		int n1 = 1;
		System.out.println(Integer.toString(n1));
	}
	
	
}
