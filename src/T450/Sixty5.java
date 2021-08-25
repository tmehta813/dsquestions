package T450;


//Print all subsequences of a string 

public class Sixty5 {
	
	public static void main(String[] args) {
		
		String str = "abc";
		printAllSubSequences(str,"");
		
		
	}
	
	
	static void printAllSubSequences(String input,String output) {
		if(input.length()==0) {
			if(output.length()!=0)
			System.out.println(output);
			return;
		}
		
		printAllSubSequences(input.substring(1),output);
		printAllSubSequences(input.substring(1),output+input.charAt(0));
		
	}

}
