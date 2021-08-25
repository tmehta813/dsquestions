package backtracking;

public class NQueen {
	
	int N=4;
	int count=0; 
	
	
	boolean isSafe(int board[][], int row, int col) {
		
		++count;
		
		int i,j;
		
		/* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
  
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
  
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
  
        return true;
		
		
			
	}
	
	void solveNQ() {
		int board[][] = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
				};
		
		if(!solveNQUtil(board,0)) {
			System.out.println("solution doesn't exsist");
		}
		else {
			System.out.println("count:"+count);
			for(int i=0;i<board.length;i++) {
				for(int j=0;j<board[i].length;j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println("");
			}
		}
	}
	
	
	
	
	private boolean solveNQUtil(int[][] board, int col) {
		
		if(col>=N) return true;
		
		for(int i=0;i<N;i++) {
			
			if(isSafe(board,i,col)) {
				board[i][col] = 1;
				
				if(solveNQUtil(board,col+1)) {
					return true;
				}
				board[i][col]=0;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		NQueen q = new NQueen();
		q.solveNQ();
		
	}

}
