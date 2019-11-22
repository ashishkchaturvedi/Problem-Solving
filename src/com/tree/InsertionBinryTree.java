package com.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int k){
		this.key = k;
		this.left = null;
		this.right = null;
	}
}

public class InsertionBinryTree {
	
	static Node root;
	static Node temp = root;

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		//(root);
		insert(root, 12);
		print(root);
		
	}
	
	public static void insert(Node temp, int n){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(temp);
		
		while(!queue.isEmpty()){
			temp = queue.peek();
			queue.remove();
			
			if(temp.left == null){
				temp.left = new Node(n);
				break;
			}
			else{
				queue.add(temp.left);
			}
			
			if(temp.right == null){
				temp.right = new Node(n);
				break;
			}
			else{
				queue.add(temp.right);
			}
		}
	}
	
	public static void print(Node temp){
		
		if(temp == null){
			return;
		}
		print(temp.left);
		System.out.println(temp.key);
		print(temp.right);
	}

}
