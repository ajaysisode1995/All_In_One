package stringTo_Array;
//chars() convert string into intStream(we have to convert intstream into char)
public class UsingChars {
	public static void main(String[] args) {
		String s="Ajay sisode";
		System.out.println("******using method ref*******");
		s.chars().mapToObj(Character::toChars).forEach(System.out::print);
		System.out.println("******using lamdaexpress*******");
		s.chars().forEach(x->System.out.print((char)x+" "));
		
		System.out.println("******using value of*******");
		s.chars().mapToObj(v->Character.valueOf((char)v));
		
		System.out.println("******using print*******");
		s.chars().mapToObj(x->(char)x).forEach(x->System.out.println(x));;
		
		
		
	}
}
