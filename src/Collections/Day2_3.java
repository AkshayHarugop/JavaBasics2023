package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Day2_3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(30);al.add(40);al.add(10);al.add(20);
		System.out.println("Before Sorting : ");
		for (int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("After Sorting : ");
		Collections.sort(al);
		for (int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("===========");
		for (int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
	}

}
