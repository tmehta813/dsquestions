package stackqueue;

import java.util.Stack;

public class EvaluatePostFix {
	
	public static void main(String[] args) {
		
		System.out.println(evaluatePostFix("231*+9-"));
		
	}
	
	//Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        
        if(S.length()==1){
            return (int)S.charAt(0);
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(char ch:S.toCharArray()){
            if(Character.isDigit(ch)){
                int value = ch-'0';
                stack.push(value);
            }
            else{
                int first=stack.pop();
                int second=stack.pop();
                if(ch=='*'){
                    stack.push(first*second);
                }
                else if(ch=='+'){
                    stack.push(first+second);
                }
                else if(ch=='-'){
                    stack.push(second-first);
                }else{
                    stack.push(second/first);
                }
                
            }
        }
    
    if(stack.isEmpty()==false)
        return stack.pop();
        else return -1;
        
    }

}
