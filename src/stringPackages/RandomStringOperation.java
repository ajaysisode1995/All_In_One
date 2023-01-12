package stringPackages;

import java.util.StringTokenizer;

public class RandomStringOperation {
	public static void main(String[] args) {
		String s="Ajay Sisode from pune";
		int totalwords = countwords(s);
		System.out.println(totalwords);
		System.out.println("\n");
		int cntWords = cntWords(s);
		System.out.println(cntWords);
		System.out.println("\n");
		int words = cntWordByNormal(s);
		System.out.println(words);
		
		String s1="I feel the same as you think about future";
		
		String reveseWordfromString = reveseWordfromString(s1);
		System.out.println(reveseWordfromString);
	}

	private static String reveseWordfromString(String s1) {
		String[] wordarray = s1.trim().split("\\s");
		String stringWithReverseWord="";
		for(String str:wordarray) {
			stringWithReverseWord+=reverseWord(str);
		}
	 return stringWithReverseWord;
	}
	
	public static String reverseWord(String str) {
		int len=str.length();
		String reverseWord="";
		
		for (int i = len-1; i >=0; i--) {
			reverseWord+=str.charAt(i);
		}
		return reverseWord;
	}

	private static int cntWordByNormal(String s) {
		int wordsCount=0;
		int endOfString = s.length()-1;
		//make sure string does not have space from starting and ending
		@SuppressWarnings("unused")
		String trim = s.trim();
		
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)== ' ' && s.charAt(i+1)!=' ') {
				wordsCount++;
			}
			else if (s.charAt(i)== ' ' && s.charAt(i++)==' ') {
				i++;
			}
			else if(i==endOfString){
				wordsCount++;
			}
		}
		return wordsCount;
	}

	private static int cntWords(String s) {
		if (!s.isEmpty()) {
			StringTokenizer stringTokenizer = new StringTokenizer(s);
			return stringTokenizer.countTokens();
		}
		return 0;
}

	private static int countwords(String str) {
		String[] split = str.split("\\s");
		return split.length;
		}
	
	
}
