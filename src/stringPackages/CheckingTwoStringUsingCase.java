package stringPackages;

public class CheckingTwoStringUsingCase {
	public static void main(String[] args) {
		String s1="Yes Im in In";
		String s2="yes im in in";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
