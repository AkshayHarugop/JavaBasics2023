package JavaLibraries;

public class Employe {

	private int id;
	private double height;

	public Employe(int id, double height) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		Employe e = (Employe) obj;
		return this.id == e.id && this.height == e.height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1 = new Employe(101, 5.8);
		Employe e2 = new Employe(101, 5.7);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println("***********");
		System.out.println(new Employe(1, 5.4));
		System.out.println(new Employe(1, 5.4).equals(new Employe(1, 5.4)));

	}

}
