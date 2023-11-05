package StringPrograms;

public class demo9 {
//Q. WAP to convert snake case to camel case 
	// ex : "belagavi_is_beautiful_city"
	// ex : "Belagavi Is Beautiful City"
	// 1. Separate each word
	// 2.
	public static void main(String[] args) {
		String s = "belagavi_is_beautiful_city";
		System.out.println(snakeToCamelCase(s));
	}

	public static String snakeToCamelCase(String s) {
		String[] word = s.split("_");
		System.out.println(word.length);
		String UpStr = "";
		for (int i = 0; i < word.length; i++) {
			UpStr += (char) (word[i].charAt(0) - 32);
			UpStr += word[i].substring(1);
			if (i != word.length - 1) {
				UpStr += " ";
			}
		}
		return UpStr;
	}
}