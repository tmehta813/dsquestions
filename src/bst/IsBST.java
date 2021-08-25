package bst;

public class IsBST {
	
	Node root;
	
	public static void main(String[] args) {
		    IsBST tree = new IsBST();
	        tree.root = new Node(10);
	        tree.root.left = new Node(6);
	        tree.root.right = new Node(18);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(7);
	 
	        if (tree.isBST())
	            System.out.println("It is BST");
	        else
	            System.out.println("Not a BST");
	}

	private boolean isBST() {
		return isbstUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);		
	}

	private boolean isbstUtil(Node node, int minValue, int maxValue) {
		if(node==null) return true;
		
		
		if(node.val<minValue || node.val>maxValue) return false;
		
		return isbstUtil(node.left,minValue,node.val) && isbstUtil(node.right,node.val,maxValue);
		
	}

}
