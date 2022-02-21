package FileIO;
import java.io.File;
public class Exercise1 {

	public static void main(String[] args) {
		File myFileDir = new File("F:\\CodeCool\\Java Workspace\\signup.jsp");
		if(myFileDir.isFile())
			System.out.println("File exist");
		else
			System.out.println("File does not exist");
	}

}
