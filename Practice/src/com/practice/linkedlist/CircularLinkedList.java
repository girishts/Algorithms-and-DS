package com.practice.linkedlist;

public class CircularLinkedList<T> {
	Node<T> head;
	
	public CircularLinkedList() {
		head =null;
	}
	
	public CircularLinkedList(T data) {
		head = new Node<T>(data);
		head.next = head;
	}
	
	public void addInLast(T data) {
		Node<T> newnode =head = new Node<T>(data);
		head.next = head;
		if(head == null) {
			head = newnode;
			head.next = head;
			return;
		}
		Node<T> current = head;
		
		while(current.next!=head) {
			current =current.next;			
		}
		
		current.next =newnode;
		newnode.next = head;
		
	}
	
	public void printAll() {
		Node<T> current =head;
		while(current!=null && current.next!=head) {
			System.out.println(current.data);
			current =current.next;
		}
		
	}
	

}
