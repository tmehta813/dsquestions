package array;

public class Q29 {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		//System.out.println(divide(10, 3));
		//calculate7nby8withoutdiv(16);
		//multiplyNumberBy10();
		//countNumberOfSetBits();
		//checkIfNumberIsEven();
		convertCharToUpperOrLowerCase();
	}
	
	private static void convertCharToUpperOrLowerCase() {
		String str = "TaRuN";
		for(char ch: str.toCharArray()) {
			System.out.println(Integer.toBinaryString(ch));
			ch^=32;
			System.out.println(ch);
			System.out.println(Integer.toBinaryString(32));
			System.out.println("--------");
		}
		
	}

	private static void countNumberOfSetBits() {
		int n = 15; // 010
		int count = 0;
		while(n>0) {
			n&=n-1;
			count++;
		}
		
		System.out.println(count);	
	}
	
	private static void checkIfNumberIsEven() {
		int n = 16; // 010 001
		if((n&1)==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

	public static long divide(long dividend, long divisor) {

		long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		long quotient = 0, temp = 0;

		for (int i = 3; i >= 0; --i) {

			if (temp + (divisor << i) <= dividend) {
				temp += divisor << i;
				quotient |= 1L << i;
			}
		}

		return (sign * quotient);
	}
	
	
	private static void calculate7nby8withoutdiv(int n) {
		
		//(8n-1)/8
		 
		System.out.println(((n<<3) - n)>>3);
		
	}
	
private static void multiplyNumberBy10() {
		
		int n = 2;
		 
		System.out.println((n<<3)+ (n<<1));
		
	}

}
