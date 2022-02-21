package numberClass;
import java.util.Random;
public class Exercise2 {
	public int getRandom(int min, int max) {
		return (int)(Math.random()*(max-min)+min);
	}

	public static void main(String[] args) {
		Exercise2 obj = new Exercise2();
		System.out.println(obj.getRandom(1, 6));
	}

}
