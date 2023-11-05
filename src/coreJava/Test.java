package coreJava;

import java.util.Scanner;

public class Test {
	static int fact = 1;

	public static void main(String[] args) {
		/*
		 * //1. Mulitplication of the tabel // o/p = 2*1=2..............2*10=20; String
		 * yn; do {
		 * 
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the number you want to list the table : "); int n =
		 * s.nextInt(), m; for (int i=1;i<=10;i++) { m=n*i;
		 * System.out.println(n+"*"+i+"="+m); }
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		// 2. Factorial of the number
		// o/p = 5!=120;
		/*
		 * String yn; do {
		 * 
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the number you want to know the factorial : "); int
		 * n = s.nextInt(), fact=1; int m=n; for (int i=1;i<=n;i++) { fact=fact*i; }
		 * System.out.println(m+"! ="+fact);
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		// 3. Factorial of the number
		// o/p = 5!=120;
		/*
		 * String yn; do {
		 * 
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the number you want to know the factorial : "); int
		 * n = s.nextInt(), fact=1; int m=n; for (int i=1;i<=n;i++) { fact=fact*i; }
		 * System.out.println(m+"! ="+fact);
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //4. Factorial of the number using recursion // o/p = 5!=120; String yn; do {
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the number you want to know the factorial : "); int
		 * n = s.nextInt(); int m=n; Test t = new Test(); t.fact(n);
		 * System.out.println(m+"! ="+fact); int fact = 1;
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //5. Reverse the given number // o/p = 321=123 String yn; do { Scanner s =
		 * new Scanner(System.in);
		 * System.out.println("Enter the number you want to reverse : "); int n =
		 * s.nextInt(), rev=0, rem; int m=n; while(n!=0) { rem=n%10; rev=rev*10+rem;
		 * n=n/10; } System.out.println(m+"="+rev);
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //6. Reverse the given String // o/p = Akshay=yahskA .length & .charAt(n)
		 * String yn; do { Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the name you want to reverse : "); String name =
		 * s.next(); int n = name.length(), rev=0; for(int i=n-1;i>=0;i--) { char c =
		 * name.charAt(i); System.out.print(c); } System.out.println("");
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //7. WAP check the number is prime or not // o/p = 7 is the prime number //
		 * prime number is the one which is div by 1 and itself (2to6) String yn; do {
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the name you want to reverse : "); int n =
		 * s.nextInt(); int m=n, mod, count=0; for(int i=2;i<n-1;i++) { mod=n%i;
		 * if(mod==0) {count++;} } if (count==0)
		 * {System.out.println(m+" is prime number");} else
		 * {System.out.println(m+" is not the prime number");}
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //8. WAP to print all the prime number between 1-100; // for loop for number
		 * between 1 to 100; // o/p = 7 is the prime number // prime number is the one
		 * which is div by 1 and itself (2to6) String yn; do { Scanner s = new
		 * Scanner(System.in);
		 * System.out.println("Enter the range for prime number you want to select : ");
		 * int a = s.nextInt(); int b = s.nextInt(); for (int j=a;j<=b;j++) { int
		 * count=0; int mod; for(int i=2;i<j-1;i++) { mod=j%i; if(mod==0) {count++;} }
		 * if (count==0) {System.out.print(j+", ");} //else
		 * {System.out.println(j+" is not the prime number");} } System.out.println("");
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //9. WAP to print Fibonacci series for n number; // series will starts with
		 * 1, 1, 2, 3, 5, 8.... etc a=1,b=1,c=a+b;.....swapping the number ; // o/p = 1,
		 * 1, 2, 3, 5, 8.... String yn; do { Scanner s = new Scanner(System.in);
		 * System.out.
		 * println("Enter the range for Fibonacci series you want to select : "); int n
		 * = s.nextInt(); int m=n; int a=1, b=1, c; System.out.print(a+", "+b+", "); for
		 * (int i=0; i<=m-3; i++) { c=a+b; System.out.print(c+", "); a=b;b=c; }
		 * System.out.println("");
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //10. WAP to print Fibonacci series for n number using recursion method; //
		 * series will starts with 1, 1, 2, 3, 5, 8.... etc a=1,b=1,c=a+b;.....swapping
		 * the number ; // o/p = 1, 1, 2, 3, 5, 8.... String yn; do { Scanner s = new
		 * Scanner(System.in); System.out.
		 * println("Enter the range for Fibonacci series you want to select : "); int n
		 * = s.nextInt(); int m=n; int a=1, b=1; System.out.print(a+", "+b+", "); Test t
		 * = new Test(); t.FaboRecursion(a,b,m); System.out.println("");
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //11. WAP to check for palindrome number; // The number which we reverse we
		 * get same number is called palindrome number ; // logic : 1.store the given
		 * number; 2. rev the number; // o/p = 12321 == 12321 String yn; do { Scanner s
		 * = new Scanner(System.in); System.out.
		 * println("Enter the number to check the number is palindrome number : "); int
		 * n = s.nextInt(); int no = n, mod, rev=0; while(no!=0) { mod=no%10;
		 * rev=rev*10+mod; no=no/10; }
		 * System.out.println(n+" after revering becomes : "+rev); if(n==rev)
		 * {System.out.println("The given number is palindrome");} else
		 * {System.out.println("The given number is not palindrome");}
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */

		/*
		 * //12. WAP to check for Armstrong number; // Armstrong Number =
		 * 153=1^3+5^3+3^3 // logic : 1. find lenght of the number and iterate 0 to n+1
		 * ; // 2. // o/p = 153 is armstrong number; String yn; do { Scanner s = new
		 * Scanner(System.in); System.out.
		 * println("Enter the number for which you want to check the Armsstrong : ");
		 * int n = s.nextInt(); int m=n, div, length=0, l=n, add=0, rem; while (m!=0) {
		 * length++; m=m/10; } //System.out.println(length); while(l!=0) { rem=l%10; int
		 * multi=1; //imp for (int i=1;i<=length;i++) {
		 * multi=multi*rem;//1*3=3;3*3=9;9*3=27;//1*5=5;5*5=25;25*5=125//1*1=1;1 }
		 * add=add+multi;//27//27+125=152//152+1=153 l=l/10;//15//1 }
		 * //System.out.println(add);
		 * System.out.println(n+" after Armstrong becomes : "+add); if(n==add)
		 * {System.out.println("The given number is Armstrong");} else
		 * {System.out.println("The given number is not Armstrong");}
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * System.out.println("If you want to continue click on 'Y' else click on 'N'");
		 * yn=s.next().toUpperCase(); }while(yn.equals("Y"));
		 */
		
		
		//Q1.								logic	i	j
//		*									1	4
//		**									2	3
//		***									3	2
//		****								4	1
		/*
		 * //Q1. logic i j // * 1 4 // ** 2 3 // *** 3 2 // **** 4 1 String yn; do {
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the number of star : "); int n = s.nextInt();
		 * for(int i=1;i<=n;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 * System.out.println("If you want to conitnue click on 'Y' else 'N'"); yn =
		 * s.next().toUpperCase(); }while(yn.equals("Y"));
		 */
		

		// Q2. logic i j
//		****								4	4
//		***									3	3
//		**									2	2
//		*									1	1
		/*String yn;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number of star : ");
			int n = s.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = n; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("If you want to conitnue click on 'Y' else 'N'");
			yn = s.next().toUpperCase();
		} while (yn.equals("Y"));*/
		
		
		
		//Q3.									logic	i	j
//		*									1	4
//		**									2	3
//		***									3	2
//		****								4	1------
//		***									3	3
//		**									2	2
//		*									1	1
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		

		//Q4.									logic	i	j		Space logic	i	j
//		*								1	1					4	3
//	   **								2	2					3	2
//	  ***								3	3					2	1
//	 ****								4	4					1	0
		/*for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		//Q5.									logic	i	j		Space logic	i	j
//		 ****								4	4					1	0
//		  ***								3	3					2	1
//		   **								2	2					3	2			
//			*								1	1					4	3
		/*for(int i=1;i<=4;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		//Q6.									logic	i	j		Space logic	i	j
//		*								1	1					4	3
//	   **								2	2					3	2
//	  ***								3	3					2	1
//	 ****								4	4					1	0---------------
//	  ***								3	3					2	1
//	   **								2	2					3	2			
//		*								1	1					4	3
		/*for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Birthday List and date 
//	
//		VUTUKURU Krishnakanth <Krishnakanth.VUTUKURU@3ds.com>  				28 july
//		ADATE Avinash <Avinash.ADATE@3ds.com> 								27 july
//		Swati PAWAR															24 july   *** 
//		JOSHI Amey <Amey.JOSHI@3ds.com>										12 july
//		Suchismita PRUSTY													9 july
//		Sonal ANASKURE														10 July
//		Prachi MORE															8 july    ***
//		Madhuri SHELAR														1 july	  ***
//		
//		MEESHI Mahesh <Mahesh.MEESHI@3ds.com>								22 july
//		Dinesh V NAIK														4 july

	}

	private void FaboRecursion(int a, int b, int m) {
		int c;
		for (int i = 0; i <= m - 3; i++) {
			c = a + b;
			System.out.print(c + ", ");
			a = b;
			b = c;
		}
	}

	private int fact(int n) {
		while (n >= 1) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;

	}

}
