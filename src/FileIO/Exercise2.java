package FileIO;

import java.io.File;

public class Exercise2 {

	public static void main(String[] args) {
		File my_file = new File("F:\\CodeCool\\Java Workspace\\signup.jsp");
		if(my_file.isDirectory())
			System.out.println(my_file.getAbsolutePath()+" is a directory");
		else
			System.out.println(my_file.getAbsolutePath()+" is not a directory");
		if(my_file.isFile())
			System.out.println(my_file.getAbsolutePath()+" is a file");
		else
			System.out.println(my_file.getAbsolutePath()+" is a file");
	}

}
