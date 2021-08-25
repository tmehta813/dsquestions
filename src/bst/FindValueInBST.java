package bst;

public class FindValueInBST {
	
	Node root;
	
	public static void main(String[] args) {
		
		FindValueInBST obj = new FindValueInBST();
		obj.insert(10);
		obj.insert(15);
		obj.insert(50);
		obj.insert(80);
		obj.search(obj.root,500);
		
		System.out.println(obj.checkIfTreeIsBSTOrNot(obj.root));
		
	}
	
	private boolean checkIfTreeIsBSTOrNot(Node node) {
		if(node==null) return true;
		if(node.left==null && node.right==null) return true;
		
		if(node.left!=null && node.left.val<node.val) {
			return checkIfTreeIsBSTOrNot(node.left);
		}
		if(node.right!=null && node.right.val>node.val) {
			return checkIfTreeIsBSTOrNot(node.right);
		}
	
		return false;
		
		
	}
	
	private void insert(int val) {
		if(root==null) {
			root=new Node(val);
			return;
		}
		
		insert(root,val);
		
	}
	
	
	private void insert(Node node, int val) {
		
		if(val>node.val) {
			if(node.right==null) {
				node.left=new Node(val);
			}
			else {
				insert(node.right,val);
			}
		}
		else {
			if(node.left==null) {
				node.left=new Node(val);
			}
			else {
				insert(node.left,val);
			}
		}
		
	}

	private void search(Node node, int value) {
		if(node==null) {
			System.out.println("no element found");
		}
		else if(node.val==value) {
			System.out.println("found: "+value);
		}
		else {
			if(value>node.val) {
				search(node.right,value);
			}
			else {
				search(node.left,value);
			}
		}
		
	}

}
