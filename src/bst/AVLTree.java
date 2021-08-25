package bst;

public class AVLTree {
	
	Node root;
	
	public static void main(String[] args) {
		
		AVLTree tree = new AVLTree();
		 
        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
		
	}
	

	private Node insert(Node root2, int i) {
		// TODO Auto-generated method stub
		return null;
	}


	// Java program for insertion in AVL Tree
	static class Node {
	    int key, height;
	    Node left, right;
	 
	    Node(int d) {
	        key = d;
	        height = 1;
	    }
	}

}
