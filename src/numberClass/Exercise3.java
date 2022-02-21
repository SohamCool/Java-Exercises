package numberClass;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check wether it is cube or not: ");
		int n = sc.nextInt();
		int i = (int)(Math.pow(n, 1.0/3.0));
		if(i*i*i== n) {
			System.out.println("Number is a cube");
		}
		else
			System.out.println("number is not a cube");
	}

}
