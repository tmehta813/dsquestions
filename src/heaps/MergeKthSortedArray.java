package heaps;

import java.util.PriorityQueue;

public class MergeKthSortedArray {
	
	public static void main(String[] args) {
		 int[][] arr= {{2, 6, 12, 34},
	                {1, 9, 20, 1000},
	                {23, 34, 90, 2000}};
	 
	        System.out.println("Merged array is :");
	        PriorityQueue<Pair> queue = new PriorityQueue();
	 
	        for(int i=0;i<arr.length;i++) {
	        	Pair pair = new Pair(i,0,arr[i][0]);
	        	queue.add(pair);
	        }
	        
	        
	        while(queue.size()>0) {
	        	Pair pair = queue.poll();
	        	System.out.println(pair.value);
	        	if(pair.di+1<arr[pair.li].length) {
	        		queue.add(new Pair(pair.li,pair.di+1,arr[pair.li][pair.di+1]));
	        	}
	        	
	        }  
	        
	}
	
	

	
	
	public static class Pair implements Comparable<Pair>{
		
		int li;
		int di;
		int value;
		
		Pair(int li, int di, int value){
			this.li=li;
			this.di=di;
			this.value=value;
		}
		
		@Override
		public int compareTo(Pair pair) {
		 return this.value-pair.value;
		}
	}
}
