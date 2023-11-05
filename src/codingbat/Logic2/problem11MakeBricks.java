package codingbat.Logic2;

public class problem11MakeBricks {
//Q. We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
//	Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. 
//	See also: Introduction to MakeBricks

//makeBricks(3, 1, 8) → true
//makeBricks(3, 1, 9) → false
//makeBricks(3, 2, 10) → true
//makeBricks(3, 2, 9) → false	
//makeBricks(3, 2, 8) → true	

	public static void main(String[] args) {
		System.out.println(makeBricks(3, 1, 8));
		System.out.println(makeBricks(3, 1, 9));
		System.out.println(makeBricks(3, 2, 10));
		System.out.println(makeBricks(3, 2, 9));
		System.out.println(makeBricks(3, 2, 8));
	}

	public static boolean makeBricks(int small, int big, int goal) {
		int digit = goal % 10;
		if (goal > small + (big * 5))
			return false;
		if (digit < 5 && small < digit)
			return false;
		else if (digit > 5 && digit > small + 5)
			return false;
		else
			return true;

		
		
		
		
		
		
		
		
		
//		return ((small+(big*5))>=goal)?true:false;

//		int digit = goal % 10;
//		  if (goal > small + (big * 5))
//		   return false;
//		  if (digit < 5 && small < digit)
//		    return false;
//		  else if (digit > 5 && digit > small + 5)
//		    return false;
//		  else
//		    return true;

	}
}
