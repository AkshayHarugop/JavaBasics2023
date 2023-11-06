package javaStreamsAndLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

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
		
//		Concatenating the 2 arraylists
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Dassault");
		names2.add("Systems");
		names2.add("Bangalore");
		names2.add("Jaynagar");
		names2.add("4th Cross");
		
		
		Stream<String> newNames = Stream.concat(names.stream(), names2.stream());
//		newNames.forEach(s->System.out.println(s));
		boolean flag = newNames.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
		System.out.println("******************************************\n");
		
//		Print unique numbers from the arraylist
		List<Integer> values1 = Arrays.asList(3,2,2,2,1,4,5,8,6,7,9);
		values1.stream().distinct().sorted().limit(5).forEach(a->System.out.print(a+", "));
		List<Integer> li = values1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("\n******************************************\n");
		System.out.println(li.get(5));
		System.out.println("******************************************\n");
		
	}

}
