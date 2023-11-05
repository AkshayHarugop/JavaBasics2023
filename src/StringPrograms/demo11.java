package StringPrograms;

import java.util.Arrays;

public class demo11 {
//Q. WAP to check the given string is anagram of another string
	// rules: EX:CAT and TAC; EX:Hello and eHoll
	// 1. Both String length should be same
	// 2. Case sensitive
	// logic sort both the String and compare
	public static void main(String[] args) {
		System.out.println(isAnagram("Cat","taC")?"Anagram":"Not Anagram");
		System.out.println(isAnagram("Cat","Cakt")?"Anagram":"Not Anagram");
	}

	public static boolean isAnagram(String n1, String n2) {
		char[] s1= n1.toCharArray();
		char[] s2= n2.toCharArray();
		if(s1.length!=s2.length) {
			return false;
		}
		else {
			Arrays.sort(s1);Arrays.sort(s2);
			for(int i=0;i<s1.length;i++) {
				if(s1[i]!=s2[i]) {
					return false;
				}
			}
		}
		return true;
	}
}