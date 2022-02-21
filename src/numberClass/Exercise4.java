package numberClass;
//Happy Numbers first 10
public class Exercise4 {

	public static void main(String[] args) {
		int sum=0, no, rem=0;
		for (int i = 1; i <= 35; i++) {
			no = i;
			sum = 0;
			while(sum!=1 && sum!=4) {
				sum = 0;
				while(no>0) {
					rem = no%10;
					sum = sum + (rem*rem);
					no = no/10;
				}
				no = sum;
			}
			if(sum==1) {
				System.out.print(i+" ");
			}
			
		}

	}
}
