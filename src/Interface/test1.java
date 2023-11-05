package Interface;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		String s = new String("Akshay!");
		String s1 = new String("Akshay!");
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s.equals(s1));
		
		
		
		int a =10;
		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		//Akshay is good boy!
		System.out.println("Enter the string2 : ");
		String string2= sc.nextLine();
		System.out.println("Enter the string1 : ");
		String string1= sc.next();
		
		
		
		System.out.println("1st String is : "+string1);//Akshay
		System.out.println("2st String is : "+string2);//Akshay is good boy!
	}

}
