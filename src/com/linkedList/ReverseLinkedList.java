package com.linkedList;

import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ListNode res = reverseList(head);
		System.out.println(res);
		
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}

	}
	
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode>  stack = new Stack<>();
        while(head != null){
        	stack.push(head);
        	head = head.next;
        }
        
        ListNode curr = new ListNode(0);
        ListNode temp = curr;
        while(!stack.isEmpty()){
        	curr.next = stack.pop();
        	curr = curr.next;
        }
        curr.next = null;
        return temp.next;
    }

}
