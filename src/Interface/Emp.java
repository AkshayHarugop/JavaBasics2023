package Interface;
public class Emp implements Person {

	public static void main(String[] args) {
		System.out.println(Person.name);
		Emp e = new Emp();
		e.eat();
	}

	@Override
	public void eat() {
		System.out.println("Eating!!");		
	}

}
