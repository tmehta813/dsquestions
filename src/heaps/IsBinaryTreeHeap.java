package heaps;

public class IsBinaryTreeHeap {
	
	public static void main(String[] args) {
		Node node1 = new Node(5);
		Node node2 = new Node(3);
		Node node3 = new Node(2);
		node1.left=node2;
		node1.right=node3;
		
		System.out.println(IsMaxHeap(node1));
	}
	
	
	private static boolean IsMaxHeap(Node root) {
		
		 if (root.left == null && root.right == null)
	            return true;
	 
	        //  node will be in second last level
	        if (root.right == null) {
	            //  check heap property at Node
	            //  No recursive call ,
	            //  because no need to check last level
	            return root.val >= root.left.val;
	        }
	        else {
	            //  Check heap property at Node and
	            //  Recursive check heap property at left and
	            //  right subtree
	            if (root.val >= root.left.val
	                && root.val >= root.right.val)
	                return IsMaxHeap(root.left)
	                    && IsMaxHeap(root.right);
	            else
	                return false;
	        }
		
	}
	
	

}
