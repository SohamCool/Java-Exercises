package Array;
import java.util.Arrays;
public class Exercise3 {
	public static int[] removeElement(int[] arr, int index) {
		if(arr == null || index>arr.length || index<0) {
			return arr;
		}
		int[] arr1 = new int[arr.length-1];
		for(int i =0, k = 0; i< arr.length; i++) {
			if(i==index)
				continue;
			arr1[k++]=arr[i];
		}
		return arr1;
	}
	public static void main(String[] args) {
		int[] arr = {39,23,1,43,25,95};
		int ind = 3;
		--ind;
		System.out.println("Original array: "+Arrays.toString(arr));
		arr =removeElement(arr, ind);
		System.out.println("After removing element: "+Arrays.toString(arr));
	}

}
