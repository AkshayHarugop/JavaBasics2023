package coreJava;

import java.util.Scanner;

public class Revision {
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int n= s.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int m= s.nextInt();
        System.out.println("Enter the symbol like + - * / % you want to perform : ");
        String sym= s.next();
    int o;
    // String sym;
    switch(sym)
    {
           case "+" : o=n+m; System.out.println("Addition of  are : "+o); break;
        //case "+" : o=n+m; System.out.println("Sum of given number is : "+o); break; 
        case "-" : o=n-m; System.out.println("Sub of given number is : "+o); break;
        case "*" : o=n*m; System.out.println("Multi of given number is : "+o); break;
        case "/" : o=n/m; System.out.println("div of given number is : "+o); break;
        case "%" : o=n%m; System.out.println("Modulus of given number is : "+o); break;
		
	}
  }
}
