package stringPackages;

import java.util.Arrays;

public class BestDemoStringToArray {
	public static void main(String[] args) {
		 // declaring the string
        String str = "1,2,356,678,3378";
        //int k=3;
     
        // calling replaceAll() method and split() method on
        // string
        String[] st = str.replaceAll("\\[", "")
                              .replaceAll("]", "")
                              .split(",");
 
        // declaring an array with the size of string
        int[] arr = new int[st.length];
 
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < st.length; i++) {
            arr[i] = Integer.valueOf(st[i]);
        }
 
        // printing string
        System.out.println("String : " + str);
 
        // printing the Integer array
        System.out.println("Integer array : "
                         + Arrays.toString(arr));
}
	}

