package codingbat.Logic2;

public class problem14Blackjack {
//Q. Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

//blackjack(19, 21) → 21
//blackjack(21, 19) → 21
//blackjack(19, 22) → 19
//blackjack(22, 19) → 19
//blackjack(33, 1) → 1	

	public static void main(String[] args) {
//		System.out.println(blackjack(19, 21));
//		System.out.println(blackjack(21, 19));
//		System.out.println(blackjack(19, 22));
		System.out.println(blackjack(22, 19));
		System.out.println(blackjack(33, 1));
	}

	public static int blackjack(int a, int b) {
		if(a>21&&b>21) {
			return 0;
		}else if(a<21) {
			if(b<=21) {
				return (Math.abs(a-21)<Math.abs(b-21))?a:b;
			}
			else {
				return a;
			}
		}else if(a>=21) {
			if(a==21&&b<21) {
				return a;
			}else if(a>21&&b<=21) {
				return b;
			}
		}
		return a;
	}
}
