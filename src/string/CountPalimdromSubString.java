package string;

//https://www.youtube.com/watch?v=XmSOWnL6T_I

public class CountPalimdromSubString {
	
	public static void main(String[] args) {
		String str = "abcbe";
		boolean dp[][]=new boolean[str.length()][str.length()];
		for(int g=0;g<str.length();g++) {
			for(int i=0,j=g; j<str.length(); i++, j++) {
				if(g==0) {
					dp[g][i]=true;
				}
				else if(g==1) {
					dp[i][j]=str.charAt(i)==str.charAt(j);
				}
				else {
					if(str.charAt(i)==str.charAt(j)==true && (dp[i+1][j-1]==true)){
						dp[i][j]=true;
					}
				}
				
			}
		}
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp.length;j++) {
				System.out.print(dp[i][j]+"   ");
			}
			System.out.println("");
		}
		
		
		
	}
	
	
	//00,11,22,33,44,55
	//01,12,23,34,45

}
