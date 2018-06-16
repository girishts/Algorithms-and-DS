package com.practice.anagrams;

import java.util.Scanner;

public class Solution {
    public static int alphabet_size = 26;
    public static int numberNeeded(String first, String second) {
       int[] c1 = getCharCount(first.toCharArray());
	   int[] c2 = getCharCount(second.toCharArray());
       return (getDelta(c1,c2));
    }
    
    public static int getDelta(int[] c1, int[] c2) {
		int delta = 0;
		for (int i=0;i<c1.length ; i++) {
			if(c1[i]!=c2[i]) {
				if(c1[i]>c2[i]) {
					delta += c1[i]-c2[i];
				}else {
					delta +=c2[i]-c1[i];
				}
			}
		}
		System.out.println("\nNo of characters difference: "+ delta);
        return delta;
	}
  
    public static int[] getCharCount(char[] input) {
		int charCount[] = new int[alphabet_size];
		int offset = (int) 'a';
		for (char ch : input) {
			int index = ((int) ch) - offset;
			charCount[index] = charCount[index] + 1;
		}
		System.out.println("\nabcdefghijklmnopqrstuvwxyz");
		for (int ch : charCount) {
			System.out.print(ch);
		}
		return charCount;
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

