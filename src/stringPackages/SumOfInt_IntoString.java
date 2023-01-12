package stringPackages;

import java.util.StringTokenizer;

public class SumOfInt_IntoString {

	public static void main(String[] args) {
		String s1="ah46gHjk82 ajay";
		int sum=0;
		int count=1;
		int countforchar=0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i) )  ) {
				sum=sum+Character.getNumericValue(s1.charAt(i));
			}
			if (s1.charAt(i)== ' ' && s1.charAt(i+1)!= ' ') {
				count++;
			}
			if (Character.isLetter(s1.charAt(i))) {
				countforchar++;
			}
		}
		System.out.println("sum of all digit in String is::"+sum);
		System.out.println(" sum of count of words::"+count);
		System.out.println("total char present in String::"+countforchar);
		
		System.out.println("StringTokenizer::"+couuntWordISEmpty(s1));
		System.out.println("USingSplitMethod::"+countWord_UsingSplit(s1));
	}
	static int couuntWordISEmpty(String str) {
		
		if (!str.isEmpty()) {
			StringTokenizer st=new StringTokenizer(str);
			return st.countTokens(); 
		}
		return 0;
		
	}
	
	static int countWord_UsingSplit(String str) {
		String[] split = str.split("\\s+");
		System.out.println();
		return split.length;
		
	}
}
