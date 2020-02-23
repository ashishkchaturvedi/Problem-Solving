package com.linkedList;

import java.util.PriorityQueue;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		
		ListNode res = mergeTwoLists(l1, l2);
		
		while(res != null){
			System.out.print(res.val);
			System.out.print("->");
			res = res.next;
		}
		System.out.print("null");
	}
	
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		PriorityQueue<ListNode> nodeQueue = new PriorityQueue<>((ListNode e,ListNode f) -> e.val - f.val);
		
		if(l1 != null){
			nodeQueue.add(l1);
		}
		
		if(l2 != null){
			nodeQueue.add(l2);
		}
		
		ListNode temp = new ListNode(0);
		ListNode head = temp;
		
		while(nodeQueue.peek() != null){
			ListNode node = nodeQueue.remove();
			if(node.next != null) nodeQueue.add(node.next);
			head.next = node;
			head = head.next;
		}
		return temp.next;
	}

}
