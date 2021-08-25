package bitmanipulation;

public class FirstSetBitPosition {
	
	private static int helper(int n) {
        if (n == 0) {
            return 0;
        }
        
        System.out.println(Integer.toBinaryString(n));
 
        int k = 1;
 
        while (true) {
        	System.out.println((1<<(k-1)));
        	System.out.println(n&(1<<(k-1)));
        	
            if ((n & (1 << (k - 1))) == 0) {
                k++;
            } else {
                return k;
            }
        }
    }
 
    public static void main(String[] args) {
        System.out.println("First setbit position for number: 18 is -> " + helper(18));
        System.out.println("First setbit position for number: 5 is -> " + helper(5));
        System.out.println("First setbit position for number: 32 is -> " + helper(32));
    }

}


