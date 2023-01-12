package stringPackages;

public class SwapStringWithThirdVar {
	public static void main(String[] args) {
		String str1="Ajay";
		String str2="Vijay";
		
		System.out.println("Before Swapping");
		System.out.println("First String::"+str1);
		System.out.println("Second String::"+str2);
		
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println("after Swapping");
		System.out.println("First String::"+str1);
		System.out.println("Second String::"+str2);
	}
}
