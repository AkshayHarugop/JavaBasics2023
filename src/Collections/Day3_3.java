package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day3_3 {

	public static void main(String[] args) {
		//Generic <element type>
		ArrayList<String> al =  new ArrayList<String>();
		al.add("20");
		al.add("sql");
		al.add("java");
		for(String i:al)
			System.out.print(i+", ");
		
		System.out.println("\n==========");
		LinkedList<Integer> Ll = new LinkedList<Integer>();
		Ll.add(10);
		Ll.add(34);
		Ll.add(67);
		for(Integer i:Ll) {
			System.out.print(i+", ");
		}
		System.out.println("\n==========");
		
		ArrayList<Double> z =  new ArrayList<Double>();
		z.add(8.99);
		z.add(102.85);
		z.add(3.45);
		for(Double i:z) {
			System.out.print(i+", ");
		}
		System.out.println("\n==========");
		
		int a =10;
		char b='z';
		ArrayList l = new ArrayList();
		l.add(a);
		l.add(20.45);
		l.add(b);
		for(Object i:l) {
			System.out.print(i+", ");
		}
		System.out.println("\n==========");
		
		
	}

}
