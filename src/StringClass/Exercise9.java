package StringClass;

public class Exercise9 {
	public Boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0,n);
		for(int i =n;i<str.length();i++) {
			if(n+i<str.length()) {
			if(prefix.equals(str.substring(i,n+i)))
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Exercise9 obj = new Exercise9();
		String str1 = "abXYabc";
		String str2 = "abXYabc";
		String str3 = "abXYabc";
		System.out.println(obj.prefixAgain(str1, 1));
		System.out.println(obj.prefixAgain(str2, 2));
		System.out.println(obj.prefixAgain(str3, 3));
	}

}
