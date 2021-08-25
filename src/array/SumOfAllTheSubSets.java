package array;

public class SumOfAllTheSubSets {
	
	public static void main(String[] args) {
		int arr[] = {3,2};
		int sum = 0;
		int length = arr.length;
		for(int i=0;i<arr.length;i++) {
			sum+=(arr[i] * 1<<length-1 );
		}
		
		System.out.println(sum);
	}

}

