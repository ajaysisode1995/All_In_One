package stringPackages;

import java.util.Arrays;
import java.util.stream.Collectors;
//Convert array to String
public class ConvertStringArrayToString {
	public static void main(String[] args) {
		String[] s1= {"My","Name","Is","Ajay"};
		
		//using the Arrays. to string method
		System.out.println(convertarraytostringusingToString(s1));
		
		//using stringbuilder append  method
		String convertarraytostringusingAppend = convertarraytostringusingAppend(s1);
		System.out.println(convertarraytostringusingAppend);
		
		String convertarraytoStringusingJoinMethod = convertarraytoStringusingJoinMethod(s1);
		System.out.println(convertarraytoStringusingJoinMethod);
		
		String convertArrayToStringUsingCollectorsJoinNingMethod = convertArrayToStringUsingCollectorsJoinNingMethod(s1);
		System.out.println(convertArrayToStringUsingCollectorsJoinNingMethod);
	}
	
	private static String convertarraytostringusingToString(String[] str) {
		
		return Arrays.toString(str);
		}
	private static String convertarraytostringusingAppend(String[] str) {
		StringBuilder sB=new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sB.append(str[i]);
		}
		return sB.toString();
	}
	
	private static String convertarraytoStringusingJoinMethod(String[] s1) {
		String join = String.join(" ", s1);
		return join.toString();
	}
	private static String convertArrayToStringUsingCollectorsJoinNingMethod(String[] shubham) {
		String str = Arrays.stream(shubham).collect(Collectors.joining());
		return str;
		
	}
}
