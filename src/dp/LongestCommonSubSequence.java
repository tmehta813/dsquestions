package dp;

public class LongestCommonSubSequence {
	
	
	char ch1[] = {'a','c','d'};
	char ch2[] = {'a','b','c','d'};
	
	public LongestCommonSubSequence() {
		
	}
	
	int findSequence(int i,int j) {
	
		if(i==ch1.length || j==ch2.length) return 0;
		
		if(ch1[i]==ch2[j]) return 1 + findSequence(i+1,j+1);
		else {
			return Math.max(findSequence(i,j+1), findSequence(i+1, j));
		}
		
	}
	
	
	int findSequenceUsingDp() {
	
		int arr[][] = new int[ch1.length+1][ch2.length+1];
		for(int i=1;i<=ch1.length;i++) {
			for(int j=1;j<=ch2.length;j++) {
				if(ch1[i-1]==ch2[j-1]) {
					arr[i][j]= 1+arr[i-1][j-1];
				}
				else {
					arr[i][j]= Math.max(arr[i-1][j], arr[i][j-1]);
				}
				
			}
		}
	 	
     return arr[ch1.length][ch2.length];	
	}
	
	
	
	
	public static void main(String[] args) {
		
		LongestCommonSubSequence ls = new LongestCommonSubSequence();
		System.out.println(ls.findSequence(0, 0));
		System.out.println(ls.findSequenceUsingDp());
		
	}

}
