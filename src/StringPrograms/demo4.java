package StringPrograms;

public class demo4 {
//Q. WAP to find the vowels in a string 
	public static void main(String[] args) {
		String s = "BCDFGAEIOU";
		String s1 = s.toUpperCase();
		char[] c = s1.toCharArray();
		int VowelCount=0,ConsonentCount=0;
		for(char i:c) {
			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
				VowelCount++;System.out.print(i+",");}
			else
				ConsonentCount++;
		}
		System.out.println("Vowel Count in a given array : "+VowelCount);
		System.out.println("Consonent Count in a given array : "+ConsonentCount);
		System.out.println("\n===========\n");
		
		for(int i=0;i<s1.length();i++) {
			char a = s1.charAt(i);
			if(!(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')) {
				System.out.print(a+",");
			}
		}
		
	}
}