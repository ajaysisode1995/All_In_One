package stringPackages;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInStr {
	public static void main(String[] args) {
		String ch1="ajay sisode ajay";
		printDuplicateChar(ch1);
	}
	
	public static void printDuplicateChar(String str) {
		if (str==null) {
			System.out.println("String is null");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		if (str.length()==1) {
			System.out.println("Single char string");
			return;
		}
		char[] words = str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<>();
		
		for(Character ch:words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
				}
			else {
				charMap.put(ch, 1);
			}
		}
		//print the map
		 Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		for(Entry<Character, Integer> entry:entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+"::::"+entry.getValue());
			}
		}
	}
}
