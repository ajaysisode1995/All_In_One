package stringPackages;

import java.util.Scanner;

public class RemoveChararcteFromString {
	public static void main(String[] args) {
		String inputString="Ajay&Sisode";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character that you want remove");
		char ch = sc.next().charAt(0);
		String removeCh = removeCharFStr(inputString,ch);
		System.out.println("After removing characte :"+ch+
				"::from the Input String ::"+inputString+"::The result will be like ::"+removeCh);
		sc.close();
	}

	private static String removeCharFStr(String inputStr,char ch1) {
		String replace = inputStr.replace(ch1,' ');
		return replace;
	}
}
