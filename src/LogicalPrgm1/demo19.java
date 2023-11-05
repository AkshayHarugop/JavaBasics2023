package LogicalPrgm1;
public class demo19 {

	public static void main(String[] args) {
//Q. write a number to check it armstrong number or not
	/*
	 * A number is thought of as an Armstrong number if the sum of its own digits raised to the power number 
	 * of digits gives the number itself. 
	 * ex : 9474 = 9^4+4^4+7^4+4^4 = 6561+256+2401+256 = 9474	
	 * ex : 153 = 1^3+5^3+3^3 = 153 
	 * ex : 1634......etc
	 */
//My logic
		/*
		 * 1. n=153 : find how many digits are there in the number and store it in root variable.
		 * Take each digit out from the number by n%10 and multiply the same number for 'root' number variable times
		 * and store that to one variable 
		 * and sum all and display the result
		 */
		
		int n=9474,m=n,o=n,root=0,digit,result,sum=0;
		while(n!=0) {
			root++;
			n=n/10;
		}
		//root =3
		while(m!=0) {
			result=1;
			digit=m%10; //digit=3
			for(int i=1;i<=root;i++) {
				result=result*digit;
			}
			m=m/10;
			sum=sum+result;
		}
		if(sum==o) {
			System.out.println("The given number "+o+" is Armstrong number");
		}
		else {
			System.out.println("The given number "+o+" is not Armstrong number");
		}
	}

}
