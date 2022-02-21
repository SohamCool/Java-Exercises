package loops;

public class Exercise1 {

	public static void main(String[] args) {
		int no = 29;
		for(int i=1; i<=29; i++) {
			if(no%i==0)
				System.out.println("not a prime number");
			System.out.println("29 is a prime number");
		}
	}

}
