package loops;

public class Exercise4 {
	public static void main(String[] args) {
		int num, sum, count = 1, rem;
		while (count < 500) {
			num = count;
			sum = 0;
			while (num != 0) {
				rem = num % 10;
				sum += (rem * rem * rem);
				num /= 10;
			}
			if (count == sum)
				System.out.println(sum);
			count++;
		}
	}
}
