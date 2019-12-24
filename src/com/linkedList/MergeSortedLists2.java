package com.linkedList;

import java.util.PriorityQueue;

public class MergeSortedLists2 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode res = mergeTwoLists(l1, l2);
		
		while(res != null){
			System.out.print(res.val+"->");
			res = res.next;
		}
		System.out.print("null");

	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		PriorityQueue<ListNode> nodesQueue = new PriorityQueue<ListNode>((ListNode e, ListNode f) -> e.val - f.val);
		
		ListNode temp = new ListNode(0);
		ListNode head = temp;
		
		if(l1 != null){
			nodesQueue.add(l1);
		}
		if(l2 != null){
			nodesQueue.add(l2);
		}
		
		while(nodesQueue.peek() != null){
			ListNode node = nodesQueue.remove();
			if(node.next != null) nodesQueue.add(node.next);
			head.next = node;
			head = head.next;
		}
		return temp.next;
	}

}
