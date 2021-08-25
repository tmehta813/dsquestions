package array;

//Find the maximum and minimum element in an array

public class Q12 {
	
	public static void main(String[] args) {
		//printRecursive(5);
		System.out.println(factorial(5));
		System.out.println(power(2,5));
	}
	
	
	static int power(int x, int n) {
		if(n==0) return 1;
		
		int value = power(x,n/2);
		value = value * value;
		if(n%2==1) {
			return value * x;
		}
		else {
			return value;
		}	
	}
	
	
	static int factorial(int n) {
		if(n==1) return 1;
		int fac = factorial(n-1);
		return n*fac;	
	}
	
	
	static void printRecursive(int n) {
		if(n==0) return;
		System.out.println(n);
		printRecursive(n-1);
		System.out.println(n);
	}

}