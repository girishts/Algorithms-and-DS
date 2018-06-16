package com.practice.linkedlist;

public class LinkedList<T> {
	
	Node<T> head;
	
	public void printList() {
		Node<T> current =head;
		while(current!=null) {
			System.out.println(current.data);
			current =current.next;
		}
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head ==null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head= newNode;
	}
	
	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head =newNode;
			return;
		}
		Node<T> currentNode =head;
		while(currentNode.next !=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
			
	}
	
	public void delete(T data) {
		Node<T> current = head;
		if(current==null) {
			System.out.println("Element not found");
			return;
		}
		if(current.data ==data) {
			head=head.next;
			return;
		}
		Node<T> previous=null;
		while(current.next !=null && current.data != data) {
				previous=current;
				current=current.next;
		}
		if(current.data ==data) {
			previous.next=current.next;
			current=null;
		}
	}

	
	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(3);
		llist.add(4);
		llist.add(5);
		llist.add(6);
		llist.addLast(7);
		System.out.println("original list");
		llist.printList();
		llist.delete(3);
		llist.delete(6);
		System.out.println("After deleting 3 and 6");
		llist.printList();
	}
}
