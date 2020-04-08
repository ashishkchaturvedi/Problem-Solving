package com.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator {
	
	List<Integer> nodesSorted;
	int index;
	
	public BinarySearchTreeIterator(TreeNode root){
		this.nodesSorted = new ArrayList<Integer>();
		this.index = -1;
		this.inorder(root);
	}

	private void inorder(TreeNode root) {
		if(root == null) return;
		this.inorder(root.left);
		this.nodesSorted.add(root.key);
		this.inorder(root.right);
	}
	
	public int next(){
		return this.nodesSorted.get(++this.index);
	}
	
	public boolean hasNext(){
		return this.index + 1 < this.nodesSorted.size();
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(3);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(20);
		BinarySearchTreeIterator iterator = new BinarySearchTreeIterator(root);
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		
		
		

	}

}
