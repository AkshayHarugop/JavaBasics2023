package StringPrograms;

public class demo10 {
//Q. WAP to convert camel case to snake case.
	// ex : "Belagavi Is Beautiful City" 
	//O/P : "belagavi_is_beautiful_city"
	public static void main(String[] args) {
		String s = "Belagavi Is Beautiful City";
		String[] word = s.split(" ");
		String UpStr="";
		for(int i=0;i<word.length;i++) {
			UpStr+=(char)(word[i].charAt(0)+32);
			UpStr+=word[i].substring(1);
			if(i!=word.length-1) {
				UpStr+="_";
			}
		}
		System.out.println(UpStr);
	}
}