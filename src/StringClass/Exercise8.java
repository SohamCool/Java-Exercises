package StringClass;

public class Exercise8 {
	public String repeatEnd(String str, int n) {
		String result = "";
		for(int i=0;i<str.length() && i<n; i++) {
			result += str.substring(str.length()-n);
		}
		return result;
	}
	public static void main(String[] args) {
		Exercise8 obj = new Exercise8();
		String str1 = "metaverse";
		String str2 = "cloud computing";
		String str3 = "AI";
		
		System.out.println(obj.repeatEnd(str1,3));
		System.out.println(obj.repeatEnd(str2, 2));
		System.out.println(obj.repeatEnd(str3, 1));
	}

}
