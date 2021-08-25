package T450;

//Split the binary string into substrings with equal number of 0s and 1s

//Input: str = “0100110101”
//Output: 4
//The required substrings are “01”, “0011”, “01” and “01”.
//
//Input: str = “0111100010”
//Output: 3

public class Sixty7 {
	
	public static void main(String[] args) {
		
		String str = "0100110101";
		String str1 = "0111100010";
		System.out.println(binaryStringIntoSubStrings(str));
		System.out.println(binaryStringIntoSubStrings(str1));
	}
	
	
	
	static int binaryStringIntoSubStrings(String str) {
		
		int count0 = 0;
		int count1 = 0;
		int count=0;
		
		for(char ch:str.toCharArray()) {
			if(ch =='0') {
				count0++;
			}
			else if(ch=='1') {
				count1++;
			}
			
			if(count0==count1) {
				count++;
			}
		}
		if(count!=0) {
			return count;
		}
		return -1;

		
	}

}
