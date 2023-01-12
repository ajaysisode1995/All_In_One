package stringPackages;

import java.util.Scanner;

public class CharCheckInString {
	public static void main(String[] args) {
		String s1="coderolls ajay";
		System.out.println("Enter any char");
		Scanner sc=new Scanner(System.in);
		char next = sc.next().charAt(0);
		int count =0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == next) {
				count++;
				System.out.println("Character present in String::"+s1.charAt(i));
			}
		}
		System.out.println(count);
		sc.close();
	}
}
