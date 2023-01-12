package patternAll;

public class NonRepeatativeNumber {
	public static int finddupl(int[] ar,int arr_size) {
		//to iterate over  element
		for (int i = 0; i < arr_size; i++) {
			
			int count=0;
			//iterate the condition and check
			for (int j = 0; j < arr_size; j++) {
				if (ar[i]==ar[j]) {
					count++;
				}
			}
			if (count==1) {
				return ar[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr1= {10, 10, 2, 2, 3,7, 4, 4, 5, 5};
		System.out.println(finddupl(arr1, 8));
	}
}
