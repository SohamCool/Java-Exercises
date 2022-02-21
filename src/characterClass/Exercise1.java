package characterClass;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		char a = sc.next().charAt(0);
		if(Character.isUpperCase(a)) {
			System.out.println(a+" is an Uppercase Letter");
		}
		else
			System.out.println(a+" is not an UpperCase Letter");
	}

}
