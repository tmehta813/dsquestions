package binarytrees;

public class Node {

	Node left;
	Node right;
	int val;
	Node(int val){
		this.val=val;
	}
	
	
	static void inOrderTraverse(Node node) {
		if(node==null) return;
		inOrderTraverse(node.left);
		System.out.println(node.val);
		inOrderTraverse(node.right);
	}
	
}
