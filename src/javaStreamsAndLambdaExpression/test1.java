package javaStreamsAndLambdaExpression;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeeta");
		names.add("Don");
		names.add("Alkeya");
		names.add("Adam");
		names.add("Rama");
//		System.out.println(names);
/*		int count=0;
		for(int i=0;i<names.size();i++) {
			if(names.get(i).startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
*/	
		long count = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		System.out.println("******************************************\n");

//		Print the names whos length is more than
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
		
//		limiting only for 1
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
		
//		storing those into arraylist
		ArrayList<String> names4 = new ArrayList<String>();
		names.stream().filter(s->s.length()>4).forEach(s->names4.add(s));
		System.out.println(names4);
		System.out.println("******************************************\n");
		
//		converting some words to capital
		names.stream().filter(s->s.length()>4&&s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
		
//		Sorting with streams
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
		
//		without filter only Sorting
		names.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
		
//		without filter & without sorting only maping
		names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
		
//		without filter, without sorting & without maping
		names.stream().forEach(s->System.out.println(s));
		System.out.println("******************************************\n");
	}

}
