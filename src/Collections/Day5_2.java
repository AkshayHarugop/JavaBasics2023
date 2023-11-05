package Collections;

import java.util.LinkedHashSet;

public class Day5_2 {

	public static void main(String[] args) {
//		Set
//		LinkedHashset
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("java");
		lh.add("python");
		lh.add("java");
		lh.add("javascript");
		System.out.println(lh);
		for(Object i:lh){
			System.out.println(i);
		}
	}

}
