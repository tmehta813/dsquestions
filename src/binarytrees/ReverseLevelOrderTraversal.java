package binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
	
	Node root;
	
	public static void main(String[] args) {
		
		ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();
        tree.root = new Node(10);
        tree.root.left = new Node(6);
        tree.root.right = new Node(18);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(7);
        
        reverseTraversal(tree.root);
 
		
	}

	private static void reverseTraversal(Node root) {
		if(root==null) return;
		int level=0;
		Queue<Node> queue = new LinkedList();
		queue.add(root);
		Stack<Level> stack = new Stack();
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size-->0) {
				Node poll = queue.poll();
				stack.push(new Level(level,poll.val));
				if(poll.right!=null) queue.add(poll.right);
				if(poll.left!=null) queue.add(poll.left);
			}
			level++;
		}
		
		level=-1;
		while(!stack.isEmpty()) {
			Level poll = stack.pop();
			if(poll.level!=level) System.out.println();
			level=poll.level;
			System.out.print("level: "+poll.level+"  value:"+poll.value+" ");
			
		}
		
		
	}
	
	
	static class Level {
		int level;
		int value;
		Level(int level, int value){
			this.level=level;
			this.value=value;
		}
	}

}
