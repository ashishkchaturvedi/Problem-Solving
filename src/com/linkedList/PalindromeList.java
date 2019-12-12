package com.linkedList;

import java.util.Stack;

//class Node{
//	int data;
//	Node next;
//	
//	public Node(int data){
//		this.data = data;
//		this.next = null;
//	}
//} 

public class PalindromeList {

	public static void main(String[] args) {
		
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(2);
		n.next.next.next = new Node(1);
		
		System.out.println(isPalidrome(n));

	}
	
	public static boolean isPalidrome(Node head){
        Node slow = head; 
        boolean ispalin = true; 
        Stack<Integer> stack = new Stack<Integer>(); 
  
        while (slow != null) { 
            stack.push(slow.data); 
            slow = slow.next; 
        } 
  
        while (head != null) { 
  
            int i = stack.pop(); 
            if (head.data == i) { 
                ispalin = true; 
            } 
            else { 
                ispalin = false; 
                break; 
            } 
            head = head.next; 
        } 
        return ispalin; 
	}

}
