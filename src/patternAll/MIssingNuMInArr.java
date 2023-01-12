package patternAll;

public class MIssingNuMInArr {
	static int getMissingNumber(int[] ar,int n) {
		int sumOfResult=n*(n+1)/2;
		int result=0;
		
		for (int i = 0; i < n-1; i++) {
			result+=ar[i];
		}
		return sumOfResult-result;
		
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,6};
		int len=arr1.length;
		int miss=getMissingNumber(arr1, len);
		System.out.println(miss);
	}
}
