package heaps;

import java.util.LinkedList;
import java.util.Queue;

//Implement a Maxheap/MinHeap using arrays and recursion.

public class MaxMinHeapUsingRecursion {
	
	Node headNode;
	
	public static void main(String[] args) {
		
		int arr[] = {4, 10, 3, 5, 1};
		MaxMinHeapUsingRecursion obj =new MaxMinHeapUsingRecursion();
		obj.insert(arr);
		obj.print(obj.headNode);
	}
	
	
	private void print(Node currentNode) {
	   if(currentNode==null) return;
	   System.out.println(currentNode.val);
	   if(currentNode.right!=null && currentNode.left!=null) {
		   
		   if(currentNode.right.val>currentNode.left.val) {
			   Node left =  currentNode.left;
			   currentNode= currentNode.right;
			   currentNode.left=left;
			   print(currentNode);
		   }
		   else {
			   
			   Node right =  currentNode.right;
			   currentNode= currentNode.left;
			   currentNode.right=right;
			   print(currentNode);
			   
		   }
	   }
	   else {
		   
		   if(currentNode.right!=null) {
			   currentNode=currentNode.right;
			   print(currentNode);
			   
		   }
		   else {
			   currentNode=currentNode.left;
			   print(currentNode);
		   }
		   
	   }
		
		
	}


	void insert(int arr[]) {
		Node node = new Node(arr[0]);
		headNode=node;
		Queue<Node> queue = new LinkedList();
		queue.add(node);
		for(int i=1;i<arr.length;i++) {
			Node firstNode = queue.peek();
			Node newNode = new Node(arr[i]);
		    if(firstNode.left==null) {
			  firstNode.left=newNode;
			  newNode.parent=firstNode;
			  heapify(newNode);
		    }
		    else {
		    	queue.remove(firstNode);
		    }
		    queue.add(newNode);
		}
		
	}


	private void heapify(Node newNode) {
	  if(newNode==null) return;	
	  if(newNode.parent==null) return;
	  if(newNode.val>newNode.parent.val) {
		  int val = newNode.val;
		  newNode.val=newNode.parent.val;
		  newNode.parent.val=val;
		  heapify(newNode.parent);
	  }
		
	}

}
