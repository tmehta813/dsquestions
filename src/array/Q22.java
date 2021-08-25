package array;

//hight of a tree

public class Q22 {
	
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
	
		//System.out.println(heightOfTree(node1));
		inOrderTraverse(node1);
		System.out.println("\n--------mirror\n-------------------");
		inOrderTraverse(mirrorOfTree(node1));
		
	}
	
	
	static void inOrderTraverse(Node node) {
		if(node==null) return;
		
		inOrderTraverse(node.left);
		System.out.println(node.val);
		inOrderTraverse(node.right);
		
	}
	
	
	
	static int heightOfTree(Node node) {
		if(node==null) return 0;
		
		int heightOfLeftTree = heightOfTree(node.left);
		int heightOfRightTree = heightOfTree(node.right);
		return 1 + Math.max(heightOfLeftTree,heightOfRightTree);
	}
	
	
	static Node mirrorOfTree(Node node) {
		if(node==null) return null;
		Node left =  mirrorOfTree(node.left);
		Node right = mirrorOfTree(node.right);
		node.left=right;
		node.right=left;
		return node;
		
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
