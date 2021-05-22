package com.girish.learning.ds.tree;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
public class LeftViewTree {
    public static void main(String[] args) {
        Node root =new Node(1);
        Node left =new Node(2);
        Node right =new Node(3);
        Node second=new Node(4);
        root.left=left;
        root.right=right;
        root.left.left=second;
        System.out.println(root.data);
    }
}
