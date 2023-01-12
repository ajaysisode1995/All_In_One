package questionOnNumbers;

import java.util.Arrays;

public class DiagonalUsingString {
	public static void main(String[] args) {
        int a[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
        int n=0;
        int[] result=new int[a.length];
        String str1="";
        String str="";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]) {
                   // result=(a[i][j]*a[i][j])+","+str1;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
