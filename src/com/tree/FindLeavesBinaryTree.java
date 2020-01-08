package com.tree;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(findLeaves(root));

	}
	
    public static List<List<Integer>> findLeaves(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	height(root, res);
    	return res;
    }

	private static int height(TreeNode root, List<List<Integer>> res) {
		if(root == null) return -1;
		int level = 1 + Math.max(height(root.left, res), height(root.right, res));
		if(res.size() < level + 1) res.add(new ArrayList<>());
		res.get(level).add(root.key);
		return level;		
	}

}
