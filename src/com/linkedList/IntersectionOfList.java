package com.linkedList;

public class IntersectionOfList {

	public static void main(String[] args) {
		
//		ListNode headA = new ListNode(4);
//		headA.next = new ListNode(1);
//		headA.next.next = new ListNode(8);
//		headA.next.next.next = new ListNode(4);
//		headA.next.next.next.next = new ListNode(5);
//		
//		ListNode headB = new ListNode(5);
//		headB.next = new ListNode(0);
//		headB.next.next = new ListNode(1);
//		headB.next.next.next = headA.next.next;
//		headB.next.next.next.next = headA.next.next.next;
//		headB.next.next.next.next.next = headA.next.next.next.next;
		
		ListNode headA = new ListNode(0);
		headA.next = new ListNode(9);
		headA.next.next = new ListNode(1);
		headA.next.next.next = new ListNode(2);
		headA.next.next.next.next = new ListNode(4);
		
		ListNode headB = new ListNode(3);
		headB.next = headA.next.next.next;
		headB.next.next = headA.next.next.next.next;
		
		ListNode res = getIntersectionNode(headA, headB);
		System.out.println(res.val);
	}
	
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    	int countA = 0, countB = 0, diff = 0;
    	ListNode pointerA = headA;
    	ListNode pointerB = headB;
    	while(pointerA != null){
    		countA++;
    		pointerA = pointerA.next;
    	}
    	System.out.println(countA);
    	while(pointerB != null){
    		countB++;
    		pointerB = pointerB.next;
    	}
    	System.out.println(countB);
    	
    	if(countA > countB){
    		diff = countA - countB;
    		while(diff > 0){
    			headA = headA.next;
    			diff--;
    		}
    	}
    	else{
    		diff = countB - countA;
    		while(diff > 0){
    			headB = headB.next;
    			diff--;
    		}
    	}
    	
    	
    	while(headA != null){
    		if(headA == headB){
    			return headA;
    		}
    		headA = headA.next;
    		headB = headB.next;
    	}
    	
    	return null;
    }

}
