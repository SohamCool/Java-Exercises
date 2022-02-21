package StringClass;

public class Exercise10 {
	public String getMiddle(String str) {
		int position =0;
		position = (str.length()/2)-1;
		if(position!=0 && str.length()%2 == 0) 
			return str.substring(position, position+2);
		else
			return "sorry, you've given string of odd length "+str.length();
	}
	public static void main(String[] args) {
		Exercise10 obj = new Exercise10();
		String str1 = "String";
		String str2 = "Code";
		String str3 = "Practice";
		String str4 = "Execution";
		System.out.println("middle characters of string \""+str1+"\" is "+obj.getMiddle(str1));
		System.out.println("middle characters of string \""+str2+"\" is "+obj.getMiddle(str2));
		System.out.println("middle characters of string \""+str3+"\" is "+obj.getMiddle(str3));
		System.out.println("middle characters of string \""+str4+"\" is "+obj.getMiddle(str4));

	}

}
