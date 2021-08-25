package array;

public class Q23 {

	Node head = null;

	public static void main(String[] args) {

		Q23 q = new Q23();
		q.insertNode(15);
		q.insertNode(12);
		q.insertNode(30);
		q.insertNode(8);
		q.insertNode(14);
		q.insertNode(20);
		q.insertNode(40);
		q.insertNode(6);
		q.insertNode(10);

	}

	void insertNode(int value) {

		Node node = new Node(value);

		if (head == null) {
			head = node;
		}
		else {
			insertNode(value,head);
		}

	}
	
	void insertNode(int value, Node node) {
		if(value<node.value) {
			if(node.left==null) {
				Node newNode = new Node(value);
				node.left=newNode;
			}else insertNode(value,node.left);	
		}
		else {
			if(node.right==null) {
				Node newNode = new Node(value);
				node.left=newNode;
			}else insertNode(value,node.right);
		}
	}

	void deleteNode(int value) {
		if(head==null) return;
	}

	static class Node {

		int value;
		Node left;
		Node right;

		Node(int val) {
			this.value = val;
		}

	}

}
