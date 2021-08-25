package array;
import java.util.Queue;
import java.util.LinkedList;
//Find the maximum and minimum element in an array

public class Q15 {
	
	Queue<Node> queue = new LinkedList();
	static Node head = null;
	
	public static void main(String[] args) {
		Q15 q = new Q15();
		q.insertInHeap(10);
		q.insertInHeap(5);
		q.insertInHeap(7);
		q.insertInHeap(15);
		q.traverseNode(head);
	}
	
	
	void traverseNode(Node node) {
		if(node==null) return;
		System.out.println(node.val);
		traverseNode(node.left);
		traverseNode(node.right);
	}
	
	
	
	 void insertInHeap(int value) {
		 Node node=new Node(value);
				 
		 if(queue.isEmpty()) {
			queue.add(node);
			head = node;
		 }
		 else {
			 Node first = queue.peek();
			 if(first.left==null) {
				 first.left=node;
				 node.parent=first;
			 }
			 else {
				 queue.remove(first);
				 first.right=node;
				 node.parent=first;
			 }
			 queue.add(node);
			 checkIfValueIsGreaterThenParent(node);	 
			
			 
		 }
		
		
	}
	
	
	private void checkIfValueIsGreaterThenParent(Node first) {
		
		if(first==null || first.parent==null || first.val<first.parent.val) return;
		int val = first.parent.val;
		first.parent.val=first.val;
		first.val=val;
		checkIfValueIsGreaterThenParent(first.parent);
	}


	static class Node {
		int val;
		Node left;
		Node right;
		Node parent;
		Node(int val){
			this.val = val;
		}
	}

}