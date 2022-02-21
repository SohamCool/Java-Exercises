package loops;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		int num;
		int j = 0,n1=0,n2=1,n3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of fibonacci series: ");
		num = sc.nextInt();
		System.out.println(n1+"\n"+n2);
		for(int i = 0; i<num;i++) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}
}
