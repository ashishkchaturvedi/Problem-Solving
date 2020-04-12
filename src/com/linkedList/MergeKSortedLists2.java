package com.linkedList;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MergeKSortedLists2 {

	public static void main(String[] args) {
		
		ListNode list4 = new ListNode(8);
		list4.next = new ListNode(9);		
		
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(5);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		
		ListNode list3 = new ListNode(2);
		list3.next = new ListNode(6);
		
		ListNode[] lists = {list4, list1, list2, list3};
		
		ListNode res = mergeKLists(lists);
		
		while(res != null){
			System.out.print(res.val +"->");
			res = res.next;
		}
		System.out.print("null");

	}
	
	public static ListNode mergeKLists(ListNode[] lists){
		PriorityQueue<ListNode> nodesQueue = new PriorityQueue<>((ListNode e, ListNode f) -> e.val - f.val);
		ListNode temp = new ListNode(0);
		ListNode head = temp;
		
		for(ListNode node : lists){
			if(node != null) nodesQueue.add(node);
		}
		while(nodesQueue.peek()!=null){
			ListNode node = nodesQueue.remove();
			if(node.next != null) nodesQueue.add(node.next);
			head.next = node;
			head = head.next;
		}
		return temp.next;
	}

}
