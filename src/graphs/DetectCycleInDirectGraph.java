package graphs;

public class DetectCycleInDirectGraph {
	
	public static void main(String[] args) {
		Graph graph = new Graph();
		Vertex v1 = new Vertex(0);
		Vertex v2 = new Vertex(1);
		Vertex v3 = new Vertex(2);
		Vertex v4 = new Vertex(3);
		Vertex v5 = new Vertex(4);
		graph.addVertices(v1);graph.addVertices(v2);graph.addVertices(v3);
		graph.addVertices(v4);graph.addVertices(v5);
		graph.addEdges(v1, v2);
		graph.addEdges(v2, v3);
		graph.addEdges(v3, v4);
		
		
		System.out.println(graph.hasCycle(new boolean[graph.vertices.size()]));
		
	}

}
