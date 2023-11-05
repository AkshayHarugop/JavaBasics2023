package JavaControlStatements.JumpStatements;

public class JavaContinueStatement {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==0 ||i==1 ||i==2 ||i==3) {
				System.out.println(i);
				continue;
			}
			else {
				break;
			}
		}
	}
}