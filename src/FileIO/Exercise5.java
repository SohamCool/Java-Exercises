package FileIO;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class Exercise5 {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		String str = "This is an Appended text to the file";
		File f = new File("F:\\CodeCool\\Java Workspace\\test.txt");
		try {
			bw = new BufferedWriter(new FileWriter(f.getName(),true));
		bw.write(str);
		bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Text Appended Successfully");
	}

}
