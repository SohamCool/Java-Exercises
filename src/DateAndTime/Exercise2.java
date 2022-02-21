package DateAndTime;

import java.util.Calendar;

public class Exercise2 {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println();
		System.out.println("Year: "+cl.get(Calendar.YEAR));
		System.out.println("Month: "+cl.get(Calendar.MONTH));
		System.out.println("Day: "+cl.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour: "+cl.get(Calendar.HOUR));
		System.out.println("Minute: "+cl.get(Calendar.MINUTE));
		System.out.println();
	}

}
