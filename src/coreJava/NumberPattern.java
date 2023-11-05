package coreJava;

public class NumberPattern {

	public static void main(String[] args) {

//Q1.							  			logic	i	j		Space logic	i	j						1

//		1
//		12
//		123
//		1234
//		12345

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q2.							  			logic	i	j		Space logic	i	j						1

//	1
//	22
//	333
//	4444
//	55555

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q3.							  			logic	i	j		Space logic	i	j						1

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				count = count + 1;
				System.out.print(count + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q4.							  			logic	i	j		Space logic	i	j						1

		// 1
		// 2 1
		// 3 2 1
		// 4 3 2 1
		// 5 4 3 2 1

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q5.							  			logic	i	j		Space logic	i	j						1

		// 1 1
		// 1 2 1 1 2 1
		// 1 2 3 2 1 -> 1 2 3 -> 2 1
		// 1 2 3 4 3 2 1 1 2 3 4 3 2 1
		// 1 2 3 4 5 4 3 2 1 1 2 3 4 5 4 3 2 1

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q6.						  			logic	i	j		Space logic	i	j						1

//			5 4 3 2 1					*****
//			5 4 3 2						****
//			5 4 3			->   		***
//			5 4							**
//			5							*

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q7.						  			logic	i	j		Space logic	i	j						1

//		1 							*
//		2 6  						**
//		3 7 10			->   		***
//		4 8	11 13					****
//		5 9	12 14 15				*****

		for (int i = 1; i <= 5; i++) {
			int n = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(n + " ");
				n = n + 5 - j;
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");

//Q8.						  			logic	i	j		Space logic	i	j						1

//		1 2 3						***
//		6 5 4						***
//		7 8 9			->   		***
//		12 11 10					***
//		13 14 15				    ***
					int count1=0;
					for(int i=1;i<=5;i++)
					{
						if(i%2!=0)
						{
							for(int j=1;j<=3;j++)
						    {
								count1++;
								System.out.print(count1+" ");
							}
						}
						else
						{
							int temp = count1+1;
							for(int j=count1+3;j>=temp;j--)
						    {
								count1++;
								System.out.print(j+" ");
							}
						}
						
						System.out.println("");
					}
						
					
					System.out.println("");
					System.out.println("---------------------------------------");
					System.out.println("");
    }

}
