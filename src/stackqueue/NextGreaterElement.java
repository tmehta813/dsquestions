package stackqueue;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int arr[] = { 50,30,20,40,45};
		int n = arr.length;
		int next[] = new int[arr.length];
		int index = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			if (stack.isEmpty()) {
				stack.push(arr[i]);
			} else {
				if (arr[i] > stack.peek()) {
					int j=0;
					while (!stack.isEmpty()) {
						next[i-1-j] = arr[i];
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
		while(!stack.isEmpty()) {
			next[index++]=0;
			stack.pop();
		}
		for(int i=0;i<next.length;i++) {
			System.out.println(next[i]);
		}

	}

}
