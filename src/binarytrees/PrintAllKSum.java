package binarytrees;

import java.util.HashSet;

public class PrintAllKSum {

	int k = 5;
	HashSet<String> set = new HashSet();

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(1);
		root.left.right.left = new Node(1);
		root.right = new Node(-1);
		root.right.left = new Node(4);
		root.right.left.left = new Node(1);
		root.right.left.right = new Node(2);
		root.right.right = new Node(5);
		root.right.right.right = new Node(2);

		PrintAllKSum obj = new PrintAllKSum();
		obj.printKPath(root);

	}

	void printKPath(Node node) {
		if (node == null)
			return;
		printSum(node, 0, 0, "");
		printKPath(node.left);
		printKPath(node.right);
	}
	

	private void printSum(Node node, int d, int sum, String str) {

		if (sum == k && d > 0) {
			if (!set.contains(str)) {
				set.add(str);
				System.out.println(str);
			}
		}
		if (node == null) {
			return;
		}

		printSum(node.left, d + 1, sum + node.val, str + node.val);
		printSum(node.right, d + 1, sum + node.val, str + node.val);

	}

}
