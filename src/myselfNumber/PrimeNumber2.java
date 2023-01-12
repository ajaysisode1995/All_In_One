package myselfNumber;

public class PrimeNumber2 {
	public static void main(String[] args) {
		System.out.println("prime number is");
		for(int i=0;i<=100;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) {
				if (i%j==0) {
					temp+=1;
				}
			}
			if (temp==0) {
				System.out.print(" "+i);
			}
		}
	}
}
