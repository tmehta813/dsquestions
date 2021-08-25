package binarytrees;

public class ConstructBinaryTreeFromStringOfBrackets {
	
	
	
	public static void main(String[] args) {
		
		String str = "1(2)(3)";
		Node node = new Node((Integer.parseInt(String.valueOf(str.charAt(0)))));
		node= constructTree(str.substring(1));
		Node.inOrderTraverse(node);
	}
	
	
	static Node constructTree(String str) {
		if(str.length()<=1) return null;
		
		Node node = new Node(str.charAt(1));
		String subString1 = str.substring(1);
		node.left=constructTree(subString1);
		int index = str.indexOf(')');
		if(index!=-1 && index!=str.length()) {
		String subString2= str.substring(str.indexOf(')')+1);
		node.right=constructTree(subString2);
		}
		
		return node;
		
	}
	
	

	

}
