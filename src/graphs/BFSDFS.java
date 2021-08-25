package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSDFS {
	
	
	public static void main(String[] args) {
		
		int v = 10;
		Graph graph = new Graph(v);
		graph.addEdge(0, 6);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(2, 7);
		graph.addEdge(4, 8);
		graph.addEdge(5, 2);
		graph.addEdge(7, 9);
		
		
		//boolean isVisited[]=new boolean[v];
		//bfs(2,graph,isVisited);
		
		
		Queue<Integer> queue = new LinkedList();
		boolean isVisited1[]=new boolean[v];
		queue.add(2);
		System.out.println("\n\n\nDFS\n\n\n");
		dfs(2,graph,isVisited1,queue);
	}

	private static void bfs(int v,Graph graph,boolean isVisited[]) {
		
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(v);
		while(!queue.isEmpty()) {
			int value = queue.poll();
			isVisited[value]=true;
			System.out.println(value);
			Iterator<Integer> iterator = graph.adj[value].listIterator();
			while(iterator.hasNext()) {
				int next = iterator.next();
				if(!isVisited[next]) {
					queue.add(next);
					
				}
			}
			
		}
	}
	
	
	
private static void dfs(int v,Graph graph,boolean isVisited[],Queue<Integer> queue) {

		while(!queue.isEmpty()) {
			int value = queue.poll();
			isVisited[value]=true;
			System.out.println(value);
			Iterator<Integer> iterator = graph.adj[value].listIterator();
			while(iterator.hasNext()) {
				int next = iterator.next();
				if(!isVisited[next]) {
					queue.add(next);
					dfs(next,graph,isVisited,queue);
				}
			}
			
		}
		
	}

static class Graph {
	
	int v;
     LinkedList<Integer> adj[];
	
	public Graph(int v){
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int e){
		adj[v].add(e);
	}
	
}

}
