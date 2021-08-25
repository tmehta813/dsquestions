package array;

public class Q27 {
	
	public static void main(String[] args) {
		
	
		//find2RaisePow();
		printCountOfOnlysetBit();
		
	}
	
	
	private static void find2RaisePow() {
		int n =5;
		System.out.println((1<<4));
		int value = 2;
		for(int i=1;i<n;i++) {
			value*=2;
		}
		System.out.println("value: "+ value);
		
	}


	static void printCountOfOnlysetBit() {
		
		int n = 16;
		if(n>0 && (n&(n-1))==0) {
			
		 System.out.println(Math.log(n));
			
		}
		
	}
}
