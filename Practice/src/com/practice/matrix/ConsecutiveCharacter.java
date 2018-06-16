/**
 * 
 */
package com.practice.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212601941
 *
 */
public class ConsecutiveCharacter {

	public static void main(String[] args) {
		String input = "kkjnmnmnjjjnmjn";
		findConsecutive3Character(input);
	}

	public static void findConsecutive3Character(String input) {

		char[] inputArr = input.toCharArray();

		List<String> stringlist = new ArrayList<String>();
		List<String> finalList = new ArrayList<String>();
		char[] temp_arr = new char[3];
		for (int i = 0; i < (input.length() - 2); i++) {
			temp_arr[0] = inputArr[i];
			temp_arr[1] = inputArr[i + 1];
			temp_arr[2] = inputArr[i + 2];
			String temp = new String(temp_arr);
			stringlist.add(temp);
		}
		System.out.println("stringlist:"+stringlist);
		for (int j = 0; j < stringlist.size(); j++) {
			for (int k = j + 1; k < stringlist.size(); k++) {
				if (stringlist.get(j).equals(stringlist.get(k))) {
					finalList.add(stringlist.get(j));
				}
			}
		}
		System.out.println("finallist:"+ finalList);
		for (String res : finalList) {
			System.out.print(res+" ");
			
		}

	}

}
