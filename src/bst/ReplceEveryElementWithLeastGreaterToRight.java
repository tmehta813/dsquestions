package bst;

public class ReplceEveryElementWithLeastGreaterToRight {

	Node root;
	Node succ=null;

	public static void main(String[] args) {

		int input[] = { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };


		ReplceEveryElementWithLeastGreaterToRight obj = new ReplceEveryElementWithLeastGreaterToRight();
		for (int i = input.length-1; i >= 0; i--) {
			obj.succ=null;
			obj.root= obj.insert(obj.root,input[i]);
			if(obj.succ!=null) {
				input[i]=obj.succ.val;
			}
			else {
				input[i]=-1;
			}
		}
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}

	}

	void inOrderSuccessor(Node node, int i, int result[]){
		
		Node parent=node.parent;
		while(parent!=null && parent.val<node.val) {
			parent=parent.parent;
		}
		if(parent==null) result[i]=-1;
		else result[i]=parent.val;
		
	}
 

	private Node insert(Node node, int val) {
		if(node==null) {
			node=new Node(val);
			return node;
		}
		
		else {
			if(val<node.val) {
				succ=node;
				node.left=insert(node.left,val);
			}
			else {
				node.right=insert(node.right,val);
			}
		}
		return node;
	}

}
