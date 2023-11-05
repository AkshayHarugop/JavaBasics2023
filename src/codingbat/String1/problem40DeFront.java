package codingbat.String1;

public class problem40DeFront {
//Q. Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
//	The string may be any length. Harder than it looks.

//deFront("Hello") → "llo"
//deFront("java") → "va"
//deFront("away") → "aay"
	
	public static void main(String[] args) {
		System.out.println(deFront("Hello"));
		System.out.println(deFront("java"));
		System.out.println(deFront("away"));
	}
	public static String deFront(String str) {
		if(str.substring(0, 1).equals("a")&&str.substring(1,2).equals("b")) {
			return str.substring(0);
		}
		else if(str.substring(0, 1).equals("a")) {
			return str.substring(0, 1)+str.substring(2);
		}
		else if(str.substring(1,2).equals("b")) {
			return str.substring(1);
		}else {
		  return str.substring(2);
		}
	}
}