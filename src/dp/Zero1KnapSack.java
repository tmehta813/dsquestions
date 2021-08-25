package dp;

public class Zero1KnapSack {
	
	public static void main(String[] args) {
		int n = 4;
		int vals[]=new int[n];
		int wts[] = new int[n];
		
		int capacity = 7;
		int dp[][]=new int[capacity+1][capacity+1];
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp.length;j++) {
				dp[i][j]=dp[i-1][j];
				if(j>wts[i-1]) {
					//remaining capacity
					int rcap = j-wts[i-1];
					if(dp[i-1][rcap]+vals[i-1]>dp[i-1][j]) {
						dp[i][j]=dp[i-1][rcap]+vals[i-1];
					}
					else {
						dp[i][j]=dp[i-1][j];
					}
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		
	}

}
