package codingbat.Warmup2;

public class problem13AltPairs {
//Q. Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

//altPairs("kitten") → "kien"
//altPairs("Chocolate") → "Chole"
//altPairs("CodingHorror") → "Congrr" 

	public static void main(String[] args) {
		System.out.println(altPairs("kitten"));
		System.out.println(altPairs("Chocolate"));
		System.out.println(altPairs("CodingHorror"));
		System.out.println(altPairs("ThisThatTheOther"));
	}

	public static String altPairs(String str) {
		String temp = "";
		int j = 0, k = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || i == (4 + j)) {
				temp = temp + str.charAt(i);
				j = i;
			} else if (i == 1 || i == (4 + k)) {
				temp = temp + str.charAt(i);
				k = i;
			}
		}
		return temp;
	}
}
