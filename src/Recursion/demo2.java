package Recursion;

public class demo2 {
	public static void main(String[] args) {
		System.out.println(devideTwoNumCheckReminderPrime(10,24)?"prime reminder":"not prime reminder");
	}
	
	public static boolean devideTwoNumCheckReminderPrime(int num1,int num2) {
		int reminder=(num1>num2)?num1%num2:num2%num1;
		System.out.println("reminder : "+reminder);
		num1=0;
		for(num2=1;num2<=reminder;num2++) {
			if(reminder%num2==0) {
				num1++;
			}
		}
		System.out.println(num1);
		return (num1==2)?true:false;
	}
}