package myOldNumber;

public class SumOfArray {
	static int[] ar= {1,2,3,5};
	public static void main(String[] args) {
		
		int sum=0;
		int count=0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		System.out.println("SUm of array is ::"+sum);
	
		//find the sum of range of length
		int sumOfAvg=0;
		for (int i = 0; i < 5; i++) {
			sumOfAvg+=i;
		}
		System.out.println(sumOfAvg);
		
		//find the length of array without using length method
		
		try {
			while (true) {
				temp=count+ar[count];
				count++;
			}
		} catch (Exception e) {
			System.out.println(count);
		}
		calculatingLength();
		
	}

	private static void calculatingLength() {
		int count=0;
		 for(int i:ar)
		 {
		   count++;
		 }
		 System.out.println(count);
		
	}
}
