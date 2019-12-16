package com.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.left = new TreeNode(7);
		
		List<List<Integer>> list = levelOrderBottom(root);
		System.out.println("[");
		for(List<Integer> l : list){
			System.out.print("[");
			for(int i : l){
				System.out.print(i + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println("]");

	}
	
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
     
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	
    	int level  = maxDepth(root);
    	
    	for(int i = 0; i < level; i++){
    		list.add(new ArrayList<>());
    	}
    	
    	buildLists(root, list, 1);
    	return list;
    }
    
    private static void buildLists(TreeNode root, List<List<Integer>> list, int i) {
		
    	if(root != null){
    		list.get(list.size() - i).add(root.key);
    		buildLists(root.left, list, i + 1);
    		buildLists(root.right, list, i + 1);
    	}
	}

	private static int maxDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	else{
    		int lHeight = maxDepth(root.left);
    		int rHeight = maxDepth(root.right);
    		
    		if(lHeight > rHeight){
    			return lHeight + 1;
    		}
    		else{
    			return rHeight + 1;
    		}
    	}
    }

}
