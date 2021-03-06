package com.practice.binarysearch;

public class CheckBinarySearchTree {
	class Node{
		int data;
		Node left;
		Node right;
	}
	public boolean checkBST(Node root){
		return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean checkBST(Node node, int min,int max) {
		if(node == null) {
			return true;
		}
		if (node.data <min || node.data >max)
			return false;
		return checkBST(node.left,min,node.data -1) && checkBST(node.right, node.data +1, max);
	}
	
	public static void main(String[] args) {
		
	}
}
