package T450;

public class ComputersCustomerProblems {

	public static void main(String[] args) {
		String arr[][] = { { "you", "we" }, { "have", "are" }, { "sleep", "eat", "drink" } };
		for (int i = 0; i < 2; i++) {
			printRecursively(i, 0, 0, arr);
		}
		// 00,01
		// 10,11,
		// 20,21,22
	}

	static void printRecursively(int i, int j, int k, String arr[][]) {

		if (k == 3) {
			++j;
			k=0;
		}
		if(j==2) return;
			

		System.out.println(arr[0][i] + " " + arr[1][j] + " " + arr[2][k]);
		printRecursively(i, j, ++k, arr);

	}

}
