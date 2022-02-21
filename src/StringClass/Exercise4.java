package StringClass;

public class Exercise4 {

	public static void main(String[] args) {
		String str1 = "Stephen Edwin King";
		String str2 = "Walter Winchell";
		String str3 = "stephen edwin king";
		if(str1.equalsIgnoreCase(str2))
			System.out.println("String \""+str1+"\" is equal to String \""+str2+"\"");
		else
			System.out.println("String \""+str1+"\" is not equal to String \""+str2+"\"");
		
		if(str1.equalsIgnoreCase(str3))
			System.out.println("String \""+str1+"\" is equal to String \""+str3+"\"");
		else
			System.out.println("String \""+str1+"\" is not equal to String \""+str3+"\"");



	}

}
