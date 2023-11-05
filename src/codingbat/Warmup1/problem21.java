package codingbat.Warmup1;

public class problem21 {
//Q. Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
//	Otherwise, return the string unchanged.

//delDel("adelbc") → "abc"
//delDel("adelHello") → "aHello"
//delDel("adedbc") → "adedbc"

	public static void main(String[] args) {
		System.out.println(delDel("adelbc"));
		System.out.println(delDel("adelHello"));
		System.out.println(delDel("adedbc"));
		System.out.println(delDel("add"));
	}
	public static String delDel(String str) {
		if(str.length()>3) {
			if(str.substring(1, 4).equals("del")) {
				return str.substring(0, 1)+str.substring(4);
			}
		}
		  return str;
	}
}
