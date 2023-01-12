package stringPackages;

public class ConvertStringToInteger {
	public static void main(String[] args) {
		String str1="1234";
		int result = Integer.parseInt(str1);
		int reverseNumber=0;
		while (result>0) {
			reverseNumber=reverseNumber*10+result%10;
			result=result/10;
		}
		System.out.println(reverseNumber);
		String string = Integer.toString(reverseNumber);
		System.out.println(string);
	}
}
