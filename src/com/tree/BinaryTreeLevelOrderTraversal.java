package com.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.left = new TreeNode(7);
		
		System.out.println(levelOrder(root));

	}
	
    public static List<List<Integer>> levelOrder(TreeNode root) {
    	
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	int level = height(root);
    	for(int i = 0; i < level; i++){
    		list.add(new ArrayList<>());
    	}
    	
    	buildList(root, list, 0);
    	return list;
    }

	private static void buildList(TreeNode root, List<List<Integer>> list, int i) {
		
		if(root != null){
			list.get(i).add(root.key);
			buildList(root.left, list, i + 1);
			buildList(root.right, list, i + 1);
		}
	}

	private static int height(TreeNode root) {
		if(root == null) return 0;
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		if(lHeight > rHeight){
			return lHeight + 1;
		}
		else {
			return rHeight + 1;
		}
	}

}
