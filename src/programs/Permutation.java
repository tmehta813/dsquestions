package programs;

import java.util.HashSet;

public class Permutation {
	
HashSet<String> set = new HashSet<String>();
    
    public boolean checkInclusion(String s1, String s2) {
        
        int lengthSubString = s1.length();
        int length = s2.length();
        findPermutation(s1,0,lengthSubString-1);
        set.add(s1);
        for(String str:set){
            if(s2.contains(str)) {
            	return true;
            }
            
        }
        return false;
        
    }
    
    
     void findPermutation(String s,int l,int k){
         if(l==k){
             set.add(s);
         }
         else{
            for(int i=l;i<=k;i++){
            	s = swap(s,l,i); 
            	findPermutation(s, l+1, k); 
                s = swap(s,l,i); 
            }
             
         }
     }
    
    String swap(String s,int i,int j){
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        String str = String.valueOf(charArray);
        set.add(str);
        return str;
    }
    
    public static void main(String[] args) {
    	
    	Permutation p = new Permutation();
    	System.out.println(p.checkInclusion("abc","bbbca"));
    	
		
	}
    

}
