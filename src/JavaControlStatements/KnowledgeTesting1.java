package JavaControlStatements;

public class KnowledgeTesting1 {

	public static void main(String[] args) {
			float x = 32.45f;
			if(32.45==x)
				System.out.println("Hello");
			System.out.println("Hi");
			
			System.out.println("============");
			
			char c= '2';
			if(c<=2) {
				System.out.println("Hi Mav");
			}
			else {
				System.out.println("Bye Mav");
			}
			System.out.println("Rest of the program!!");
			
			
			
			System.out.println("============");
			int y = 68;
			for(;y<='N';y++) {
				System.out.println((char)y);
				if(y>='L')
					continue;
			}
			
			
			System.out.println("============");
			int z = 68;
			for(;z<='N';z++) {
				if(z>='L')
					continue;
				System.out.println((char)z);
			}
			
			
			System.out.println("============");
			int v=18;
			
			do {
				v>>=1;
				System.out.println(v);
				if(v<=0)
					break;
			}while(true);
			
			
	}

}
