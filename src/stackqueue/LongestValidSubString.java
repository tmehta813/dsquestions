package stackqueue;

import java.util.Stack;

public class LongestValidSubString {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.add(-1);
		int result = 0;
		//String s = "))(()((())";
		//String s = "(())";
		String s = ")))()))))((((()))))";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push(i);
			}
			else {
				if(!stack.isEmpty()) {
				int value = stack.pop();
				if(!stack.isEmpty()) {
				result = Math.max(i+1-value, result);
				}
				else {
					stack.push(i);
				}
				}
				
			}
		}
		
		System.out.println(result);
		
		
	}

}
