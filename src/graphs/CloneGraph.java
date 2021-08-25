package graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CloneGraph {
	
	public static void main(String[] args) {
		
		
	}
	
	
	private void cloneNode(GraphNode node) {
		
		GraphNode clone = new GraphNode(node.val);
		GraphNode currentNode = null;
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		Set<GraphNode> set = new HashSet<GraphNode>();
		q.add(node);
		while(!q.isEmpty()) {
			GraphNode gn = q.poll();
			currentNode=new GraphNode(gn.val);
			set.add(gn);
			for(GraphNode nbr: gn.adj) {
				if(!set.contains(nbr)) {
					currentNode.addNeibour(new GraphNode(nbr.val));
					q.add(nbr);
				}
			}
			
			
		}
		
		
		
	}
	

}
