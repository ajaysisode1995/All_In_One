package myselfNumber;

public class PrintPrimeNuberOneT100 {
	public static void main(String[] args) {
		String primeNumber="";
		int temp=0;
		for(int i=0;i<100;i++) {
			int count=0;
			
			for(int j=i;j>=1;j--) {
				
				if (i%j==0) {
					count+=1;
					
				}
				
			}
			
			if (count==2) {
				primeNumber+=i+" ";
				temp++;
				
			}
		}
		System.out.println("prime number are::");
		System.out.println(primeNumber);
		System.out.println(temp);
	}
}
