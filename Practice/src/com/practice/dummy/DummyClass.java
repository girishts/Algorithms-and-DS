package com.practice.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DummyClass {
	 static  public void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("a");
		al.add(1, "b");
		System.out.println(al);
		
		al.set(0, "c");
		System.out.println(al);
		
		al.add(0, "d");
		System.out.println(al);
		
		Set normalSet = new HashSet<>();
		Set sortedSet =new TreeSet<>() ;
		for(char i ='a';i<='z';i++) {
			System.out.println(i);
		}
		
		normalSet.add(9);
		normalSet.add(1);
		normalSet.add(6);
		normalSet.add(2);
		
		sortedSet.add(3);
		sortedSet.add(1);
		sortedSet.add(5);
		sortedSet.add(2);
		
		System.out.println("normal set" + normalSet);
		System.out.println("sorted set" + sortedSet);
		Map<String, Integer> a = new HashMap<String, Integer>();
		
		a.put("count", 123);
		a.put("count1", 123);
		a.put("count2", 123);
		
		
	
	}
}
