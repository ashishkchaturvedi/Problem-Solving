package com.linkedList;

public class DeleteNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);
		
		int val = 5;
		
		deleteNode(head, val);

	}
	
    public static void deleteNode(ListNode node, int val) {

        
        while(node != null){
            if(node.val == val){
            	node.val = node.next.val;
                node.next = node.next.next;
            }
            node = node.next;
        }
        
        while(node != null){
        	System.out.println(node.val);
        	node = node.next;
        }
    }

}
