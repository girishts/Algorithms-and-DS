package com.practice.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Sample {
	static int n;
	static int array[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//function1();
		//function2();
		function6();
	}
	
	static class Person{
		private String name;
		Person(String n){
			this.name=n;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + "]";
		}
		
	}
	private static void function6() {
		Map<String, String> map =new HashMap<String,String>();
		map.put("A", "AAA");
		map.put("B", "BB");
		System.out.println(map);
		Map<String, Person> mapmap =new HashMap<String,Person>();
		mapmap.put("C", new Sample.Person("Girish"));
		mapmap.put("D", new Sample.Person("Girish TS"));
		System.out.println(mapmap);
		
		
	}
	private static void function2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		array=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ (i+1) +" element of array");
			array[i]=sc.nextInt();
		}
		System.out.println("<==================>");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		sc.close();
		
	}
	
	private static void function5() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array:");
		n=Integer.parseInt(br.readLine());
		array=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ (i+1) +" element of array");
			array[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("<==================>");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		br.close();
	}
	public static void function4()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scn.nextInt();
        System.out.println("Enter a String");
        String b = scn.nextLine();
        System.out.printf("You have entered:- "
                + a + " " + "and name as " + b);
        scn.close();
    }
	
	private static void function3() throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("Enter an integer");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter a String");
        String b = br.readLine();
        System.out.printf("You have entered:- " + a +
                          " and name as " + b);
	}

	private static void function1() {
		Map<String, String> countryJurisdictionMap = new HashMap<String, String>();
		countryJurisdictionMap.put("A","1");
		countryJurisdictionMap.put("B","2");
		int gts=6;
		System.out.println(countryJurisdictionMap);
		function2(countryJurisdictionMap,gts);
		for(Map.Entry<String, String> map: countryJurisdictionMap.entrySet()) {
			System.out.println(map.getKey() +" "+ map.getValue());
		}
		System.out.println(gts);
		
	}

	private static void function2(Map<String, String> countryJurisdictionMap,int gts) {
		countryJurisdictionMap.put("C", "3");
		gts=7;
		
	}
}
