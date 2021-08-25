package backtracking;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordBreakProblem {

	static void wordBreak(int n, List<String> list, String str) {

		String ans = "";
		wordBreakUtil(n, list, str, ans);

	}

	static void wordBreakUtil(int n, List<String> list, String str, String ans) {

		for (int i = 1; i <= n; i++) {

			String prefix = str.substring(0, i);

			if (list.contains(prefix)) {
				if (i == n) {
					ans = ans + prefix;
					System.out.println(ans);
					return;
				}
				wordBreakUtil(n-i,list,str.substring(i,n),ans+prefix+" ");

			}

		}

	}

	public static void main(String[] args) {

		String str1 = "iloveicecreamandmango"; // for first test case
		String str2 = "ilovesamsungmobile"; // for second test case
		int n1 = str1.length(); // length of first string
		int n2 = str2.length(); // length of second string

		// List of strings in dictionary
		List<String> dict = Arrays.asList("mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go",
				"i", "love", "ice", "cream");
		//System.out.println("First Test:");

		// call to the method
		//wordBreak(n1, dict, str1);
		System.out.println("\nSecond Test:");

		// call to the method
		wordBreak(n2, dict, str2);

	}

}
