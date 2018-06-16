package com.practice.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class RandomConceptsCheck {
	
	
	
	
	public static void main(String[] args) {
		
		function();
	}


	private static void function() {
		List<Integer> number=Arrays.asList(6,2,3,4,5);
		System.out.println(number.parallelStream().filter(s-> s%2 ==0).reduce((ans,i)-> ans*i));
		 Optional<String> opt = Optional.of("");
		 System.out.println(opt);
	}


	private static void extracted() {
		List<String> list=new ArrayList<String>();
		list.add("");
		list.add("  ");
		list.add("   ");
		//list.addAll(null);
		System.out.println("size of list "+list.size());
		System.out.println(list);
	}
	

	public static void main1(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[]= {1,2,3,6};
		
		for(int i=0,j=0;i<a.length && j<b.length;) {
			if(a[i]==b[j]) {
				System.out.println(a[i]);
				i++;j++;
			}else if(a[i]<b[j]) {
				i++;
			}else {
				j++;
			}
		}
		System.out.println("===========================");
		int i=0,j=0;
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				System.out.println(a[i]);
				i++;j++;
			}else if(a[i]<b[j]) {
				i++;
			}else {
				j++;
			}
		}
	}
	
	
	
	//Concurrent Modification Example
	public static void main5(String args[]) {
		Map<String,String> map = new ConcurrentHashMap<String,String>();
		map.put("A", "B");
		map.put("C", "D");
		
		
		
		for(Map.Entry<String, String> entry: map.entrySet() ) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getKey().equals("A")) {
				map.put("B", "C"); // Here it will throw concurrent modification exception if it is simple HashMap instead of Concurrent HashMap
			}
		}
		System.out.println("========================");
		for(Map.Entry<String, String> entry: map.entrySet() ) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}
	
	public static void main2(String[] args) {
		int b= 0b10001;
		System.out.println(b);
		
		int u =1_000_000;
		float f=1_000_000;
		long l=1_00_000;
		
		System.out.println(u);
		System.out.println(f);
		System.out.println(l);
		
		if(1_000_000 ==1000000)System.out.println("true"+" ");
		else System.out.println("false");
	}

}
