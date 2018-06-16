package com.practice.fibonacci;

public class FibonacciSeries {
	
	public static int fibonacci(int n, int[] memo) {
		if(n==0)return 0;
		else if(n==1)return 1;
		else if(memo[n] == 0) {
			memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo);
		}
		return memo[n-1];
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(6, new int[7]));
	}

}
