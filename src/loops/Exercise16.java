package loops;

public class Exercise16 {
	public boolean parrot_trouble(boolean talking, int hr) {
        if (talking == true && (hr<7 || hr>20))
            return true;
        else
            return false;
	}
	public static void main(String[] args) {
		Exercise16 obj = new Exercise16();
		boolean res =obj.parrot_trouble(true, 6);
		boolean res2 = obj.parrot_trouble(true, 7);
		boolean res3 =obj.parrot_trouble(false, 6);
		System.out.println("parrot_trouble(true, 6)->"+res);
		System.out.println("parrot_trouble(true, 7)->"+res2);
		System.out.println("parrot_trouble(false, 6)->"+res3);

	}

}
