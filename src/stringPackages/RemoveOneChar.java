package stringPackages;

import java.util.Map;
import java.util.stream.Collectors;

public class RemoveOneChar {
	public static void main(String[] args) {
		String s11="jeevan i come over there";
		String s1="jeevan";
		
//		char[] charArray = s11.toCharArray();
//		String string = charArray.toString();
//		
//		 string.replace('a', ' ').chars().distinct().;
		
		s1.chars().filter(x->x!='a').forEach(x->System.out.print((char)x));
		
//		Long collect = s11.chars().mapToObj(x->(char)x).collect(Collectors.counting());
//		System.out.println(collect);

		Map<Character,Long> collect2 = 
		s11
		.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors
		.groupingBy(c->c,Collectors
		.counting()));
		
		collect2.forEach((x,y)->{
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
				System.out.println(x+":"+y);
			}
		});	
		
	}
}
