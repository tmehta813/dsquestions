package programs;

class SolPath {
	int count = 0;
	int m, n;
	
	public static void main(String[] args) {
		int obstacleGrid[][] = {
				{0,0,0},
				{0,1,0},
				{0,0,0}
				};
		int obstacleGrid1[][] = {
				{0,1},
				{0,0}
				};
		
		
		SolPath path = new SolPath();
		System.out.println(path.uniquePathsWithObstacles(obstacleGrid1));
		
	}
	


	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		m = obstacleGrid.length - 1;
		n = obstacleGrid[0].length - 1;
		findUniquePath(obstacleGrid, 0, 0);
		return count;
	}

	boolean canMoveFurther(int[][] obstacleGrid, int i, int j) {
		if (i <= m && j <= n && obstacleGrid[i][j] == 0)
			return true;
		return false;
	}

	void findUniquePath(int[][] obstacleGrid, int i, int j) {
		if (i == m && j == n) {
			count++;
		}
		if (canMoveFurther(obstacleGrid, i, j + 1)) {
			findUniquePath(obstacleGrid, i, j + 1);
		}
		if (canMoveFurther(obstacleGrid, i + 1, j)) {
			findUniquePath(obstacleGrid, i + 1, j);
		}

	}
}