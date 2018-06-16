package com.practice.fractions;

import java.util.ArrayList;
import java.util.List;

public class FractionsAddition {
	
	public static void main(String[] args) {
		System.out.println(gcd(54,24));
	}

	public static int gcd(int a, int b) {
		if (a==0) /* bheema bheema Baa , similarly a,b  a==0 return b, b%a,a*/
			return b;
		else return gcd(b%a,a);
	}
	
	public List<Integer> lowest(int n,int d){
		int cf= gcd(n,d);
		int res_num=n/cf;
		int res_den=d/cf;
		List<Integer> list = new ArrayList<Integer>();
		list.add(res_num);
		list.add(res_den);
		return list;
	}
	public List<Integer> addFraction(int n1,int n2, int d1,int d2){
		int d3= gcd(d1,d2);
		d3 =(d1*d2)/d3;
		int	n3=(n1)*(d3/d1) + (n2)*(d3/d2);
		return lowest(n3,d3);
	}
	
}
