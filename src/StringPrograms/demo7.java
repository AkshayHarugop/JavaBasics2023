package StringPrograms;

public class demo7 {
//Q. WAP to check the string is paliandrome or not?
	public static void main(String[] args) {
		System.out.println(Palindrome("MalayalaM")?"Paliandrome":"Not a Paliandrome"); 
//		System.out.println(Palindrome("GadaG"));
	}

	public static boolean Palindrome(String s) {
		String word="";
		for(int i=s.length()-1;i>=0;i--) {
			word=word+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(word);
		if(s.equals(word))
			return true;
		else
			return false;
	}

}
