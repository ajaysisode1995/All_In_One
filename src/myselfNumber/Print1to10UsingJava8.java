package myselfNumber;

import java.time.Year;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Print1to10UsingJava8 {
	public static void main(String[] args) {
		System.out.println("print 1 to 10");
		
		//IntStream range = IntStream.range(1, 15);
		//range.forEach(x->System.out.println(x));
		List<Integer> asList = Arrays.asList(1,2,3,4,5,5,6);
		Set<Integer> set=new HashSet<>();
		asList.stream().filter(x->x%2!=0).collect(Collectors.toList()).forEach(x->System.out.println(x));
		System.out.println("\n");
		Set<Integer> collect = asList.stream().
		filter(x->!set.add(x))
		.collect(Collectors.toSet());
		collect.forEach(x->System.out.println(x));
		
	}
}
