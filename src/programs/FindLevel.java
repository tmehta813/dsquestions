package programs;

import java.util.ArrayList;
import java.util.List;

public class FindLevel {

	int parentNode = 0;

	public boolean isCousins(TreeNode root, int x, int y) {

		int level1 = findLevel(root, root, x, 0);
		int parentNode1 = parentNode;
		int level2 = findLevel(root, root, y, 0);
		int parentNode2 = parentNode;
		if (parentNode1 == parentNode2)
			return false;
		if (level1 != level2)
			return false;
		return true;

	}

	int findLevel(TreeNode root, TreeNode parent, int data, int level) {
		if (root == null)
			return 0;
		if (root.val == data)
			return level;

		int downLevel = findLevel(root.left, root, data, level + 1);
		if (downLevel != 0) {
			parentNode = root.val;
			return downLevel;
		}

		downLevel = findLevel(root.right, root, data, level + 1);
		parentNode = root.val;
		return downLevel;

	}

	TreeNode insert() {

		TreeNode node = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		node.left = left;
		node.right = right;
		TreeNode leftRight = new TreeNode(4);
		left.right = leftRight;
		TreeNode rightRight = new TreeNode(5);
		right.right = rightRight;

		return node;

	}

	public static int findJudge(int N, int[][] trust) {
		if (N == 1)
			return -1;
	        
	        int trustValue[]=new int[N+1];
	        int firstValue[]=new int[N+1];
	        int length = trust.length;
	        for(int i=0;i<length;i++){
	           int count =  trustValue[trust[i][1]];
	           firstValue[i+1]= trust[i][0];
	           trustValue[trust[i][1]]= ++count; 
	        }
	       
	        for(int i=1;i<=N;i++){
	            if(trustValue[i]==(N-1) && firstValue[i]==0){
	                return i;
	            }
	        }
	        
	        return -1;
	        

	}
	
	 public static String removeKdigits(String num, int k) {
		 StringBuilder builder = new StringBuilder(num);
	        for(int i=0;i<k;i++){
	          int j = 0;
	            while ((j < builder.length() - 1) && (builder.charAt(j) <= builder.charAt(j + 1))) {
	                j++;
	            }
	            builder.delete(j, j + 1);  
	        }
	        
	        while(builder.length()>0 && builder.charAt(0)=='0'){
	            builder.delete(0,1);
	        }
	        if(builder.length()==0) return "0";
	        return builder.toString();
	        
	    }
	 
	 public static int maxSubarraySumCircular(int[] A) {
	       int length = A.length;
	       if(length==0) return 0;
	        length=length-1;
	        int maxSum=Integer.MIN_VALUE;
	        int maxSumTillNow=0;
	        boolean isFirstIterationCompleted=false;
	         int j=Integer.MIN_VALUE;
	        for(int i=length;i>=0;i--){
	            if(A[i]>=0) j=i;
	            else break;
	        }
	        if(j==Integer.MIN_VALUE){
	        for(int i=0;i<=length;i++){
	            int val = A[i];
	            maxSumTillNow=maxSumTillNow+val;
	            if(maxSumTillNow>maxSum){
	                maxSum=maxSumTillNow;
	            }
	            if((val+maxSumTillNow)<=0){
	                maxSumTillNow=0;
	            }
	        }
	            return maxSum; 
	        }
	        else{
	            boolean isFirstIteration = true;
	            
	            for(int i=j;i<=length;i++){
	            int val = A[i];
	            maxSumTillNow=maxSumTillNow+val;
	            if(maxSumTillNow>maxSum){
	                maxSum=maxSumTillNow;
	            }
	            if((val+maxSumTillNow)<=0){
	                maxSumTillNow=0;
	            }
	            if(isFirstIteration && i==length){
	                    isFirstIteration=false;
	                    length=j-1;
	                    j=0;
	            }
	                
	        }
	            return maxSum; 
	            
	        }
	             
	        
	     
	    }
	 
      static boolean compare(int p[],int s[]){
	        for(int i=0;i<26;i++){
	            if(p[i]!=s[i]) return false;
	        }
	        return true;
	    }
	    
	    public static List<Integer> findAnagrams(String s, String p) {
	         int pLength=p.length();
	         int sLength =s.length();
	         List<Integer> list = new ArrayList<Integer>();
	         if(sLength<pLength) {
	          return list;
	         }
	        int pArray[]=new int[26];
	        int sArray[]=new int[26];
	        int m=0;
	        for(int i=0;i<pLength;i++){
	           pArray[(int)p.charAt(i)-'a']++;
	           sArray[(int)s.charAt(i)-'a']++;
	            m++;
	        }
	        if(compare(pArray,sArray)) list.add(0);

	        for(int i=m;i<sLength;i++){
	           
	            sArray[(int)s.charAt(i)-'a']++;
	            if(compare(pArray,sArray)) list.add(i-m);
	        }
	        
	       return list;
	       
	      
	        
	    }
	    
	    
	    
	 

	public static void main(String[] args) {
    	

    	System.out.println(findAnagrams("cbaebabacd","abc").toString());
    	
		
	}

	class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}

	}

}
