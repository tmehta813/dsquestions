package programs;

public class SmallestInRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 1, 2, 3, 4 };
		int low = 0;
		int high = arr.length-1;

		while (low < high) {
			int mid = (low + high) / 2;
			if (low == high) {
				System.out.println(arr[low]);
				break;
			}
			if (mid < high && arr[mid] > arr[mid + 1]) {
				System.out.println(arr[mid + 1]);
				break;
			}

			// Check if mid itself is minimum element
			if (mid > low && arr[mid] < arr[mid - 1]) {
				System.out.println(arr[mid]);
				break;
			}

			// Decide whether we need to go to left half or right half
			if (arr[high] > arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

	}

}
