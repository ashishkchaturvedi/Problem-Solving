package com.linkedList;

public class RemoveElements {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		int val = 6;
		
		ListNode res = removeElements(head, val);
		
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}

	}
	
    public static ListNode removeElements(ListNode head, int val) {
        
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        while (curr != null) {
          if (curr.val == val) prev.next = curr.next;
          else prev = curr;
          curr = curr.next;
        }
        return sentinel.next;
    }

}
