package dp;

public class LongestSubSequences {

	public static int arr[] = { 1, 3, 4, 5, 2, 2, 2, 2, 2 };

	public static void main(String[] args) {

		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = 1;
		}
		int max = 1;

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {
				if (arr[i] >= arr[j]) {
					arr1[i]++;
				}
			}
			
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
 
		System.out.println(max);
		
	}

}
