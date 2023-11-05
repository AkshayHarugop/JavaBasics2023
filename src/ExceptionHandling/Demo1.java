package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// NullPointerException
		String a = null, b = "Abc";
		try {
			System.out.println(a.length());
		} catch (NullPointerException e) {
			System.out.println(e);
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("Entered to finally  block of NullPointerException!!");
		}

		System.out.println("===============");
		// NumberFormatException
		try {
			Integer.parseInt(b);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Entered to finally  block of NullPointerException!!");
		}

		System.out.println("===============");
		// ArrayIndexOutOfBoundsException
		int[] c = new int[5];
		try {
			System.out.println(c[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Entered to finally  block of ArrayIndexOutOfBoundsException!!");
		}

		System.out.println("===============");
		// FileNotFoundException
		PrintWriter pw;
		try {
			pw = new PrintWriter("jtp.txt"); // may throw exception
			pw.println("saved");
		}
		// providing the checked exception handler  
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");

		System.out.println("===============");
		try{    
		    int d[]=new int[5];    
		    d[5]=30/0;    
		   }    
		   catch(ArithmeticException e){
			   System.out.println("task1 is completed");
		   }catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("task 2 completed");
		   }catch(Exception e){
			   System.out.println("common task completed");
		   }    
		   System.out.println("rest of the code..."); 
	}

}
