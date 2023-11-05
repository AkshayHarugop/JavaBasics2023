package StringPrograms;

public class demo5 {
//Q. WAP to convert lower case to upper case and upper case to lower case from the string
	// EX : s="BelaGavi"
	// O/P : s="bELAgAVI"
	public static void main(String[] args) {
		String s = "BeLaGaVi";
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] >= 'A' && s1[i] <= 'Z') {
				s1[i]=(char) (s1[i]+32);
			}
			else if(s1[i] >= 'a' && s1[i] <= 'z') {
				s1[i]=(char) (s1[i]-32);
			}
		}
		System.out.println(s1);
	}

}
