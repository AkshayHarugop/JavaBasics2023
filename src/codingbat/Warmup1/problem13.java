package codingbat.Warmup1;

public class problem13 {
//Q. Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
//	The original string will be length 1 or more.

//backAround("cat") → "tcatt"
//backAround("Hello") → "oHelloo"
//backAround("a") → "aaa"
	
	public static void main(String[] args) {
		System.out.println(backAround(""));
	}
	
	public static String backAround(String str) {
		if(str.length()>=1) {
			String lastChar = str.substring(str.length()-1);
			
		return lastChar+str+lastChar;	
		}
		else {
			return "not valid charecter or word !!";
		}
		

	}

}
