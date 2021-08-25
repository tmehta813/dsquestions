package stackqueue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class SortElementOfStack {
	
	
	private static void sortStack(Stack<Integer> stack) {
		
		if(stack.isEmpty()) return;
		int pop = stack.pop();
		sortStack(stack);
		insertInStack(stack,pop);
	}
	
	
	
 
    private static void insertInStack(Stack<Integer> stack, int element) {
		if(stack.isEmpty() || stack.peek()>element) {
			stack.push(element);
			return;
		}
		
		int pop = stack.pop();
		insertInStack(stack,element);
		stack.push(pop);
	}




	// Driver code
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
 
        System.out.println(
            "Stack elements before sorting: ");
        printStack(s);
 
        sortStack(s);
 
        System.out.println(
            " \n\nStack elements after sorting:");
        printStack(s);
    }




	private static void printStack(Stack<Integer> s) {
		
		ListIterator<Integer> iterator = s.listIterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous()+" ");
		}
		
	}

}
