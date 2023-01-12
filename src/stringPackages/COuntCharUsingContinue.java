package stringPackages;
import java.util.Scanner;

public class COuntCharUsingContinue {
	public static void main(String[] args) {
		String str1="ajay sisode";
		System.out.println("enter any char");
		Scanner sc=new Scanner(System.in);
		int count=0;
		char c = sc.next().charAt(0);
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)!=c) {
				continue;
			}
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}
