package com.stack;

import java.util.Stack;

public class MinStack {
	
	static int min = Integer.MAX_VALUE;
	static Stack<Integer> stack = new Stack<>();
	
	public static void push(int x){
		if(x < min){
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}
	
	public static void pop(){
		if(stack.pop() == min) min = stack.pop();
	}
	
	public static int top(){
		return stack.peek();
	}
	
	public static int getMin(){
		return min;
	}

	public static void main(String[] args) {
		push(-2);
		push(0);
		push(-3);
		System.out.println("Top is: "+top());
		System.out.println("Min is: " +getMin());
		pop();
		System.out.println("Top is: "+top());
		System.out.println("Min is: "+getMin());

	}

}
