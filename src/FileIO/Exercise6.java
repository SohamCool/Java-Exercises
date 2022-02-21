package FileIO;

import java.io.FileReader;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = null;
		String str = null;
		String longeststr= "";
		try {
			sc= new Scanner(new FileReader("F:\\CodeCool\\Java Workspace\\test.txt"));
			while((str=sc.next())!= null) {
				if(str.length()>longeststr.length())
					longeststr=str;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(longeststr);
	}

}
