package com.linkedList;

//class Node{
//	int data;
//	Node next;
//	
//	public Node(int data){
//		this.data = data;
//		this.next = null;
//	}
//}

public class AddTwoNumbers {

	public static void main(String[] args) {
		Node l1 = new Node(2);
		l1.next = new Node(4);
		l1.next.next = new Node(3);
		
		Node l2 = new Node(5);
		l2.next = new Node(6);
		l2.next.next = new Node(4);
		
		//add(l1,l2);
		Node result = add(l1, l2);
		//System.out.println(result);
		
		System.out.println("================================");
		while(result != null){
			System.out.println(result.data);
			result = result.next;
		}

	}
	
	//static boolean carry = false;
	
	public static Node add(Node l1, Node l2){
		
		Node temp = new Node(0);
		Node l3 = temp;
		boolean carry = false;
		
//		while(l3 != null){
//			System.out.println(l3.data);{
//				l3 = l3.next;
//			}
//		}
		
		while(l1 != null){
			Node curr = new Node(0);
			if(carry){
				curr.data = l1.data + l2.data + 1;
				System.out.println("when carry is true:" + curr.data);
			}
			else{
				curr.data = l1.data + l2.data;
				System.out.println("when carry is false: "+curr.data);
			}
			if(curr.data >=10){
				carry = true;
				curr.data = curr.data - 10;
				System.out.println("Remoed 10 from total: "+ curr.data);
			}
			else{
				carry = false;
			}
			temp.next = curr;
			temp = curr;
			//l3 = l1.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		return l3.next;
	}

}
