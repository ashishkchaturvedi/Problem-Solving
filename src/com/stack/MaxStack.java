package com.stack;

public class MaxStack {
	
	private class Node{
		int data;
		Node next;
		Node oldMax;
		
		public Node(int data){
			this.data = data;
			this.next = null;
			this.oldMax = null;
		}
	}
	
	Node max;
	Node stack;
	
	public void push (int x){
		Node n = new Node(x);
		if(stack == null){
			stack = n;
		}
		else{
			n.next = stack;
			stack = n;
		}
		
		if(max == null || n.data > max.data){
			n.oldMax = max;
			max = n;
		}
	}
	
	public int pop(){
		if(stack == null) throw new NullPointerException();
		Node n = stack;
		stack = n.next;
		if(n.oldMax != null){
			max = n.oldMax;
		}
		return n.data;
	}
	
	public int max(){
		if(max == null) throw new NullPointerException();
		return max.data;
	}

	public static void main(String[] args) {
		MaxStack ms = new MaxStack();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		System.out.println(ms.max());
		System.out.println(ms.pop());
		System.out.println(ms.max());
	}

}
