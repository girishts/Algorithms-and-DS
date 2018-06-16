package com.practice.stage;

public class MyStack {

	int capacity =2;
	int top;
	int array[] ;
	
	MyStack(){
		top=-1;
		array = new int[capacity] ;
	}
	
	int push(int element) throws Exception {
		if(top>=capacity-1) {
			throw new Exception("Stack Overflow");
		}else {
			array[++top]=element;
		}
		return element;
	}
	
	int pop() throws Exception{
		if(top < 0) {
			throw new Exception("Stack Underflow");
		}
		return array[top--];
	}
	
	void printAll() {
		for (int i = 0; i <= top; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		MyStack stack = new MyStack();
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.printAll();
		
	}
	
}
