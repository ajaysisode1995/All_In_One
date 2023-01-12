package stringPackages;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateCharMapToObject {
	public static void main(String[] args) {
		String s="Hi I a";
//		char[] words = s.toCharArray();
//		for(char s11:words) {
//			System.out.println(s11);
//		}
		
	IntStream chars = s.chars();
		chars.forEach(x->System.out.println((char)x));
	
//	for(char s22:chars) {
//		
//	}
		
//		Map<Character,Long> collect =
//				chars
//				.mapToObj(c->(char)c)
//				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
//		
//		collect.forEach((k,v)->{
//			if (v>1) {
//				System.out.println(k+"::"+v);
//			}
//		});
		
		
	}
}
