package heaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertBST2MinHeap {
	
	Node head;
	Node minHeap;
	
	public static void main(String[] args) {
		
		ConvertBST2MinHeap obj = new ConvertBST2MinHeap();
		obj.insert(4);obj.insert(2); obj.insert(6);obj.insert(1);obj.insert(3);obj.insert(5);obj.insert(7);
		ArrayList<Integer> list = new ArrayList();
		insertIntoList(obj.head,list);
		Node node = obj.convertListIntoMinHeap(list);	
		obj.traverse(node);
	}
	


	private Node convertListIntoMinHeap(ArrayList<Integer> list) {
		int index = 0;
		LinkedList<Node> queue = new LinkedList();
		Node headNode = new Node(list.get(0));
		queue.add(headNode);
		index++;
		while(index<list.size()) {
		 
			Node node = queue.peek();
			Node newNode = new Node(list.get(index++));
			if(node.left==null) {
				node.left=newNode;
			}
			else {
				node.right=newNode;
				queue.poll();
			}
			queue.addFirst(newNode);
		}
		
		return headNode;
		
	}



	private void traverse(Node node) {
		if(node==null) return;
		System.out.println(node.val);
		traverse(node.left);
		traverse(node.right);
	}



	private static void insertIntoList(Node node, ArrayList<Integer> list) {
		if(node==null) return;
		insertIntoList(node.left,list);
		list.add(node.val);
		insertIntoList(node.right, list);
	}


	private void insert(int value) {
		if(head==null) head = new Node(value);
		else insert(head,value);
		
	}

	private void insert(Node node, int value) {
		if(value>node.val) {
			if(node.right==null) {
				node.right=new Node(value);
			}
			else {
				insert(node.right,value);
			}
		}
		else {
			if(node.left==null) {
				node.left=new Node(value);
			}
			else {
				insert(node.left,value);
			}
		}
		
	}

}
