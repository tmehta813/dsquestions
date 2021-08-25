package programs;

public class SolMid {
	
	public static void main(String[] args) {
		SolMid sol = new SolMid();
		int nums[] = {5,7,7,8,8,10};
		int data[]=sol.searchRange(nums, 8);
		for(int i:data) {
			System.out.println(i+" ");
		}
	}
	
	public int[] searchRange(int[] nums, int target) {
        int[] t = new int[2];
        t[0]=-1; 
        t[1]=-1;
        int length = nums.length; 
        if(length==0) return t;
        int start=0;
        int last=length;
        int mid=(start+last)/2;
        while(start<mid){
          if(nums[mid]==target){
              int j=mid-1;
              int k=mid+1;
              while(j>=0 && nums[j]==target){
                      j--;
              }
              
              while(k<length && nums[k]==target){
                      k++;
              }
           t[0]=j+1;
           t[1]=k-1;
           return t;   
          }  
        
       if(nums[mid]>target) last=mid;  
       else start=mid;
       mid=(start+last)/2;
            
        }
        return t;
        
        
    }

}
