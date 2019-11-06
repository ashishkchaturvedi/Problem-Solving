package com.tree;

class Tnode{
	int data;
	Tnode right;
	Tnode left;
	
	public Tnode(int data){
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

public class IsBinarySearchTree {
	

	
	static Tnode parent;
	
	public static boolean isBST(Tnode n){
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean isBST(Tnode n, int min, int max){
		if(n == null) return true;
		if(n.data < min || n.data > max) return false;
		
		return isBST(n.left, min, n.data) && isBST(n.right, n.data + 1, max);
	}

	public static void main(String[] args) {
		//IsBinarySearchTree bst = new IsBinarySearchTree();
		parent = new Tnode(5);
		parent.left = new Tnode(2);
		parent.right = new Tnode(7);
		parent.left.left = new Tnode(1);
		parent.left.right = new Tnode(3);
		parent.right.left = new Tnode(6);
		parent.right.right = new Tnode(8);
		System.out.println(isBST(parent) ? "It is a binary tree" : "Not a binary tree");
		
	}

}
