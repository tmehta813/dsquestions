package binarytrees;

import java.util.HashMap;
import java.util.Map;

//    10
  //  6    18
//  4   7


//after mirror

//   10
// 18  6
//    7  4

public class MirrorOfATree {
	Node root;
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		MirrorOfATree tree = new MirrorOfATree();
        tree.root = new Node(10);
        tree.root.left = new Node(6);
        tree.root.right = new Node(18);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(7);
        
         inOrderTraverse(tree.root);
         Node node = mirror(tree.root);
         System.out.println("after mirror\n");
         inOrderTraverse(node);
        
 
	}

	private static void inOrderTraverse(Node root) {
		if(root ==null) return;
		inOrderTraverse(root.left);
		System.out.print(root.val+" ");
		inOrderTraverse(root.right);
		
	}

	private static Node mirror(Node node) {
		
		if(node==null) return null;
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		node.right=left;
		node.left=right;
		return node;
	}

}
