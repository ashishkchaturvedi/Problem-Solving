package com.tree;

public class Subtree {
	
	public static String preOrder(Node node){
		if(node == null){
			//str1 = s1.toString();
			return "null";
		}
		return "#"+node.key + " " +preOrder(node.left)+" " +preOrder(node.right);
	}
	
	static Node root1;
	static Node root2;
	
	public static void main(String[] args) {
		
		
		root1 = new Node(3);
		root1.left = new Node(4);
		root1.right = new Node(5);
		root1.left.left = new Node(1);
		root1.left.right = new Node(2);
		
		
		root2 = new Node(4);
		root2.left = new Node(1);
		root2.right = new Node(2);
		
		if(isSubtree(root1, root2)){
			System.out.println("It is subtree");
		}
		else{
			System.out.println("Not a subtree");
		}

	}
	
	public static boolean isSubtree(Node root1, Node root2){
		String str1;
		String str2;
		str1 = preOrder(root1);
		str2 = preOrder(root2);
		return str1.indexOf(str2) >= 0;
	}

}
