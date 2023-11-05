package Collections;

import java.util.ArrayList;

public class Day1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.34);
		al.add(10);
		al.add(null);
		al.add("Java");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.contains("java"));
		System.out.println(al.contains("Java"));
		al.remove(2);
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println("====================");
		

		ArrayList x = new ArrayList();
		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(60);
		System.out.println(x);
		System.out.println(x.indexOf(30));
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(100));
		System.out.println(x.lastIndexOf(30));
		x.add(1, 100);
		System.out.println(x);
		System.out.println(x.indexOf(100));
		x.set(1, 110);
		System.out.println(x);
		System.out.println(x.indexOf(100));
	}

}
