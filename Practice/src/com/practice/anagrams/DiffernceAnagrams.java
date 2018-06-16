package com.practice.anagrams;

import java.util.HashMap;
import java.util.Map;

public class DiffernceAnagrams {

	public static Map<Character, Integer> characterCount(String input) {
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char ch[] = input.toCharArray();
		for (char c : ch) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;
	}
	
	public static void main(String args[]) {
		String s2 ="Hello";
		String s1 ="dellc";
		Map<Character, Integer> charCountMap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> charCountMap2 = new HashMap<Character, Integer>();
		charCountMap1 = characterCount(s1);
		charCountMap2=characterCount(s2);
		System.out.println(charCountMap1);
		System.out.println(charCountMap2);
		
		for(Map.Entry<Character, Integer> charcountset:charCountMap1.entrySet()) {
			if(!charCountMap2.containsKey(charcountset.getKey())){
				System.out.println(charcountset.getKey() + " needs to be removed from string 1");
			}else if(charCountMap2.get(charcountset.getKey()) >charcountset.getValue()) {
				System.out.println(charCountMap2.get(charcountset.getKey()) - charcountset.getValue()+ charcountset.getKey() + " needs to be removed from s2");
			}else if(charCountMap2.get(charcountset.getKey()) <charcountset.getValue()) {
				System.out.println(charcountset.getValue() -charCountMap2.get(charcountset.getKey())  + charcountset.getKey() + " needs to be removed from s1");
			}
		}
		
		//TODO : It's not checking the elements in charcountmap2 which are not in charcountmap1 
		
	}
}
