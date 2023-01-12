package stringPackages;

import java.io.File;
import java.util.Arrays;

public class FilePathTest {
	public static void main(String[] args) {
		String path="C:\\Users\\Mobile Programming.DESKTOP-5VPG6JO";
		File file = new File(path);
		String[] directories = file.list((dir,name)->new File(dir, name).isDirectory());
		System.out.println(Arrays.toString(directories));
	}
}
