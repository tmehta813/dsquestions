package array;

// Copy set bits in a range

public class Q28 {
	
	public static void main(String[] args) {
		
		
		int x = 10, y =13;
		int l =2, r = 3;
		if(l<1 || r>32) return;
		
		//0111
		//1000
		//1001
		//1010 10
		//1011 11
		//1100 12
		//1101 13
		//1110 14
		//1111 15
		

		//1 = 0001
		
		int mask =(1<<(r-l+1));
		//mask =  0100
		mask--;
		//mask = 0111
		
		mask = mask<<(l-1);
		//mask =  1110
		mask = (mask & y);
		//1010 &
		//1110
		x = x | mask;
		
		System.out.println("y:" + x);
		
		
	}

}
