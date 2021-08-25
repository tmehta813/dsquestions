package programs;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class S {
	
	ExecutorService ex;
	Executors e;
	 public static int[] prisonAfterNDays(int[] cells, int N) {
	        if(cells.length<=2) return cells;
	        
	        if(cells.length<=1) return cells;
	        int cycle = 1;
	        int firstCells[]=new int[cells.length];
	        for(int i=1;i<cells.length-1;i++){
	           if(cells[i-1]==cells[i+1]) firstCells[i]=1;  
	          else firstCells[i]=0;  
	        }
	        
	        firstCells[0]=0;
	        firstCells[cells.length-1]=0;
	        N--;
	        
	        int lastCells[]=firstCells;
	        while(N-->0){
	          int temp[]=new int[cells.length];
	            
	          for(int i=1;i<temp.length-1;i++){
	              if(lastCells[i-1]==lastCells[i+1]) temp[i]=1;
	              else temp[i]=0;
	          } 
	            
	          if(Arrays.equals(temp,firstCells)) N%=cycle;
	          lastCells=temp;   
	          cycle++;     
	        }
	        
	       return lastCells; 
	        
	    }
	
	
	public static void main(String[] args) {
		int data[] = {0,1,0,1,1,0,0,1};
		System.out.println(prisonAfterNDays(data,7));
		
	}

}
