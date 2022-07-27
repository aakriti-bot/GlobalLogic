package com.globallogic.demo;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyJava {
public static void main(String[] args) {
	List<Integer> ls=new ArrayList<>();
	ls.add(21);
	ls.add(19);
	ls.add(4);
	ls.add(8);
	ls.add(1);
	Consumer<Integer> p=s->System.out.println(s);
	Consumer<List<Integer>> sqrt=list->
	{
		for(int i=0;i<ls.size();i++)
		{
			ls.set(i, ls.get(i)*ls.get(i));
		}
		
	};
	Consumer<List<Integer>> print=list->list.stream().forEach(p);
	sqrt.andThen(print).accept(ls);
	//System.out.println(sqrt.getClass());
	Supplier<Integer> supplier=new Supplier<Integer>(){
		@Override
		public Integer get(){
			return new Random().nextInt();
			
		}
		
	};
	System.out.println(supplier.get());
			Predicate<Integer> predicate=new Predicate<Integer>(){
				@Override
				public boolean test(Integer num){
					if(num>0)
					{
						return true;
					}
					else
						return false;
				}
			};
			System.out.println(predicate.test(5));
			
			
}
}
