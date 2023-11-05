package codingbat.Warmup1;

public class problem16 {
//Q. Given a string, return true if the string starts with "hi" and false otherwise.

//startHi("hi there") → true
//startHi("hi") → true
//startHi("hello hi") → false
	
	public static void main(String[] args) {
		System.out.println(startHi("hi"));
	}
	public static  boolean startHi(String str) {
		if(str.startsWith("hi")) {
			return true;
		}
		
		  return false;
	}

}
