package Collections;

import java.util.ArrayList;

public class Day4_2 {

	public static void main(String[] args) {
		Day4_1 d1 = new Day4_1(21,"Tom");
		Day4_1 d2 = new Day4_1(22,"Jerry");
		Day4_1 d3 = new Day4_1(23,"Smith");
		
		ArrayList<Day4_1> l = new ArrayList<Day4_1>();
		l.add(d1);
		l.add(d2);
		l.add(d3);
		for(Day4_1 i:l) {
//			System.out.println("name : "+i.name+" Age : "+i.age);
			System.out.println(i);
		}
	}

}
