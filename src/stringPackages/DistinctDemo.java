package stringPackages;

import java.util.ArrayList;
import java.util.List;

public class DistinctDemo {
	public static void main(String[] args) {
		 List<String> names = new ArrayList<>();
		    names.add("Kamal");
		    names.add("Ram");
		    names.add("Madhavi");
		    names.add("Kamal");
		    
		    names.stream().distinct().forEach(x->System.out.println(x));
	}
}
