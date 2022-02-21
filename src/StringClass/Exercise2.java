package StringClass;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		String str1 = "Python";
		String str = "PHP Exercises and Python Exercises";
		
		boolean r = str.contains(str1);
		if(r) {
			System.out.println("The string \""+str+"\" contains string "+str1);
		}
		else
			System.out.println("The string \""+str+"\" doesn't contains string "+str1);

	}

}
