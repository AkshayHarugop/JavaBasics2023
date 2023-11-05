package JavaControlStatements.JumpStatements;

public class JavaBreakStatement {

	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 6) {
//				break;
//			}
//		}

		
		
		
		
		
		a: for (int i = 0; i <= 10; i++) {
			b: for (int j = 0; j <= 15; j++) {
				c: for (int k = 0; k <= 20; k++) {
					System.out.println(k);
					if (k == 5) {
						break a;
					}
				}
			}
		}
	}
}
