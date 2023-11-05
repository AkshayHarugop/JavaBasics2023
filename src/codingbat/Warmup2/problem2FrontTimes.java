package codingbat.Warmup2;

public class problem2FrontTimes {
//Q. Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
//	or whatever is there if the string is less than length 3. Return n copies of the front;

//frontTimes("Chocolate", 2) → "ChoCho"
//frontTimes("Chocolate", 3) → "ChoChoCho"
//frontTimes("Abc", 3) → "AbcAbcAbc"

	public static void main(String[] args) {
		System.out.println(frontTimes("Chocolate", 2));
		System.out.println(frontTimes("Chocolate", 3));
		System.out.println(frontTimes("Abc", 3));
	}

	public static String frontTimes(String str, int n) {
		if(str.length()>3) {
			str = str.substring(0, 3);
		}
		String temp="";
		for(int i=0;i<n;i++) {
			temp=temp+str;
		}
		return temp;
	}
}
