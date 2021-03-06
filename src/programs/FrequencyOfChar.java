package programs;

public class FrequencyOfChar {
	
	public static String frequencySort(String s) {
        if(s.isEmpty() || s.length()==0)
           return s;
       int[] charMap = new int[128];
       for(char ch: s.toCharArray()){
           charMap[ch]++;
       }
       char[] result = new char[s.length()];
       for(int i=0; i < s.length();) {
           int index = 0;
           int max = 0;
           for( int j=0; j < 128; j++){
               if(charMap[j] > max) {
                   max=charMap[j];
                   index=j;
               }
           }
           while(charMap[index]>0) {
               result[i++] = (char)index;
               charMap[index]--;
           }
       }

       return new String(result);
   }
	
	public static void main(String[] args) {
		
		System.out.println(frequencySort("tree"));
	}

}
