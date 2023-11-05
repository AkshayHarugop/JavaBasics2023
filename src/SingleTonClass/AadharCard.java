package SingleTonClass;

public class AadharCard {
	static AadharCard AC = null;

	AadharCard() {
		System.out.println("New Aadhar card got created");
	}

	public static void CreateAadharCardObject() {
		if (AC == null) {
			AC = new AadharCard();
		} else {
			System.out.println("Can't create new Aadhar card!!");
		}
	}
}
