package binarytrees;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class DiagnoalTraversal {
	
	Node root;
	
	public static void main(String[] args) {
		
		DiagnoalTraversal traversal = new DiagnoalTraversal();
		traversal.root=new Node(8);
		traversal.root.left=new Node(3);
		traversal.root.right=new Node(10);
		traversal.root.right.right=new Node(14);
		traversal.root.right.right.left=new Node(13);
		traversal.root.left.left=new Node(1);
		traversal.root.left.right=new Node(6);
		traversal.root.left.right.left=new Node(4);
		traversal.root.left.right.right=new Node(7);
		traversal.diagonal(traversal.root);
		
	}
	
	public ArrayList<Integer> diagonal(Node root)
    {
        if(root==null) return null;
         ArrayList<Integer> list = new ArrayList<Integer>();
         Map<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
         zigZagTraversal(root,0,map);
         for(int key: map.keySet()){
             ArrayList<Integer> data = map.get(key);
             for(int i=0;i<data.size();i++){
                 list.add(data.get(i));
             }
         }
         return list;
         
         
    }
    
    private void zigZagTraversal(Node node, int d, Map<Integer,ArrayList<Integer>> map){
        
        if(node==null) return;
        ArrayList<Integer> list = map.get(d);
        if(list==null){
            list=new ArrayList<Integer>();
        }
        else{
            list.add(node.val);
        }
        map.put(d,list);
        zigZagTraversal(node.left,d+1,map);
        zigZagTraversal(node.right,d,map);
        
    }
    
    

}
