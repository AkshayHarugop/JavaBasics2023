package Collections;

import java.util.LinkedList;

public class Day2_1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		System.out.println("----------");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("----------");
		for (int i = ll.size()-1; i >= 0; i--) {
			System.out.println(ll.get(i));
		}
		System.out.println("----------");
		int[] x= {10,20,30};
		System.out.println(x.length);
		System.out.println("----------");
		String y="Java";
		System.out.println(y.length());
	}

}
