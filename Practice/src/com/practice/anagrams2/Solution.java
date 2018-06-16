package com.practice.anagrams2;

import java.io.*;
import java.util.*;
public class Solution {
    public static int alphabet_size = 26;
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    System.out.println("drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe".length());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> inputStrings = new ArrayList<String>();
    int n;
    n=Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
        inputStrings.add(br.readLine());
     }
    
    for(String str: inputStrings){
          findAnagramCount(str);
    }

    
}

public static void findAnagramCount(String str){
    int mid =str.length()/2;
    String s1=str.substring(0,mid);
    String s2=str.substring(mid,str.length());
    System.out.println(s1);
    System.out.println(s2);
    int[] c1 = getCharCount(s1.toCharArray());
	int[] c2 = getCharCount(s2.toCharArray());
	System.out.println(c1);
	System.out.println(c2);
	getDelta(c1, c2);
}

    public static int[] getCharCount(char[] input) {
		int charCount[] = new int[alphabet_size];
		int offset = (int) 'a';
		for (char ch : input) {
			int index = ((int) ch) - offset;
			charCount[index] = charCount[index] + 1;
		}
		
		return charCount;
	}
    
    private static void getDelta(int[] c1, int[] c2) {
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
		System.out.println(delta);
	}
}