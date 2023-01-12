package myselfNumber;

public class PalindromeNumber {
		public static void main(String[] args) {
			int num=212;
			int rev=0;
			int org=num;
			//System.out.println("Using while loop");
//			while (num>0) {
//			rev=rev*10+num%10;
//			num=num/10;
//			
//			}
			
			System.out.println("Using for loop");
			
			System.out.println("\n");
			for(int i=0;i<num;i++) {
				rev=rev*10+num%10;
				num=num/10;
			}
			if (org==rev) {
				System.out.println("Number is palindrom");
			}
			else {
				System.out.println("Number is not palindrom");
			}
		}
	}

