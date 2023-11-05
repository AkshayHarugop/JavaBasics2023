package LogicalPrgm1;

public class demo4 {
	public static void main(String[] args) {
		//count the character in the string 
		/*
		 * name = "Akshay";
		 * count of string is 6
		 */
		String s = "Akshay Harugop is good Boy";
// with space
		System.out.println(s);
		System.out.println(s.length()); 
		System.out.println("=================");
// without space
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println("=================");
//count the words in a sentence
		String[] s2= s.split(" ");
		System.out.println(s2.length);
		
	}
}
