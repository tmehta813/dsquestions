package graphs;

import java.util.ArrayList;

public class StepsByKnight {

	public static void main(String[] args) {

		int N = 6;
		int knightPos[] = { 1, 1 };
		int targetPos[] = { 4, 5 };
		System.out.println(minStepToReachTarget(knightPos, targetPos, N));
	}

	static int minStepToReachTarget(int knightPos[], int targetPos[], int N) {
		
		 int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
	     int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
		
		
		ArrayList<Cell> q = new ArrayList();
		q.add(new Cell(knightPos[0], knightPos[1],0));
		
		Cell t;
		int x,y;
		boolean visit[][]=new boolean[N+1][N+1];
		visit[knightPos[0]][knightPos[1]]=true;
		
		while(!q.isEmpty()) {
			t = q.remove(0);
			if(t.x==targetPos[0] && t.y==targetPos[1]) {
				return t.dis;
			}
			
			for(int i=0;i<8;i++) {
				x=t.x+dx[i];
				y=t.y+dy[i];
				if(isInside(x, y, dx, dy, N)) {
					q.add(new Cell(x,y,t.dis+1));
				}
			}
		}
		
		return Integer.MAX_VALUE;
		
	}
	
	static boolean isInside(int x, int y, int dx[], int dy[],int N) {
		if(x<0 || y<0 || x>= N || y>=N ) return false;
		return true;
	}
	
	
	static class Cell{
		int x,y;
		int dis;
		Cell(int x, int y, int dis){
			this.x=x;
			this.y=y;
			this.dis=dis;
		}
	}

}
