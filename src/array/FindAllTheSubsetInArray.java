package array;

//https://afteracademy.com/blog/print-all-subsets-of-a-given-set

public class FindAllTheSubsetInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
	    effiicentApproach();
	}

	

	static private void effiicentApproach() {

		int arr[] = { 1, 2, 3, 4 };
		// 2 pow n = 1<<arr.length
		for (int i = 1; i < (1 << arr.length); i++) {
			int j = i;
			System.out.print("{ ");
			int k = 0;
			while (j > 0) {
				if ((j & 1) > 0) {
					System.out.print(arr[k] + " ");
				}
				k++;
				j = j >> 1;
			}
			System.out.println("}");

		}

	}

}
