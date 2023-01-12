package stringTo_Array;

public class FirstNaiveSolu {
	public static void main(String[] args) {
		String s="Ajay Sisode";
		System.out.println("*******NAive*****");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
		
		System.out.println("*******UsingToCharArray*****");
		char[] ch = s.toCharArray();
		for(char s1:ch) {
			System.out.println(s1+" ");
		}
		System.out.println("*******UsingSplitMethod*****");
		String[] splt = s.split("");
		for(String s1:splt) {
			System.out.println(s1);
		}
		
		
		
	}
}
