package stringPackages;

public class ReverseOfString {
	public static void main(String[] args) {
		String str1="Ajay Sisode From Pune";
		String reverString="";
		int l = str1.length();
		for (int i = l-1; i >= 0; i--) {
			reverString=reverString+str1.charAt(i);
		}
		System.out.println(reverString);
	}
}
