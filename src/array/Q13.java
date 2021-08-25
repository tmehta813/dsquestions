package array;

import java.util.Scanner;

//Find the maximum and minimum element in an array

public class Q13 {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int t1d1 = sc.nextInt();
//		int t2d = sc.nextInt();
//		int t3d = sc.nextInt();	
		toh(3,1,2,3);
	}
	
	public static void toh(int n, int t1d, int t2d, int t3d) {
		
		if(n==0) return;
		
		toh(n-1,t1d,t3d,t2d);
		System.out.println(n+"["+t1d+"->"+t2d);
		toh(n-1,t3d,t2d,t1d);
	}

}



