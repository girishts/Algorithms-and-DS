package com.practice.ransomenote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagzineRansomNote {
	
	
	    Map<String, Integer> magazineMap;
	    Map<String, Integer> noteMap;
	    
	    public static boolean isBalanced(String expression) {
	         Map<Character, Integer> charMap =new HashMap<Character, Integer>();
	         char[] carr =expression.toCharArray();
	         for(Character ch :carr) {
	        	if(charMap.containsKey(ch)) {
	        		charMap.put(ch, charMap.get(ch)+1);
	        	}else {
	        		charMap.put(ch, 1);
	        	}
	        }
	        
	        for(Map.Entry<Character, Integer> map:charMap.entrySet()){
	        	if(map.getValue() % 2 !=0) {
	        		return false;
	        	}
	        }
	        return true;
	    }
	    
	    
	    public MagzineRansomNote(String magazine, String note) {
	    	String[] magWords =magazine.split(" ");
	    	String[] noteWords =note.split(" ");
	    	magazineMap =new HashMap<String,Integer>();
	    	noteMap=new HashMap<String,Integer>();
	    	for(String word:magWords) {
	    		if(magazineMap.containsKey(word)) {
	    			magazineMap.put(word, magazineMap.get(word)+1);
	    		}else {
	    			magazineMap.put(word, 1);
	    		}
	    	}
	    	for(String word:noteWords) {
	    		if(noteMap.containsKey(word)) {
	    			noteMap.put(word, noteMap.get(word)+1);
	    		}else {
	    			noteMap.put(word, 1);
	    		}
	    	}
	        
	    }
	    
	    public boolean solve() {
	    	
	    	for(Map.Entry<String, Integer> map : noteMap.entrySet()) {
	    		if(!magazineMap.containsKey(map.getKey()) || (magazineMap.get(map.getKey())< map.getValue()))
	    			return false;
	    	}
	    	
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();
	        
	        scanner.nextLine();
	        
	        MagzineRansomNote s = new MagzineRansomNote(scanner.nextLine(), scanner.nextLine());
	        scanner.close();
	        
	        boolean answer = s.solve();
	        if(answer)
	            System.out.println("Yes");
	        else System.out.println("No");
	      
	    }
	
}
