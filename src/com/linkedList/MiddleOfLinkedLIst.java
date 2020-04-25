package com.linkedList;

public class MiddleOfLinkedLIst {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
		ListNode res = middleNode(head);
		while(res != null){
			System.out.print(res.val +"->");
			res = res.next;
		}
		System.out.print("null");

	}
	
	public static ListNode middleNode(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast.next != null){
			if(fast.next.next != null){
				fast = fast.next.next;
				slow = slow.next;
			}
			else{
				fast = fast.next;
				slow = slow.next;
			}
		}
		return slow;
	}

}
