package sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		int k=3;
		int n=4;
		int arr[][] = { {1, 15, 77, 7}, 
				{50, 4, 88, 8}, 
				{0, 9, 10, 115}} ;
		
		int mergeArray[]=new int[n*k];
		int count=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<arr[i].length;j++) {
				mergeArray[count++]=arr[i][j];
			}
		}
		
		mergeSort(mergeArray,0,(n*k)-1);
		
		for(int i:mergeArray) {
			System.out.println(i);
		}
		
	}

	
	static void mergeSort(int arr[],int low, int high) {
		
		if(low<high) {
			int mid = low+(high-low)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merging(arr,low,mid,high);
		}
		
	}


	private static void merging(int[] arr, int low, int mid, int high) {
		

		int n1 = mid - low + 1;
        int n2 = high - mid;
		
		int l[]=new int[n1];
		int r[]=new int[n2];
		
		for(int i=0;i<n1;i++) {
			l[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++) {
			r[j]=arr[mid+1+j];
		}
		
		int i=0,j=0;
		int k= low;
		while(i<n1 && j<n2) {
			if(l[i]>r[j]) {
				arr[k++]=r[j++];
			}
			else {
				arr[k++]=l[i++];
			}
		}
		
		while(i<n1) {
			arr[k++]=l[i++];
		}
		while(j<n2) {
			arr[k++]=r[j++];
		}
		
	}
	
}
