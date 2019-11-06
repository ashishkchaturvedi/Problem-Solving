package com.linkedList;


public class MegingTwoList {
	
	
	Node head;
	
	public static void merge(Node l1, Node l2){
		
		Node temp = new Node(0);
		Node list3 = temp;
		
		while(true) {
			
			if(l1 == null){
				list3.next = l2;
				break;
			}
			
			if (l2 == null){
				list3.next = l1;
				break;
			}
			
			if(l1.data <= l2.data){
				list3.next = l1;
				l1 = l1.next;
			}
			else {
				list3.next = l2;
				l2 = l2.next;
			}
			
			list3 = list3.next;
		}
		temp = temp.next;
		
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	

	public static void main(String[] args) {
		MegingTwoList list1 = new MegingTwoList();
		MegingTwoList list2 = new MegingTwoList();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(4);
		list2.head = new Node(1);
		list2.head.next = new Node(3);
		list2.head.next.next = new Node(4);
		merge(list1.head, list2.head);
	}

}
