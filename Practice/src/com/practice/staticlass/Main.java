package com.practice.staticlass;

import com.practice.staticlass.StaticClasses.NestedStaticClass;

public class Main {

	public static void main(String[] args) {

		// create instance of nested Static class
		StaticClasses.NestedStaticClass printer = new StaticClasses.NestedStaticClass();
		NestedStaticClass ns = new NestedStaticClass();
		//StaticClasses.NestedStaticClass ps = new StaticClasses.NestedStaticClass();
		//StaticClasses.InnerClass ic = new StaticClasses().new InnerClass();
		System.out.println("****************************************************");
		ns.printMessage();
		System.out.println("****************************************************");
		// call non static method of nested static class
		printer.printMessage();

		// In order to create instance of Inner class we need an Outer class
		// instance. Let us create Outer class instance for creating
		// non-static nested class
		StaticClasses outer = new StaticClasses();
		StaticClasses.InnerClass inner = outer.new InnerClass();

		// calling non-static method of Inner class
		inner.display();

		// we can also combine above steps in one step to create instance of
		// Inner class
		StaticClasses.InnerClass innerObject = new StaticClasses().new InnerClass();

		// similarly we can now call Inner class method
		innerObject.display();

	}
}
