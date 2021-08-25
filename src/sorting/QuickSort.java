package sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int arr[]= {1,10,90,5,2,100};
		quickSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

	private static void quickSort(int[] arr, int i, int j) {
		
		if(j>i) {
			int p = partiton(arr,i,j);
			quickSort(arr,i,p-1);
			quickSort(arr,p+1,j);
		}
		
		
	}

	private static int partiton(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			    i++;
			}
		}
		
		int temp = pivot;
		arr[high]=arr[i];
		arr[i]=temp;

		return i;
	}

	
	
	
}
