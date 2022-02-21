package DateAndTime;

import java.util.Calendar;

public class Exercise3 {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.getActualMaximum(cl.DAY_OF_MONTH));
}
}
