package com.linkedList;

import java.util.HashMap;

class RNode {
    public int val;
    public RNode next;
    public RNode random;

    public RNode() {}

    public RNode(int _val,RNode _next,RNode _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};

public class RandomPointer {
	
	HashMap<RNode, RNode> visitedHash = new HashMap<RNode, RNode>();
	public static void main(String[] args) {
		RNode head = new RNode();
		RandomPointer rp = new RandomPointer();
		RNode node = rp.copyRandomList(head);
		
		while(node != null){
			System.out.println(node.val);
			node = node.random;
		}
		

	}

	public RNode copyRandomList(RNode head) {
        if (head == null) {
          return null;
        }

        // If we have already processed the current node, then we simply return the cloned version of
        // it.
        if (this.visitedHash.containsKey(head)) {
          return this.visitedHash.get(head);
        }

        // Create a new node with the value same as old node. (i.e. copy the node)
        RNode node = new RNode(head.val, null, null);

        // Save this value in the hash map. This is needed since there might be
        // loops during traversal due to randomness of random pointers and this would help us avoid
        // them.
        this.visitedHash.put(head, node);

        // Recursively copy the remaining linked list starting once from the next pointer and then from
        // the random pointer.
        // Thus we have two independent recursive calls.
        // Finally we update the next and random pointers for the new node created.
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
