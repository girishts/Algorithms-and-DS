package com.practice.balancedbracket;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
	
	public static boolean isBalanced(String expression) {
		Stack<Character> st =new Stack<Character>();
		char[] charry=expression.toCharArray();
		for(char ch:charry) {
			if(ch=='{' || ch =='[' || ch=='(') {
				st.push(ch);
			}
			else if(ch == '}' || ch ==']' || ch==')') {
				if(st.isEmpty()) return false;
				else if(!isMatchingPair(st.pop(),ch)) {
					return false;
				}
			}
		}
		if(st.empty())
		return true;
		else
			return false;
	}
	
	public static boolean isMatchingPair(char c1,char c2) {
		if(c1 =='{' && c2 == '}') {
			return true;
		}else if(c1 =='(' && c2 == ')') {
			return true;
		}else if(c1 =='[' && c2 == ']') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

}
