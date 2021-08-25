package binarytrees;

public class IsIsomorphic {

	Node root1;
	Node root2;

	public static void main(String[] args) {
		IsIsomorphic isomorphic = new IsIsomorphic();
		isomorphic.root1 = new Node(8);
		isomorphic.root1.left = new Node(9);
		isomorphic.root1.right = new Node(8);
		isomorphic.root1.left.left = new Node(4);

		isomorphic.root2 = new Node(8);
		isomorphic.root2.left = new Node(8);
		isomorphic.root2.right = new Node(9);
		isomorphic.root2.right.right = new Node(4);

		System.out.println(isomorphic.isIsomorphic(isomorphic.root1, isomorphic.root2));

	}

	// Return True if the given trees are isomotphic. Else return False
	boolean isIsomorphic(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		return checkIsomorphinc(root1, root2);
	}

	boolean checkIsomorphinc(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 == null || node2 == null)
			return false;
		if (node1.val != node2.val)
			return false;

		return checkIsomorphinc(node1.left, node2.left) || checkIsomorphinc(node1.left, node2.right)
				|| checkIsomorphinc(node1.right, node2.right) || checkIsomorphinc(node1.right, node2.left);

	}

	boolean checkIftrue(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 == null || node2 == null)
			return false;
		if (node1.val != node2.val)
			return false;
		return checkIftrue(node1.left, node2.left) && checkIftrue(node1.right, node2.right);
	}

}
