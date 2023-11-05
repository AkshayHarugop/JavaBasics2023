package ExceptionHandling;

import java.util.Scanner;

public class Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i=0;
		int j=i;
		j=i++ + j++;
 		System.out.println(i+","+j);
		
		
		System.out.println("Start");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = scan.nextInt();
		if(a==0) {
			try {
				NominatorZeroException NZE =  new NominatorZeroException();
				throw NZE;
//				extracted(NZE);
			}
			catch(NominatorZeroException NZE) {
				NZE.getMessage();
				NZE.printStackTrace();
				System.out.println("Nominator can not be zero !!");
				System.exit(0);
			}
		}
		System.out.print("Enter the value of b : ");
		int b = scan.nextInt();
		
		
		
		
		try {
			System.out.println("Division result is equal to :" + a / b);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("falling under the ArrayIndexOutOfBounds exception : denominator can't be zero!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("falling under the NullPointer exception : denominator can't be zero!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		finally {
			System.out.println("Falling under the finally block !!");
		}

		System.out.println("End");

		scan.close();
	}

	
}
