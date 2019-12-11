package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class ZigZagTraversal {

	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		res = zigzagLevelOrder(root);
		
		System.out.println("[");
		for(List<Integer> l : res){
			System.out.print("[");
			for(int i : l){
				System.out.print(i + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println("]");
	}
		
	
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      if(root == null) return res;
      
      Queue<TreeNode> q = new LinkedList<TreeNode>();
      q.offer(root);
      boolean isOdd = true;
      
      while(!q.isEmpty()){
    	  List<Integer> level = new ArrayList<>();
    	  int qSize = q.size();
    	  
    	  for(int i = 0; i < qSize; i++){
    		  root = q.poll();
    		  if(isOdd){
    			  level.add(root.key);
    		  }
    		  else{
    			level.add(0, root.key);  
    		  }
    		  if(root.left != null) q.offer(root.left);
    		  if(root.right != null) q.offer(root.right);
    	  }
    	  
    	  if(isOdd){
    		  isOdd = false;
    	  }
    	  else{
    		  isOdd = true;
    	  }
    	  res.add(level);
      }
      return res;
    }

}
