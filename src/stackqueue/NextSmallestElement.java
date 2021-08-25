package stackqueue;

import java.util.Stack;

public class NextSmallestElement {
	
	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3,50,110,30,200,90 };
		int n = arr.length;
		int next[] = new int[arr.length];
		int index = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<n;i++) {
			if(stack.isEmpty()) stack.push(arr[i]);
			else {
				if(arr[i]<stack.peek()) {
					int j=0;
					while(!stack.isEmpty() && stack.peek()>arr[i]) {
						next[i-1-j]=arr[i];
						stack.pop();
						j++;
					}
					stack.push(arr[i]);
				}
				else {
					stack.push(arr[i]);
				}
				
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(next[i]);
		}
		
		
	}

}
