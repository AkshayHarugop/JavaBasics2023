package ExceptionHandling;

public class FinallyExample {

	public static void main(String[] args) {
		System.out.println("Start!");
		try{
			System.out.println(10/0);
		}
		catch(ClassCastException e){
			System.out.println("denominator can't be zero !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Entered to finally block !");
		}
		System.out.println("End");

	}

}
