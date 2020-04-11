package com.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator1 {
	
	List<Integer> nodesSorted;
	int index;
	
	public BinarySearchTreeIterator1(TreeNode root){
		this.index = -1;
		this.nodesSorted = new ArrayList<Integer>();
		this.inorder(root);
	}

	private void inorder(TreeNode root) {
		if(root == null) return;
		inorder(root.left);
		nodesSorted.add(root.key);
		inorder(root.right);
	}
	
	public int next(){
		return nodesSorted.get(++this.index);
	}
	
	public boolean hasNext(){
		return this.index + 1 < nodesSorted.size();
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(3);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(20);
		BinarySearchTreeIterator1 iterator = new BinarySearchTreeIterator1(root);
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
