package heaps;

public class ConvertMinHeapToMaxheap {
	
	// A utility function to print a given array
    // of given size
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i]+" ");
    }
    
    
    private static void convertMaxHeap(int arr[], int n) {
    	
    	for(int i= n/2-1;i>=0;i--) {
    	  convertToMax(arr,i);
    	}
    	
    }
    
     
    private static void convertToMax(int[] arr, int i) {
		int l = 2*i + 1;
		int r = 2*i+2;
		int max = i;
		if((l<arr.length) && arr[l]>arr[max]) {
			max=l;
		}
		if((r<arr.length) && arr[r]>arr[max]) {
			max=r;
		}
		if(max!=i) {
			int temp = arr[max];
			arr[max]=arr[i];
			arr[i]=temp;
			convertToMax(arr,max);
		}
	}


	// driver program
    public static void main (String[] args)
    {
        // array representing Min Heap
        int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        int n = arr.length;
  
        System.out.print("Min Heap array : ");
        printArray(arr, n);
  
        convertMaxHeap(arr, n);
  
        System.out.print("\nMax Heap array : ");
        printArray(arr, n);
    }

}
