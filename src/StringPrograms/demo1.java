package StringPrograms;

import java.util.StringJoiner;

public class demo1 {

	public static void main(String[] args) {
		String sentance = "Akshay_is_good_boy!!!";
		
		
		System.out.println(sentance.indexOf('z'));
		String newSentance = sentance.replace("_", " ");
		System.out.println(newSentance);
		
		
		StringBuilder s1 = new StringBuilder("Akshay");
		StringBuilder s2 = new StringBuilder(" Harugop");
		System.out.println(s1.append(s2));
		
		
		
		String s3 = "Xyz";
		String s4 = "Abc";
		String s5 = String.format("%s%s",s3, s4);
		System.out.println(s5.toString());
		
		System.out.println(s3+s4);
		
		String s = String.join("",s3,s4);   //String 3 to store the result  
        System.out.println(s.toString());  //Displays result  
        
        
        StringJoiner s6 = new StringJoiner(", ");   //StringeJoiner object  
        s6.add("Hello");    //String 1   
        s6.add("World");    //String 2  
        System.out.println(s6.toString());  //Displays result  

	}

}
