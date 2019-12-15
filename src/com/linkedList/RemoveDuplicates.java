package com.linkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(4);
		head.next.next.next.next.next= new Node(4);
		head.next.next.next.next.next.next = new Node(4);
		head.next.next.next.next.next.next.next = new Node(4);
		
		Node res = deleteDuplicates(head);
		while(res!= null){
			System.out.println(res.data);
			res = res.next;
		}

	}
	
    public static Node deleteDuplicates(Node head) {
    	Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == current.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


}
