package stringPackages;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class EXCEPTIONdEMO {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Mobile Programming.DESKTOP-5VPG6JO\\Desktop\\p.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bf=new BufferedReader(fileReader);
		String line;
		
		while ((line=bf.readLine())!=null) {
			System.out.println(line);
		}
		fileReader.close();
	}
}
