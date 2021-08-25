package stackqueue;

import java.util.Stack;

public class SlidingWindowMaximum {
	
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		int k=4;
		int nge[]=new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr.length-1); //6
		nge[arr.length-1]=arr.length; //7
		
		for(int i=arr.length-2;i>=0;i--) {
			
			while(stack.size()>0 && arr[i]>=arr[stack.peek()]) {
				stack.pop();
			}
			if(stack.size()==0) {
				nge[i]=arr.length;
			}
			else {
				nge[i]=stack.peek();
			}
			stack.push(i);
		}
		
		
		int j=0;
		for(int i=0;i<=arr.length-k;i++) {
			
			if(j<i) j=i;
			
			while(nge[j]<i+k) {
				j=nge[j];
			}
			System.out.println(arr[j]);
			
		}
		
		
	}
	

}
