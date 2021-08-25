package graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	int val;
	List<GraphNode> adj;
	
	GraphNode(int val){
		this.val=val;
		adj=new ArrayList<GraphNode>();
	}
	
	void addNeibour(GraphNode node) {
		adj.add(node);
	}
	
	
}
