package graphs;
import java.util.*;

public class Vertex {
	
	int value;
	List<Vertex> adjList;
	
	public List getAdjList() {
		return adjList;
	}
	
	Vertex(int value){
		this.value=value;
		adjList = new ArrayList();
	}
	
	void addNeibour(Vertex vertex) {
		adjList.add(vertex);
	}

}
