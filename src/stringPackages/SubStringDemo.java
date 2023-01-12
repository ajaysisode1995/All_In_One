package stringPackages;

import java.util.Arrays;

public class SubStringDemo {
	public static void main(String[] args) {
		String s="Ajay Sisode";
		System.out.println("Original String :"+s);
		System.out.println("substring start 4"+s.substring(4));
		System.out.println("substring start from 0 to 6::"+s.substring(2,6));
		
	String str1=new String("Hi my name ajay Sisode");
	String[] split = str1.split("\\.");
	System.out.println(Arrays.toString(split));
	
	for(String s1:split) {
		System.out.println(s1);
	}
	
	}
}
