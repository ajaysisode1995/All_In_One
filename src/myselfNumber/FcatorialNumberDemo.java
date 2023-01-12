package myselfNumber;

import java.util.Scanner;

public class FcatorialNumberDemo {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	int fact=1;
		
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
		}
		System.out.println("factorial of the number");
		System.out.println(fact+" ");
		sc.close();
	}
}
