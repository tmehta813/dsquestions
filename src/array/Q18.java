package array;

//print all path of rat in maze

public class Q18 {
	
	public static void main(String[] args) {
		
		 int N = 4;
			int m[][] = {
					{1, 0, 0, 0},
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
		
		
		mazeUtil(maze,0,0,n,"");
				       
	}
	
	private static void mazeUtil(int maze[][],int i,int j, int n,String path) {
		
		if(i==n-1 && j==n-1) {
			System.out.println(path);
		}
		
		if(i>=n || j>=n || maze[i][j]==0) {
			return;
		}
		
		
		mazeUtil(maze,i+1,j,n,path+"D");
		mazeUtil(maze,i,j+1,n,path+"R");
	}
	
	
	

}