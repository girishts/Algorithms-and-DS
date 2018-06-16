/**
 * 
 */
package com.practice.lonelyinteger;

/**
 * @author 212601941
 *
 */
public class LonelyInteger {

	/**
	 * @param args
	 */
	public static int findLonelyInteger(int arr[]) {
		
		int result = 0;
		for(int i:arr) {
			result ^= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1};
		 System.out.println(findLonelyInteger(a));

	}

}
