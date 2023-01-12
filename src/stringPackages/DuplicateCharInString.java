package stringPackages;

import java.util.ArrayList;

public class DuplicateCharInString {
	public static void main(String[] args) {
		String s1="My name is ajay Sisode and I wish to be here for 4 yr i guess";
		printDuplicates(s1);
	}

	private static void printDuplicates(String inputString) {
		
		ArrayList<Character> charlist=new ArrayList<>();
		int count=0;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			for (int j = 0; j < inputString.length(); j++) {
				if (inputString.charAt(j)!=ch) {
					continue;
				}
				count++;
			}
			 // check if we have already printed for ch
	        if (!charlist.contains(ch)) {
	            // check if count is more than 1 i.e. duplicate and char should not be space
	            if (count > 1 && ch != ' ') {

	                System.out.println("Char: " + ch + ", Count: " + count + " times.");
	                charlist.add(ch);
	            }
	        }
	        	// set counter to zero for next ch
	        count = 0;
		}
		
    }
		
	
}
