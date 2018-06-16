package com.practice.tries.onlineTests;

import java.util.HashMap;
import java.util.Map;

public class OnlineTests {
	
	static String findNumber(int[] arr, int k) {
        Map<Integer,Character> lookup = new HashMap<Integer,Character>();
        for(int i=0;i<arr.length;i++){
            lookup.put(arr[i],'Y');
        }
        if(lookup.containsKey(k)){
            return "YES";
        }else{
            return "NO";
        }
    }
	
	 static int[] oddNumbers(int l, int r) {
	        int array[] =new int[r-l];
	        int k=0;
	       for(int i=l;i<=r;i++){
	           if(i%2 !=0){
	               array[k++]=i;
	               
	           }
	       }
	        return array;
	   }
	
	public static void main(String[] args) {
		
	int arr[]=	oddNumbers(3,9);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0)
		System.out.println(arr[i]);
	}
	}

}
