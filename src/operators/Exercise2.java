package operators;

public class Exercise2 {

	public static void main(String[] args) {
		int a = 16, b = 2, c = 68;
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greatest");
		}else {
			System.out.println(c+" is greatest");
		}
	}

}
