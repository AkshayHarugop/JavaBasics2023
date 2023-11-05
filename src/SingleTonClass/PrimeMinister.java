package SingleTonClass;

public class PrimeMinister {
	String name="Modi";
	private static PrimeMinister PM=null;
	
	private PrimeMinister(){
		System.out.println("PM got elected");
	}
	
	public static PrimeMinister CreteAndReturnPMObject(){
		if(PM==null) {
			PM=new PrimeMinister();
		}
//		else {
//			System.out.println("PM yet to elect");
//		}
		return PM;
	}

}
