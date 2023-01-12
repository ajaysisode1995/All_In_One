package myselfNumber;

public class Perfect_Num_Demo {
	public static void main(String[] args) {
		int num=28;
		boolean b=isPerfect(num);
		if (b) {
			System.out.println("Number is perfect");
		}
		else {
			System.out.println("Not Perfect");
		}
	}

	private static boolean isPerfect(int num) {
		int sum=0;
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				sum+=i;
			}
		}
		if (num==sum) {
			return true;
		}
		
		return false;
	}
}
