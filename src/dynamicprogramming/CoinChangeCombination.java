package dynamicprogramming;

//

public class CoinChangeCombination {
	
	
	public static void main(String[] args) {
		
   int arr[] = {1,2,3};
   int n =4;
   int output[] = new int[n+1];
   output[0]=1;
   
   for(int i=0;i<arr.length;i++) {
	 for(int j=arr[i];j<=n;j++) {
		 output[j]+=output[j-arr[i]];
	 }
   }
   System.out.println("coin: "+output[n]);
	}

}
