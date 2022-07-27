package com.globallogic.demo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streaming {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(12);
		ls.add(67);
		ls.add(-2);
		ls.add(-44);
		ls.add(19);
		ls.add(-73);
		ls.add(11);
		ls.add(56);
		ls.add(-5);
		Stream<Integer> st=ls.stream();
		//st.forEach(obj->System.out.println(obj));
		//ls.stream().filter(e->e>0).forEach(System.out::println);
		//ls.stream().filter(e->e<0).forEach(System.out::println);
//		List<Integer> pos=ls.stream().filter(e->e>0).collect(Collectors.toList());
//		System.out.println(pos);
//		List<Integer> neg=ls.stream().filter(e->e<0).collect(Collectors.toList());
//		System.out.println(neg);
//		List<Integer> neg=ls.stream()
//				.filter(e->e<0)
//				.sorted(Collections.reverseOrder())
//				.collect(Collectors.toList());
//		System.out.println(neg);
//		List<Integer> pos=ls.stream()
//				.filter(e->e>0)
//				.sorted()
//				.collect(Collectors.toList());
//		System.out.println(pos);
		ls.stream()
		.filter(e -> e > 0)  
		.map(e->e*e)
		.sorted()
		.distinct()
		.limit(5)
		.forEach(System.out::println);
		ls.stream()
		.filter(e ->e<0)  
		//.map(e->e*e)
		.sorted()
		.distinct()
		.limit(5)
		.forEach(System.out::println);
		//OptionalInt sum=     ls.stream().mapToInt(Integer::intValue).max();
		Integer sum1=ls.stream().mapToInt(Integer::intValue).sum();
	     
		  // System.out.println("sum is "+sum);
	     
		   System.out.println("sum is "+sum1);
		
		
		
		
	}		
	
	
}
