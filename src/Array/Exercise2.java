package Array;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		String[] strArray = {"Atharva", "Sanmesh", "Prathamesh", "Ankita", "Chetana"};
		String key = "Chetana";
		for(int i=1;i<=strArray.length;i++) {
			if(strArray[i]==key)
				System.out.println("found "+key+" at position "+(++i));
		}
	}

}
