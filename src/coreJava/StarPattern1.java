package coreJava;

public class StarPattern1 {

	public static void main(String[] args) {
//Q1.								logic	i	j
//		*									1	4
//		**									2	3
//		***									3	2
//		****								4	1
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		
//Q2.									logic	i	j
//			****								4	4
//			***									3	3
//			**									2	2
//			*									1	1
			for(int i=1;i<=4;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		
//Q3.									logic	i	j
//			*									1	4
//			**									2	3
//			***									3	2
//			****								4	1------
//			***									3	3
//			**									2	2
//			*									1	1
			for(int i=1;i<=4;i++)
			{
				for (int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			for(int i=1;i<=3;i++)
			{
				for(int j=3;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		
//Q4.									logic	i	j		Space logic	i	j
//				*								1	1					4	3
//			   **								2	2					3	2
//			  ***								3	3					2	1
//			 ****								4	4					1	0
			for(int i=1;i<=4;i++)
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
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		
//Q5.									logic	i	j		Space logic	i	j
//			 ****								4	4					1	0
//			  ***								3	3					2	1
//			   **								2	2					3	2			
//				*								1	1					4	3
			for(int i=1;i<=4;i++)
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
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		
//Q6.									logic	i	j		Space logic	i	j
//				*								1	1					4	3
//			   **								2	2					3	2
//			  ***								3	3					2	1
//			 ****								4	4					1	0---------------
//			  ***								3	3					2	1
//			   **								2	2					3	2			
//				*								1	1					4	3
			for(int i=1;i<=4;i++)
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
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		

//Q7.								logic	i	j		Space logic	i	j
//				*				*		same logic as applied in previous just add space
//			   * *			   **
//			  * * *		-> 	  ***
//			 * * * *		 **** 
//			* * * * *		*****
			
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		
			 
//Q8.								logic	i	j		Space logic	i	j
//			*				*		same logic as applied in previous just add space
//		   ***			   ** *
//		  *****		-> 	  *** **
//		 *******		 **** ***
//		*********		***** ****
			
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				for(int l=2;l<=i;l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		

//Q9.								logic	i	j		Space logic	i	j
//			*********		***** ****			same logic as applied in previous just add space
//			 *******		 **** ***
//			  *****		-> 	  *** **
//			   ***			   ** *	
//				*				*	
				
			for(int i=1;i<=5;i++)
			{
				for(int j=2;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int k=5;k>=i;k--)
				{
					System.out.print("*");
				}
				for(int l=4;l>=i;l--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
		

//Q10.								logic	i	j		Space logic	i	j
//			*				* 			same logic as applied in previous just add space		*****
//			 *		 		** 																	 ****
//			  *		-> 	  	*** 																  ***
//			   *			**** 																   ** 
//				*			*****																    *

			//1
			for(int i=1;i<=5;i++)
			{
				for(int j=2;j<=i;j++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");

			
			//2
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i ;j++)
				{
					if(i>=2 && j<=i-1)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");

			
//Q11.					2			logic	i	j		Space logic	i	j						1
//			*		 ***** 			same logic as applied in previous just add space			*
//		   *		 **** 																	   **
//	      *		-> 	 *** 																      ***
//	     *			 ** 																     **** 
//		*			 *																    	*****
			
			//1
			for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");

			
			
//Q12.								logic	i	j		Space logic	i	j						1
//			*		 ***** 			same logic as applied in previous just add space			*
//		   * *		 **** 																	   ***
//	      *	  *	-> 	 *** 																      *****
//	     *	   *	 ** 																     ******* 
//		*		*	 *																    	*********
			
			for(int i=0;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<(i*2);k++)
				{
					if(k>1 && k<(i*2)-1)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");

//Q13.								logic	i	j		Space logic	i	j						1
//		*	    *    *********  			same logic as applied in previous just add space        *
//		 *     *      ******* 																	   ***
//	      *	  *	-> 	   ***** 																      *****
//	       * *  	    *** 																     ******* 
//			*		     *																    	*********
			 
			for(int i=5;i>=1;i--)
			{
				for(int j=5;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<(i*2);k++)
				{
					if(k>1 && k<(i*2)-1)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println("");
			}
			
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
			
			
			
//Q14.							  			logic	i	j		Space logic	i	j						1
//			*****
//			*****			
//			*****
//			*****
//			*****
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");

//Q15.							  			logic	i	j		Space logic	i	j						1
//				*   *
//				 * *
//				  *
//				 * *
//				*   *
			
			
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(i==j || i+j==5-1) // doubt ....
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("");
			
			
//Q16.							  			logic	i	j		Space logic	i	j						1
//			****
//			*  *
//			*  *			
//			****
			
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=2 && j>=2 && i<=4 && j<=4	)
					System.out.print(" ");
				else {System.out.print("*");}
			}
			
			System.out.println("");
		}
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");
			
	}

}
