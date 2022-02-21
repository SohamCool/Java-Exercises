package Array;
import java.util.Arrays;
public class Exercise1 {

	public static void main(String[] args) {
		int[] numArray = {4,5,2,9,3,1};
		String[] strArray = {"ball","dog","cat","apple","elephant"};
		System.out.println("Original Array: "+Arrays.toString(numArray));
		Arrays.sort(numArray);
		System.out.println("Sorted Array: "+Arrays.toString(numArray));
		System.out.println();
		System.out.println("Original Array: "+Arrays.toString(strArray));
		Arrays.sort(strArray);
		System.out.println("Sorted Array: "+Arrays.toString(strArray));

	}

}
