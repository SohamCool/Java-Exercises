package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise7b {
 
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
             Scanner sc = new Scanner(new FileReader("F:\\CodeCool\\Java Workspace\\Internship Excercises\\test.txt"));
              while (sc.hasNext())
               {
                strLine = sc.next();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = sc.next();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray()));
             sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}