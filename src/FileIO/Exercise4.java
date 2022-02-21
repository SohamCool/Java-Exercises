package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4 {

	public static void main(String[] args) {
		BufferedReader br = null;
		String str = "";
		try {
			br = new BufferedReader(new FileReader("F:\\CodeCool\\Java Workspace\\signup.jsp"));
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		}
		catch(IOException e) {
			System.err.println("Unable to read file");
		}
	}

}
