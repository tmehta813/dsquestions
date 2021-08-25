package array;
import java.util.Arrays;

// job schedulling algo

public class Q24 {
	
	public static void main(String[] args) {
		
		int arr[][]={
				{1,2,100},
				{2,1,19},
				{3,2,27},
				{4,1,25},
				{5,1,15}
				};
		
	
		Arrays.sort(arr,(a,b)->b[2]-a[2]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
	}

}
