package stringPackages;

import java.util.Arrays;

public class CheckAnagram {
	public static void main(String[] args) {
		String s1="maRy";
		String s2="Army";
		System.out.println(isAnagram(s1,s2));
	}

	private static boolean isAnagram(String str1, String str2) {
		
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
		
		
	}
}
