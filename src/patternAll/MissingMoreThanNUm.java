package patternAll;

public class MissingMoreThanNUm {
	public static void main(String[] args) {
		int[] ar= {1,1,2,3,3,4,4};
		//create new array of same length
		int[] registr=new int[ar.length];
		
		//mark all array in given 
		
		for(int i:ar) {
			registr[i]=1;
		}
		//now lets print all the absents
	for (int i = 0; i < registr.length; i++) {
		if (registr[i]==0) {
			System.out.println(i);
		}
	}
	}
}
