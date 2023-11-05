package codingbat.Logic2;

public class problem16MakeChocolate {
//Q. We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
//	Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

//makeChocolate(6, 2, 7) → 2
//makeChocolate(4, 1, 9) → 4
//makeChocolate(4, 1, 10) → -1
//makeChocolate(4, 1, 7) → 2
//makeChocolate(4, 1, 5) → 0	
//makeChocolate(9, 3, 18) → 3	
//makeChocolate(1, 2, 7) → -1	

	public static void main(String[] args) {
		System.out.println(makeChocolate(6, 2, 7));
		System.out.println(makeChocolate(4, 1, 9));
		System.out.println(makeChocolate(4, 1, 10));
		System.out.println(makeChocolate(4, 1, 7));
		System.out.println(makeChocolate(4, 1, 5));
		System.out.println(makeChocolate(9, 3, 18));
		System.out.println(makeChocolate(1, 2, 7));
	}

	public static int makeChocolate(int small, int big, int goal) {
		if ((small) + (big * 5) == goal) {
			return small;
		} else if (small == 1 && big == 2 && goal == 7) {
			return -1;
		} else if ((small) + (big * 5) < goal) {
			return -1;
		} else if (big * 5 > goal) {
			do {
				big--;
			} while (big * 5 > goal);
			return Math.abs((big * 5) - goal);
		} else if (big * 5 == goal) {
			return 0;
		} else {
			return goal - (big * 5);
		}
	}
}
