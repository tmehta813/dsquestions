package dp;

public class EditStrings {
 
	String one ="abcd";
	String two = "b";
	int n=one.length();
	int m=two.length();
	
	
	int[][] findEditString() {
	 
		int arr[][]=new int[n+1][m+1];
		for(int i=0;i<arr[0].length;i++) {
			arr[0][i]=i;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=i;
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[i].length;j++) {
				if(one.charAt(i-1)==two.charAt(j-1)) {
					arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));	
				}
				else {
					arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]))+1;
				}
				
			}
		}
		
	return arr;	
    		
		
	}
	
	
	public static void main(String[] args) {
		EditStrings es = new EditStrings();
		int arr[][] =es.findEditString();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
	}
  	

}
