package programs;

import java.util.HashMap;
import java.util.Map;

class Solution {
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	   HashMap<String,Integer> countMap = new HashMap<String,Integer>(); 
	    
	    public String longestDupSubstring(String S) {
	        if(S.length()<=1) return "";
	         
	        findSubString(S); 
	        if(countMap.isEmpty()) return "";
	        String string = "";
	         for (Map.Entry<String,Integer> entry : countMap.entrySet()){
	             if(entry.getKey().length()>string.length()){
	                 string = entry.getKey();
	             }
	         }
	        
	        return string;
	        
	    }
	    
	    private void findSubString(String s){
	      
	        for (int i = 0; i < s.length()-1; i++)  
	           for (int j = i+1; j <= s.length()-1; j++) {
	               
	               String str = s.substring(i, j);
	               if(map.get(str)==null){
	                   map.put(str,1);
	               }
	               else {
	            	   map.put(str,map.get(str)+1);
	                   Integer val = countMap.get(str);
	                   if(val==null) countMap.put(str,2);
	                   else countMap.put(str,val+1);
	               }
	           } 
	    } 
	    
    
    public static void main(String[] args) {
    	
		System.out.println(new Solution().longestDupSubstring("banana"));
	}
}
