package TestPackage;

public class A1 {

	public static void main(String[] args) {
		char x = 'b';
		if(Character.isAlphabetic(x))
		{
			/*if(x>='A' && x<='Z')
				{
					System.out.println(x+" is upper case character");
					if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
						System.out.println(x+" is the vowel");
					else
						System.out.println(x+" is the consonant");
				}
			
			else
				{
					System.out.println(x+" is lower case character");
					if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
						System.out.println(x+" is the vowel");
					else
						System.out.println(x+" is the consonant");
				}*/
			
			/*if(x>='A' && x<='Z')
			{
				x = Character.toLowerCase(x);
			}
			
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
				System.out.println(x+" is the vowel");
			else
				System.out.println(x+" is the consonant");
			*/
			
			if(x>='a' && x<='z')
			{
				x = Character.toUpperCase(x);
			}
			
			if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
				System.out.println(x+" is the vowel");
			else
				System.out.println(x+" is the consonant");
			
		}
		else if (Character.isDigit(x))
		{
			if(x%2==0)
				System.out.println(x+" is even number");
			else
				System.out.println(x+" is odd number");
		}
		else
			System.out.println(x+" is special character");
		
		System.out.println("done");

	}

}
