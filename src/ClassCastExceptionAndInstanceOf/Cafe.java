package ClassCastExceptionAndInstanceOf;
public class Cafe {
	Bevarage VendingMachine(int choice) {
		if (choice == 1) {
				Coffee c = new Coffee();
				return c;
		}
		else if(choice==2) {
			Tea t = new Tea();
			return t;
		}
		return null;
	}
}
