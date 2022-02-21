package loops;

public class Exercise12 {

	public static void main(String[] args) {
		int num;
		for (int i = 1; i <= 100; i++) {
			int cnt = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2)
				System.out.println(i);
		}
	}

}
