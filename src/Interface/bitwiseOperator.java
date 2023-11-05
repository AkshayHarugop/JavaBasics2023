package Interface;
public class bitwiseOperator {

	public static void main(String[] args) {
		//Bitwise And (&)
		int a=2,b=3;//0010&0011=0010=2
		int c= a&b;
		System.out.println(c);
		
		//Bitwise Or(|)
		//0010|0011=0011=3
		System.out.println(a|b);
		
		//Bitwise XOR(^)
		//10^11=01
		System.out.println(a^b);
		
		//Bitwise complement(~)
		System.out.println(~10);
		
		
		//Bitwise Right shift operator(>>)
//		b=13>>2;
		//1010>>2=10=2
		//1001>>2=10=2
		//111>>2=1=1
		//111>>1=11=3
		//111>>0=11=7
		//1101>>110==111=7
		int x=-13;
		System.out.println(Integer.toBinaryString(x));
		int y=x>>2;
		System.out.println(Integer.toBinaryString(y));
		System.out.println(y);
		
		//Bitwise left shift operator(<<)
		b=-7<<3;
		//111<<0=11=7
		//111<<1=1110=14
		//111<<2=11100=28
		//111<<3=111000=56
//		System.out.println(b);
		int r=-13;
		System.out.println(Integer.toBinaryString(r));
		int s=r<<2;
		System.out.println(Integer.toBinaryString(s));
		System.out.println(s);
		
		//Bitwise Unsigned right shift operator
		b=240>>>2;
		System.out.println(b);
		int p=-13;
		System.out.println(Integer.toBinaryString(p));
		int q=p>>>2;
		System.out.println(Integer.toBinaryString(q));
		System.out.println(q);
		
	}

}
