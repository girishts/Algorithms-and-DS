package com.practice.subArray;

public class SubArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println(subArrayofSumK(arr,8));
	}
	
	public static boolean subArrayofSumK(int a[],int k) {
		for(int i=0;i<a.length;i++) {
			int sum=a[i];
			if(sum ==k) return true;
			for(int j=i+1;j<a.length;j++) {
				sum =sum+a[j];
				if(sum == k)
					return true;
				if(sum >k)
				break;
			}
			
		}
		
		return false;
	}
}
