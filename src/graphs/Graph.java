package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	List<Vertex> vertices;
	
	public Graph() {
        this.vertices = new ArrayList<>();
    }
	
	public void addVertices(Vertex a) {
		this.vertices.add(a);
	}
	
	public void addEdges(Vertex a, Vertex b) {
		a.addNeibour(b);
	}
	
	public boolean hasCycle(boolean isVisited[]) {
		
	    for (Vertex vertex : vertices) {
	        if (!isVisited[vertex.value] && hasCycle(vertex,isVisited)) {
	            return true;
	        }
	    }
	    return false;
	}

	private boolean hasCycle(Vertex vertex, boolean[] isVisited) {
	  isVisited[vertex.value]=true;
	   for(Vertex adj: vertex.adjList) {
		   if(isVisited[adj.value]) {
			   return true;
		   }
		   else if(!isVisited[adj.value] && hasCycle(adj, isVisited)) {
			   return true;
		   }
	   }
   
		return false;
	}
	

}
