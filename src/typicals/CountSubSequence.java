package typicals;

import java.util.ArrayList;
import java.util.List;

public class CountSubSequence {
	public static void main(String[] args) {
		String str1="aajajajajaja";
		String str2="aj";
		int lastindex=0;
		int count=0;
		
		System.out.println("***First Way***");
//		while (lastindex!=-1) {
//			lastindex=str1.indexOf(str2, lastindex);
//			if (lastindex!=-1) {
//				count++;
//				lastindex+=str2.length();
//			}
//		}
//		System.out.println(count);
		
		System.out.println("***Second Way***");
		
		System.out.println(subString_Calc( str1, str2 ));
		
		System.out.println("***Third Way***");
		System.out.println(str1.split(str2,-1).length-1);
		System.out.println("***Fourth Way***");
		
		List<Integer> indixes=new ArrayList<>();
		
		while ((lastindex= str1.indexOf(str2, lastindex)) != -1) {
			count++;
			indixes.add(lastindex);
			lastindex++;
		}
		System.out.println("total number of sub string in in String ::"+count);
		
		System.out.println("string found at the index of ::"+indixes);
	}

	private static int subString_Calc(String str1, String str2) {
		if (str1.contains(str2)) {
			return 1 + subString_Calc(str1.replaceFirst(str2, ""), str2);
		}
		return 0;
	}
}
