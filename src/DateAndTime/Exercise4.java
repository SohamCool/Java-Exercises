package DateAndTime;

import java.util.Calendar;

public class Exercise4 {

	public static void main(String[] args) {
		
		Calendar cl = Calendar.getInstance();
		int date = cl.get(Calendar.DAY_OF_WEEK);
		System.out.println(date);
	}

}
