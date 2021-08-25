package stackqueue;

import java.util.Arrays;
import java.util.Stack;

//00,01
//10,11
//20,21

public class MergeIntervals {
	
	public static void main(String[] args) {
		int intervals[][] = {{1,3},{6,10},{2,6},{15,18}};
		
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		
		Stack<Pair> stack = new Stack<Pair>();
		stack.push(new Pair(intervals[0][0],intervals[0][1]));
		
		for(int i=0;i<intervals.length;i++) {
			System.out.println(intervals[i][0]+" "+ intervals[i][1]);
		}
		
		for(int i=1;i<intervals.length;i++) {
			Pair peek = stack.peek();
			if(peek.end>=intervals[i][0]) {
				stack.pop();
				stack.push(new Pair(peek.start,intervals[i][1]));
			}
			else {
				stack.push(new Pair(intervals[i][0],intervals[i][1]));
			}
		}
		
		int newPair[][]=new int[stack.size()][stack.size()];
		for(int i=stack.size()-1;i>=0;i--) {
			Pair pair = stack.pop();
			newPair[i][0]=pair.start;
			newPair[i][1]=pair.end;
		}
		
		
		System.out.println("after merge");
		
		for(int i=0;i<newPair.length;i++) {
			System.out.println(newPair[i][0]+" "+ newPair[i][1]);
		}
		
		
	}
	
	
	static class Pair{
		int start;
		int end;
		Pair(int start, int end){
			this.start=start;
			this.end=end;
		}
	}

}
