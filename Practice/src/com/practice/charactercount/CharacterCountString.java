package com.practice.charactercount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCountString {

	private static String inputString = "Hello how Are You ?";

	@Override
	public String toString() {
		return "CharacterCountString [inputString=" + inputString + "]";
	}

	public static void characterCount(String input) {
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char ch[] = input.toCharArray();
		for (char c : ch) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		System.out.println("Direct CharCountObject" + charCountMap);
		System.out.println("Manual Iteration ::");
		for (Map.Entry<Character, Integer> map : charCountMap.entrySet()) {
			System.out.println("Key:" + map.getKey() + " Value:" + map.getValue());

		}
		
		for(char c:charCountMap.keySet())System.out.println(c);
		for(int i:charCountMap.values())System.out.println(i);
		
		Iterator<Entry<Character, Integer>> entries = charCountMap.entrySet().iterator();
		while(entries.hasNext()) {
			System.out.println(entries.next());
		}
		
	}

	public static void main(String args[]) {
		characterCount(inputString);

		System.out.println(new CharacterCountString());
	}

}
