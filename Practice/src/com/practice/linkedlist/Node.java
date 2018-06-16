package com.practice.linkedlist;

public class Node<T> {
	T data;
	Node<T> next;
	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node(T data) {
		super();
		this.data = data;
		this.next =null;
	}
	public Node() {
		super();
	}
	
}
