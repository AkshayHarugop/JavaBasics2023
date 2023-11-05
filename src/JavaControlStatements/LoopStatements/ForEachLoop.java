package JavaControlStatements.LoopStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		int Arr[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i]+", ");
		}
		System.out.println("\n=====================");
		for(int i=Arr.length-1;i>=0;i--){
			System.out.print(Arr[i]+", ");
		}
		System.out.println("\n=====================");
		for (int i : Arr) {
			System.out.print(i+", ");
		}
		System.out.println("\n=====================");
	}
}