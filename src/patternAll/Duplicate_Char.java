package patternAll;

import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate_Char {
	public static void main(String[] args) {
		String st1="ajaysisodea";
		
		Map<Character,Long> collect = st1
				.codePoints()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
//		collect.forEach((k,v)->{
//			if (v>2) {
//				System.out.println("character is three times::"+k+" "+v);
//			}
//		
//			else if (v>1)
//			{
//				System.out.println("character is 2 times::"+k+" "+v);
//			}
//			else if (v==1)
//			{
//				System.out.println("character is 1 times::"+k+" "+v);
//			}
//		});
		String str2="sisodeajay";
		Map<Character,Long> collect2 = str2.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		collect2.forEach((x,v)->{
			if (x>1) {
				System.out.println(x+" "+v);
			}
		});
		
		
	}
}
