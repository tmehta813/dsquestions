package binarytrees;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LowestCommonAncestor {
	
	Node root;
	
	public static void main(String[] args) {
		
		LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
        System.out.println("LCA(4, 5): " + tree.lca(4,5).val);
		
	}
	
	Node lca(int n1,int n2)
	{
	    List<Node> list1 = new ArrayList<Node>();
	    List<Node> list2 = new ArrayList<Node>();
		findCommonAncesstor(root,n1,list1);
		findCommonAncesstor(root,n2,list2);
		Node ans = null;
		int i;
		for(i=0;i<list1.size() && i<list2.size();i++) {
			if(list1.get(i) !=list2.get(i)) {
				break;
			}
		}
		
		ans = list1.get(i-1);
		
		
		return ans;
	}
	
	boolean findCommonAncesstor(Node node,int element,List<Node> list){
	   if(node==null){
	       return false;
	   }
	   list.add(node);
	   if(node.val==element) return true;
	   if(node.left!=null && findCommonAncesstor(node.left,element,list)){
	       return true;
	   }
	   if(node.right!=null && findCommonAncesstor(node.right,element,list)){
	       return true;
	   }
	   list.remove(list.size()-1);
	   
	   return false;
	   
	}

}
