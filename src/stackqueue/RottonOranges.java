package stackqueue;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RottonOranges {

	public static void main(String[] args) {
		int arr[][] = { 
				{ 1, 0, 2 },
				{ 0, 1, 2 },
				{ 2, 1, 1 } 
				};
		
		
		Queue<Rotton> queue = new LinkedList();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==2)
				queue.add(new Rotton(i,j));
			}
		}
		
		int length = arr.length;
		int ans = 0;
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			boolean flag=false;
			while( size-- >0) {
				Rotton poll = queue.poll();
				int start=poll.start;
				int end = poll.end;
				
				 if(isFeasible(start+1, end, length) && arr[start+1][end]==1) {
					 arr[start+1][end]=2;
					 flag=true;
					 queue.add(new Rotton(start+1,end));
				 }
				 if(isFeasible(start-1, end, length) && arr[start-1][end]==1) {
					 arr[start-1][end]=2;
					 flag=true;
					 queue.add(new Rotton(start-1,end));
				 }
				 if(isFeasible(start, end+1, length) && arr[start][end+1]==1) {
					 arr[start][end+1]=2;
					 flag=true;
					 queue.add(new Rotton(start,end+1));
				 }
				 if(isFeasible(start, end-1, length) && arr[start][end-1]==1) {
					 arr[start][end-1]=2;
					 flag=true;
					 queue.add(new Rotton(start,end-1));
				 }
				
			}
			
			if(flag) ans+=1;
			
		}
		
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					flag=true;
					break;
				}
			}
		}
		if(flag)
		System.out.println("-1");
		else
			System.out.println("ans: "+ans);
		
		
	}
	
	
	static boolean isFeasible(int i, int j, int n) {
		if(i>=0 && i<n && j>=0 && j< n) return true;
		return false;
	}
	
	
	static class Rotton{
		int start;
		int end;
		Rotton(int start, int end){
			this.start=start;
			this.end=end;
		}
		
	}

}
