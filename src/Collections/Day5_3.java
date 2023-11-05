package Collections;

import java.util.TreeSet;

public class Day5_3 {

	public static void main(String[] args) {
//		Set
//		TreeSet
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(21);
		t.add(20);
		t.add(25);
		t.add(32);
		System.out.println(t);
		for (Object i : t)
			System.out.print(i);

		TreeSet<String> s = new TreeSet<String>();
		s.add("Banana");
		s.add("Apple");
		s.add("Pomogranate");
		s.add("DragonFruit");
		System.out.println(s);
		for (Object i : s)
			System.out.print(i);
	}

}
