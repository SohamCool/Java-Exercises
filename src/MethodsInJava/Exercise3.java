package MethodsInJava;

public class Exercise3 {
	public static int getCount(String str) {
		int count =0 ;
		for ( int i =0; i<str.length();i++) {
		//	if(str.charAt(i)==" ")
				count++;
		}
		return count+=1;
	}
	public static void main(String[] args) {
		String str="I am very happy today.";
		int j = getCount(str);
		System.out.println(j);
	}

}
