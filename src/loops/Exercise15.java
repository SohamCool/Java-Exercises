package loops;

import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		int req = 18-age;
		if(age<18) {
			System.out.println("Sorry, you are not eligible for the voting. Wait for "+req+" years");
		}
		else {
			System.out.println("Go ahead, you are eligible for the voting.");
		}
	}

}
