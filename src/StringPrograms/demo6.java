package StringPrograms;

public class demo6 {
//Q. WAP to reverse a string 
	//EX : s="Akshay"
	//O/P : s="yahskA"
	public static String reverseString(String s) {
		String word ="";
		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
			word = word+s.charAt(i);
		}
		return word;
	}
	public static void main(String[] args) {
		String s = "Akshay Harugop";
		System.out.println(s);
		System.out.println(demo6.reverseString(s));
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
	}

}
