package numberClass;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is ugly or not: ");
		int n = sc.nextInt();
		if(n==1 || n%2==0 || n%3==0 || n%5==0)
			System.out.println("Number is ugly");
		else
			System.out.println("number is not ugly");

	}

}
