package myOldNumber;

public class ArrayRandonmFirst {
	public static void main(String[] args) {
		int[] ar= {1,2,2,3,4};
		int[] index=new int[ar.length];
		int count=0;
		int len = ar.length;
		for (int i = 0; i < len; i++) {
			
			for (int j = i+1; j < len; j++) {
				if ((ar[i]==ar[j]) && (i==j) && (i==0)) {
					index[count]++;
				}
				
			}
			System.out.println(index[count]);
		}
	}
}
