package characterClass;

import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press any key: ");
		char a = sc.next().charAt(0);
		if(Character.isDigit(a))
			System.out.println("You entered a number");
		else
			System.out.println("You entered an alphabet");
	}

}
