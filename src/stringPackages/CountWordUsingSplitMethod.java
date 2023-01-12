package stringPackages;

public class CountWordUsingSplitMethod {
	
	public static void main(String[] args) {
		String s="ajay sisode";
		String[] ch = s.split(" ");
		for(String c:ch) {
			System.out.println(c);
		}
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i].equals(ch[j])) {
					count++;
					ch[j]="0";
				}
			}
		}
		
	}
}
