package codingbat;
//Q. When squirrels get together for a party, they like to have cigars. 

//A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
//Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
//Return true if the party with the given values is successful, or false otherwise.
//O/P : 
//cigarParty(30, false) → false		> methodName(int cigars,boolean is weekend) 
//cigarParty(50, false) → true
//cigarParty(70, true) → true

public class A1_cigarParty {

	public static void main(String[] args) {
		methods m = new methods();
		System.out.println(m.cigarParty(70, true));
	}

}