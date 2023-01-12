package questionOnNumbers;

public class ReverseTheDiagonalOfElement {
	public static void main(String[] args) {
		int[][] a= {{10,2,3,5},{4,25,6,6},{7,8,9,7},{5,6,7,8}};
		int n=0;
		//we create new Array
		int[] result=new int[4];
		
		for(int i=3;i>=0;i--) {
			
			for(int j=3;j>=0;j--) {
				if (i==j) {
					result[n]=a[i][j]*a[i][j];
					n++;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
