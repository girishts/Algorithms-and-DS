package com.practice.matrix;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class PerformanceListIteration {
	private static long startTime;
	private static long endTime;
	private static long startTime1;
	private static long endTime1;
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");nameList.add("Hello");
		nameList.add("Hello");
		
		startTime =Calendar.getInstance().getTimeInMillis();
		for(String s : nameList) {
			System.out.println(s);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken is :" + (endTime -startTime));
		
		startTime1 =Calendar.getInstance().getTimeInMillis();
		for(Iterator<String> iterator=nameList.iterator() ;iterator.hasNext();) {
			System.out.println(iterator.next()); 
			}
		endTime1 = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("Time taken is :" + (endTime1 -startTime1));
		
		
		
		}
	
	
	

}
