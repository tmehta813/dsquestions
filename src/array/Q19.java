package array;
import java.util.List;
import java.util.ArrayList;

//Find the maximum and minimum element in an array

//create a graph and print it

public class Q19 {
	
	Node node;
	
	public static void main(String[] args) {
		
		Q19 q = new Q19();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 =  new Node(5);
		
		node1.addNodes(node2);
		node1.addNodes(node3);
		node2.addNodes(node4);
		node3.addNodes(node4);
		node2.addNodes(node5);
		node4.addNodes(node5);
		node5.addNodes(node1);
		node5.addNodes(node2);
		traverseGraph(node1,new boolean[5]);
		
	}
	
	
	static void traverseGraph(Node node,boolean visited[]) {
	
		visited[node.value-1]=true;
		System.out.println(node.value);
		if(node.list!=null) {
		for(Node no:node.list) {
			if(!visited[no.value-1]) {
				traverseGraph(no,visited);
			}
		}
		}
	}

}


class Node {
	int value;
	List<Node> list;
	Node(int value){
		this.value=value;
	}
	void addNodes(Node node) {
		if(list==null) {
			list = new ArrayList<Node>();
		}
		list.add(node);
	}
}