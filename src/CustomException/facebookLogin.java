package CustomException;

import java.util.Scanner;

public class facebookLogin {

	public static void main(String[] args) {
		String Data= "Admin";
		System.out.println("Welcome to facebook!!");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the User name : ");
		String UserId = s.next();
		System.out.print("Enter the Password : ");
		String Password = s.next();
		if(UserId.equals(Data)) {
			if(Password.equals(Data)) {
				System.out.println("Login Successful!!");
			}else {
				try{
					FacebookUserIdException FUE = new FacebookUserIdException();
					throw FUE;
				}catch(FacebookUserIdException FUE){
					System.out.println("Invalid Password!!");
					FUE.printStackTrace();
				}finally {
					System.out.println("Try again later");
				}
			}
		}else {
			try{
				FacebookPasswordException FPE = new FacebookPasswordException();
				throw FPE;
			}catch(FacebookPasswordException FPE){
				System.out.println("Invalid Username!!");
				FPE.printStackTrace();
			}finally {
				System.out.println("Try again later");
			}
		}
	}

}
