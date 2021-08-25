package string;

public class RabinKarpAlgo {
	
	public static void main(String[] args) {
		
		String pattern = "abc";
		String str = "ajiuuiiuabcdf";
		rabinKarp(str.length(),pattern.length(),pattern,str);
		
		
	}
	
	static void rabinKarp(int n, int m, String p, String str) {
		int hash = p.length();
		int phashValue=0;
		int strHashValue=0;
		for(int i=m-1;i>=0;i--) {
			int charValue = p.charAt(m-i-1);
			phashValue+=(int)Math.pow(hash, i)+charValue;
			strHashValue+=(int)Math.pow(hash, i)+str.charAt(m-i-1);
		}
		System.out.println("pattern hash value:"+phashValue);
		System.out.println("str hash value:"+strHashValue);
		
		for(int i=0;i<n;i++) {
			if(phashValue==strHashValue) {
				for(int j=0;j<m;j++) {
					if(p.charAt(j)!=str.charAt(i+j)) {
						break;
					}
				}
			}
			else {
				strHashValue= strHashValue-
			}
			
		}
		
		
	}
	
	

}
