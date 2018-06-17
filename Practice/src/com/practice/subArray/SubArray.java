package com.practice.subArray;

public class SubArray {

	public static void main(String[] args) {
		int arr[]= {1,4,3,4};
		//System.out.println(isSubArrayofSumKPresent(arr,6));
		subArrayOfSumK(arr,6);
	}
	
	private static void subArrayOfSumK(int[] arr, int k) {
		int l=0,m=0;
		int sum =0;int found=0;
		while(l<arr.length && m<arr.length) {
			if(sum == k) {
				System.out.println("sub array for sum "+k+" found between "+l+" and "+(m-1));
				printSubArray(arr,l,m);found=1;
				break;
			}else if(sum<k) {
				sum=sum+arr[m++];
				
			}else if(sum>k) {
				sum=sum-arr[l++];
			}
		}
		if(found==0)System.out.println("sub array not found");
	}

	private static void printSubArray(int[] arr, int l, int m) {
		for (int i = l; i < m; i++) {
			System.out.println(arr[i]);
		}
	}

	public static boolean isSubArrayofSumKPresent(int a[],int k) {
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
