package coreJava;

import java.util.Scanner;

public class revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to find the largest of 2 numbers and 3 numbers;
//		String yn;
//		do {
//			Scanner s = new Scanner(System.in);
//			System.out.println("Enter the 1st number : ");
//			int n1 = s.nextInt();
//			System.out.println("Enter the 2nd number : ");
//			int n2 = s.nextInt();
//			System.out.println("Enter the 3rd number : ");
//			int n3 = s.nextInt();
//
//			if (n1 > n2 && n1 > n3) {
//				System.out.println(n1 + " is the greater number ");
//			} else if (n2 > n1 && n2 > n3) {
//				System.out.println(n2 + " is the greater number");
//			} else {
//				System.out.println(n3 + " is the greater number");
//			}
//			System.out.println("Press 'Y' if u want to continue the programming else click on 'N' : ");
//			yn = s.next().toUpperCase();
//		} while (yn.equals("Y"));

		// WAP to check the number is even or odd ?
//		String yn;
//		do
//		{
//			Scanner s=new Scanner(System.in);
//			System.out.println("Enter the number you want to check even or odd : ");
//			int n1 = s.nextInt();
//			if(n1%2==0)
//			{
//				System.out.println("The entered number that is : "+n1+" is even number");
//			}
//			else
//			{
//				System.out.println("The entered number that is : "+n1+" is odd number");
//			}
//			System.out.println("If you want to continue press 'Y' else click 'N' : ");
//			yn=s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAp to check the given year is leap or not ?
//		String yn;
//		do
//		{
//
//			// if the year is divided by 4
//			Scanner s= new Scanner(System.in);
//			System.out.println("Enter the year ehich you want to check the leap : ");
//			int year = s.nextInt();
//			boolean leap;
//		    if (year % 4 == 0) {
//
//		      // if the year is century
//		      if (year % 100 == 0) {
//
//		        // if year is divided by 400
//		        // then it is a leap year
//		        if (year % 400 == 0)
//		          leap = true;
//		        else
//		          leap = false;
//		      }
//		      
//		      // if the year is not century
//		      else
//		        leap = true;
//		    }
//		    
//		    else
//		      leap = false;
//
//		    if (leap)
//		      System.out.println(year + " is a leap year.");
//		    else
//		      System.out.println(year + " is not a leap year.");
//		    System.out.println("If you want to continue press 'Y' else press 'N' ");
//		    yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to create an calculator using switch statemenet ?
//		String yn;
//		do
//		{
//			Scanner s = new Scanner(System.in);
//			System.out.println("Enter the 1st number");
//			int n1=s.nextInt();
//			System.out.println("Enter the Symbol +, -, *, /, % ");
//			String sym=s.next();
//			System.out.println("Enter the 2nd number");
//			int n2=s.nextInt();
//			int res;
//			switch (sym)
//			{
//			case "+": res = n1+n2; System.out.println("addition of 2 given number is : "+res); break;
//			case "-": res = n1-n2; System.out.println("Substraction of 2 given number is : "+res); break;
//			case "/": res = n1/n2; System.out.println("Division of 2 given number is : "+res); break;
//			case "*": res = n1*n2; System.out.println("Multiplication of 2 given number is : "+res); break;
//			case "%": res = n1%n2; System.out.println("Modulus of 2 given number is : "+res); break;
//			default: System.out.println("provided symbol is not valid !! ");
//			}
//			System.out.println("If you want to continue press 'Y' else 'N'");
//			yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to swap the two numbers
//		String yn;
//		do
//		{
//			Scanner s = new Scanner(System.in);
//			System.out.println("Enter the value of a : ");
//			int a = s.nextInt();
//			System.out.println("Enter the value of b : ");
//			int b = s.nextInt();
//			int c;
//			c=a;
//			a=b;
//			b=c;
//			System.out.println("the value of a after swaping is : "+a);
//			System.out.println("the value of b after swaping is : "+b);
//			System.out.println("If you want to continue press 'Y' else 'N'");
//			yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to swap the two numbers without using 3rd variable ?
//		String yn;
//		do
//		{
//			Scanner s =new Scanner(System.in);
//			System.out.println("Enter the value of a : ");
//			int a = s.nextInt();
//			System.out.println("Enter the value of b : ");
//			int b = s.nextInt();
//			a=a+b;	//a=30
//			b=a-b;  //b=10
//			a=a-b;	//a=20
//			System.out.println();
//			System.out.println("the value of a after swaping is : "+a);
//			System.out.println("the value of b after swaping is : "+b);
//			System.out.println("If you want to continue press 'Y' else 'N'");
//			yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to for table of any given number
//		String yn;
//		do
//		{
//		Scanner s =new Scanner(System.in);
//		System.out.println("Enter the value of a : ");
//		int table, n = s.nextInt();
//		for (int i=1;i<=10;i++)
//		{
//			table = n*i;
//			System.out.println(n+"*"+i+"="+table);
//		}
//		System.out.println("If you want to continue press 'Y' else 'N'");
//		yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to for table of any given number using recurion
//		int n = 2, i=1;
//		Mutli_Table(n,i);

		// WAP to find the factorial of any number
//		String yn;
//		do
//		{
//		Scanner s =new Scanner(System.in);
//		System.out.println("Enter the value of n for which u want to know the factorial : ");
//		int n= s.nextInt();
//		int fact=1;
//		while (n>=1)
//		{
//			fact=fact*n;
//			n=n-1;
//		}
//		System.out.println(fact);
//		System.out.println("If you want to continue press 'Y' else 'N'");
//		yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to find the factorial of any number using recursion me
//		String yn;
//		do
//		{
//		revision2 rv = new revision2();
//		Scanner s =new Scanner(System.in);
//		System.out.println("Enter the value of n for which u want to know the factorial : ");
//		int n= s.nextInt();
//		int factorial = rv.Fact(n);
//		System.out.println("factorial for the given number is : "+factorial);
//		System.out.println("If you want to continue press 'Y' else 'N'");
//		yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to find the value of power of any number x^n with recurion method;
//		String yn;
//		do
//		{
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter the base value : ");
//		int x = s.nextInt();
//		System.out.println("enter the power value : ");
//		int n = s.nextInt();
//		revision2 rv = new revision2();
//		int powerResult = rv.power(x,n);
//		System.out.println(x+"^"+n+" = "+powerResult);
//		System.out.println("If you want to continue press 'Y' else 'N'");
//		yn = s.next().toUpperCase();
//		}while(yn.contains("Y"));

		// WAP to rever a given number
//		String yn;
//		do
//		{
//			Scanner s = new Scanner(System.in);
//			System.out.println("enter the number you want to reverse : ");
//			int n = s.nextInt(), rem, rev = 0;
//			int m = n;
//			while (n != 0) {
//				rem = n % 10;
//				rev = rev * 10 + rem;
//				n = n / 10;
//			}
//			System.out.println(m+" after revering the number "+rev);
//			System.out.println("If you want to continue press 'Y' else 'N'");
//			yn = s.next().toUpperCase();
//			}while(yn.contains("Y"));

		// WAP to reverse the given String
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the name which you want to reverse : ");
//		String name = s.next(), rev="";
//		int length = name.length();
//		for(int i=length-1;i>=0;i--)
//		{
//			//System.out.print(name.charAt(i));
//			rev = rev+name.charAt(i);
//		}
//		System.out.println(rev);

		// WAP to check the given number is prime or not
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number which you want to check prime : ");
//		int n=s.nextInt(), count=0;
//		for(int i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
//		if (count==0) {System.out.println("The given number that is "+n+" prime number!");}
//		else {System.out.println("The given number that is "+n+" not prime number!");}

		// WAP to print all the prime numbers btween 1 to 100;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the initial number : ");
//		int n1 = s.nextInt();
//		System.out.println("Enter the boundry number : ");
//		int n2 = s.nextInt();
//		for(int i=n1;i<=n2;i++)
//		{
//			int count=0;
//			for(int j=2;j<=i-1;j++)
//				if(i%j==0)
//				{
//					count++;
//				}
//			if(count==0) {System.out.print(i+", ");}
//		}

		// WAP to print fibonacci series
//		Scanner s = new Scanner(System.in);
//		int a=1,b=1;
//		System.out.println("Enter the boundry number : ");
//		int c;
//		long n=s.nextLong();
//		System.out.print("0,");
//		System.out.print(a+",");
//		System.out.print(b+",");
//		for(int i=2;i<n;i++)
//		{
//			c=a+b;
//			System.out.print(c+",");
//			a=b;
//			b=c;
//			c=0;
//		}

		// WAP to print fibonacci series using recursion method;
//		revision2 rv =  new revision2();
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the boundry number : ");
//		int n=s.nextInt();
//		for(int i=0;i<=n-1;i++)
//		{
//		long Fabonacci = rv.Fabo(i);
//		System.out.print(Fabonacci+",");
//		}

		// WAP to check the given number is paliandrome or not ?
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int n=s.nextInt(), rem, rev=0;
//		int m=n;
//		while (n != 0) 
//		{
//			rem = n % 10;
//			rev = rev * 10 + rem;
//			n = n / 10;
//		}
//		System.out.println(rev);
//		if (m==rev) {System.out.println("The given number is paliandrome");}
//		else {System.out.println("The given number is not paliandrome");}

		// WAP to check the given number is armstrong or not ?
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int n=s.nextInt();
//		int m=n,o=n, l = 0, total=0;
//		do
//		{
//			n=n/10;
//			l++;
//		}while (n!=0);
//		while (m != 0) 
//			{
//				int rem = m % 10;
//				int multi=1,i=1;
//				do
//				{
//					multi = multi*rem;
//					i++;
//				}while(i<=l);
//				total = total+multi;
//				m = m / 10;
//			}
//		System.out.println(total);
//		if(total==o) {System.out.println("the given number is armstrong");}
//		else {System.out.println("the given number is not armstrong");}

		// WAP program for * pattern
//		*
//		**
//		***
//		****
//		*****

//		for (int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//		*****
//		****
//		***
//		**
//		*
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//		*
//		**
//		***
//		****
//		*****		
//		****
//		***
//		**
//		*		

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//			*
//		   **
//		  ***
//		 ****
//		*****
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//		*****
//		 ****
//		  ***
//		   **
//		    *

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=5;k>=i;k--)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//			*
//		   **
//		  ***
//		 ****
//		*****
//		 ****
//		  ***
//		   **
//		    *

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=4;k>=i;k--)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//	       *
//	      * *
//	     * * *
//	    * * * *
//	   * * * * *

//		for(int i=1;i<=5;i++)
//		{
//			for(int k=4;k>=i;k--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//	       *
//	      ***
//	     *****
//	    *******
//	   *********	

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// OR

//		for(int i=1;i<=5;i++)
//			{
//				for(int k=4;k>=i;k--)
//				{
//					System.out.print(" ");
//				}
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print("*");
//				}
//				for(int l=2;l<=i;l++)
//				{
//					System.out.print("*");
//				}
//				System.out.println("");
//			}

		// WAP program for * pattern
//		   *********
//	        *******
//	         *****
//	          ***
//		       *

//		for(int i=5;i>=1;i--)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// OR

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=5;k>=i;k--)
//			{
//				System.out.print("*");
//			}
//			for(int l=4;l>=i;l--)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//		   *
//	        *
//	         *
//	          *
//		       *

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}

		// WAP program for * pattern
//	  			*
//	      	   *
//	          *
//	       	 *
//	        *

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}

		// WAP program for * pattern
//		   *       *
//	        *	  *
//	         *	 *
//	          *	*
//		       *

//		for(int i=5;i>=1;i--)
//		{
//			for(int j=5;j>i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				if(k>1 && k<(i*2)-1)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//		       *
//      	  *	*
//  	     *	 *
//		    *	  *
//		   *       *

//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				if(k>1 && k<(i*2)-1)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

		// WAP program for * pattern
//		   *       *
//	        *	  *
//	         *	 *
//	          *	*
//		       *
//			  *	*
//		     *	 *
//		    *	  *
//		   *       *

//		for(int i=5;i>=1;i--)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				if(k>1 && k<(i*2)-1)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
//		for(int i=2;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				if(k>1 && k<(i*2)-1)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		
		// WAP program for * pattern
//		   * * * * *
//	       *	   *
//	       *	   *
//	       *	   *
//		   * * * * *
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(j>1 && j<5)
//				{
//					System.out.print("  ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

		// WAP for number pattern
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		// WAP for number pattern
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		5 5 5 5 5
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println("");
//		}
		
		// WAP for number pattern
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		
//		int k=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println("");
//		}

		// WAP for number pattern
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1 

//		for(int i=5;i>=1;i--)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		// WAP for number pattern
//		1
//		2 1
//		3 2 1
//		4 3 2 1
//		5 4 3 2 1
		
//		for(int i=1;i<=5;i++)
//			{
//				for(int j=i;j>=1;j--)
//				{
//					System.out.print(j+" ");
//				}
//				System.out.println("");
//			}
		
		// WAP for number pattern
//		1
//		1 2 1 
//		1 2 3 2 1 
//		1 2 3 4 3 2 1
//		1 2 3 4 5 4 3 2 1
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			for(int k=i-1;k>=1;k--)
//			{
//				System.out.print(k+" ");
//			}
//			System.out.println("");
//		}
		
		// WAP for number pattern
//		5 4 3 2 1
//		5 4 3 2 
//		5 4 3 
//		5 4 
//		5 
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		// WAP for number pattern
//		1
//		2 6 
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15
		
//		for(int i=1;i<=5;i++)
//		{
//			int n=i;
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(n+" ");
//				n=n+5-j;
//			}
//			System.out.println("");
//		}
		
		// WAP program for number pattern
//		1 2 3 
//		6 5 4 
//		7 8 9 
//		12 11 10
//		13 14 15
		
//		int a=1;
//		for(int i=1;i<=5;i++)
//		{
//			if(i%2!=0)
//			{
//				for(int j=1;j<=3;j++)
//				{
//					System.out.print(a+" ");
//					a++;
//				}
//			}
//			else
//			{
//				int temp = a;
//				for(int j=a+2;j>=temp;j--)
//				{
//					System.out.print(j+" ");
//					a++;
//				}
//			}
//			System.out.println("");
//		}
		
		
		
		
		
	}

	private int Fabo(int i) {
		if (i == 0)
			return 0;
		else if (i == 1)
			return 1;
		else
			return Fabo(i - 1) + Fabo(i - 2);

	}

	private static int power(int x, int n) {
		if (n == 0)
			return 1;
		else
			return x * power(x, n - 1);

	}

	private static int Fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Fact(n - 1);
		}

	}

	private static void Mutli_Table(int n, int i) {
		// TODO Auto-generated method stub
		if (i > 10)
			return;
		System.out.println(n + "*" + i + "=" + n * i);
		Mutli_Table(n, i + 1);

	}

}
