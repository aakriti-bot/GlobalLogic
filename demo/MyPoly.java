package com.globallogic.demo;

class Person{
	public void work(){
		System.out.println("I am being me");
	}
	public void work(int hours){
		System.out.println("I am being me"+ " "+ hours);
	}
	public void work(int hours, String work){
		System.out.println("I am being me"+ " "+ hours+ " "+ work);
	}
}
class School extends Person{
	public void work(){
		System.out.println("I am at school");
	}
	public void work(int hours, String work){
		System.out.println("I am at school for"+ " "+ hours+ " "+ work);
	}
}
class Office extends Person{
	public void work(){
		System.out.println("I am at office");
	}
}
public class MyPoly {
	public static void main(String[] args) {
		Person aakriti=new Person();
		aakriti.work(4, "hours a day");
		aakriti=new School();
		aakriti.work(6, "hours a day");
		aakriti=new Office();
		aakriti.work();
	}

}
