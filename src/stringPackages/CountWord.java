package stringPackages;

import java.util.StringTokenizer;

public class CountWord {
	public static void main(String[] args) {
		String str1="Ajay sisode";
		int countwordusingSpli = countwordusingSpli(str1);
		System.out.println(countwordusingSpli);
		
		int countWordUsingStringTokenizer = countWordUsingStringTokenizer(str1);
		System.out.println(countWordUsingStringTokenizer);
	}

	private static int countWordUsingStringTokenizer(String str1) {
		
		if (!str1.isEmpty()) {
		StringTokenizer str=new StringTokenizer(str1);
		return str.countTokens();
		}
		return 0;
	}

	private static int countwordusingSpli(String inputString) {
		String[] split = inputString.split("\\s+");
		return split.length;
	}
}
