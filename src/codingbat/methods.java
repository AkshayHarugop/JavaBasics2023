package codingbat;

public class methods {
	public boolean cigarParty(int n, boolean b) {
		// n= no of cigars
		// b= is weekend true if it is weekend, else false
		if (b == false && (n < 40 || n > 60))
			return false;
		if (b == false && (n >= 40 && n <= 60))
			return true;
		if (b == true && n >= 60)
			return true;
		if (b == false && n < 60)
			return false;
		return b;
		// My Logic
//		if(b==true) {
//			return (n>60)?true:false;
////			if(n>60) {
////				return true;
////			}
////			else {
////				return false;
////			}
//		}
//		else {
//			return (n>=40 && n<=60)?true:false;
////			if(n>=40 && n<=60) {
////				return true;
////			}
////			else {
////				return false;
////			}
//		}
//		
	}

	public int dateFashion(int you, int date) {
		if ((you >= 8 && date > 2) || (date >= 8 && you > 2)) {
			return 2;
		}
		if (you <= 2 || date <= 2) {
			return 0;
		}
//		if(you==5 && date==5) {
//			return 1;
//		}
		return 1;

	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if ((temp >= 60 && temp <= 90) && isSummer == false) {
			return true;
		} else if ((temp >= 60 && temp <= 100) && isSummer == true) {
			return true;
		} else {
			return false;
		}
//		if(isSummer==false) {
//			if(temp >= 60 && temp <= 90) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		else {
//			if(temp >= 60 && temp <= 100) {
//				return true;
//			}
//			else {
//				return false;
//			}
//			
//		}
	}
}