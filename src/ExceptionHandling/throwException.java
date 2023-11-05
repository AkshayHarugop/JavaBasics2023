package ExceptionHandling;

public class throwException {

	public static void main(String[] args) {
		validate(13);  
        System.out.println("rest of the code...");    
	}
	public static void validate(int age) {  
        if(age<18) {  
        	ArrayIndexOutOfBoundsException AEX1 = new ArrayIndexOutOfBoundsException("Person is not eligible to vote");
        	ArithmeticException AEX = new ArithmeticException("Person is not eligible to vote!!`");
        	throw AEX1;   
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  

}
