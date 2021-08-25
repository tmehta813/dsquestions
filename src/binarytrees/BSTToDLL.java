package binarytrees;

public class BSTToDLL {

	Node head = null;
	Node prev = null;

	Node bToDLL(Node root) {
		bToDLL1(root);
		return head;
	}

	void bToDLL1(Node root) {
		// Base case
		if (root == null)
			return;

		bToDLL1(root.left);

		if (prev == null)
			head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;

		bToDLL1(root.right);
	}

}
