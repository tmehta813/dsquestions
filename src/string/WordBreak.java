package string;

import java.util.ArrayList;

public class WordBreak {
	
	public static void main(String[] args) {
		
	}
	
	 public static int wordBreak(String A, ArrayList<String> B )
	    {
	        if(B.size()==0) return 0;
	        if(word(A,B)) return 1;
	        return 0;
	        
	    }
	    
	    static boolean word(String str,ArrayList<String> list){
	        
	        if(str.length()==0) return true;
	        
	        for(int i=1;i<=str.length();i++){
	            if(list.contains(str.substring(0,i))){
	              if(word(str.substring(i),list)){
	               return true;
	            }
	        }
	        }
	        
	        return false;
	        
	    }
	    

}
