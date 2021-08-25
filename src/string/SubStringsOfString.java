package string;

public class SubStringsOfString {
	
	public static void main(String[] args) {
		String str = "abcd";
		//findSubString(0,str);
		substrings("abc", "");
	}

	private static void findSubString(int index, String str) {
	    	for(int i=0;i<str.length();i++) {
	    		for(int j=i+1;j<=str.length();j++) {
	    			System.out.println(str.substring(i,j));
	    		}
			}
		}
	
	 public static void substrings(String str, String temp)
	    {
	        if(str.length()==0)
	        {
	            System.out.println(temp); return;
	        }

	          substrings(str.substring(1), temp+str.substring(0,1));
	          substrings(str.substring(1), temp);
	    }
}
