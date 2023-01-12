package questionOnNumbers;

import java.util.HashMap;

public class HashReplace {
		public static void main(String[] args) {
			HashMap<Integer, String> m1=new HashMap<>();
			m1.put(1, "aa");
			m1.put(2, "bb");
			m1.put(3, "aa");
			m1.put(4, "cc");
			
			m1.replace(3, "dd");
			System.out.println(m1);
		}
}
