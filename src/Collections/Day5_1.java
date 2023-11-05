package Collections;

import java.util.HashSet;

public class Day5_1 {

	public static void main(String[] args) {
//		Set
//		Hashset
		HashSet h = new HashSet();
		h.add(20);
		h.add(20.67);
		h.add(20);
		h.add(null);
		h.add(20);
		h.add("java");
		System.out.println(h);
		for(Object i:h)
			System.out.println(i);
		System.out.println(h.remove(20));
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(2));
		
	}

}
