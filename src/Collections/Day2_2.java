package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day2_2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);al.add(20);
		System.out.println("Objects inside ArrayList : "+al+" size : "+al.size());
		System.out.println("-----------");
		LinkedList ll =  new LinkedList();
		ll.add(5);
		ll.addAll(al);
		ll.add(30);
		System.out.println("Objects inside LinkedList : "+ll+" size : "+ll.size());
		System.out.println("-----------");
		
		System.out.println(ll.containsAll(al));
		ll.remove(1);
		System.out.println("Objects inside LinkedList : "+ll+" size : "+ll.size());
		System.out.println(ll.containsAll(al));
		ll.removeAll(al);
		System.out.println("Objects inside LinkedList : "+ll+" size : "+ll.size());
		
		
	}

}
