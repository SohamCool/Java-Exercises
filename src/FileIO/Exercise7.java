package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise7 {
	public static void main(String[] args) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		List<String> li = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("F:\\CodeCool\\Java Workspace\\test.txt"));
			while(str!=null) {
				str = br.readLine();
				sb.append(str);
				sb.append(System.lineSeparator());
				str = br.readLine();
				if(str == null)
					break;
				li.add(str);
			}
			System.out.println(Arrays.toString(li.toArray()));
			br.close();
		} 
		
		catch(FileNotFoundException f) {
			System.out.println(f);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
System.out.println(e);		}
		
		
	}
}
