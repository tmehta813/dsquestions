package array;

//

public class Q26 {
	
	
	static int countSetBits(int n)
    {
		if(n==0) return 0;
		
	
		int x = largestPowerOf2(n); //4
		int bittill2x = x * (1<<(x-1)); // 36
		int msb2xton = n-(1<<x)+1;   //4
		int rest = n - (1<<x); 
		int ans =  bittill2x + msb2xton + countSetBits(rest);	
		return ans;
    }
 
    private static int largestPowerOf2(int n) {
		int x =0;
		while(1<<x <=n) {
			x++;
		}
    	
		return x-1;
	}

	// Driver program
    public static void main(String[] args)
    {
        int n = 19;
         
        System.out.println(countSetBits(n));
    }

}
