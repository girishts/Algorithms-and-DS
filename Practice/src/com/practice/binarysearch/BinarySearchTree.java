package com.practice.binarysearch;

public class BinarySearchTree {

	
	Node root;

	public BinarySearchTree() {
		root = null;
	}


	public void insert(int key) {
		root =insertNode(root, key);
	}

	private Node insertNode(Node node, int key) {

		if (node == null) {
			node = new Node(key);
			return node;
		}

		if (key > node.key) {
			node.right = insertNode(node.right, key);
		} else if(key < node.key){
			node.left = insertNode(node.left, key);
		}
		return node;
	}

	public void inOrder() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.key);
			inOrderTraversal(node.right);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(40);
		bst.insert(10);
		bst.insert(20);
		bst.insert(50);
		bst.insert(30);
		bst.inOrder();
	}

}
