package loops;

public class Exercise9 {

	public static void main(String[] args) {
		int i=1;
		for(; i<=9; i++) {
			i=i+1/i;
		}
		System.out.println(i);
	}

}
