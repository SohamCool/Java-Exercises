package loops;

import java.util.Scanner;

public class Exercise17 {
	public int diff21(int n) {
		return 21-n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise17 obj = new Exercise17();
		int r1,r2,r3;
		r1 = obj.diff21(19);
		r2 = obj.diff21(10);
		r3 = obj.diff21(21);
		System.out.println("diff21(19)-> "+r1);
		System.out.println("diff21(10)-> "+r2);
		System.out.println("diff21(21)-> "+r3);
	}

}
