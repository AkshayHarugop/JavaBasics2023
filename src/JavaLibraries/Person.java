package JavaLibraries;

public class Person {
	@Override
	public String toString() {
		return "Hello";
		
	}
	
		public static void main(String[] args) {
			Person p = new Person();
			System.out.println(p);
			System.out.println(p.toString());
		}
}
