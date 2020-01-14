package com.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = head.next;
		ListNode res = detectCycle(head);
		System.out.println(res.val);
		
	}
	
    public static ListNode detectCycle(ListNode head) {
    	Set<ListNode> set = new HashSet<>();
    	ListNode temp = head;
    	while(temp != null){
    		if(set.contains(temp)){
    			return temp;
    		}
    		else{
    			set.add(temp);
    		}
    		temp = temp.next;
    	}
    	return null;
    }

}
