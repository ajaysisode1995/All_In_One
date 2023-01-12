package stringPackages;

public class SwapToStringWithThird_Variable {
	public static void main(String[] args) {
		String str1="one";
		String str2="two";
		
		//first add the string 
		
		str1=str1+str2;
		str2=str1.substring(0, (str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
	}
}
