package com.practice.arraylist;

public class ArrayList<T> {
	int size;
	int capacity = 10;
	Object dataArray[];
	int index;

	public ArrayList() {
		super();
		dataArray = new Object[capacity];
		index = 0;
	}

	public void add(T data) {
		ensureSufficientCapacity();
		dataArray[index++]=data;
		size++;
	}
	
	public int size() {
		return size;
	}

	private void ensureSufficientCapacity() {
		if (size == capacity - 1) {
			capacity = capacity * 2;
			Object newDataArray[] = new Object[capacity];
			for (int i = 0; i < dataArray.length; i++) {
				newDataArray[i] = dataArray[i];
			}
			this.dataArray = newDataArray;
		}
	}
	
	public void printArray() {
		for (int i = 0; i < index; i++) {
			System.out.println(dataArray[i]);
			
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String> slist	=new ArrayList<String>();
		
		slist.add("a");slist.add("s");slist.add("b");
		slist.add("b");slist.add("g");slist.add("l");
		slist.add("t");slist.add("p");slist.add("q");
		slist.printArray();
		
		System.out.println("--------------Enjoy----------------");
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(4);
		alist.add(1);
		alist.add(3);
		alist.add(2);
		alist.add(5);
		alist.add(6);
		alist.add(7);
		alist.add(8);
		
		alist.printArray();
		System.out.println("Arraylist size: "+ alist.size());
	}

}
