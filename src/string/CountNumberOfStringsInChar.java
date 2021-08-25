package string;

public class CountNumberOfStringsInChar {
	
	static int count = 0;
	private static String strStatic = "";
	
	public static void main(String[] args) {
		char input[][] ={
	            {'D','D','T','A','R','U'},
	            {'U','R','A','E','B','S'},
	            {'B','S','K','E','B','K'},
	            {'D','D','D','D','D','E'},
	            {'D','D','T','A','R','E'},
	            {'D','D','D','D','U','G'}
	           };
		
		String str = "TARU";
		strStatic=new String(str);
		
		isFound(str,input);
		System.out.println("count: "+count);
	}
	
	static int isFound(String str, char input[][]) {
		
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(str.charAt(0)== input[i][j]) {
					String newString = new String(str);
					if(search(input,newString,i,j,new boolean[input.length][input.length])) {
			     // do nothing
					}
				}
			}
		}
		
		return count;
		
	}

	private static boolean search(char arr[][],String str, int i, int j, boolean[][] visited) {
		
		   if(str.length()==0) {
			   count++;
			   return true;
		   }
	   
		  if(i>=0 && j>=0 && i<arr.length && j< arr.length && visited[i][j]==false && arr[i][j]==str.charAt(0)) {
			  visited[i][j]=true;
			  if(search(arr,str.substring(1),i+1,j,visited)) return true;
			  if(search(arr,str.substring(1),i-1,j,visited)) return true;
			  if(search(arr,str.substring(1),i,j+1,visited)) return true;
			  if(search(arr,str.substring(1),i,j-1,visited)) return true; 
			  visited[i][j]=false;
			  str = new String(strStatic);
		  }
		
		return false;
	}
	
	
	

}
