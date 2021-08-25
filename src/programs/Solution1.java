package programs;

class Solution1 {
	
    public static int firstUniqChar(String s) {
        int len = s.length();
        if(len == 0) return -1;
        if(len < 2) return 0;
        
        int[] res = new int[26];
        for(int i = 0; i < len; i++) {
            int index = (int)(s.charAt(i)-'a');
            if(res[index] < 0) continue;
            else if(res[index] > 0) res[index] *= -1;
            else res[index] = i+1;
        }
        int result = -1;
        for(int i = 0; i < 26; i++) {
            int c = res[i];
            if(c > 0) {
                if(result < 0) {
                    result = c;
                } else {
                    if(result > c) {
                        result = c;
                    }
                }
            }
        }
        return result > 0 ? result-1 : -1;
    }
    
    
    public static void main(String[] args) {
    	
    	System.out.println(firstUniqChar("leetcode")+"");
		
	}
}
