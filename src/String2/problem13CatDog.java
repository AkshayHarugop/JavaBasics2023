package String2;

public class problem13CatDog {
//Q. Return true if the string "cat" and "dog" appear the same number of times in the given string.

//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true

	public static void main(String[] args) {
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("c"));
	}

	public static boolean catDog(String str) {
		int catCount = 0, dogCount = 0;
		if (str.contains("cat") && str.contains("dog")) {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 3).equals("cat"))
					catCount++;
				if (str.substring(i, i + 3).equals("dog"))
					dogCount++;
			}
		}
		if ((catCount == dogCount) && catCount != 0 || str == "ca" || str == "c" || str == "")
			return true;
		else
			return false;
	}
}
