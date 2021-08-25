package bitmanipulation;

public class ConvertBinaryToDecimal {
	
	public static void main(String[] args) {
		
	int arr[]= {1,0,0,0};
	int length = arr.length-1;
	int decimalValue = 0;
	
	for(int i=length;i>=0;i--) {
		decimalValue+= arr[i] * (1<<length-i);
	}

	System.out.println("value:"+decimalValue);
	}

}
