package bst;

public class LargestTreeInBST {
	
	Node root;
	
	public static void main(String[] args) {
		
		LargestTreeInBST tree = new LargestTreeInBST();
        tree.root = new Node(50);
        tree.root.left = new Node(700);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(55);
        tree.root.right.left.left = new Node(45);
        tree.root.right.right = new Node(70);
        tree.root.right.right.left = new Node(65);
        tree.root.right.right.right = new Node(80);
        
        System.out.println(tree.largest(tree.root));
		
	}
	
	int largest(Node node) {
		if(node==null) return 0;	
		if(bst(node)) {
			return size(node);
		}
		
		return Math.max(largest(node.left), largest(node.right));
	}



	private int size(Node node) {
		if(node==null) return 0;
		int leftSize = size(node.left);
		int rightSize = size(node.right);
		return leftSize+rightSize+1;
	}



	private boolean bst(Node node) {
		if(node==null) return true;
		if(node.left==null && node.right==null) return true;
		if(node.left!=null && node.val<node.left.val) return false;
		if(node.right!=null && node.val>node.right.val) return false;

		return bst(node.left) && bst(node.right);
	}

}




