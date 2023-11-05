package codingbat.Warmup1;

public class problem29 {
//Q. Given a string, return a new string where the last 3 chars are now in upper case. 
//	If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

//endUp("Hello") → "HeLLO"
//endUp("hi there") → "hi thERE"
//endUp("hi") → "HI"
	
	public static void main(String[] args) {
		System.out.println(endUp("Hello"));
		System.out.println(endUp("hi there"));
		System.out.println(endUp("hi"));
	}
	public static String endUp(String str) {
		String temp="";
		if(str.length()>3) {
			for(int i=0;i<str.length();i++) {
				if(i==str.length()-1||i==str.length()-2||i==str.length()-3) {
					temp=temp+str.toUpperCase().charAt(i);
				}else {
				temp=temp+str.charAt(i);
				}
			}
			return temp;
		}
		else {
			return str.toUpperCase();
		}
	}
}
