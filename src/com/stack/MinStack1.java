package com.stack;

import java.util.Stack;

public class MinStack1 {
	
	static Stack<Integer> minStack = new Stack<Integer>();
	static int min = Integer.MAX_VALUE;

	
	public static void push(int x){
		if(x <= min){
			minStack.push(min);
			min = x;
		}
		minStack.push(x);
	}
	
	public static void pop(){
		if(min == minStack.pop()) min = minStack.pop();
	}
	
	public static int top(){
		return minStack.peek();
	}
	
	public static int getMin(){
		return min;
	}

	public static void main(String[] args) {
		push(-2);
		push(0);
		push(-3);
		System.out.println(getMin()); // return -3
		pop();
		System.out.println(top());    // return 0
		System.out.println(getMin()); // return -2

	}
	
	

}
