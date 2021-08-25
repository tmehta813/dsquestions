package string;

public class PrintAllPermutationOfString {
	
	static int count = 0;
	public static void main(String[] args) {
		String str="abcdef";
		permute(str,0,str.length()-1);
		//permute("abc", "");
	}

	private static void permute(String str, int l, int r)
    {
        if (l == r) {
        	
        System.out.println(str);
        System.out.println(++count);
    }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                //str = swap(str,l,i);
            }
        }
    }
 
    /**
    * Swap Characters at position
    * @param a string value
    * @param i position 1
    * @param j position 2
    * @return swapped string
    */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    static void permute(String s,String answer)
    {  
        if (s.length() == 0)
        {
            System.out.print(answer + "  ");
            return;
        }
         
        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }


}
