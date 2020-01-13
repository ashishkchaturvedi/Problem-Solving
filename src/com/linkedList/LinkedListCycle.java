package com.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = head.next;
		System.out.println(hasCycle(head));

	}
	
    public static boolean hasCycle(ListNode head) {
    	ListNode temp = head;
    	Set<ListNode> set = new HashSet<>();
    	while(temp != null){
    		if(set.contains(temp)){
    			return true;
    		}
    		else{
    			set.add(temp);
    		}
    		temp = temp.next;
    	}
    	return false;
    }

}
