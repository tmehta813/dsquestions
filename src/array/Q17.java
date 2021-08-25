package array;


public class Q17 {
	
	public static void main(String[] args) {
		
		        int N = 4;
				int m[][] = {{1, 0, 0, 0},
				         {1, 1, 0, 1}, 
				         {1, 1, 0, 0},
				         {0, 1, 1, 1}};
				
				solveMaze(m,N);

		
	}
	
	
	public static void solveMaze(int maze[][], int n) {
		int ans[][] = {{0,0,0,0},
				       {0,0,0,0},
				       {0,0,0,0},
				       {0,0,0,0}
		};
		
		
		ans[0][0] = 1;
		
		
		mazeUtil(maze,0,0,ans,n);
		
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			
			System.out.println("");
		}
		
				       
	}
	
	private static boolean mazeUtil(int maze[][],int i,int j,int ans[][], int n) {
		
		if(i==n-1 && j==n-1) {
			ans[i][j]=1;
			return true;
		}
		
		if(isSafe(i,j,n,maze)) {
			
			ans[i][j]=1;
			
			if(mazeUtil(maze,i+1,j,ans,4)) {
				return true;
			}
			
			if(mazeUtil(maze,i,j+1,ans,4)) {
				return true;
			}
			
			if (mazeUtil(maze, i - 1, j, ans,4))
                return true;
 
            /* If moving backwards in x direction doesn't give
            solution then Move upwards in y direction */
            if (mazeUtil(maze, i, j - 1, ans,4))
                return true;
			
			ans[i][j]=0;
			return false;
			
		}
		
		return false;
				
	}
	


	static boolean isSafe(int i,int j,int n,int arr[][]) {
		
		if(i>=n || j>=n || i<0 || j<0) return false;
		
		if(arr[i][j]==1) return true;
		
		return false;
	}

}