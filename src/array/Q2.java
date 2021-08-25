package array;

//Count set bits in an integer

public class Q2 {
	
	public static void main(String[] args) {
		
		int n=13;
		int count =0;
//		while(n>0) {
//			count+=n%2;
//			n=n/2;
//		}	
		
//		 while (n > 0) {
//	            count += n & 1;
//	            n >>= 1;
//	        }
		 
		 while (n > 0) {
	            n&= n - 1;
	            count++;
	        }
		 
		System.out.println("count: "+count);
		
	}

}