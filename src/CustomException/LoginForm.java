package CustomException;

import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the user Name : ");
		String name = s.next();
		System.out.println("Enter the Password : ");
		int Password = s.nextInt();
		if(name.equals("Admin")) {
			if(Password==123) {
				System.out.println("Login successful!!");
			}
			else {
				try {
					InvalidPasswordException IPE = new InvalidPasswordException();
					throw IPE;
				}
				catch(InvalidPasswordException IPE) {
					IPE.printStackTrace();
					System.out.println("Invalid Password!");
				}
				finally {
					System.out.println("Thank you for using login page");
				}
			}
		}
		else {
			if(name.equals("Admin")) {
				System.out.println("user name is correct ");
			}
			else {
				try {
					InvalidNameException INE = new InvalidNameException();
					throw INE;
				}
				catch(InvalidNameException INE) {
					INE.printStackTrace();
					System.out.println("Invalid Name!");
				}
				finally {
					System.out.println("Thank you for using login page");
				}
			}
		}
	}
}