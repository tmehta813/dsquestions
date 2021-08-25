package binarytrees;

public class KthAncestorNode {
	
	static int k;
	static Node temp;
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	 
	    k = 3;
	    int node = 5;
	 
	    // print kth ancestor of given node
	    Node parent = nodeKthAncestor(root,node);
	     
	    // check if parent is not null, it means
	    // there is no Kth ancestor of the node
	    if (parent == null)
	        System.out.println("-1");
	   
		
	}
	
	static Node nodeKthAncestor(Node root, int node) {
		if(root==null) return null;
		if(root.val==node) {
			return root;
		}
		Node left =  nodeKthAncestor(root.left,node);
		Node right = nodeKthAncestor(root.right, node);
		if(left!=null) {
			k--;
			if(k==0) {
				 System.out.print("Kth ancestor is: "+root.val);
			}
			return root;
		}
		if(right!=null) {
			k--;
			if(k==0) {
				 System.out.print("Kth ancestor is: "+root.val);
			}
			return root;
		}
		return null;
	}

}
