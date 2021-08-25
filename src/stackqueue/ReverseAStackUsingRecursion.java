package stackqueue;

import java.util.Stack;

public class ReverseAStackUsingRecursion {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		
		reverseStack(stack);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	
	private static void reverseStack(Stack<Integer> stack) {
		if(stack.size()>0){
		int item = stack.pop();
		insertItemAtBottm(stack,item);
		stack.push(item);
		}	
	}
	
	
	private static void insertItemAtBottm(Stack<Integer> stack, int item) {
		//System.out.println(item);
		if(stack.isEmpty()) {
			stack.push(item);
		}
		else {
		int pop = stack.pop();
		insertItemAtBottm(stack,pop);
		stack.push(pop);
		}
	}

}
