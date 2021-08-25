package programs;

import java.util.ArrayList;

public class PositiveNegative {

	// Input: {1, 2, 3, -4, -1, 4}
	// Output: {-4, 1, -1, 2, 3, 4}
	
	//Input: {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
	//output: {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0} 


	public static void main(String[] args) {

		int index = 0;
		int arr[] = {1, 2, 3, -4, -1, 4};
		ArrayList<Integer> positive = new ArrayList();
		ArrayList<Integer> negative = new ArrayList();
		int sizeOfPositive = 0;
		int sizeOfNegative = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				positive.add(arr[i]);
				sizeOfPositive++;
			} else {
				negative.add(arr[i]);
				sizeOfNegative++;
			}

			if (index > 0) {
				if (arr[index - 1] < 0 && sizeOfPositive > 0) {
					arr[index++] = positive.remove(0);
					sizeOfPositive--;
				} else if (arr[index - 1] > 0 && sizeOfNegative > 0) {
					arr[index++] = negative.remove(0);
					sizeOfNegative--;
				}
			}
			else {
				if(sizeOfNegative>0) {
					arr[index++]=negative.remove(0);
					sizeOfNegative--;
				}
			}

		}

		if (!positive.isEmpty()) {
			for (int i : positive) {
				arr[index++] = i;
			}
		}

		if (!negative.isEmpty()) {
			for (int i : negative) {
				arr[index++] = i;
			}
		}

		for(int i: arr) {
		System.out.print(i+" ");
		}

	}

}
