package com.practice.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6);
		//System.out.println(list);
		
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer item) {
				System.out.println(item);
			}
		});
		
		list.forEach(item ->{
			System.out.println(item);
		});
		
		Map<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("A", 2);
		testMap.put("B", 3);
		
		testMap.forEach((k,v)->{
			System.out.println(k+" " +v);
		});
	}

}
