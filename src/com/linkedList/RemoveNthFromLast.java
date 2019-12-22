package com.linkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveNthFromLast {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		int n = 2;
		
		
		
		ListNode res = removeNthFromEnd(head, n);
		while(res != null){
			System.out.print(res.val+"->");
			res = res.next;
		}
		System.out.print("null");
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode fp = temp;
		ListNode p = temp;
		
	    for (int i = 1; i <= n + 1; i++) {
	        fp = fp.next;
	    }
		
		while(fp != null){
			p = p.next;
			fp = fp.next;
		}
		
		p.next = p.next.next;
		
		return temp.next;
        
    }

}
