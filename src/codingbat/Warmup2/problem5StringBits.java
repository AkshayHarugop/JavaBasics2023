package codingbat.Warmup2;

public class problem5StringBits {
//Q. Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

//stringBits("Hello") → "Hlo"
//stringBits("Hi") → "H"
//stringBits("Heeololeo") → "Hello"

	public static void main(String[] args) {
		System.out.println(stringBits("Hello"));
		System.out.println(stringBits("Hi"));
		System.out.println(stringBits("Heeololeo"));
	}

	public static String stringBits(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i += 2) {
			temp = temp + str.substring(i, i + 1);
		}
		return temp;
	}
}
