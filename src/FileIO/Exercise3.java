package FileIO;

import java.io.File;
import java.util.Date;
public class Exercise3 {

	public static void main(String[] args) {
		File myfile = new File("F:\\\\CodeCool\\\\Java Workspace\\\\signup.jsp");
		Date d = new Date(myfile.lastModified());
		System.out.println(d);
	}

}
