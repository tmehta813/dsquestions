package T450;

//permutation of a string
//reference https://www.youtube.com/watch?v=mEBEw_xScsE

public class Sixty6 {
	
	public static void main(String[] args) {
		
		String str = "ABC";
		permutation(str, 0, str.length()-1);
	}
	
	
	static void permutation(String str,int l,int r) {
		if(l==r) {
			System.out.println(str);
			return;
		}
		
		for(int i=l;i<=r;i++) {
			str = swap(l,i,str);
			permutation(str,l+1,r);
			str=swap(l,i,str);
		}
		
	}


	private static String swap(int l, int i, String str) {
		
		char ch[] = str.toCharArray();
		char ch1 = ch[l];
		ch[l]=ch[i];
		ch[i]=ch1;
	
		return new String(ch);
	}

}
