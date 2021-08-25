package T450;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int arr[] = {92,645,783,5454,3454,4454,46600};
		int max = Integer.MIN_VALUE;
		for(int val:arr) {
			if(val>max) {
				max=val;
			}	
		}
		
		
		int exp =1;
		while(exp<=max) {
			countSort(arr,exp);
			exp = exp*10;
		}
		
		for(int val: arr) {
			System.out.println(val);
		}
		
		
	}
	
	
	
	public static void countSort(int arr[], int exp) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i:arr) {
			max =Math.max(max, i);
			min =Math.min(min, i);
		}
		
		int range = max-min+1; 
		
		int arr2[]=new int[10];
		
		for(int i:arr) {
			arr2[(i/exp)%10]++;
		}
		
		
		//converted to prefix sub array
		
		for(int i=1;i<arr2.length;i++) {
			arr2[i]+=arr2[i-1];
		}
		
		
		int[] ans = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val =arr[i];
			int pos = arr2[(val/exp)%10];
			int idx  = pos-1;
			ans[idx]=val;
			arr2[(val/exp)%10]--;
		}
		
		
     for(int i=0;i<ans.length;i++) {
    	 arr[i]=ans[i];
     }
		
		
		}
	

}


// 
