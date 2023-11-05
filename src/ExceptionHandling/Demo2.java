package ExceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Denominator can't be zero!!");
		}catch (Exception e) {
			System.out.println("!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("We are into finally block");
		}
		System.out.println("Done");
	}

}
