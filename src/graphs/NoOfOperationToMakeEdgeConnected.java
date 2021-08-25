package graphs;

import java.util.HashSet;
import java.util.Set;

public class NoOfOperationToMakeEdgeConnected {
	
	public static int makeConnected(int n, int[][] connections) {
        if(n==0) return 0;
        int length  = connections.length;
        
        //4 //5
        if(length<n-1) return 0;
        int totalComponent = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<length;i++){
            if(!set.contains(connections[i][0])){
                set.add(connections[i][0]);
                totalComponent++;
            }
            if(!set.contains(connections[i][1])){
                set.add(connections[i][1]);
                totalComponent++;
            }
        }
        
        int re = length-totalComponent+1;
        if(re==0) return 0;
        if(re>=n-totalComponent){
            return (n-totalComponent);
        }
        
        return 0;

        
    }
	
	public static void main(String[] args) {
		
		int arr[][]= {{0,1},{0,2},{1,2}};
		
		System.out.println(makeConnected(4, arr));
		
	}

}
