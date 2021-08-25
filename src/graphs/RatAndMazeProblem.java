package graphs;

import java.util.ArrayList;

public class RatAndMazeProblem {

	public static void main(String[] args) {
		
		int N = 4;
				int m[][] = {{1, 0, 0, 0},
				         {1, 1, 0, 1}, 
				         {1, 1, 0, 0},
				         {0, 1, 1, 1}};
				
				ArrayList<String> list  = findPath(m, N);
				for(String data:list) {
					System.out.println(data);
				}

	}

	public static ArrayList<String> findPath(int[][] m, int n) {

		boolean visited[][] = new boolean[n][n];
		ArrayList<String> list = new ArrayList<String>();
		solve(list, m, n, 0, 0, "", visited);
		return list;

	}

	private static void solve(ArrayList<String> list, int arr[][], int n, int i, int j, String path,boolean visited[][]) {
		
		if (i == n - 1 && j == n - 1) {
			list.add(path) ;
		}
		
		if(isSafe(i,j,arr,n,visited)) {
			visited[i][j]=true;
			solve(list,arr,n,i+1,j,path+"D",visited);
			solve(list,arr,n,i-1,j,path+"L",visited);
			solve(list,arr,n,i,j+1,path+"R",visited);
			solve(list,arr,n,i,j-1,path+"L",visited);
			visited[i][j]=false;
		}
		
	
	}

	static boolean isSafe(int row, int col, int m[][], int n, boolean visited[][]) {
		if (row == -1 || row == n || col == -1 || col == n || visited[row][col] || m[row][col] == 0)
			return false;

		return true;
	}

}