package stringPackages;

public class ReverseTheWords {
	public static void main(String[] args) {
		
		String str1="United States of America";
		System.out.println("Given String is "+str1);
		System.out.println("\n");
		
		String outputString = printreverseTheWords(str1);
		System.out.println(outputString);

	}

	private static String printreverseTheWords(String str1)
	
	{
		String[] wordsArray = str1.trim().split("\\s+");
		String reverseString="";
		for(String word:wordsArray) {
			reverseString+=revereWord(word)+" ";
		}
		return reverseString.trim();
	}

	private static String revereWord(String string)
	{
		String reverseWord="";
		for (int i = string.length()-1; i >= 0; i--) {
			reverseWord+=string.charAt(i);
		}
		return reverseWord;
	}
}
