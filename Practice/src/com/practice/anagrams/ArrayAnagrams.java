package com.practice.anagrams;

public class ArrayAnagrams {

	public static int alphabet_size = 26;

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
		String s1 = "cde";
		String s2 = "abc";
		int[] c1 = getCharCount(s1.toCharArray());
		int[] c2 = getCharCount(s2.toCharArray());
		getDelta(c1, c2);
	}

	/**
	 * @param c1
	 * @param c2
	 */
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
		System.out.println("\nNo of characters difference: "+ delta);
	}
}
