package SingleTonClass;

public class Account {
	private static Account a = null;

	private Account() {
		System.out.println("Object creation Successful!!");
	}

	public static void CreateObject() {
		if (a == null) {
			a = new Account();
		} else {
			System.out.println("Object creation not possible!");
		}
	}
}
