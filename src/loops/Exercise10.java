package loops;

public class Exercise10 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1; i<=n ; i++) {
			int a = 1;
			while(a<=i){
			System.out.print("*");
			a++;
			}
			for(int j=n-1; j>0; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
