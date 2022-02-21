package loops;

public class Exercise2 {
//reverseint
	public static void main(String[] args) {
		int a = 1234,n,rev = 0;
		for (; a!=0;a/=10) {
			n = a%10;
			rev=rev*10 + n;
		}
		System.out.println(rev);
	}
}
