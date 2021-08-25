package array;
import java.util.Stack;

import array.Q21.Node;

import java.util.Queue;
import java.util.LinkedList;

//print reverse level order traversal

public class Q21 {
	
	
	public static void main(String[] args) {
		
		Node node1=new Node(10);
		Node node2=new Node(20);
		Node node3=new Node(30);
		Node node4=new Node(40);
		Node node5=new Node(60);
		Node node6=new Node(50);
		Node node7=new Node(55);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		

		Q21 q =new Q21();
		//q.printLevelOrderRecursively(node1);
		
		Queue<Node> queue = new LinkedList();
		queue.add(node1);
		
		q.printLevelOrderRecursively(queue);
		
	}
	
	
	void printLevelOrderRecursively(Node node) {
		
		Stack<Node> stack = new Stack<Node>();
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while(!queue.isEmpty())	{
		int size = queue.size();
		while(size-->0)
		{
			Node polled = queue.poll();
			stack.push(polled);
			if(polled.right!=null) queue.add(polled.right);
			if(polled.left!=null) queue.add(polled.left);
		}
		}
		
	 while(!stack.isEmpty()) {
		 System.out.println(stack.pop().val);
	 }		
     
	}
	
void printLevelOrderRecursively(Queue<Node> queue) {
	
	
	   if(queue.isEmpty()) return;
		
		int size = queue.size();
		while(size-->0)
		{
			Node polled = queue.poll();
			
			
			if(polled.right!=null) queue.add(polled.right);
			if(polled.left!=null) queue.add(polled.left);
		}
		
		printLevelOrderRecursively(queue);
		

     
	}
	
	
	
	static class Node{
		Node left;
		Node right;
		int val;
		
		Node(int val){
			this.val=val;
		}
	}

}




