package binarytrees;
import java.util.Stack;

public class InorderIterative {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(50);
		Node node2 = new Node(30);
		Node node3 = new Node(70);
		Node node4 = new Node(20);
		Node node5 = new Node(40);
		Node node6 = new Node(60);
		Node node7 = new Node(80);
		
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		Stack<Node> stack = new Stack();
		inorder(node1,stack);
		
	}
	
	
	
	static void inorder(Node root, Stack<Node> node)
    {
        if (root == null)
            return;
 
 
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
 
        // traverse the tree
        while (curr != null || s.size() > 0)
        {
 
            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }
 
            /* Current must be NULL at this point */
            curr = s.pop();
 
            System.out.print(curr.val + " ");
 
            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }
 

}
