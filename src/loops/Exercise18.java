package loops;

import java.util.Scanner;

public class Exercise18 {
	public int sumDouble(int n1, int n2) {
		if(n1 == n2)
			return 2*(n1+n2);
		else
			return n1+n2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise18 obj = new Exercise18();
		int r1,r2,r3;
		r1 = obj.sumDouble(1,2);
		r2 = obj.sumDouble(3,2);
		r3 = obj.sumDouble(2,2);
		System.out.println("sumDouble(1,2)-> "+r1);
		System.out.println("sumDouble(3,2)-> "+r2);
		System.out.println("sumDouble(2,2)-> "+r3);
	}

}
