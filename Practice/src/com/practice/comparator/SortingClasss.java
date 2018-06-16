package com.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingClasss {
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee e1 = new Employee(3,"Abhay",56000,28);
		Employee e2 = new Employee(1,"Girish",56000,28);
		Employee e3 = new Employee(6,"Kannan",36000,27);
		Employee e4 = new Employee(2,"Niranjan",66000,26);
		emplist.add(e1);emplist.add(e2);emplist.add(e3);emplist.add(e4);
		Collections.sort(emplist, new NameComparator());
		System.out.println(emplist);
	}
}
