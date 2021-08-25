package bitmanipulation;

public class CountNumberOfBitsInInteger {
	
	public static void main(String[] args) {
		
		int n =5;
		int count = 0;
		while((n&n-1)>0) {
			n&=n-1;
			count++;
		}
		
		System.out.println("count:"+ ++count);
		
	}

}
