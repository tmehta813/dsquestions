package array;

//flip bits

public class Q25 {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=25;
		int count=0;
		while(a>0 && b>0) {
			if(a%2 != b%2) count++;
			a=a/2;
			b=b/2;
		}
		
		if(a>0) {
			count++;
			a=a/2;
		}
		if(b>0) {
			count++;
			b=b/2;
		}
		System.out.println("count:"+ count);
	}

}
