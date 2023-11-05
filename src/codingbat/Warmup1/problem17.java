package codingbat.Warmup1;

public class problem17 {
//Q. Given two temperatures, return true if one is less than 0 and the other is greater than 100.

//icyHot(120, -1) → true
//icyHot(-1, 120) → true
//icyHot(2, 120) → false

	public static void main(String[] args) {
		System.out.println(icyHot(120,2));
	}
	
	public static boolean icyHot(int temp1, int temp2) {
		if(temp1>100) {
			if (temp2<0) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(temp1<0) {
			if (temp2>100) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
		
		
		  
	}

}
