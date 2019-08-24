package com.linkedList;

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class NthToLastElement {
	
	Node head;

	public static void main(String[] args) {
		NthToLastElement element = new NthToLastElement();
		element.head = new Node(1);
		element.head.next = new Node(2);
		element.head.next.next = new Node(3);
		element.head.next.next.next = new Node(4);
		element.head.next.next.next.next = new Node(5);
		Node result = nthToLast(element.head, 4);
		
		System.out.println(result.data);
	}
	
	public static Node nthToLast(Node node, int n){
		Node curr = node;
		Node follower = node;
		for(int i = 0; i < n; i++){
			curr = curr.next;
		}
		
		while(curr.next != null){
			curr = curr.next;
			follower = follower.next;
		}
		return follower;
	}

}
