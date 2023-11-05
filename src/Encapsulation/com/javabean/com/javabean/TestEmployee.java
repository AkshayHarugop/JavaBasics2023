package Encapsulation.com.javabean.com.javabean;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Akshay");
		e.setId(101);
		System.out.println(e.getId()+" "+e.getName());
		System.out.println("");
	}
}