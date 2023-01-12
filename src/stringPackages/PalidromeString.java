package stringPackages;

import java.util.Scanner;

public class PalidromeString {
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String next = sc.next();
		
		String reverseString = reverseString(next);
		if (next.equals(reverseString)) {
			System.out.println("Input String Is Palindrom::"+reverseString);
		}
		else {
			System.out.println("String is not palindrom");
		}
		sc.close();
	}

	public static String reverseString(String str) {
        String reversedString ="";
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
 
        }
        return reversedString;
    }
}
