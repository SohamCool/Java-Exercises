package loops;

import java.util.Scanner;

public class Exercise13 {
	public void getRev(int uprice, int qty) {
		int rev, disc = 0, tot, d;
		rev = uprice*qty;
		tot = rev;
		if(qty>=100 && qty<=120) {
			d=10;
			disc = rev*d/100;
			tot = rev - disc;
		}
		else if(qty>120) {
			d=15;
			disc = rev*d/100;
			tot = rev - disc;
		}else {
			d=0;
			disc = d;
			tot = rev;
		}
		System.out.println("The revenue from the sale: "+rev+"$");
		System.out.println("After Discount: "+tot+"$ ("+d+"%)");
	}
	public static void main(String[] args) {
		Exercise13 obj = new Exercise13();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit price: ");
		int uprice = sc.nextInt();
		System.out.println("Enter quantity: ");
		int qty = sc.nextInt();
		obj.getRev(uprice, qty);
	}

}
